package org.schema.base;

import com.texelz.schemorger.Constants;

public class URL {

	public static final URL toSchema(String href) {
		return new URL(Constants.SCHEMA_ORG + href);
	}

	public static final URL to(String href) {
		return new URL(href);
	}

	public static final URL toWiki(String href) {
		return new URL(Constants.WIKIPEDIA_ORG + href);
	}

	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public URL(String href) {
		super();
		this.href = href;
	}

	public URL() {
		super();
	}
}
