package com.texelz.schemorger.model;

/**
 *
 * A structured value providing information about when a certain organization or person owned a certain product.
 * @fullPath Thing > Intangible > StructuredValue > OwnershipInfo
 *
 * @author Texelz (by Onhate)
 *
 */
public class OwnershipInfo extends StructuredValue {

	private Object acquiredFrom;
	private java.util.Date ownedFrom;
	private java.util.Date ownedThrough;
	private Product typeOfGood;
	/**
	 * The organization or person from which the product was acquired.
	 * @see Person
	 * @see Organization
	 */
	public Object getAcquiredFrom() {
		return this.acquiredFrom;
	}
	public void setAcquiredFrom(Object acquiredFrom) {
		this.acquiredFrom = acquiredFrom;
	}
	/**
	 * The date and time of obtaining the product.
	 */
	public java.util.Date getOwnedFrom() {
		return this.ownedFrom;
	}
	public void setOwnedFrom(java.util.Date ownedFrom) {
		this.ownedFrom = ownedFrom;
	}
	/**
	 * The date and time of giving up ownership on the product.
	 */
	public java.util.Date getOwnedThrough() {
		return this.ownedThrough;
	}
	public void setOwnedThrough(java.util.Date ownedThrough) {
		this.ownedThrough = ownedThrough;
	}
	/**
	 * The product that this structured value is referring to.
	 */
	public Product getTypeOfGood() {
		return this.typeOfGood;
	}
	public void setTypeOfGood(Product typeOfGood) {
		this.typeOfGood = typeOfGood;
	}
}
