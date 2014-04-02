package com.texelz.schemorger.model;

import com.texelz.schemorger.definition.Link;

public class Brand extends Intangible {
	private Link logo;

	public Link getLogo() {
		return logo;
	}

	public void setLogo(Link logo) {
		this.logo = logo;
	}

}
