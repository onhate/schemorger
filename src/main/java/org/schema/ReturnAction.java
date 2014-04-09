package org.schema;

/**
 * 
 * The act of returning to the origin that which was previously received
 * (concrete objects) or taken (ownership).
 * 
 * @fullPath Thing > Action > TransferAction > ReturnAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ReturnAction extends TransferAction {

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
