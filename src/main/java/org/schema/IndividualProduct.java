package org.schema;

/**
 * 
 * A single, identifiable product instance (e.g. a laptop with a particular
 * serial number).
 * 
 * @fullPath Thing > Product > IndividualProduct
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class IndividualProduct extends Product {

	private String serialNumber;

	/**
	 * The serial number or any alphanumeric identifier of a particular product.
	 * When attached to an offer, it is a shortcut for the serial number of the
	 * product included in the offer.
	 */
	public String getSerialNumber() {
		return this.serialNumber;
	}

	/**
	 * The serial number or any alphanumeric identifier of a particular product.
	 * When attached to an offer, it is a shortcut for the serial number of the
	 * product included in the offer.
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
