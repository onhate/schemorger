package com.texelz.schemorger.model;

public class AggregateOffer extends Offer {
	private Double highPrice;
	private Double lowPrice;
	private Integer offerCount;

	public Double getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(Double highPrice) {
		this.highPrice = highPrice;
	}

	public Double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Integer getOfferCount() {
		return offerCount;
	}

	public void setOfferCount(Integer offerCount) {
		this.offerCount = offerCount;
	}

}
