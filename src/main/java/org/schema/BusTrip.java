package org.schema;

/**
 * 
 * A trip on a commercial bus line.
 * 
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
	 * 
	 * @see BusStation
	 * @see BusStop
	 */
	public Object getArrivalBusStop() {
		return this.arrivalBusStop;
	}

	/**
	 * The stop or station from which the bus arrives.
	 * 
	 * @see BusStation
	 * @see BusStop
	 */
	public void setArrivalBusStop(Object arrivalBusStop) {
		this.arrivalBusStop = arrivalBusStop;
	}

	/**
	 * The expected arrival time.
	 */
	public java.util.Date getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * The expected arrival time.
	 */
	public void setArrivalTime(java.util.Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * The name of the bus (e.g. Bolt Express).
	 */
	public String getBusName() {
		return this.busName;
	}

	/**
	 * The name of the bus (e.g. Bolt Express).
	 */
	public void setBusName(String busName) {
		this.busName = busName;
	}

	/**
	 * The unique identifier for the trainbus.
	 */
	public String getBusNumber() {
		return this.busNumber;
	}

	/**
	 * The unique identifier for the trainbus.
	 */
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	/**
	 * The stop or station from which the bus departs.
	 * 
	 * @see BusStation
	 * @see BusStop
	 */
	public Object getDepartureBusStop() {
		return this.departureBusStop;
	}

	/**
	 * The stop or station from which the bus departs.
	 * 
	 * @see BusStation
	 * @see BusStop
	 */
	public void setDepartureBusStop(Object departureBusStop) {
		this.departureBusStop = departureBusStop;
	}

	/**
	 * The expected departure time.
	 */
	public java.util.Date getDepartureTime() {
		return this.departureTime;
	}

	/**
	 * The expected departure time.
	 */
	public void setDepartureTime(java.util.Date departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getProvider() {
		return this.provider;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setProvider(Object provider) {
		this.provider = provider;
	}
}
