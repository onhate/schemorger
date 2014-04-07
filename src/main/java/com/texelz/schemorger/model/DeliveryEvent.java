package com.texelz.schemorger.model;

/**
 *
 * An event involving the delivery of an item.
 * @fullPath Thing > Event > DeliveryEvent
 *
 * @author Texelz (by Onhate)
 *
 */
public class DeliveryEvent extends Event {

	private String accessCode;
	private java.util.Date availableFrom;
	private java.util.Date availableThrough;
	private DeliveryMethod hasDeliveryMethod;
	/**
	 * Password, PIN, or access code needed for delivery (e.g. from a locker).
	 */
	public String getAccessCode() {
		return this.accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	/**
	 * When the item is available for pickup from the store, locker, etc.
	 */
	public java.util.Date getAvailableFrom() {
		return this.availableFrom;
	}
	public void setAvailableFrom(java.util.Date availableFrom) {
		this.availableFrom = availableFrom;
	}
	/**
	 * After this date, the item will no longer be available for pickup.
	 */
	public java.util.Date getAvailableThrough() {
		return this.availableThrough;
	}
	public void setAvailableThrough(java.util.Date availableThrough) {
		this.availableThrough = availableThrough;
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
}
