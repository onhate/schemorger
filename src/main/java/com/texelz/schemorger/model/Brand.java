package com.texelz.schemorger.model;

<<<<<<< HEAD
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
=======
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
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
		this.logo = logo;
	}
}
