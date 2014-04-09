package org.schema;

/**
 * 
 * The act of providing goods, services, or money without compensation, often
 * for philanthropic reasons.
 * 
 * @fullPath Thing > Action > TradeAction > DonateAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DonateAction extends TradeAction {

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
