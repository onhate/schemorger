package org.schema;

/**
 * 
 * A reservation for a rental car.
 * 
 * @fullPath Thing > Intangible > Reservation > RentalCarReservation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class RentalCarReservation extends Reservation {

	private Place dropoffLocation;
	private java.util.Date dropoffTime;
	private Place pickupLocation;
	private java.util.Date pickupTime;

	/**
	 * Where a rental car can be dropped off.
	 */
	public Place getDropoffLocation() {
		return this.dropoffLocation;
	}

	/**
	 * Where a rental car can be dropped off.
	 */
	public void setDropoffLocation(Place dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}

	/**
	 * When a rental car can be dropped off.
	 */
	public java.util.Date getDropoffTime() {
		return this.dropoffTime;
	}

	/**
	 * When a rental car can be dropped off.
	 */
	public void setDropoffTime(java.util.Date dropoffTime) {
		this.dropoffTime = dropoffTime;
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
