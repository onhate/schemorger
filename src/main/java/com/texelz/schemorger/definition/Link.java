package com.texelz.schemorger.definition;

import com.texelz.schemorger.Constants;
import com.texelz.schemorger.model.Thing;

public class Link extends Thing {

	public static final Link toSchema(String href) {
		return new Link(Constants.SCHEMA_ORG + href);
	}

	public static final Link to(String href) {
		return new Link(href);
	}

	public static final Link toWiki(String href) {
		return new Link(Constants.WIKIPEDIA_ORG + href);
	}

	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Link(String href) {
		super();
		this.href = href;
	}

	public Link() {
		super();
	}
}
