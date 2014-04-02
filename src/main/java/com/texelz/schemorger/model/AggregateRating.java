package com.texelz.schemorger.model;

import com.texelz.schemorger.definition.Scoped;

public class AggregateRating extends Scoped {

	private Double ratingValue;
	private Integer reviewCount;

	public Double getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(Double ratingValue) {
		this.ratingValue = ratingValue;
	}

	public Integer getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(Integer reviewCount) {
		this.reviewCount = reviewCount;
	}
}
