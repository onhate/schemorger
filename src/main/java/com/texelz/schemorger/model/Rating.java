package com.texelz.schemorger.model;

/**
 *
 * The rating of the video.
 * @fullPath Thing > Intangible > Rating
 *
 * @author Texelz (by Onhate)
 *
 */
public class Rating extends Intangible {

	private Object bestRating;
	private String ratingValue;
	private Object worstRating;
	/**
	 * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
	 * @see Text
	 * @see Number
	 */
	public Object getBestRating() {
		return this.bestRating;
	}
	public void setBestRating(Object bestRating) {
		this.bestRating = bestRating;
	}
	/**
	 * The rating for the content.
	 */
	public String getRatingValue() {
		return this.ratingValue;
	}
	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}
	/**
	 * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
	 * @see Text
	 * @see Number
	 */
	public Object getWorstRating() {
		return this.worstRating;
	}
	public void setWorstRating(Object worstRating) {
		this.worstRating = worstRating;
	}
}
