package org.schema;

/**
 * 
 * The act of managing by changing/editing the state of the object.
 * 
 * @fullPath Thing > Action > UpdateAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class UpdateAction extends Action {

	private Thing collection;

	/**
	 * A sub property of object. The collection target of the action.
	 */
	public Thing getCollection() {
		return this.collection;
	}

	/**
	 * A sub property of object. The collection target of the action.
	 */
	public void setCollection(Thing collection) {
		this.collection = collection;
	}
}
