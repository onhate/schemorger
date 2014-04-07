package com.texelz.schemorger.model;

/**
 *
 * The delivery of a parcel either via the postal service or a commercial service.
 * @fullPath Thing > Intangible > ParcelDelivery
 *
 * @author Texelz (by Onhate)
 *
 */
public class ParcelDelivery extends Intangible {

	private Object carrier;
	private PostalAddress deliveryAddress;
	private DeliveryEvent deliveryStatus;
	private java.util.Date expectedArrivalFrom;
	private java.util.Date expectedArrivalUntil;
	private DeliveryMethod hasDeliveryMethod;
	private Product itemShipped;
	private PostalAddress originAddress;
	private Order partOfOrder;
	private String trackingNumber;
	private com.texelz.schemorger.definition.Link trackingUrl;
	/**
	 * The party responsible for the parcel delivery.
	 * @see Airline
	 * @see Organization
	 */
	public Object getCarrier() {
		return this.carrier;
	}
	public void setCarrier(Object carrier) {
		this.carrier = carrier;
	}
	/**
	 * Destination address.
	 */
	public PostalAddress getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(PostalAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	/**
	 * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
	 */
	public DeliveryEvent getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(DeliveryEvent deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	/**
	 * The earliest date the package may arrive.
	 */
	public java.util.Date getExpectedArrivalFrom() {
		return this.expectedArrivalFrom;
	}
	public void setExpectedArrivalFrom(java.util.Date expectedArrivalFrom) {
		this.expectedArrivalFrom = expectedArrivalFrom;
	}
	/**
	 * The latest date the package may arrive.
	 */
	public java.util.Date getExpectedArrivalUntil() {
		return this.expectedArrivalUntil;
	}
	public void setExpectedArrivalUntil(java.util.Date expectedArrivalUntil) {
		this.expectedArrivalUntil = expectedArrivalUntil;
	}
	/**
	 * Method used for delivery or shipping.
	 */
	public DeliveryMethod getHasDeliveryMethod() {
		return this.hasDeliveryMethod;
	}
	public void setHasDeliveryMethod(DeliveryMethod hasDeliveryMethod) {
		this.hasDeliveryMethod = hasDeliveryMethod;
	}
	/**
	 * Item(s) being shipped.
	 */
	public Product getItemShipped() {
		return this.itemShipped;
	}
	public void setItemShipped(Product itemShipped) {
		this.itemShipped = itemShipped;
	}
	/**
	 * Shipper's address.
	 */
	public PostalAddress getOriginAddress() {
		return this.originAddress;
	}
	public void setOriginAddress(PostalAddress originAddress) {
		this.originAddress = originAddress;
	}
	/**
	 * The overall order the items in this delivery were included in.
	 */
	public Order getPartOfOrder() {
		return this.partOfOrder;
	}
	public void setPartOfOrder(Order partOfOrder) {
		this.partOfOrder = partOfOrder;
	}
	/**
	 * Shipper tracking number.
	 */
	public String getTrackingNumber() {
		return this.trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	/**
	 * Tracking url for the parcel delivery.
	 */
	public com.texelz.schemorger.definition.Link getTrackingUrl() {
		return this.trackingUrl;
	}
	public void setTrackingUrl(com.texelz.schemorger.definition.Link trackingUrl) {
		this.trackingUrl = trackingUrl;
	}
}
