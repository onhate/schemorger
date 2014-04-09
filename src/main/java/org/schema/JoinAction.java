package org.schema;

/**
 * 
 * An agent joins an event/group with participants/friends at a location.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike
 * RegisterAction, JoinAction refers to joining a group/team of people.</li>
 * <li><a href="http://schema.org/SubscribeAction">SubscribeAction</a>: Unlike
 * SubscribeAction, JoinAction does not imply that you'll be receiving updates.</li>
 * <li><a href="http://schema.org/FollowAction">FollowAction</a>: Unlike
 * FollowAction, JoinAction does not imply that you'll be polling for updates.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > InteractAction > JoinAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class JoinAction extends InteractAction {

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
