package org.schema;

/**
 * 
 * Web applications.
 * 
 * @fullPath Thing > CreativeWork > SoftwareApplication > WebApplication
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class WebApplication extends SoftwareApplication {

	private String browserRequirements;

	/**
	 * Specifies browser requirements in human-readable text. For
	 * example,&quot;requires HTML5 support&quot;.
	 */
	public String getBrowserRequirements() {
		return this.browserRequirements;
	}

	/**
	 * Specifies browser requirements in human-readable text. For
	 * example,&quot;requires HTML5 support&quot;.
	 */
	public void setBrowserRequirements(String browserRequirements) {
		this.browserRequirements = browserRequirements;
	}
}
