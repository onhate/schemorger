package org.schema;

/**
 * 
 * The act of participating in an exchange of goods and services for monetary
 * compensation. An agent trades an object, product or service with a
 * participant in exchange for a one time or periodic payment.
 * 
 * @fullPath Thing > Action > TradeAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TradeAction extends Action {

	private Object price;

	/**
	 * The offer price of a product, or of a price component when attached to
	 * PriceSpecification and its subtypes.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getPrice() {
		return this.price;
	}

	/**
	 * The offer price of a product, or of a price component when attached to
	 * PriceSpecification and its subtypes.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setPrice(Object price) {
		this.price = price;
	}
}
