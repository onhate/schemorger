package org.schema;

/**
 * 
 * A mobile software application.
 * 
 * @fullPath Thing > CreativeWork > SoftwareApplication > MobileApplication
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MobileApplication extends SoftwareApplication {

	private String carrierRequirements;

	/**
	 * Specifies specific carrier(s) requirements for the application (e.g. an
	 * application may only work on a specific carrier network).
	 */
	public String getCarrierRequirements() {
		return this.carrierRequirements;
	}

	/**
	 * Specifies specific carrier(s) requirements for the application (e.g. an
	 * application may only work on a specific carrier network).
	 */
	public void setCarrierRequirements(String carrierRequirements) {
		this.carrierRequirements = carrierRequirements;
	}
}
