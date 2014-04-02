package com.texelz.schemorger.model;

import com.texelz.schemorger.definition.Link;

public class Offer extends Intangible {
	private Double price;
	private Link availability;

	public Link getAvailability() {
		return availability;
	}

	public void setAvailability(Link availability) {
		this.availability = availability;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
