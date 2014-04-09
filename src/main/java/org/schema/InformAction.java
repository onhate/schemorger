package org.schema;

/**
 * 
 * The act of notifying someone of information pertinent to them, with no
 * expectation of a response.
 * 
 * @fullPath Thing > Action > InteractAction > CommunicateAction > InformAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class InformAction extends CommunicateAction {

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
