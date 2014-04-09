package org.schema;

/**
 * 
 * A structured value providing information about the opening hours of a place
 * or a certain service inside a place.
 * 
 * @fullPath Thing > Intangible > StructuredValue > OpeningHoursSpecification
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class OpeningHoursSpecification extends StructuredValue {

	private java.util.Date closes;
	private DayOfWeek dayOfWeek;
	private java.util.Date opens;
	private java.util.Date validFrom;
	private java.util.Date validThrough;

	/**
	 * The closing hour of the place or service on the given day(s) of the week.
	 */
	public java.util.Date getCloses() {
		return this.closes;
	}

	/**
	 * The closing hour of the place or service on the given day(s) of the week.
	 */
	public void setCloses(java.util.Date closes) {
		this.closes = closes;
	}

	/**
	 * The day of the week for which these opening hours are valid.
	 */
	public DayOfWeek getDayOfWeek() {
		return this.dayOfWeek;
	}

	/**
	 * The day of the week for which these opening hours are valid.
	 */
	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	/**
	 * The opening hour of the place or service on the given day(s) of the week.
	 */
	public java.util.Date getOpens() {
		return this.opens;
	}

	/**
	 * The opening hour of the place or service on the given day(s) of the week.
	 */
	public void setOpens(java.util.Date opens) {
		this.opens = opens;
	}

	/**
	 * The date when the item becomes valid.
	 */
	public java.util.Date getValidFrom() {
		return this.validFrom;
	}

	/**
	 * The date when the item becomes valid.
	 */
	public void setValidFrom(java.util.Date validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * The end of the validity of offer, price specification, or opening hours
	 * data.
	 */
	public java.util.Date getValidThrough() {
		return this.validThrough;
	}

	/**
	 * The end of the validity of offer, price specification, or opening hours
	 * data.
	 */
	public void setValidThrough(java.util.Date validThrough) {
		this.validThrough = validThrough;
	}
}
