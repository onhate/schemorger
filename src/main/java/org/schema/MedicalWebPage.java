package org.schema;

/**
 * 
 * A web page that provides medical information.
 * 
 * @fullPath Thing > CreativeWork > WebPage > MedicalWebPage
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalWebPage extends WebPage {

	private String aspect;

	/**
	 * An aspect of medical practice that is considered on the page, such as
	 * 'diagnosis', 'treatment', 'causes', 'prognosis', 'etiology',
	 * 'epidemiology', etc.
	 */
	public String getAspect() {
		return this.aspect;
	}

	/**
	 * An aspect of medical practice that is considered on the page, such as
	 * 'diagnosis', 'treatment', 'causes', 'prognosis', 'etiology',
	 * 'epidemiology', etc.
	 */
	public void setAspect(String aspect) {
		this.aspect = aspect;
	}
}
