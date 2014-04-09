package org.schema;

/**
 * 
 * Any medical intervention designed to prevent, treat, and cure human diseases
 * and medical conditions, including both curative and palliative therapies.
 * Medical therapies are typically processes of care relying upon
 * pharmacotherapy, behavioral therapy, supportive therapy (with fluid or
 * nutrition for example), or detoxification (e.g. hemodialysis) aimed at
 * improving or preventing a health condition.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTherapy
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalTherapy extends MedicalEntity {

	private MedicalEntity adverseOutcome;
	private MedicalContraindication contraindication;
	private MedicalTherapy duplicateTherapy;
	private MedicalIndication indication;
	private MedicalEntity seriousAdverseOutcome;

	/**
	 * A possible complication and/or side effect of this therapy. If it is
	 * known that an adverse outcome is serious (resulting in death, disability,
	 * or permanent damage; requiring hospitalization; or is otherwise
	 * life-threatening or requires immediate medical attention), tag it as a
	 * seriouseAdverseOutcome instead.
	 */
	public MedicalEntity getAdverseOutcome() {
		return this.adverseOutcome;
	}

	/**
	 * A possible complication and/or side effect of this therapy. If it is
	 * known that an adverse outcome is serious (resulting in death, disability,
	 * or permanent damage; requiring hospitalization; or is otherwise
	 * life-threatening or requires immediate medical attention), tag it as a
	 * seriouseAdverseOutcome instead.
	 */
	public void setAdverseOutcome(MedicalEntity adverseOutcome) {
		this.adverseOutcome = adverseOutcome;
	}

	/**
	 * A contraindication for this therapy.
	 */
	public MedicalContraindication getContraindication() {
		return this.contraindication;
	}

	/**
	 * A contraindication for this therapy.
	 */
	public void setContraindication(MedicalContraindication contraindication) {
		this.contraindication = contraindication;
	}

	/**
	 * A therapy that duplicates or overlaps this one.
	 */
	public MedicalTherapy getDuplicateTherapy() {
		return this.duplicateTherapy;
	}

	/**
	 * A therapy that duplicates or overlaps this one.
	 */
	public void setDuplicateTherapy(MedicalTherapy duplicateTherapy) {
		this.duplicateTherapy = duplicateTherapy;
	}

	/**
	 * A factor that indicates use of this therapy for treatment and/or
	 * prevention of a condition, symptom, etc. For therapies such as drugs,
	 * indications can include both officially-approved indications as well as
	 * off-label uses. These can be distinguished by using the
	 * ApprovedIndication subtype of MedicalIndication.
	 */
	public MedicalIndication getIndication() {
		return this.indication;
	}

	/**
	 * A factor that indicates use of this therapy for treatment and/or
	 * prevention of a condition, symptom, etc. For therapies such as drugs,
	 * indications can include both officially-approved indications as well as
	 * off-label uses. These can be distinguished by using the
	 * ApprovedIndication subtype of MedicalIndication.
	 */
	public void setIndication(MedicalIndication indication) {
		this.indication = indication;
	}

	/**
	 * A possible serious complication and/or serious side effect of this
	 * therapy. Serious adverse outcomes include those that are
	 * life-threatening; result in death, disability, or permanent damage;
	 * require hospitalization or prolong existing hospitalization; cause
	 * congenital anomalies or birth defects; or jeopardize the patient and may
	 * require medical or surgical intervention to prevent one of the outcomes
	 * in this definition.
	 */
	public MedicalEntity getSeriousAdverseOutcome() {
		return this.seriousAdverseOutcome;
	}

	/**
	 * A possible serious complication and/or serious side effect of this
	 * therapy. Serious adverse outcomes include those that are
	 * life-threatening; result in death, disability, or permanent damage;
	 * require hospitalization or prolong existing hospitalization; cause
	 * congenital anomalies or birth defects; or jeopardize the patient and may
	 * require medical or surgical intervention to prevent one of the outcomes
	 * in this definition.
	 */
	public void setSeriousAdverseOutcome(MedicalEntity seriousAdverseOutcome) {
		this.seriousAdverseOutcome = seriousAdverseOutcome;
	}
}
