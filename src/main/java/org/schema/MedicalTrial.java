package org.schema;

/**
 * 
 * A medical trial is a type of medical study that uses scientific process used
 * to compare the safety and efficacy of medical therapies or medical
 * procedures. In general, medical trials are controlled and subjects are
 * allocated at random to the different treatment and/or control groups.
 * 
 * @fullPath Thing > MedicalEntity > MedicalStudy > MedicalTrial
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalTrial extends MedicalStudy {

	private String phase;
	private MedicalTrialDesign trialDesign;

	/**
	 * The phase of the trial.
	 */
	public String getPhase() {
		return this.phase;
	}

	/**
	 * The phase of the trial.
	 */
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * Specifics about the trial design (enumerated).
	 */
	public MedicalTrialDesign getTrialDesign() {
		return this.trialDesign;
	}

	/**
	 * Specifics about the trial design (enumerated).
	 */
	public void setTrialDesign(MedicalTrialDesign trialDesign) {
		this.trialDesign = trialDesign;
	}
}
