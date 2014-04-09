package org.schema;

/**
 * 
 * An agent tracks an object for updates.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike
 * FollowAction, TrackAction refers to the interest on the location of
 * innanimates objects.</li>
 * <li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike
 * SubscribeAction, TrackAction refers to the interest on the location of
 * innanimate objects.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > FindAction > TrackAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TrackAction extends FindAction {

	private DeliveryMethod deliveryMethod;

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
}
