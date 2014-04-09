package org.schema;

/**
 * 
 * An airport.
 * 
 * @fullPath Thing > Place > CivicStructure > Airport
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Airport extends CivicStructure {

	private String iataCode;

	/**
	 * IATA identifier for an airline or airport
	 */
	public String getIataCode() {
		return this.iataCode;
	}

	/**
	 * IATA identifier for an airline or airport
	 */
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
}
