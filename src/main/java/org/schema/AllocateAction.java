package org.schema;

/**
 * 
 * The act of organizing tasks/objects/events by associating resources to it.
 * 
 * @fullPath Thing > Action > OrganizeAction > AllocateAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AllocateAction extends OrganizeAction {

	private Object purpose;

	/**
	 * A goal towards an action is taken. Can be concrete or abstract.
	 * 
	 * @see MedicalDevicePurpose
	 * @see Thing
	 */
	public Object getPurpose() {
		return this.purpose;
	}

	/**
	 * A goal towards an action is taken. Can be concrete or abstract.
	 * 
	 * @see MedicalDevicePurpose
	 * @see Thing
	 */
	public void setPurpose(Object purpose) {
		this.purpose = purpose;
	}
}
