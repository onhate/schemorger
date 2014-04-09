package org.schema;

/**
 * 
 * Used to describe a seat, such as a reserved seat in an event reservation.
 * 
 * @fullPath Thing > Intangible > Seat
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Seat extends Intangible {

	private String seatNumber;
	private String seatRow;
	private String seatSection;
	private Object seatingType;

	/**
	 * The location of the reserved seat (e.g., 27).
	 */
	public String getSeatNumber() {
		return this.seatNumber;
	}

	/**
	 * The location of the reserved seat (e.g., 27).
	 */
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	/**
	 * The row location of the reserved seat (e.g., B).
	 */
	public String getSeatRow() {
		return this.seatRow;
	}

	/**
	 * The row location of the reserved seat (e.g., B).
	 */
	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}

	/**
	 * The section location of the reserved seat (e.g. Orchestra).
	 */
	public String getSeatSection() {
		return this.seatSection;
	}

	/**
	 * The section location of the reserved seat (e.g. Orchestra).
	 */
	public void setSeatSection(String seatSection) {
		this.seatSection = seatSection;
	}

	/**
	 * The type/class of the seat.
	 * 
	 * @see Text
	 * @see QualitativeValue
	 */
	public Object getSeatingType() {
		return this.seatingType;
	}

	/**
	 * The type/class of the seat.
	 * 
	 * @see Text
	 * @see QualitativeValue
	 */
	public void setSeatingType(Object seatingType) {
		this.seatingType = seatingType;
	}
}
