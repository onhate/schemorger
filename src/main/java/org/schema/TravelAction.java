package org.schema;

/**
 * 
 * The act of traveling from an fromLocation to a destination by a specified
 * mode of transport, optionally with participants.
 * 
 * @fullPath Thing > Action > MoveAction > TravelAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TravelAction extends MoveAction {

	private Distance distance;

	/**
	 * A sub property of asset. The distance travelled.
	 */
	public Distance getDistance() {
		return this.distance;
	}

	/**
	 * A sub property of asset. The distance travelled.
	 */
	public void setDistance(Distance distance) {
		this.distance = distance;
	}
}
