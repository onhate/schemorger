package org.schema;

/**
 * 
 * A reservation for air travel.
 * 
 * @fullPath Thing > Intangible > Reservation > FlightReservation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class FlightReservation extends Reservation {

	private String boardingGroup;

	/**
	 * The airline-specific indicator of boarding order / preference.
	 */
	public String getBoardingGroup() {
		return this.boardingGroup;
	}

	/**
	 * The airline-specific indicator of boarding order / preference.
	 */
	public void setBoardingGroup(String boardingGroup) {
		this.boardingGroup = boardingGroup;
	}
}
