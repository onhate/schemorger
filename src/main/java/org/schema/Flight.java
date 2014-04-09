package org.schema;

/**
 * 
 * An airline flight.
 * 
 * @fullPath Thing > Intangible > Flight
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Flight extends Intangible {

	private Object aircraft;
	private Airport arrivalAirport;
	private String arrivalGate;
	private String arrivalTerminal;
	private java.util.Date arrivalTime;
	private Object carrier;
	private Airport departureAirport;
	private String departureGate;
	private String departureTerminal;
	private java.util.Date departureTime;
	private Object estimatedFlightDuration;
	private Object flightDistance;
	private String flightNumber;
	private String mealService;
	private Object provider;
	private java.util.Date webCheckinTime;

	/**
	 * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
	 * 
	 * @see Vehicle
	 * @see Text
	 */
	public Object getAircraft() {
		return this.aircraft;
	}

	/**
	 * The kind of aircraft (e.g., &quot;Boeing 747&quot;).
	 * 
	 * @see Vehicle
	 * @see Text
	 */
	public void setAircraft(Object aircraft) {
		this.aircraft = aircraft;
	}

	/**
	 * The airport where the flight terminates.
	 */
	public Airport getArrivalAirport() {
		return this.arrivalAirport;
	}

	/**
	 * The airport where the flight terminates.
	 */
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	/**
	 * Identifier of the flight's arrival gate.
	 */
	public String getArrivalGate() {
		return this.arrivalGate;
	}

	/**
	 * Identifier of the flight's arrival gate.
	 */
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	/**
	 * Identifier of the flight's arrival terminal.
	 */
	public String getArrivalTerminal() {
		return this.arrivalTerminal;
	}

	/**
	 * Identifier of the flight's arrival terminal.
	 */
	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
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
	 * The party responsible for the parcel delivery.
	 * 
	 * @see Airline
	 * @see Organization
	 */
	public Object getCarrier() {
		return this.carrier;
	}

	/**
	 * The party responsible for the parcel delivery.
	 * 
	 * @see Airline
	 * @see Organization
	 */
	public void setCarrier(Object carrier) {
		this.carrier = carrier;
	}

	/**
	 * The airport where the flight originates.
	 */
	public Airport getDepartureAirport() {
		return this.departureAirport;
	}

	/**
	 * The airport where the flight originates.
	 */
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	/**
	 * Identifier of the flight's departure gate.
	 */
	public String getDepartureGate() {
		return this.departureGate;
	}

	/**
	 * Identifier of the flight's departure gate.
	 */
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}

	/**
	 * Identifier of the flight's departure terminal.
	 */
	public String getDepartureTerminal() {
		return this.departureTerminal;
	}

	/**
	 * Identifier of the flight's departure terminal.
	 */
	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
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
	 * The estimated time the flight will take.
	 * 
	 * @see Text
	 * @see Duration
	 */
	public Object getEstimatedFlightDuration() {
		return this.estimatedFlightDuration;
	}

	/**
	 * The estimated time the flight will take.
	 * 
	 * @see Text
	 * @see Duration
	 */
	public void setEstimatedFlightDuration(Object estimatedFlightDuration) {
		this.estimatedFlightDuration = estimatedFlightDuration;
	}

	/**
	 * The distance of the flight.
	 * 
	 * @see Distance
	 * @see Text
	 */
	public Object getFlightDistance() {
		return this.flightDistance;
	}

	/**
	 * The distance of the flight.
	 * 
	 * @see Distance
	 * @see Text
	 */
	public void setFlightDistance(Object flightDistance) {
		this.flightDistance = flightDistance;
	}

	/**
	 * The unique identifier for a flight.
	 */
	public String getFlightNumber() {
		return this.flightNumber;
	}

	/**
	 * The unique identifier for a flight.
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Description of the meals that will be provided or available for purchase.
	 */
	public String getMealService() {
		return this.mealService;
	}

	/**
	 * Description of the meals that will be provided or available for purchase.
	 */
	public void setMealService(String mealService) {
		this.mealService = mealService;
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

	/**
	 * The time when a passenger can check into the flight online.
	 */
	public java.util.Date getWebCheckinTime() {
		return this.webCheckinTime;
	}

	/**
	 * The time when a passenger can check into the flight online.
	 */
	public void setWebCheckinTime(java.util.Date webCheckinTime) {
		this.webCheckinTime = webCheckinTime;
	}
}
