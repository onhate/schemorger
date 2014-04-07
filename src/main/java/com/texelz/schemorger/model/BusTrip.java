package com.texelz.schemorger.model;

/**
 *
 * A trip on a commercial bus line.
 * @fullPath Thing > Intangible > BusTrip
 *
 * @author Texelz (by Onhate)
 *
 */
public class BusTrip extends Intangible {

	private Object arrivalBusStop;
	private java.util.Date arrivalTime;
	private String busName;
	private String busNumber;
	private Object departureBusStop;
	private java.util.Date departureTime;
	private Object provider;
	/**
	 * The stop or station from which the bus arrives.
	 * @see BusStop
	 * @see BusStation
	 */
	public Object getArrivalBusStop() {
		return this.arrivalBusStop;
	}
	public void setArrivalBusStop(Object arrivalBusStop) {
		this.arrivalBusStop = arrivalBusStop;
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
	 * The name of the bus (e.g. Bolt Express).
	 */
	public String getBusName() {
		return this.busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	/**
	 * The unique identifier for the trainbus.
	 */
	public String getBusNumber() {
		return this.busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	/**
	 * The stop or station from which the bus departs.
	 * @see BusStop
	 * @see BusStation
	 */
	public Object getDepartureBusStop() {
		return this.departureBusStop;
	}
	public void setDepartureBusStop(Object departureBusStop) {
		this.departureBusStop = departureBusStop;
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
}
