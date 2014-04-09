package com.texelz.schemorger.gen;

import static org.apache.commons.lang3.StringUtils.capitalize;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * Teste
 * 
 * @author onhate
 * 
 */
public class Clazz {
	private String extend = "org.schema.base.Scoped";
	private String name;
	private String comment;
	private Set<Property> properties;

	public Clazz(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}

	public Clazz(String name) {
		this.name = name;
	}

	public String getExtend() {
		return extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Property> getProperties() {
		if (properties == null) {
			properties = new LinkedHashSet<Property>();
		}
		return properties;
	}

	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}

	public void addProperty(String name, String type, String comment) {
		Property prop = new Property(name, type, comment);
		getProperties().add(prop);
	}

	public String build() {
		StringBuilder sb = new StringBuilder();

		sb.append("package org.schema;\n\n");

		sb.append("/**\n");
		sb.append(" *\n");
		if (isNotEmpty(comment)) {
			sb.append(" * ");
			sb.append(comment);
			sb.append("\n *\n");
		}
		sb.append(" * @author Texelz (by Onhate)\n");
		sb.append(" *\n");
		sb.append(" */\n");
		sb.append("public class ");
		sb.append(name);
		sb.append(" extends ");
		sb.append(extend);
		sb.append(" {\n\n");

		// properties
		Iterator<Property> it = getProperties().iterator();
		while (it.hasNext()) {
			Property prop = it.next();

			sb.append("\tprivate ");
			sb.append(prop.getType());
			sb.append(" ");
			sb.append(prop.getName());
			sb.append(";\n");
		}

		it = getProperties().iterator();
		while (it.hasNext()) {
			Property prop = it.next();

			String cName = capitalize(prop.getName());

			// getter
			if (isNotEmpty(prop.getComment())) {
				sb.append("\t/**\n");
				sb.append("\t * ");
				sb.append(prop.getComment().replaceAll("\n", "\n\t * "));
				sb.append("\n\t */\n");
			}

			sb.append("\tpublic ");
			sb.append(prop.getType());
			sb.append(" get");
			sb.append(cName);
			sb.append("() {\n");
			sb.append("\t\t");
			sb.append("return this.");
			sb.append(prop.getName());
			sb.append(";\n");
			sb.append("\t}\n");

			// getter
			if (isNotEmpty(prop.getComment())) {
				sb.append("\t/**\n");
				sb.append("\t * ");
				sb.append(prop.getComment().replaceAll("\n", "\n\t * "));
				sb.append("\n\t */\n");
			}

			sb.append("\tpublic void set");
			sb.append(cName);
			sb.append("(");
			sb.append(prop.getType());
			sb.append(" ");
			sb.append(prop.getName());
			sb.append(") {\n");
			sb.append("\t\t");
			sb.append("this.");
			sb.append(prop.getName());
			sb.append(" = ");
			sb.append(prop.getName());
			sb.append(";\n");
			sb.append("\t}\n");
		}

		sb.append("}\n");

		return sb.toString();
	}

	public void write(File baseDir) throws IOException {
		String fileName = capitalize(name) + ".java";
		File file = new File(baseDir, fileName);
		if (file.exists()) {
			file.delete();
		}
		file.createNewFile();

		FileWriter fw = new FileWriter(file);
		fw.write(build());
		fw.flush();
		fw.close();
	}
}
