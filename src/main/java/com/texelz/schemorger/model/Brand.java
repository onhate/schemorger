package com.texelz.schemorger.model;

import java.net.URL;

/**
 * 
 * A brand is a name used by an organization or business person for labeling a
 * product, product group, or similar.
 * 
 * @fullPath Thing > Intangible > Brand
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Brand extends Intangible {

	private Thing logo;

	/**
	 * A logo associated with an organization.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public Thing getLogo() {
		return this.logo;
	}

	public void setLogo(Thing logo) {
		this.logo = logo;
	}
}
