package com.texelz.schemorger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product extends Thing {

	private String sku;
	private Date releaseDate;

	private AggregateRating aggregateRating;
	private Thing brand;

	private List<Offer> offers;

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Thing getBrand() {
		return brand;
	}

	public void setBrand(Thing brand) {
		this.brand = brand;
	}

	public List<Offer> buildOffers() {
		return offers = new ArrayList<Offer>(1);
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

	public AggregateRating buildAggregateRating() {
		return aggregateRating = new AggregateRating();
	}

	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

}
