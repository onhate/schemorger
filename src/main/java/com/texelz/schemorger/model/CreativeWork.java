package com.texelz.schemorger.model;

import java.util.ArrayList;
import java.util.List;

import com.texelz.schemorger.definition.Link;

public class CreativeWork extends Thing {
	private AggregateRating aggregateRating;
	private Link image;
	
	private List<Offer> offers;

	public Link getImage() {
		return image;
	}

	public void setImage(Link image) {
		this.image = image;
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
