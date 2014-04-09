package org.schema;

/**
 * 
 * The act of asking someone to attend an event. Reciprocal of RsvpAction.
 * 
 * @fullPath Thing > Action > InteractAction > CommunicateAction > InviteAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class InviteAction extends CommunicateAction {

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
