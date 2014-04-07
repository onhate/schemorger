package com.texelz.schemorger.model;

/**
 *
 * A type of blood vessel that specifically carries blood away from the heart.
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
	public void setArterialBranch(AnatomicalStructure arterialBranch) {
		this.arterialBranch = arterialBranch;
	}
	/**
	 * The anatomical or organ system that the artery originates from.
	 */
	public AnatomicalStructure getSource() {
		return this.source;
	}
	public void setSource(AnatomicalStructure source) {
		this.source = source;
	}
	/**
	 * The area to which the artery supplies blood to.
	 */
	public AnatomicalStructure getSupplyTo() {
		return this.supplyTo;
	}
	public void setSupplyTo(AnatomicalStructure supplyTo) {
		this.supplyTo = supplyTo;
	}
}
