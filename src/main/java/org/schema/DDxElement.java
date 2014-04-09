package org.schema;

/**
 * 
 * An alternative, closely-related condition typically considered later in the
 * differential diagnosis process along with the signs that are used to
 * distinguish it.
 * 
 * @fullPath Thing > MedicalEntity > MedicalIntangible > DDxElement
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DDxElement extends MedicalIntangible {

	private MedicalCondition diagnosis;
	private MedicalSignOrSymptom distinguishingSign;

	/**
	 * One or more alternative conditions considered in the differential
	 * diagnosis process.
	 */
	public MedicalCondition getDiagnosis() {
		return this.diagnosis;
	}

	/**
	 * One or more alternative conditions considered in the differential
	 * diagnosis process.
	 */
	public void setDiagnosis(MedicalCondition diagnosis) {
		this.diagnosis = diagnosis;
	}

	/**
	 * One of a set of signs and symptoms that can be used to distinguish this
	 * diagnosis from others in the differential diagnosis.
	 */
	public MedicalSignOrSymptom getDistinguishingSign() {
		return this.distinguishingSign;
	}

	/**
	 * One of a set of signs and symptoms that can be used to distinguish this
	 * diagnosis from others in the differential diagnosis.
	 */
	public void setDistinguishingSign(MedicalSignOrSymptom distinguishingSign) {
		this.distinguishingSign = distinguishingSign;
	}
}
