package org.schema;

/**
 * 
 * A medical test performed by a laboratory that typically involves examination
 * of a tissue sample by a pathologist.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTest > PathologyTest
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PathologyTest extends MedicalTest {

	private String tissueSample;

	/**
	 * The type of tissue sample required for the test.
	 */
	public String getTissueSample() {
		return this.tissueSample;
	}

	/**
	 * The type of tissue sample required for the test.
	 */
	public void setTissueSample(String tissueSample) {
		this.tissueSample = tissueSample;
	}
}
