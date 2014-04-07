package com.texelz.schemorger.model;

/**
 * 
 * When a single product that has different offers (for example, the same pair
 * of shoes is offered by different merchants), then AggregateOffer can be used.
 * 
 * @fullPath Thing > Intangible > Offer > AggregateOffer
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AggregateOffer extends Offer {

	private Thing highPrice;
	private Thing lowPrice;
	private Integer offerCount;

	/**
	 * The highest price of all offers available.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Thing getHighPrice() {
		return this.highPrice;
	}

	public void setHighPrice(Thing highPrice) {
		this.highPrice = highPrice;
	}

	/**
	 * The lowest price of all offers available.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Thing getLowPrice() {
		return this.lowPrice;
	}

	public void setLowPrice(Thing lowPrice) {
		this.lowPrice = lowPrice;
	}

	/**
	 * The number of offers for the product.
	 */
	public Integer getOfferCount() {
		return this.offerCount;
	}

	public void setOfferCount(Integer offerCount) {
		this.offerCount = offerCount;
	}
}
