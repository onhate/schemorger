package com.texelz.schemorger.model;

/**
 *
 * A trip on a commercial train line.
 * @fullPath Thing > Intangible > TrainTrip
 *
 * @author Texelz (by Onhate)
 *
 */
public class TrainTrip extends Intangible {

	private String arrivalPlatform;
	private TrainStation arrivalStation;
	private java.util.Date arrivalTime;
	private String departurePlatform;
	private TrainStation departureStation;
	private java.util.Date departureTime;
	private Object provider;
	private String trainName;
	private String trainNumber;
	/**
	 * The platform where the train arrives.
	 */
	public String getArrivalPlatform() {
		return this.arrivalPlatform;
	}
	public void setArrivalPlatform(String arrivalPlatform) {
		this.arrivalPlatform = arrivalPlatform;
	}
	/**
	 * The station where the train trip ends.
	 */
	public TrainStation getArrivalStation() {
		return this.arrivalStation;
	}
	public void setArrivalStation(TrainStation arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
	/**
	 * The expected arrival time.
	 */
	public java.util.Date getArrivalTime() {
		return this.arrivalTime;
	}
	public void setArrivalTime(java.util.Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * The platform from which the train departs.
	 */
	public String getDeparturePlatform() {
		return this.departurePlatform;
	}
	public void setDeparturePlatform(String departurePlatform) {
		this.departurePlatform = departurePlatform;
	}
	/**
	 * The station from which the train departs.
	 */
	public TrainStation getDepartureStation() {
		return this.departureStation;
	}
	public void setDepartureStation(TrainStation departureStation) {
		this.departureStation = departureStation;
	}
	/**
	 * The expected departure time.
	 */
	public java.util.Date getDepartureTime() {
		return this.departureTime;
	}
	public void setDepartureTime(java.util.Date departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * The organization or agency that is providing the service.
	 * @see Person
	 * @see Organization
	 */
	public Object getProvider() {
		return this.provider;
	}
	public void setProvider(Object provider) {
		this.provider = provider;
	}
	/**
	 * The name of the train (e.g. The Orient Express).
	 */
	public String getTrainName() {
		return this.trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	/**
	 * The unique identifier for the train.
	 */
	public String getTrainNumber() {
		return this.trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
}
