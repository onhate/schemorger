package com.texelz.schemorger.model;

/**
 *
 * A common pathway for the electrochemical nerve impulses that are transmitted along each of the axons.
 * @fullPath Thing > MedicalEntity > AnatomicalStructure > Nerve
 *
 * @author Texelz (by Onhate)
 *
 */
public class Nerve extends AnatomicalStructure {

	private Object branch;
	private Muscle nerveMotor;
	private Object sensoryUnit;
	private BrainStructure sourcedFrom;
	/**
	 * The branches that delineate from the nerve bundle.
	 * @see Nerve
	 * @see AnatomicalStructure
	 */
	public Object getBranch() {
		return this.branch;
	}
	public void setBranch(Object branch) {
		this.branch = branch;
	}
	/**
	 * The neurological pathway extension that involves muscle control.
	 */
	public Muscle getNerveMotor() {
		return this.nerveMotor;
	}
	public void setNerveMotor(Muscle nerveMotor) {
		this.nerveMotor = nerveMotor;
	}
	/**
	 * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
	 * @see AnatomicalStructure
	 * @see SuperficialAnatomy
	 */
	public Object getSensoryUnit() {
		return this.sensoryUnit;
	}
	public void setSensoryUnit(Object sensoryUnit) {
		this.sensoryUnit = sensoryUnit;
	}
	/**
	 * The neurological pathway that originates the neurons.
	 */
	public BrainStructure getSourcedFrom() {
		return this.sourcedFrom;
	}
	public void setSourcedFrom(BrainStructure sourcedFrom) {
		this.sourcedFrom = sourcedFrom;
	}
}
