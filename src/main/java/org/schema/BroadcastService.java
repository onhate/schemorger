package org.schema;

/**
 * 
 * A delivery service through which content is provided via broadcast over the
 * air or online.
 * 
 * @fullPath Thing > BroadcastService
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class BroadcastService extends Thing {

	private Place area;
	private Organization broadcaster;
	private BroadcastService parentService;

	/**
	 * The area within which users can expect to reach the broadcast service.
	 */
	public Place getArea() {
		return this.area;
	}

	/**
	 * The area within which users can expect to reach the broadcast service.
	 */
	public void setArea(Place area) {
		this.area = area;
	}

	/**
	 * The organization owning or operating the broadcast service.
	 */
	public Organization getBroadcaster() {
		return this.broadcaster;
	}

	/**
	 * The organization owning or operating the broadcast service.
	 */
	public void setBroadcaster(Organization broadcaster) {
		this.broadcaster = broadcaster;
	}

	/**
	 * A broadcast service to which the broadcast service may belong to such as
	 * regional variations of a national channel.
	 */
	public BroadcastService getParentService() {
		return this.parentService;
	}

	/**
	 * A broadcast service to which the broadcast service may belong to such as
	 * regional variations of a national channel.
	 */
	public void setParentService(BroadcastService parentService) {
		this.parentService = parentService;
	}
}
