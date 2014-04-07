package com.texelz.schemorger.model;

/**
 *
 * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another.
 * @fullPath Thing > Action > TransferAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class TransferAction extends Action {

	private Object fromLocation;
	private Object toLocation;
	/**
	 * A sub property of location. The original location of the object or the agent before the action.
	 * @see Number
	 * @see Place
	 */
	public Object getFromLocation() {
		return this.fromLocation;
	}
	public void setFromLocation(Object fromLocation) {
		this.fromLocation = fromLocation;
	}
	/**
	 * A sub property of location. The final location of the object or the agent after the action.
	 * @see Number
	 * @see Place
	 */
	public Object getToLocation() {
		return this.toLocation;
	}
	public void setToLocation(Object toLocation) {
		this.toLocation = toLocation;
	}
}
