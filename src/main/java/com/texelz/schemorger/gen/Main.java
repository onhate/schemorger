package com.texelz.schemorger.gen;

import static org.apache.commons.lang3.StringUtils.join;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @see Main
 * @author onhate
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://schema.org/docs/full.html").get();
		Element table = doc.select("#mainContent > table.h").get(1);
		Elements items = table.select("td.tc > a");
		Iterator<Element> it = items.iterator();
		while (it.hasNext()) {
			Element item = it.next();
			String href = item.attr("href");
			String url = href.replace("..", "http://schema.org");
			parseItem(url);
		}
	}

	private static void parseItem(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();

		Elements definition = doc.select("#mainContent > .page-title > a");
		int definitionTypes = definition.size();
		if (definitionTypes == 0) {
			System.err.println("WARN: " + url);
			return;
		}

		String completeName = join(definition.html().split("\n"), " > ");
		String name = definition.get(definitionTypes - 1).html();
		String comment = doc.select("#mainContent > div").get(0).html();
		comment += "\n * @fullPath " + completeName;
		Clazz clazz = new Clazz(name, comment);
		if (definitionTypes >= 2) {
			String extend = definition.get(definitionTypes - 2).html();
			clazz.setExtend(extend);
		}

		Element firstClass = doc.select("table.definition-table > thead.supertype > tr > th > a").get(0);
		String firstClassName = firstClass.html();

		if (name.equals(firstClassName)) {
			Elements table = doc.select("table.definition-table > tbody");

			Element properties = table.get(0);
			Elements rows = properties.select("tr");
			Iterator<Element> it = rows.iterator();
			while (it.hasNext()) {
				Element row = it.next();

				// name
				String pName = row.select("th > code > a").html();

				Elements tds = row.select("td");
				// comments
				StringBuilder pComment = new StringBuilder();
				pComment.append(tds.get(1).html());
				// type or generic
				String pType = "Object";
				Elements types = tds.get(0).select("a");
				if (types.size() == 1) {
					pType = types.html();
				} else {
					Iterator<Element> tIt = types.iterator();
					while (tIt.hasNext()) {
						Element permittedType = tIt.next();
						pComment.append("\n@see ");
						pComment.append(permittedType.html());
					}
				}
				switch (pType) {
				case "Text":
					pType = "String";
					break;
				case "Date":
				case "DateTime":
				case "Time":
					pType = "java.util.Date";
					break;
				case "URL":
					pType = "org.schema.base.Link";
					break;
				case "Number":
				case "Float":
					pType = "Double";
					break;
				default:
					break;
				}

				clazz.addProperty(pName, pType, pComment.toString());
			}
		}

		System.err.println(completeName);
		File baseDir = new File("./src/main/java/org/schema");
		if (!baseDir.exists()) {
			baseDir.mkdirs();
		}
		clazz.write(baseDir);
	}
}
