package org.schema;

/**
 * 
 * The act of producing a balanced opinion about the object for an audience. An
 * agent reviews an object with participants resulting in a review.
 * 
 * @fullPath Thing > Action > AssessAction > ReviewAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ReviewAction extends AssessAction {

	private Review resultReview;

	/**
	 * A sub property of result. The review that resulted in the performing of
	 * the action.
	 */
	public Review getResultReview() {
		return this.resultReview;
	}

	/**
	 * A sub property of result. The review that resulted in the performing of
	 * the action.
	 */
	public void setResultReview(Review resultReview) {
		this.resultReview = resultReview;
	}
}
