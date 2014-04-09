package org.schema;

/**
 * 
 * The act of physically/electronically taking delivery of an object thathas
 * been transferred from an origin to a destination. Reciprocal of SendAction.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/SendAction">SendAction</a>: The reciprocal of
 * ReceiveAction.</li>
 * <li><a href="http://schema.org/TakeAction">TakeAction</a>: Unlike TakeAction,
 * ReceiveAction does not imply that the ownership has been transfered (e.g. I
 * can receive a package, but it does not mean the package is now mine).</li>
 * </ul>
 * 
 * @fullPath Thing > Action > TransferAction > ReceiveAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ReceiveAction extends TransferAction {

	private DeliveryMethod deliveryMethod;
	private Object sender;

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
	 * A sub property of participant. The participant who is at the sending end
	 * of the action.
	 * 
	 * @see Audience
	 * @see Organization
	 * @see Person
	 */
	public Object getSender() {
		return this.sender;
	}

	/**
	 * A sub property of participant. The participant who is at the sending end
	 * of the action.
	 * 
	 * @see Audience
	 * @see Organization
	 * @see Person
	 */
	public void setSender(Object sender) {
		this.sender = sender;
	}
}
