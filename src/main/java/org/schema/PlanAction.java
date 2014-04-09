package org.schema;

/**
 * 
 * The act of planning the execution of an event/task/action/reservation/plan to
 * a future date.
 * 
 * @fullPath Thing > Action > OrganizeAction > PlanAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PlanAction extends OrganizeAction {

	private java.util.Date scheduledTime;

	/**
	 * The time the object is scheduled to.
	 */
	public java.util.Date getScheduledTime() {
		return this.scheduledTime;
	}

	/**
	 * The time the object is scheduled to.
	 */
	public void setScheduledTime(java.util.Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
}
