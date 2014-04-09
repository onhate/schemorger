package org.schema;

/**
 * 
 * An agent leaves an event / group with participants/friends at a location.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/JoinAction">JoinAction</a>: The antagonym of
 * LeaveAction.</li>
 * <li><a href="http://schema.org/UnRegisterAction">UnRegisterAction</a>: Unlike
 * UnRegisterAction, LeaveAction implies leaving a group/team of people rather
 * than a service.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > InteractAction > LeaveAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class LeaveAction extends InteractAction {

	private Event event;

	/**
	 * Upcoming or past event associated with this place or organization.
	 * Supercedes <a href="events">events</a>.
	 */
	public Event getEvent() {
		return this.event;
	}

	/**
	 * Upcoming or past event associated with this place or organization.
	 * Supercedes <a href="events">events</a>.
	 */
	public void setEvent(Event event) {
		this.event = event;
	}
}
