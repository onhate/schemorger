package org.schema;

/**
 * 
 * A reservation for lodging at a hotel, motel, inn, etc.
 * 
 * @fullPath Thing > Intangible > Reservation > LodgingReservation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class LodgingReservation extends Reservation {

	private java.util.Date checkinTime;
	private java.util.Date checkoutTime;
	private String lodgingUnitDescription;
	private Object lodgingUnitType;
	private Object numAdults;
	private Object numChildren;

	/**
	 * The earliest someone may check into a lodging establishment.
	 */
	public java.util.Date getCheckinTime() {
		return this.checkinTime;
	}

	/**
	 * The earliest someone may check into a lodging establishment.
	 */
	public void setCheckinTime(java.util.Date checkinTime) {
		this.checkinTime = checkinTime;
	}

	/**
	 * The latest someone may check out of a lodging establishment.
	 */
	public java.util.Date getCheckoutTime() {
		return this.checkoutTime;
	}

	/**
	 * The latest someone may check out of a lodging establishment.
	 */
	public void setCheckoutTime(java.util.Date checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	/**
	 * A full description of the lodging unit.
	 */
	public String getLodgingUnitDescription() {
		return this.lodgingUnitDescription;
	}

	/**
	 * A full description of the lodging unit.
	 */
	public void setLodgingUnitDescription(String lodgingUnitDescription) {
		this.lodgingUnitDescription = lodgingUnitDescription;
	}

	/**
	 * Textual description of the unit type (including suite vs. room, size of
	 * bed, etc.).
	 * 
	 * @see Text
	 * @see QualitativeValue
	 */
	public Object getLodgingUnitType() {
		return this.lodgingUnitType;
	}

	/**
	 * Textual description of the unit type (including suite vs. room, size of
	 * bed, etc.).
	 * 
	 * @see Text
	 * @see QualitativeValue
	 */
	public void setLodgingUnitType(Object lodgingUnitType) {
		this.lodgingUnitType = lodgingUnitType;
	}

	/**
	 * The number of adults staying in the unit.
	 * 
	 * @see Number
	 * @see QuantitativeValue
	 */
	public Object getNumAdults() {
		return this.numAdults;
	}

	/**
	 * The number of adults staying in the unit.
	 * 
	 * @see Number
	 * @see QuantitativeValue
	 */
	public void setNumAdults(Object numAdults) {
		this.numAdults = numAdults;
	}

	/**
	 * The number of children staying in the unit.
	 * 
	 * @see Number
	 * @see QuantitativeValue
	 */
	public Object getNumChildren() {
		return this.numChildren;
	}

	/**
	 * The number of children staying in the unit.
	 * 
	 * @see Number
	 * @see QuantitativeValue
	 */
	public void setNumChildren(Object numChildren) {
		this.numChildren = numChildren;
	}
}
