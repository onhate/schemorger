package org.schema;

/**
 * 
 * An event happening at a certain time and location, such as a concert,
 * lecture, or festival. Ticketing information may be added via the 'offers'
 * property. Repeated events may be structured as separate Event objects.
 * 
 * @fullPath Thing > Event
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Event extends Thing {

	private Object attendee;
	private java.util.Date doorTime;
	private Duration duration;
	private java.util.Date endDate;
	private EventStatusType eventStatus;
	private Object location;
	private Offer offers;
	private Object performer;
	private java.util.Date previousStartDate;
	private java.util.Date startDate;
	private Event subEvent;
	private Event superEvent;
	private String typicalAgeRange;

	/**
	 * A person or organization attending the event.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getAttendee() {
		return this.attendee;
	}

	/**
	 * A person or organization attending the event.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setAttendee(Object attendee) {
		this.attendee = attendee;
	}

	/**
	 * The time admission will commence.
	 */
	public java.util.Date getDoorTime() {
		return this.doorTime;
	}

	/**
	 * The time admission will commence.
	 */
	public void setDoorTime(java.util.Date doorTime) {
		this.doorTime = doorTime;
	}

	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public Duration getDuration() {
		return this.duration;
	}

	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	/**
	 * The end date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public java.util.Date getEndDate() {
		return this.endDate;
	}

	/**
	 * The end date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * An eventStatus of an event represents its status; particularly useful
	 * when an event is cancelled or rescheduled.
	 */
	public EventStatusType getEventStatus() {
		return this.eventStatus;
	}

	/**
	 * An eventStatus of an event represents its status; particularly useful
	 * when an event is cancelled or rescheduled.
	 */
	public void setEventStatus(EventStatusType eventStatus) {
		this.eventStatus = eventStatus;
	}

	/**
	 * The location of the event, organization or action.
	 * 
	 * @see Place
	 * @see PostalAddress
	 */
	public Object getLocation() {
		return this.location;
	}

	/**
	 * The location of the event, organization or action.
	 * 
	 * @see Place
	 * @see PostalAddress
	 */
	public void setLocation(Object location) {
		this.location = location;
	}

	/**
	 * An offer to transfer some rights to an item or to provide a service—for
	 * example, an offer to sell tickets to an event, to rent the DVD of a
	 * movie, to stream a TV show over the internet, to repair a motorcycle, or
	 * to loan a book.
	 */
	public Offer getOffers() {
		return this.offers;
	}

	/**
	 * An offer to transfer some rights to an item or to provide a service—for
	 * example, an offer to sell tickets to an event, to rent the DVD of a
	 * movie, to stream a TV show over the internet, to repair a motorcycle, or
	 * to loan a book.
	 */
	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	/**
	 * A performer at the event—for example, a presenter, musician, musical
	 * group or actor. Supercedes <a href="performers">performers</a>.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getPerformer() {
		return this.performer;
	}

	/**
	 * A performer at the event—for example, a presenter, musician, musical
	 * group or actor. Supercedes <a href="performers">performers</a>.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setPerformer(Object performer) {
		this.performer = performer;
	}

	/**
	 * Used in conjunction with eventStatus for rescheduled or cancelled events.
	 * This property contains the previously scheduled start date. For
	 * rescheduled events, the startDate property should be used for the newly
	 * scheduled start date. In the (rare) case of an event that has been
	 * postponed and rescheduled multiple times, this field may be repeated.
	 */
	public java.util.Date getPreviousStartDate() {
		return this.previousStartDate;
	}

	/**
	 * Used in conjunction with eventStatus for rescheduled or cancelled events.
	 * This property contains the previously scheduled start date. For
	 * rescheduled events, the startDate property should be used for the newly
	 * scheduled start date. In the (rare) case of an event that has been
	 * postponed and rescheduled multiple times, this field may be repeated.
	 */
	public void setPreviousStartDate(java.util.Date previousStartDate) {
		this.previousStartDate = previousStartDate;
	}

	/**
	 * The start date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public java.util.Date getStartDate() {
		return this.startDate;
	}

	/**
	 * The start date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * An Event that is part of this event. For example, a conference event
	 * includes many presentations, each are a subEvent of the conference.
	 * Supercedes <a href="subEvents">subEvents</a>.
	 */
	public Event getSubEvent() {
		return this.subEvent;
	}

	/**
	 * An Event that is part of this event. For example, a conference event
	 * includes many presentations, each are a subEvent of the conference.
	 * Supercedes <a href="subEvents">subEvents</a>.
	 */
	public void setSubEvent(Event subEvent) {
		this.subEvent = subEvent;
	}

	/**
	 * An event that this event is a part of. For example, a collection of
	 * individual music performances might each have a music festival as their
	 * superEvent.
	 */
	public Event getSuperEvent() {
		return this.superEvent;
	}

	/**
	 * An event that this event is a part of. For example, a collection of
	 * individual music performances might each have a music festival as their
	 * superEvent.
	 */
	public void setSuperEvent(Event superEvent) {
		this.superEvent = superEvent;
	}

	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public String getTypicalAgeRange() {
		return this.typicalAgeRange;
	}

	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}
}
