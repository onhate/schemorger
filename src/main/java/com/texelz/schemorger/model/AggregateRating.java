package com.texelz.schemorger.model;

/**
<<<<<<< HEAD
 *
 * The average rating based on multiple ratings or reviews.
 * @fullPath Thing > Intangible > Rating > AggregateRating
 *
 * @author Texelz (by Onhate)
 *
=======
 * 
 * The average rating based on multiple ratings or reviews.
 * 
 * @fullPath Thing > Intangible > Rating > AggregateRating
 * 
 * @author Texelz (by Onhate)
 * 
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
 */
public class AggregateRating extends Rating {

	private Thing itemReviewed;
	private Double ratingCount;
	private Double reviewCount;
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The item that is being reviewed/rated.
	 */
	public Thing getItemReviewed() {
		return this.itemReviewed;
<<<<<<< HEAD
	}
	public void setItemReviewed(Thing itemReviewed) {
		this.itemReviewed = itemReviewed;
	}
	/**
	 * The count of total number of ratings.
	 */
	public Double getRatingCount() {
		return this.ratingCount;
	}
	public void setRatingCount(Double ratingCount) {
		this.ratingCount = ratingCount;
	}
	/**
	 * The count of total number of reviews.
	 */
	public Double getReviewCount() {
		return this.reviewCount;
	}
=======
	}

	public void setItemReviewed(Thing itemReviewed) {
		this.itemReviewed = itemReviewed;
	}

	/**
	 * The count of total number of ratings.
	 */
	public Double getRatingCount() {
		return this.ratingCount;
	}

	public void setRatingCount(Double ratingCount) {
		this.ratingCount = ratingCount;
	}

	/**
	 * The count of total number of reviews.
	 */
	public Double getReviewCount() {
		return this.reviewCount;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	public void setReviewCount(Double reviewCount) {
		this.reviewCount = reviewCount;
	}
}
