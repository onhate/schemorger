package org.schema;

/**
 * 
 * A group of multiple reservations with common values for all sub-reservations.
 * 
 * @fullPath Thing > Intangible > Reservation > ReservationPackage
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ReservationPackage extends Reservation {

	private Reservation subReservation;

	/**
	 * The individual reservations included in the package. Typically a repeated
	 * property.
	 */
	public Reservation getSubReservation() {
		return this.subReservation;
	}

	/**
	 * The individual reservations included in the package. Typically a repeated
	 * property.
	 */
	public void setSubReservation(Reservation subReservation) {
		this.subReservation = subReservation;
	}
}
