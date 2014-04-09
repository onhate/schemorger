package org.schema;

/**
 * 
 * A process of care used in either a diagnostic, therapeutic, or palliative
 * capacity that relies on invasive (surgical), non-invasive, or percutaneous
 * techniques.
 * 
 * @fullPath Thing > MedicalEntity > MedicalProcedure
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalProcedure extends MedicalEntity {

	private String followup;
	private String howPerformed;
	private String preparation;
	private MedicalProcedureType procedureType;

	/**
	 * Typical or recommended followup care after the procedure is performed.
	 */
	public String getFollowup() {
		return this.followup;
	}

	/**
	 * Typical or recommended followup care after the procedure is performed.
	 */
	public void setFollowup(String followup) {
		this.followup = followup;
	}

	/**
	 * How the procedure is performed.
	 */
	public String getHowPerformed() {
		return this.howPerformed;
	}

	/**
	 * How the procedure is performed.
	 */
	public void setHowPerformed(String howPerformed) {
		this.howPerformed = howPerformed;
	}

	/**
	 * Typical preparation that a patient must undergo before having the
	 * procedure performed.
	 */
	public String getPreparation() {
		return this.preparation;
	}

	/**
	 * Typical preparation that a patient must undergo before having the
	 * procedure performed.
	 */
	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}

	/**
	 * The type of procedure, for example Surgical, Noninvasive, or
	 * Percutaneous.
	 */
	public MedicalProcedureType getProcedureType() {
		return this.procedureType;
	}

	/**
	 * The type of procedure, for example Surgical, Noninvasive, or
	 * Percutaneous.
	 */
	public void setProcedureType(MedicalProcedureType procedureType) {
		this.procedureType = procedureType;
	}
}
