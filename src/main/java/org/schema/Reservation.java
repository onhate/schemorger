package org.schema;

/**
 * 
 * Describes a reservation for travel, dining or an event. Some reservations
 * require tickets.
 * 
 * @fullPath Thing > Intangible > Reservation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Reservation extends Intangible {

	private Object bookingAgent;
	private java.util.Date bookingTime;
	private java.util.Date modifiedTime;
	private String priceCurrency;
	private ProgramMembership programMembershipUsed;
	private Object provider;
	private Thing reservationFor;
	private String reservationId;
	private ReservationStatusType reservationStatus;
	private Ticket reservedTicket;
	private Object totalPrice;
	private Object underName;

	/**
	 * If the reservation was not booked directly through the provider, the
	 * third-party booking agent can be recorded through this property.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Object getBookingAgent() {
		return this.bookingAgent;
	}

	/**
	 * If the reservation was not booked directly through the provider, the
	 * third-party booking agent can be recorded through this property.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public void setBookingAgent(Object bookingAgent) {
		this.bookingAgent = bookingAgent;
	}

	/**
	 * The date and time the reservation was booked.
	 */
	public java.util.Date getBookingTime() {
		return this.bookingTime;
	}

	/**
	 * The date and time the reservation was booked.
	 */
	public void setBookingTime(java.util.Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	/**
	 * The date and time the reservation was modified.
	 */
	public java.util.Date getModifiedTime() {
		return this.modifiedTime;
	}

	/**
	 * The date and time the reservation was modified.
	 */
	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price
	 * component, when attached to PriceSpecification and its subtypes.
	 */
	public String getPriceCurrency() {
		return this.priceCurrency;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price
	 * component, when attached to PriceSpecification and its subtypes.
	 */
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	/**
	 * Any membership in a frequent flyer, hotel loyalty program, etc. being
	 * applied to the reservation.
	 */
	public ProgramMembership getProgramMembershipUsed() {
		return this.programMembershipUsed;
	}

	/**
	 * Any membership in a frequent flyer, hotel loyalty program, etc. being
	 * applied to the reservation.
	 */
	public void setProgramMembershipUsed(ProgramMembership programMembershipUsed) {
		this.programMembershipUsed = programMembershipUsed;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getProvider() {
		return this.provider;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setProvider(Object provider) {
		this.provider = provider;
	}

	/**
	 * The thing -- flight, event, restaurant,etc. being reserved.
	 */
	public Thing getReservationFor() {
		return this.reservationFor;
	}

	/**
	 * The thing -- flight, event, restaurant,etc. being reserved.
	 */
	public void setReservationFor(Thing reservationFor) {
		this.reservationFor = reservationFor;
	}

	/**
	 * A unique identifier for the reservation.
	 */
	public String getReservationId() {
		return this.reservationId;
	}

	/**
	 * A unique identifier for the reservation.
	 */
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 * The current status of the reservation.
	 */
	public ReservationStatusType getReservationStatus() {
		return this.reservationStatus;
	}

	/**
	 * The current status of the reservation.
	 */
	public void setReservationStatus(ReservationStatusType reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

	/**
	 * A ticket associated with the reservation.
	 */
	public Ticket getReservedTicket() {
		return this.reservedTicket;
	}

	/**
	 * A ticket associated with the reservation.
	 */
	public void setReservedTicket(Ticket reservedTicket) {
		this.reservedTicket = reservedTicket;
	}

	/**
	 * The total price for the reservation or ticket, including applicable
	 * taxes, shipping, etc.
	 * 
	 * @see PriceSpecification
	 * @see Text
	 * @see Number
	 */
	public Object getTotalPrice() {
		return this.totalPrice;
	}

	/**
	 * The total price for the reservation or ticket, including applicable
	 * taxes, shipping, etc.
	 * 
	 * @see PriceSpecification
	 * @see Text
	 * @see Number
	 */
	public void setTotalPrice(Object totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * The person or organization the reservation or ticket is for.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Object getUnderName() {
		return this.underName;
	}

	/**
	 * The person or organization the reservation or ticket is for.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public void setUnderName(Object underName) {
		this.underName = underName;
	}
}
