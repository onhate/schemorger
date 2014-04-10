package org.schema;

/**
 * 
 * The UserInteraction event in which a user comments on an item.
 * 
 * @fullPath Thing > Event > UserInteraction > UserComments
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class UserComments extends UserInteraction {

	private String commentText;
	private java.util.Date commentTime;
	private Object creator;
	private CreativeWork discusses;
	private org.schema.base.URL replyToUrl;

	/**
	 * The text of the UserComment.
	 */
	public String getCommentText() {
		return this.commentText;
	}

	/**
	 * The text of the UserComment.
	 */
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	/**
	 * The time at which the UserComment was made.
	 */
	public java.util.Date getCommentTime() {
		return this.commentTime;
	}

	/**
	 * The time at which the UserComment was made.
	 */
	public void setCommentTime(java.util.Date commentTime) {
		this.commentTime = commentTime;
	}

	/**
	 * The creator/author of this CreativeWork or UserComments. This is the same
	 * as the Author property for CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getCreator() {
		return this.creator;
	}

	/**
	 * The creator/author of this CreativeWork or UserComments. This is the same
	 * as the Author property for CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setCreator(Object creator) {
		this.creator = creator;
	}

	/**
	 * Specifies the CreativeWork associated with the UserComment.
	 */
	public CreativeWork getDiscusses() {
		return this.discusses;
	}

	/**
	 * Specifies the CreativeWork associated with the UserComment.
	 */
	public void setDiscusses(CreativeWork discusses) {
		this.discusses = discusses;
	}

	/**
	 * The URL at which a reply may be posted to the specified UserComment.
	 */
	public org.schema.base.URL getReplyToUrl() {
		return this.replyToUrl;
	}

	/**
	 * The URL at which a reply may be posted to the specified UserComment.
	 */
	public void setReplyToUrl(org.schema.base.URL replyToUrl) {
		this.replyToUrl = replyToUrl;
	}
}
