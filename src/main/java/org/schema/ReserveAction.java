package org.schema;

/**
 * 
 * Reserving a concrete object.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/ScheduleAction">ScheduleAction</a>: Unlike
 * ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a
 * hotel) towards a time slot / spatial allocation.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > OrganizeAction > PlanAction > ReserveAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ReserveAction extends PlanAction {

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
