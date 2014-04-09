package org.schema;

/**
 * 
 * The act of adding at a specific location in an ordered collection.
 * 
 * @fullPath Thing > Action > UpdateAction > AddAction > InsertAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class InsertAction extends AddAction {

	private Object toLocation;

	/**
	 * A sub property of location. The final location of the object or the agent
	 * after the action.
	 * 
	 * @see Place
	 * @see Number
	 */
	public Object getToLocation() {
		return this.toLocation;
	}

	/**
	 * A sub property of location. The final location of the object or the agent
	 * after the action.
	 * 
	 * @see Place
	 * @see Number
	 */
	public void setToLocation(Object toLocation) {
		this.toLocation = toLocation;
	}
}
