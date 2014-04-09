package org.schema;

/**
 * 
 * A specific question - e.g. from a user seeking answers online, or collected
 * in a Frequently Asked Questions (FAQ) document.
 * 
 * @fullPath Thing > CreativeWork > Question
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Question extends CreativeWork {

	private Answer acceptedAnswer;
	private Integer answerCount;
	private Integer downvoteCount;
	private Answer suggestedAnswer;
	private Integer upvoteCount;

	/**
	 * The answer that has been accepted as best, typically on a Question/Answer
	 * site. Sites vary in their selection mechanisms, e.g. drawing on community
	 * opinion and/or the view of the Question author.
	 */
	public Answer getAcceptedAnswer() {
		return this.acceptedAnswer;
	}

	/**
	 * The answer that has been accepted as best, typically on a Question/Answer
	 * site. Sites vary in their selection mechanisms, e.g. drawing on community
	 * opinion and/or the view of the Question author.
	 */
	public void setAcceptedAnswer(Answer acceptedAnswer) {
		this.acceptedAnswer = acceptedAnswer;
	}

	/**
	 * The number of answers this question has received.
	 */
	public Integer getAnswerCount() {
		return this.answerCount;
	}

	/**
	 * The number of answers this question has received.
	 */
	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

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
	 * An answer (possibly one of several, possibly incorrect) to a Question,
	 * e.g. on a Question/Answer site, often collected in a QAPage.
	 */
	public Answer getSuggestedAnswer() {
		return this.suggestedAnswer;
	}

	/**
	 * An answer (possibly one of several, possibly incorrect) to a Question,
	 * e.g. on a Question/Answer site, often collected in a QAPage.
	 */
	public void setSuggestedAnswer(Answer suggestedAnswer) {
		this.suggestedAnswer = suggestedAnswer;
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
