package org.schema;

/**
 * 
 * A reservation for a taxi.
 * 
 * @fullPath Thing > Intangible > Reservation > TaxiReservation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TaxiReservation extends Reservation {

	private Object partySize;
	private Place pickupLocation;
	private java.util.Date pickupTime;

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
	 * Where a taxi will pick up a passenger or a rental car can be picked up.
	 */
	public Place getPickupLocation() {
		return this.pickupLocation;
	}

	/**
	 * Where a taxi will pick up a passenger or a rental car can be picked up.
	 */
	public void setPickupLocation(Place pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	/**
	 * When a taxi will pickup a passegner or a rental car can be picked up.
	 */
	public java.util.Date getPickupTime() {
		return this.pickupTime;
	}

	/**
	 * When a taxi will pickup a passegner or a rental car can be picked up.
	 */
	public void setPickupTime(java.util.Date pickupTime) {
		this.pickupTime = pickupTime;
	}
}
