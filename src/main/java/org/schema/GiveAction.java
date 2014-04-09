package org.schema;

/**
 * 
 * The act of transferring ownership of an object to a destination. Reciprocal
 * of TakeAction.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/TakeAction">TakeAction</a>: Reciprocal of
 * GiveAction.</li>
 * <li><a href="http://schema.org/SendAction">SendAction</a>: Unlike SendAction,
 * GiveAction implies that ownership is being transferred (e.g. I may send my
 * laptop to you, but that doesn't mean I'm giving it to you).</li>
 * </ul>
 * 
 * @fullPath Thing > Action > TransferAction > GiveAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class GiveAction extends TransferAction {

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
