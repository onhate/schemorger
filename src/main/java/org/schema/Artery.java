package org.schema;

/**
 * 
 * A type of blood vessel that specifically carries blood away from the heart.
 * 
 * @fullPath Thing > MedicalEntity > AnatomicalStructure > Vessel > Artery
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Artery extends Vessel {

	private AnatomicalStructure arterialBranch;
	private AnatomicalStructure source;
	private AnatomicalStructure supplyTo;

	/**
	 * The branches that comprise the arterial structure.
	 */
	public AnatomicalStructure getArterialBranch() {
		return this.arterialBranch;
	}

	/**
	 * The branches that comprise the arterial structure.
	 */
	public void setArterialBranch(AnatomicalStructure arterialBranch) {
		this.arterialBranch = arterialBranch;
	}

	/**
	 * The anatomical or organ system that the artery originates from.
	 */
	public AnatomicalStructure getSource() {
		return this.source;
	}

	/**
	 * The anatomical or organ system that the artery originates from.
	 */
	public void setSource(AnatomicalStructure source) {
		this.source = source;
	}

	/**
	 * The area to which the artery supplies blood to.
	 */
	public AnatomicalStructure getSupplyTo() {
		return this.supplyTo;
	}

	/**
	 * The area to which the artery supplies blood to.
	 */
	public void setSupplyTo(AnatomicalStructure supplyTo) {
		this.supplyTo = supplyTo;
	}
}
