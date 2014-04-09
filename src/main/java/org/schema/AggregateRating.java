package org.schema;

/**
 * 
 * The average rating based on multiple ratings or reviews.
 * 
 * @fullPath Thing > Intangible > Rating > AggregateRating
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AggregateRating extends Rating {

	private Thing itemReviewed;
	private Double ratingCount;
	private Double reviewCount;

	/**
	 * The item that is being reviewed/rated.
	 */
	public Thing getItemReviewed() {
		return this.itemReviewed;
	}

	/**
	 * The item that is being reviewed/rated.
	 */
	public void setItemReviewed(Thing itemReviewed) {
		this.itemReviewed = itemReviewed;
	}

	/**
	 * The count of total number of ratings.
	 */
	public Double getRatingCount() {
		return this.ratingCount;
	}

	/**
	 * The count of total number of ratings.
	 */
	public void setRatingCount(Double ratingCount) {
		this.ratingCount = ratingCount;
	}

	/**
	 * The count of total number of reviews.
	 */
	public Double getReviewCount() {
		return this.reviewCount;
	}

	/**
	 * The count of total number of reviews.
	 */
	public void setReviewCount(Double reviewCount) {
		this.reviewCount = reviewCount;
	}
}
