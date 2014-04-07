package com.texelz.schemorger.model;

/**
 *
 * Used to describe a ticket to an event, a flight, a bus ride, etc.
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
	public void setDateIssued(java.util.Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	/**
	 * The organization issuing the permit.
	 */
	public Organization getIssuedBy() {
		return this.issuedBy;
	}
	public void setIssuedBy(Organization issuedBy) {
		this.issuedBy = issuedBy;
	}
	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price component, when attached to PriceSpecification and its subtypes.
	 */
	public String getPriceCurrency() {
		return this.priceCurrency;
	}
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}
	/**
	 * The unique identifier for the ticket.
	 */
	public String getTicketNumber() {
		return this.ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	/**
	 * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
	 * @see URL
	 * @see Text
	 */
	public Object getTicketToken() {
		return this.ticketToken;
	}
	public void setTicketToken(Object ticketToken) {
		this.ticketToken = ticketToken;
	}
	/**
	 * The seat associated with the ticket.
	 */
	public Seat getTicketedSeat() {
		return this.ticketedSeat;
	}
	public void setTicketedSeat(Seat ticketedSeat) {
		this.ticketedSeat = ticketedSeat;
	}
	/**
	 * The total price for the reservation or ticket, including applicable taxes, shipping, etc.
	 * @see Text
	 * @see Number
	 * @see PriceSpecification
	 */
	public Object getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(Object totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * The person or organization the reservation or ticket is for.
	 * @see Person
	 * @see Organization
	 */
	public Object getUnderName() {
		return this.underName;
	}
	public void setUnderName(Object underName) {
		this.underName = underName;
	}
}
