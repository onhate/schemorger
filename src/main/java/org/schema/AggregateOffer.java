package org.schema;

/**
 * 
 * When a single product is associated with multiple offers (for example, the
 * same pair of shoes is offered by different merchants), then AggregateOffer
 * can be used.
 * 
 * @fullPath Thing > Intangible > Offer > AggregateOffer
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AggregateOffer extends Offer {

	private Object highPrice;
	private Object lowPrice;
	private Integer offerCount;

	/**
	 * The highest price of all offers available.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getHighPrice() {
		return this.highPrice;
	}

	/**
	 * The highest price of all offers available.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setHighPrice(Object highPrice) {
		this.highPrice = highPrice;
	}

	/**
	 * The lowest price of all offers available.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getLowPrice() {
		return this.lowPrice;
	}

	/**
	 * The lowest price of all offers available.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setLowPrice(Object lowPrice) {
		this.lowPrice = lowPrice;
	}

	/**
	 * The number of offers for the product.
	 */
	public Integer getOfferCount() {
		return this.offerCount;
	}

	/**
	 * The number of offers for the product.
	 */
	public void setOfferCount(Integer offerCount) {
		this.offerCount = offerCount;
	}
}
