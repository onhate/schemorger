package com.texelz.schemorger;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.PropertyUtils;
import org.schema.Enumeration;
import org.schema.Thing;
import org.schema.base.URL;

public class SchemaOrgBuilder {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

	private static final String ITEM_START = "<div itemscope itemtype=\"http://schema.org/{itemtype}\">\n";
	private static final String ITEM_START_PROP = "<div itemprop=\"{name}\" itemscope itemtype=\"http://schema.org/{itemtype}\">\n";
	private static final String ITEM_END = "</div>\n";

	private static final String PROPERTY = "<meta itemprop=\"{name}\" content=\"{value}\"/>\n";
	private static final String LINK = "<link itemprop=\"{name}\" href=\"{value}\"/>\n";

	protected static void build(String name, Object value, StringBuilder out) throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		if (value != null) {
			String content = null;

			if (value instanceof Enumeration) { // ENUMERATION
				Enumeration e = (Enumeration) value;
				URL url = e.getUrl();
				if (url != null) {
					build(name, url, out);
				} else {
					build(name, e.getName(), out);
				}
			} else if (value instanceof Collection) { // COLLECTION
				for (Object e : (Collection<?>) value)
					build(name, e, out);
			} else if (value.getClass().isArray()) { // ARRAY
				build(name, Arrays.asList(value), out);
			} else if (value instanceof URL) { // LINK
				content = LINK.replace("{name}", name).replace("{value}", ((URL) value).getHref());
			} else if (value instanceof Date) { // date
				content = PROPERTY.replace("{name}", name).replace("{value}", DATE_FORMAT.format(value));
			} else if (value instanceof Thing) { // SCOPED
				build(name, (Thing) value, out);
			} else { // DEFAULT
				content = PROPERTY.replace("{name}", name).replace("{value}", value.toString());
			}

			if (content != null) {
				out.append(content);
			}
		}
	}

	protected static void build(String name, Thing thing, StringBuilder out) throws IllegalAccessException,
			InvocationTargetException, NoSuchMethodException {
		// start
		String header = null;
		if (name != null) {
			header = ITEM_START_PROP.replace("{name}", name);
		} else {
			header = ITEM_START;
		}
		header = header.replace("{itemtype}", thing.getClass().getSimpleName());
		out.append(header);

		// the properties
		Map<String, Object> map = PropertyUtils.describe(thing);
		Iterator<Entry<String, Object>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Object> e = it.next();
			String key = e.getKey();
			Object value = e.getValue();

			if ("class".equals(key))
				continue;

			build(key, value, out);
		}
		out.append(ITEM_END);
	}

	public static StringBuilder build(Thing thing) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		StringBuilder out = new StringBuilder();
		build(null, thing, out);
		return out;
	}
}
