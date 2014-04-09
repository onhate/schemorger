package org.schema;

/**
 * 
 * A common pathway for the electrochemical nerve impulses that are transmitted
 * along each of the axons.
 * 
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
	 * 
	 * @see Nerve
	 * @see AnatomicalStructure
	 */
	public Object getBranch() {
		return this.branch;
	}

	/**
	 * The branches that delineate from the nerve bundle.
	 * 
	 * @see Nerve
	 * @see AnatomicalStructure
	 */
	public void setBranch(Object branch) {
		this.branch = branch;
	}

	/**
	 * The neurological pathway extension that involves muscle control.
	 */
	public Muscle getNerveMotor() {
		return this.nerveMotor;
	}

	/**
	 * The neurological pathway extension that involves muscle control.
	 */
	public void setNerveMotor(Muscle nerveMotor) {
		this.nerveMotor = nerveMotor;
	}

	/**
	 * The neurological pathway extension that inputs and sends information to
	 * the brain or spinal cord.
	 * 
	 * @see SuperficialAnatomy
	 * @see AnatomicalStructure
	 */
	public Object getSensoryUnit() {
		return this.sensoryUnit;
	}

	/**
	 * The neurological pathway extension that inputs and sends information to
	 * the brain or spinal cord.
	 * 
	 * @see SuperficialAnatomy
	 * @see AnatomicalStructure
	 */
	public void setSensoryUnit(Object sensoryUnit) {
		this.sensoryUnit = sensoryUnit;
	}

	/**
	 * The neurological pathway that originates the neurons.
	 */
	public BrainStructure getSourcedFrom() {
		return this.sourcedFrom;
	}

	/**
	 * The neurological pathway that originates the neurons.
	 */
	public void setSourcedFrom(BrainStructure sourcedFrom) {
		this.sourcedFrom = sourcedFrom;
	}
}
