package org.schema;

/**
 * 
 * A reservation to dine at a food-related business.
 * 
 * @fullPath Thing > Intangible > Reservation > FoodEstablishmentReservation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class FoodEstablishmentReservation extends Reservation {

	private Object partySize;
	private java.util.Date startTime;

	/**
	 * Number of people the reservation should accomodate.
	 * 
	 * @see Number
	 * @see QuantitativeValue
	 */
	public Object getPartySize() {
		return this.partySize;
	}

	/**
	 * Number of people the reservation should accomodate.
	 * 
	 * @see Number
	 * @see QuantitativeValue
	 */
	public void setPartySize(Object partySize) {
		this.partySize = partySize;
	}

	/**
	 * When the Action was performed: start time. This is for actions that span
	 * a period of time. e.g. John wrote a book from *January* to December.
	 */
	public java.util.Date getStartTime() {
		return this.startTime;
	}

	/**
	 * When the Action was performed: start time. This is for actions that span
	 * a period of time. e.g. John wrote a book from *January* to December.
	 */
	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}
}
