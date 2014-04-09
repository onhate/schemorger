package org.schema;

/**
 * 
 * The geographic coordinates of a place or event.
 * 
 * @fullPath Thing > Intangible > StructuredValue > GeoCoordinates
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class GeoCoordinates extends StructuredValue {

	private Object elevation;
	private Object latitude;
	private Object longitude;

	/**
	 * The elevation of a location.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getElevation() {
		return this.elevation;
	}

	/**
	 * The elevation of a location.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setElevation(Object elevation) {
		this.elevation = elevation;
	}

	/**
	 * The latitude of a location. For example <code>37.42242</code>.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getLatitude() {
		return this.latitude;
	}

	/**
	 * The latitude of a location. For example <code>37.42242</code>.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setLatitude(Object latitude) {
		this.latitude = latitude;
	}

	/**
	 * The longitude of a location. For example <code>-122.08585</code>.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getLongitude() {
		return this.longitude;
	}

	/**
	 * The longitude of a location. For example <code>-122.08585</code>.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setLongitude(Object longitude) {
		this.longitude = longitude;
	}
}
