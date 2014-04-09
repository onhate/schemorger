package org.schema;

/**
 * 
 * The act of giving money in return for temporary use, but not ownership, of an
 * object such as a vehicle or property. For example, an agent rents a property
 * from a landlord in exchange for a periodic payment.
 * 
 * @fullPath Thing > Action > TradeAction > RentAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class RentAction extends TradeAction {

	private Object landlord;
	private RealEstateAgent realEstateAgent;

	/**
	 * A sub property of participant. The owner of the real estate property. Sub
	 * property of destination or participant?
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getLandlord() {
		return this.landlord;
	}

	/**
	 * A sub property of participant. The owner of the real estate property. Sub
	 * property of destination or participant?
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setLandlord(Object landlord) {
		this.landlord = landlord;
	}

	/**
	 * A sub property of participant. The real estate agent involved in the
	 * action.
	 */
	public RealEstateAgent getRealEstateAgent() {
		return this.realEstateAgent;
	}

	/**
	 * A sub property of participant. The real estate agent involved in the
	 * action.
	 */
	public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
		this.realEstateAgent = realEstateAgent;
	}
}
