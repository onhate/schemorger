package org.schema;

/**
 * 
 * A medical laboratory that offers on-site or off-site diagnostic services.
 * 
 * @fullPath Thing > Place > LocalBusiness > MedicalOrganization > DiagnosticLab
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DiagnosticLab extends MedicalOrganization {

	private MedicalTest availableTest;

	/**
	 * A diagnostic test or procedure offered by this lab.
	 */
	public MedicalTest getAvailableTest() {
		return this.availableTest;
	}

	/**
	 * A diagnostic test or procedure offered by this lab.
	 */
	public void setAvailableTest(MedicalTest availableTest) {
		this.availableTest = availableTest;
	}
}
