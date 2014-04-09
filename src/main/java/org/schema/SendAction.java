package org.schema;

/**
 * 
 * The act of physically/electronically dispatching an object for transfer from
 * an origin to a destination.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/ReceiveAction">ReceiveAction</a>: The
 * reciprocal of SendAction.</li>
 * <li><a href="http://schema.org/GiveAction">GiveAction</a>: Unlike GiveAction,
 * SendAction does not imply the transfer of ownership (e.g. I can send you my
 * laptop, but I'm not necessarily giving it to you).</li>
 * </ul>
 * 
 * @fullPath Thing > Action > TransferAction > SendAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class SendAction extends TransferAction {

	private DeliveryMethod deliveryMethod;
	private Object recipient;

	/**
	 * A sub property of instrument. The method of delivery
	 */
	public DeliveryMethod getDeliveryMethod() {
		return this.deliveryMethod;
	}

	/**
	 * A sub property of instrument. The method of delivery
	 */
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

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
