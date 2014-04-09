package org.schema;

/**
 * 
 * The act of posing a question / favor to someone.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/ReplyAction">ReplyAction</a>: Appears
 * generally as a response to AskAction.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > InteractAction > CommunicateAction > AskAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AskAction extends CommunicateAction {

	private String question;

	/**
	 * A sub property of object. A question.
	 */
	public String getQuestion() {
		return this.question;
	}

	/**
	 * A sub property of object. A question.
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
}
