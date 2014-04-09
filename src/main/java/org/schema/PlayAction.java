package org.schema;

/**
 * 
 * The act of playing/exercising/training/performing for enjoyment, leisure,
 * recreation, competion or exercise.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/ListenAction">ListenAction</a>: Unlike
 * ListenAction (which is under ConsumeAction), PlayAction refers to performing
 * for an audience or at an event, rather than consuming music.</li>
 * <li><a href="http://schema.org/WatchAction">WatchAction</a>: Unlike
 * WatchAction (which is under ConsumeAction), PlayAction refers to
 * showing/displaying for an audience or at an event, rather than consuming
 * visual content.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > PlayAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PlayAction extends Action {

	private Audience audience;
	private Event event;

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
	 */
	public Audience getAudience() {
		return this.audience;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
	 */
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

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
