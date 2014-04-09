package org.schema;

/**
 * 
 * The geographic shape of a place.
 * 
 * @fullPath Thing > Intangible > StructuredValue > GeoShape
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class GeoShape extends StructuredValue {

	private String box;
	private String circle;
	private Object elevation;
	private String line;
	private String polygon;

	/**
	 * A polygon is the area enclosed by a point-to-point path for which the
	 * starting and ending points are the same. A polygon is expressed as a
	 * series of four or more spacedelimited points where the first and final
	 * points are identical.
	 */
	public String getBox() {
		return this.box;
	}

	/**
	 * A polygon is the area enclosed by a point-to-point path for which the
	 * starting and ending points are the same. A polygon is expressed as a
	 * series of four or more spacedelimited points where the first and final
	 * points are identical.
	 */
	public void setBox(String box) {
		this.box = box;
	}

	/**
	 * A circle is the circular region of a specified radius centered at a
	 * specified latitude and longitude. A circle is expressed as a pair
	 * followed by a radius in meters.
	 */
	public String getCircle() {
		return this.circle;
	}

	/**
	 * A circle is the circular region of a specified radius centered at a
	 * specified latitude and longitude. A circle is expressed as a pair
	 * followed by a radius in meters.
	 */
	public void setCircle(String circle) {
		this.circle = circle;
	}

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
	 * A line is a point-to-point path consisting of two or more points. A line
	 * is expressed as a series of two or more point objects separated by space.
	 */
	public String getLine() {
		return this.line;
	}

	/**
	 * A line is a point-to-point path consisting of two or more points. A line
	 * is expressed as a series of two or more point objects separated by space.
	 */
	public void setLine(String line) {
		this.line = line;
	}

	/**
	 * A polygon is the area enclosed by a point-to-point path for which the
	 * starting and ending points are the same. A polygon is expressed as a
	 * series of four or more spacedelimited points where the first and final
	 * points are identical.
	 */
	public String getPolygon() {
		return this.polygon;
	}

	/**
	 * A polygon is the area enclosed by a point-to-point path for which the
	 * starting and ending points are the same. A polygon is expressed as a
	 * series of four or more spacedelimited points where the first and final
	 * points are identical.
	 */
	public void setPolygon(String polygon) {
		this.polygon = polygon;
	}
}
