package com.texelz.schemorger.model;

import javax.xml.datatype.Duration;

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

	private Thing attendee;
	private java.util.Date doorTime;
	private Duration duration;
	private java.util.Date endDate;
	private EventStatusType eventStatus;
	private Thing location;
	private Offer offers;
	private Thing performer;
	private java.util.Date previousStartDate;
	private java.util.Date startDate;
	private Event subEvent;
	private Event superEvent;
	private String typicalAgeRange;

	/**
	 * A person or organization attending the event.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getAttendee() {
		return this.attendee;
	}

	public void setAttendee(Thing attendee) {
		this.attendee = attendee;
	}

	/**
	 * The time admission will commence.
	 */
	public java.util.Date getDoorTime() {
		return this.doorTime;
	}

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

	public void setEventStatus(EventStatusType eventStatus) {
		this.eventStatus = eventStatus;
	}

	/**
	 * The location of the event, organization or action.
	 * 
	 * @see Place
	 * @see PostalAddress
	 */
	public Thing getLocation() {
		return this.location;
	}

	public void setLocation(Thing location) {
		this.location = location;
	}

	/**
	 * An offer to sell this item—for example, an offer to sell a product, the
	 * DVD of a movie, or tickets to an event.
	 */
	public Offer getOffers() {
		return this.offers;
	}

	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	/**
	 * A performer at the event—for example, a presenter, musician, musical
	 * group or actor. Supercedes <a href="performers">performers</a>.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getPerformer() {
		return this.performer;
	}

	public void setPerformer(Thing performer) {
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

	public void setSuperEvent(Event superEvent) {
		this.superEvent = superEvent;
	}

	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public String getTypicalAgeRange() {
		return this.typicalAgeRange;
	}

	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}
}
