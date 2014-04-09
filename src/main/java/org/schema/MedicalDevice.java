package org.schema;

/**
 * 
 * Any object used in a medical capacity, such as to diagnose or treat a
 * patient.
 * 
 * @fullPath Thing > MedicalEntity > MedicalDevice
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalDevice extends MedicalEntity {

	private MedicalEntity adverseOutcome;
	private MedicalContraindication contraindication;
	private MedicalIndication indication;
	private String postOp;
	private String preOp;
	private String procedure;
	private Object purpose;
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
	 * A description of the postoperative procedures, care, and/or followups for
	 * this device.
	 */
	public String getPostOp() {
		return this.postOp;
	}

	/**
	 * A description of the postoperative procedures, care, and/or followups for
	 * this device.
	 */
	public void setPostOp(String postOp) {
		this.postOp = postOp;
	}

	/**
	 * A description of the workup, testing, and other preparations required
	 * before implanting this device.
	 */
	public String getPreOp() {
		return this.preOp;
	}

	/**
	 * A description of the workup, testing, and other preparations required
	 * before implanting this device.
	 */
	public void setPreOp(String preOp) {
		this.preOp = preOp;
	}

	/**
	 * A description of the procedure involved in setting up, using, and/or
	 * installing the device.
	 */
	public String getProcedure() {
		return this.procedure;
	}

	/**
	 * A description of the procedure involved in setting up, using, and/or
	 * installing the device.
	 */
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	/**
	 * A goal towards an action is taken. Can be concrete or abstract.
	 * 
	 * @see MedicalDevicePurpose
	 * @see Thing
	 */
	public Object getPurpose() {
		return this.purpose;
	}

	/**
	 * A goal towards an action is taken. Can be concrete or abstract.
	 * 
	 * @see MedicalDevicePurpose
	 * @see Thing
	 */
	public void setPurpose(Object purpose) {
		this.purpose = purpose;
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
