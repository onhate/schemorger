package com.texelz.schemorger.model;

import com.texelz.schemorger.definition.Link;
import com.texelz.schemorger.definition.Scoped;

public class Thing extends Scoped {
	private String name;
	private String alternateName;
	private String description;

	private Link image;
	private Link additionalType;
	private Link sameAs;
	private Link url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Link getImage() {
		return image;
	}

	public void setImage(Link image) {
		this.image = image;
	}

	public Link getAdditionalType() {
		return additionalType;
	}

	public void setAdditionalType(Link additionalType) {
		this.additionalType = additionalType;
	}

	public Link getSameAs() {
		return sameAs;
	}

	public void setSameAs(Link sameAs) {
		this.sameAs = sameAs;
	}

	public Link getUrl() {
		return url;
	}

	public void setUrl(Link url) {
		this.url = url;
	}
}