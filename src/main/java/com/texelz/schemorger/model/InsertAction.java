package com.texelz.schemorger.model;

/**
 *
 * The act of adding at a specific location in an ordered collection.
 * @fullPath Thing > Action > UpdateAction > AddAction > InsertAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class InsertAction extends AddAction {

	private Object toLocation;
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
