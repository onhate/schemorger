package org.schema;

/**
 * 
 * Any indication of the existence of a medical condition or disease.
 * 
 * @fullPath Thing > MedicalEntity > MedicalSignOrSymptom
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalSignOrSymptom extends MedicalEntity {

	private MedicalCause cause;
	private MedicalTherapy possibleTreatment;

	/**
	 * An underlying cause. More specifically, one of the causative agent(s)
	 * that are most directly responsible for the pathophysiologic process that
	 * eventually results in the occurrence.
	 */
	public MedicalCause getCause() {
		return this.cause;
	}

	/**
	 * An underlying cause. More specifically, one of the causative agent(s)
	 * that are most directly responsible for the pathophysiologic process that
	 * eventually results in the occurrence.
	 */
	public void setCause(MedicalCause cause) {
		this.cause = cause;
	}

	/**
	 * A possible treatment to address this condition, sign or symptom.
	 */
	public MedicalTherapy getPossibleTreatment() {
		return this.possibleTreatment;
	}

	/**
	 * A possible treatment to address this condition, sign or symptom.
	 */
	public void setPossibleTreatment(MedicalTherapy possibleTreatment) {
		this.possibleTreatment = possibleTreatment;
	}
}
