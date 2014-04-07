package com.texelz.schemorger.model;

/**
 *
 * Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.
 * @fullPath Thing > MedicalEntity > MedicalSignOrSymptom > MedicalSign
 *
 * @author Texelz (by Onhate)
 *
 */
public class MedicalSign extends MedicalSignOrSymptom {

	private PhysicalExam identifyingExam;
	private MedicalTest identifyingTest;
	/**
	 * A physical examination that can identify this sign.
	 */
	public PhysicalExam getIdentifyingExam() {
		return this.identifyingExam;
	}
	public void setIdentifyingExam(PhysicalExam identifyingExam) {
		this.identifyingExam = identifyingExam;
	}
	/**
	 * A diagnostic test that can identify this sign.
	 */
	public MedicalTest getIdentifyingTest() {
		return this.identifyingTest;
	}
	public void setIdentifyingTest(MedicalTest identifyingTest) {
		this.identifyingTest = identifyingTest;
	}
}
