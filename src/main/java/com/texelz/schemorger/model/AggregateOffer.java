package com.texelz.schemorger.model;

/**
<<<<<<< HEAD
 *
 * When a single product that has different offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.
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
	 * @see Text
	 * @see Number
	 */
	public Object getHighPrice() {
		return this.highPrice;
	}
	public void setHighPrice(Object highPrice) {
		this.highPrice = highPrice;
	}
	/**
	 * The lowest price of all offers available.
	 * @see Text
	 * @see Number
	 */
	public Object getLowPrice() {
		return this.lowPrice;
	}
	public void setLowPrice(Object lowPrice) {
		this.lowPrice = lowPrice;
	}
=======
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

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
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
