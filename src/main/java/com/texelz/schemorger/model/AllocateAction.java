package com.texelz.schemorger.model;

/**
 *
 * The act of organizing tasks/objects/events by associating resources to it.
 * @fullPath Thing > Action > OrganizeAction > AllocateAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class AllocateAction extends OrganizeAction {

	private Object purpose;
	/**
	 * A goal towards an action is taken. Can be concrete or abstract.
	 * @see Thing
	 * @see MedicalDevicePurpose
	 */
	public Object getPurpose() {
		return this.purpose;
	}
	public void setPurpose(Object purpose) {
		this.purpose = purpose;
	}
}
