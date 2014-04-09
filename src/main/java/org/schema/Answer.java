package org.schema;

/**
 * 
 * An answer offered to a question; perhaps correct, perhaps opinionated or
 * wrong.
 * 
 * @fullPath Thing > CreativeWork > Answer
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Answer extends CreativeWork {

	private Integer downvoteCount;
	private Question parentItem;
	private Integer upvoteCount;

	/**
	 * The number of downvotes this question has received from the community.
	 */
	public Integer getDownvoteCount() {
		return this.downvoteCount;
	}

	/**
	 * The number of downvotes this question has received from the community.
	 */
	public void setDownvoteCount(Integer downvoteCount) {
		this.downvoteCount = downvoteCount;
	}

	/**
	 * The parent of a question, answer or item in general.
	 */
	public Question getParentItem() {
		return this.parentItem;
	}

	/**
	 * The parent of a question, answer or item in general.
	 */
	public void setParentItem(Question parentItem) {
		this.parentItem = parentItem;
	}

	/**
	 * The number of upvotes this question has received from the community.
	 */
	public Integer getUpvoteCount() {
		return this.upvoteCount;
	}

	/**
	 * The number of upvotes this question has received from the community.
	 */
	public void setUpvoteCount(Integer upvoteCount) {
		this.upvoteCount = upvoteCount;
	}
}
