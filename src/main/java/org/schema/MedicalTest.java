package org.schema;

/**
 * 
 * Any medical test, typically performed for diagnostic purposes.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTest
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalTest extends MedicalEntity {

	private Drug affectedBy;
	private String normalRange;
	private MedicalSign signDetected;
	private MedicalCondition usedToDiagnose;
	private MedicalDevice usesDevice;

	/**
	 * Drugs that affect the test's results.
	 */
	public Drug getAffectedBy() {
		return this.affectedBy;
	}

	/**
	 * Drugs that affect the test's results.
	 */
	public void setAffectedBy(Drug affectedBy) {
		this.affectedBy = affectedBy;
	}

	/**
	 * Range of acceptable values for a typical patient, when applicable.
	 */
	public String getNormalRange() {
		return this.normalRange;
	}

	/**
	 * Range of acceptable values for a typical patient, when applicable.
	 */
	public void setNormalRange(String normalRange) {
		this.normalRange = normalRange;
	}

	/**
	 * A sign detected by the test.
	 */
	public MedicalSign getSignDetected() {
		return this.signDetected;
	}

	/**
	 * A sign detected by the test.
	 */
	public void setSignDetected(MedicalSign signDetected) {
		this.signDetected = signDetected;
	}

	/**
	 * A condition the test is used to diagnose.
	 */
	public MedicalCondition getUsedToDiagnose() {
		return this.usedToDiagnose;
	}

	/**
	 * A condition the test is used to diagnose.
	 */
	public void setUsedToDiagnose(MedicalCondition usedToDiagnose) {
		this.usedToDiagnose = usedToDiagnose;
	}

	/**
	 * Device used to perform the test.
	 */
	public MedicalDevice getUsesDevice() {
		return this.usesDevice;
	}

	/**
	 * Device used to perform the test.
	 */
	public void setUsesDevice(MedicalDevice usesDevice) {
		this.usesDevice = usesDevice;
	}
}
