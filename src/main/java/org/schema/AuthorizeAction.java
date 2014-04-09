package org.schema;

/**
 * 
 * The act of granting permission to an object.
 * 
 * @fullPath Thing > Action > OrganizeAction > AllocateAction > AuthorizeAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AuthorizeAction extends AllocateAction {

	private Object recipient;

	/**
	 * A sub property of participant. The participant who is at the receiving
	 * end of the action.
	 * 
	 * @see Audience
	 * @see Organization
	 * @see Person
	 */
	public Object getRecipient() {
		return this.recipient;
	}

	/**
	 * A sub property of participant. The participant who is at the receiving
	 * end of the action.
	 * 
	 * @see Audience
	 * @see Organization
	 * @see Person
	 */
	public void setRecipient(Object recipient) {
		this.recipient = recipient;
	}
}
