package com.texelz.schemorger.model;

/**
 *
 * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
 * @fullPath Thing > Intangible > Brand
 *
 * @author Texelz (by Onhate)
 *
 */
public class Brand extends Intangible {

	private Object logo;
	/**
	 * A logo associated with an organization.
	 * @see URL
	 * @see ImageObject
	 */
	public Object getLogo() {
		return this.logo;
	}
	public void setLogo(Object logo) {
		this.logo = logo;
	}
}
