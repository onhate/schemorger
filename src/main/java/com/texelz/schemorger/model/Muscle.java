package com.texelz.schemorger.model;

/**
 *
 * A muscle is an anatomical structure consisting of a contractile form of tissue that animals use to effect movement.
 * @fullPath Thing > MedicalEntity > AnatomicalStructure > Muscle
 *
 * @author Texelz (by Onhate)
 *
 */
public class Muscle extends AnatomicalStructure {

	private String action;
	private Muscle antagonist;
	private Vessel bloodSupply;
	private AnatomicalStructure insertion;
	private Nerve nerve;
	private AnatomicalStructure origin;
	/**
	 * The movement the muscle generates.
	 */
	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * The muscle whose action counteracts the specified muscle.
	 */
	public Muscle getAntagonist() {
		return this.antagonist;
	}
	public void setAntagonist(Muscle antagonist) {
		this.antagonist = antagonist;
	}
	/**
	 * The blood vessel that carries blood from the heart to the muscle.
	 */
	public Vessel getBloodSupply() {
		return this.bloodSupply;
	}
	public void setBloodSupply(Vessel bloodSupply) {
		this.bloodSupply = bloodSupply;
	}
	/**
	 * The place of attachment of a muscle, or what the muscle moves.
	 */
	public AnatomicalStructure getInsertion() {
		return this.insertion;
	}
	public void setInsertion(AnatomicalStructure insertion) {
		this.insertion = insertion;
	}
	/**
	 * The underlying innervation associated with the muscle.
	 */
	public Nerve getNerve() {
		return this.nerve;
	}
	public void setNerve(Nerve nerve) {
		this.nerve = nerve;
	}
	/**
	 * The place or point where a muscle arises.
	 */
	public AnatomicalStructure getOrigin() {
		return this.origin;
	}
	public void setOrigin(AnatomicalStructure origin) {
		this.origin = origin;
	}
}
