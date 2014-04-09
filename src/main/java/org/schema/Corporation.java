package org.schema;

/**
 * 
 * Organization: A business corporation.
 * 
 * @fullPath Thing > Organization > Corporation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Corporation extends Organization {

	private String tickerSymbol;

	/**
	 * The exchange traded instrument associated with a Corporation object. The
	 * tickerSymbol is expressed as an exchange and an instrument name separated
	 * by a space character. For the exchange component of the tickerSymbol
	 * attribute, we reccommend using the controlled vocaulary of Market
	 * Identifier Codes (MIC) specified in ISO15022.
	 */
	public String getTickerSymbol() {
		return this.tickerSymbol;
	}

	/**
	 * The exchange traded instrument associated with a Corporation object. The
	 * tickerSymbol is expressed as an exchange and an instrument name separated
	 * by a space character. For the exchange component of the tickerSymbol
	 * attribute, we reccommend using the controlled vocaulary of Market
	 * Identifier Codes (MIC) specified in ISO15022.
	 */
	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}
}
