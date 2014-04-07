package com.texelz.schemorger.model;

/**
 *
 * An airport.
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
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
}
