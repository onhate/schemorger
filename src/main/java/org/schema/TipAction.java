package org.schema;

/**
 * 
 * The act of giving money voluntarily to a beneficiary in recognition of
 * services rendered.
 * 
 * @fullPath Thing > Action > TradeAction > TipAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TipAction extends TradeAction {

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
