package org.schema;

/**
 * 
 * A type of blood vessel that specifically carries lymph fluid unidirectionally
 * toward the heart.
 * 
 * @fullPath Thing > MedicalEntity > AnatomicalStructure > Vessel >
 *           LymphaticVessel
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class LymphaticVessel extends Vessel {

	private Vessel originatesFrom;
	private Object regionDrained;
	private Vessel runsTo;

	/**
	 * The vasculature the lymphatic structure originates, or afferents, from.
	 */
	public Vessel getOriginatesFrom() {
		return this.originatesFrom;
	}

	/**
	 * The vasculature the lymphatic structure originates, or afferents, from.
	 */
	public void setOriginatesFrom(Vessel originatesFrom) {
		this.originatesFrom = originatesFrom;
	}

	/**
	 * The anatomical or organ system drained by this vessel; generally refers
	 * to a specific part of an organ.
	 * 
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public Object getRegionDrained() {
		return this.regionDrained;
	}

	/**
	 * The anatomical or organ system drained by this vessel; generally refers
	 * to a specific part of an organ.
	 * 
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public void setRegionDrained(Object regionDrained) {
		this.regionDrained = regionDrained;
	}

	/**
	 * The vasculature the lymphatic structure runs, or efferents, to.
	 */
	public Vessel getRunsTo() {
		return this.runsTo;
	}

	/**
	 * The vasculature the lymphatic structure runs, or efferents, to.
	 */
	public void setRunsTo(Vessel runsTo) {
		this.runsTo = runsTo;
	}
}
