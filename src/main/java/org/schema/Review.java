package org.schema;

/**
 * 
 * A review of an item - for example, a restaurant, movie, or store.
 * 
 * @fullPath Thing > CreativeWork > Review
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Review extends CreativeWork {

	private Thing itemReviewed;
	private String reviewBody;
	private Rating reviewRating;

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
	 * The actual body of the review
	 */
	public String getReviewBody() {
		return this.reviewBody;
	}

	/**
	 * The actual body of the review
	 */
	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	/**
	 * The rating given in this review. Note that reviews can themselves be
	 * rated. The <code>reviewRating</code> applies to rating given by the
	 * review. The <code>aggregateRating</code> property applies to the review
	 * itself, as a creative work.
	 */
	public Rating getReviewRating() {
		return this.reviewRating;
	}

	/**
	 * The rating given in this review. Note that reviews can themselves be
	 * rated. The <code>reviewRating</code> applies to rating given by the
	 * review. The <code>aggregateRating</code> property applies to the review
	 * itself, as a creative work.
	 */
	public void setReviewRating(Rating reviewRating) {
		this.reviewRating = reviewRating;
	}
}
