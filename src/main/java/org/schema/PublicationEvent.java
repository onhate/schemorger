package org.schema;

/**
 * 
 * A PublicationEvent corresponds indifferently to the event of publication for
 * a CreativeWork of any type e.g. a broadcast event, an on-demand event, a
 * book/journal publication via a variety of delivery media.
 * 
 * @fullPath Thing > Event > PublicationEvent
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PublicationEvent extends Event {

	private Boolean free;
	private BroadcastService publishedOn;

	/**
	 * A flag to signal that the publication is accessible for free.
	 */
	public Boolean getFree() {
		return this.free;
	}

	/**
	 * A flag to signal that the publication is accessible for free.
	 */
	public void setFree(Boolean free) {
		this.free = free;
	}

	/**
	 * A broadcast service associated with the publication event
	 */
	public BroadcastService getPublishedOn() {
		return this.publishedOn;
	}

	/**
	 * A broadcast service associated with the publication event
	 */
	public void setPublishedOn(BroadcastService publishedOn) {
		this.publishedOn = publishedOn;
	}
}
