package org.schema;

/**
 * 
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
 * 
 * @fullPath Thing > Intangible > Ticket
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Ticket extends Intangible {

	private java.util.Date dateIssued;
	private Organization issuedBy;
	private String priceCurrency;
	private String ticketNumber;
	private Object ticketToken;
	private Seat ticketedSeat;
	private Object totalPrice;
	private Object underName;

	/**
	 * The date the ticket was issued.
	 */
	public java.util.Date getDateIssued() {
		return this.dateIssued;
	}

	/**
	 * The date the ticket was issued.
	 */
	public void setDateIssued(java.util.Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	/**
	 * The organization issuing the permit.
	 */
	public Organization getIssuedBy() {
		return this.issuedBy;
	}

	/**
	 * The organization issuing the permit.
	 */
	public void setIssuedBy(Organization issuedBy) {
		this.issuedBy = issuedBy;
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
	 * The unique identifier for the ticket.
	 */
	public String getTicketNumber() {
		return this.ticketNumber;
	}

	/**
	 * The unique identifier for the ticket.
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for
	 * entrance.
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getTicketToken() {
		return this.ticketToken;
	}

	/**
	 * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for
	 * entrance.
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setTicketToken(Object ticketToken) {
		this.ticketToken = ticketToken;
	}

	/**
	 * The seat associated with the ticket.
	 */
	public Seat getTicketedSeat() {
		return this.ticketedSeat;
	}

	/**
	 * The seat associated with the ticket.
	 */
	public void setTicketedSeat(Seat ticketedSeat) {
		this.ticketedSeat = ticketedSeat;
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
