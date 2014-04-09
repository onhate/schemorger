package org.schema;

/**
 * 
 * Any condition of the human body that affects the normal functioning of a
 * person, whether physically or mentally. Includes diseases, injuries,
 * disabilities, disorders, syndromes, etc.
 * 
 * @fullPath Thing > MedicalEntity > MedicalCondition
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalCondition extends MedicalEntity {

	private Object associatedAnatomy;
	private MedicalCause cause;
	private DDxElement differentialDiagnosis;
	private String epidemiology;
	private String expectedPrognosis;
	private String naturalProgression;
	private String pathophysiology;
	private String possibleComplication;
	private MedicalTherapy possibleTreatment;
	private MedicalTherapy primaryPrevention;
	private MedicalRiskFactor riskFactor;
	private MedicalTherapy secondaryPrevention;
	private MedicalSignOrSymptom signOrSymptom;
	private MedicalConditionStage stage;
	private String subtype;
	private MedicalTest typicalTest;

	/**
	 * The anatomy of the underlying organ system or structures associated with
	 * this entity.
	 * 
	 * @see SuperficialAnatomy
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public Object getAssociatedAnatomy() {
		return this.associatedAnatomy;
	}

	/**
	 * The anatomy of the underlying organ system or structures associated with
	 * this entity.
	 * 
	 * @see SuperficialAnatomy
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public void setAssociatedAnatomy(Object associatedAnatomy) {
		this.associatedAnatomy = associatedAnatomy;
	}

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
	 * One of a set of differential diagnoses for the condition. Specifically, a
	 * closely-related or competing diagnosis typically considered later in the
	 * cognitive process whereby this medical condition is distinguished from
	 * others most likely responsible for a similar collection of signs and
	 * symptoms to reach the most parsimonious diagnosis or diagnoses in a
	 * patient.
	 */
	public DDxElement getDifferentialDiagnosis() {
		return this.differentialDiagnosis;
	}

	/**
	 * One of a set of differential diagnoses for the condition. Specifically, a
	 * closely-related or competing diagnosis typically considered later in the
	 * cognitive process whereby this medical condition is distinguished from
	 * others most likely responsible for a similar collection of signs and
	 * symptoms to reach the most parsimonious diagnosis or diagnoses in a
	 * patient.
	 */
	public void setDifferentialDiagnosis(DDxElement differentialDiagnosis) {
		this.differentialDiagnosis = differentialDiagnosis;
	}

	/**
	 * The characteristics of associated patients, such as age, gender, race
	 * etc.
	 */
	public String getEpidemiology() {
		return this.epidemiology;
	}

	/**
	 * The characteristics of associated patients, such as age, gender, race
	 * etc.
	 */
	public void setEpidemiology(String epidemiology) {
		this.epidemiology = epidemiology;
	}

	/**
	 * The likely outcome in either the short term or long term of the medical
	 * condition.
	 */
	public String getExpectedPrognosis() {
		return this.expectedPrognosis;
	}

	/**
	 * The likely outcome in either the short term or long term of the medical
	 * condition.
	 */
	public void setExpectedPrognosis(String expectedPrognosis) {
		this.expectedPrognosis = expectedPrognosis;
	}

	/**
	 * The expected progression of the condition if it is not treated and
	 * allowed to progress naturally.
	 */
	public String getNaturalProgression() {
		return this.naturalProgression;
	}

	/**
	 * The expected progression of the condition if it is not treated and
	 * allowed to progress naturally.
	 */
	public void setNaturalProgression(String naturalProgression) {
		this.naturalProgression = naturalProgression;
	}

	/**
	 * Changes in the normal mechanical, physical, and biochemical functions
	 * that are associated with this activity or condition.
	 */
	public String getPathophysiology() {
		return this.pathophysiology;
	}

	/**
	 * Changes in the normal mechanical, physical, and biochemical functions
	 * that are associated with this activity or condition.
	 */
	public void setPathophysiology(String pathophysiology) {
		this.pathophysiology = pathophysiology;
	}

	/**
	 * A possible unexpected and unfavorable evolution of a medical condition.
	 * Complications may include worsening of the signs or symptoms of the
	 * disease, extension of the condition to other organ systems, etc.
	 */
	public String getPossibleComplication() {
		return this.possibleComplication;
	}

	/**
	 * A possible unexpected and unfavorable evolution of a medical condition.
	 * Complications may include worsening of the signs or symptoms of the
	 * disease, extension of the condition to other organ systems, etc.
	 */
	public void setPossibleComplication(String possibleComplication) {
		this.possibleComplication = possibleComplication;
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

	/**
	 * A preventative therapy used to prevent an initial occurrence of the
	 * medical condition, such as vaccination.
	 */
	public MedicalTherapy getPrimaryPrevention() {
		return this.primaryPrevention;
	}

	/**
	 * A preventative therapy used to prevent an initial occurrence of the
	 * medical condition, such as vaccination.
	 */
	public void setPrimaryPrevention(MedicalTherapy primaryPrevention) {
		this.primaryPrevention = primaryPrevention;
	}

	/**
	 * A modifiable or non-modifiable factor that increases the risk of a
	 * patient contracting this condition, e.g. age, coexisting condition.
	 */
	public MedicalRiskFactor getRiskFactor() {
		return this.riskFactor;
	}

	/**
	 * A modifiable or non-modifiable factor that increases the risk of a
	 * patient contracting this condition, e.g. age, coexisting condition.
	 */
	public void setRiskFactor(MedicalRiskFactor riskFactor) {
		this.riskFactor = riskFactor;
	}

	/**
	 * A preventative therapy used to prevent reoccurrence of the medical
	 * condition after an initial episode of the condition.
	 */
	public MedicalTherapy getSecondaryPrevention() {
		return this.secondaryPrevention;
	}

	/**
	 * A preventative therapy used to prevent reoccurrence of the medical
	 * condition after an initial episode of the condition.
	 */
	public void setSecondaryPrevention(MedicalTherapy secondaryPrevention) {
		this.secondaryPrevention = secondaryPrevention;
	}

	/**
	 * A sign or symptom of this condition. Signs are objective or physically
	 * observable manifestations of the medical condition while symptoms are the
	 * subjective experienceof the medical condition.
	 */
	public MedicalSignOrSymptom getSignOrSymptom() {
		return this.signOrSymptom;
	}

	/**
	 * A sign or symptom of this condition. Signs are objective or physically
	 * observable manifestations of the medical condition while symptoms are the
	 * subjective experienceof the medical condition.
	 */
	public void setSignOrSymptom(MedicalSignOrSymptom signOrSymptom) {
		this.signOrSymptom = signOrSymptom;
	}

	/**
	 * The stage of the condition, if applicable.
	 */
	public MedicalConditionStage getStage() {
		return this.stage;
	}

	/**
	 * The stage of the condition, if applicable.
	 */
	public void setStage(MedicalConditionStage stage) {
		this.stage = stage;
	}

	/**
	 * A more specific type of the condition, where applicable, for example
	 * 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for
	 * Diabetes.
	 */
	public String getSubtype() {
		return this.subtype;
	}

	/**
	 * A more specific type of the condition, where applicable, for example
	 * 'Type 1 Diabetes', 'Type 2 Diabetes', or 'Gestational Diabetes' for
	 * Diabetes.
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	/**
	 * A medical test typically performed given this condition.
	 */
	public MedicalTest getTypicalTest() {
		return this.typicalTest;
	}

	/**
	 * A medical test typically performed given this condition.
	 */
	public void setTypicalTest(MedicalTest typicalTest) {
		this.typicalTest = typicalTest;
	}
}
