package org.schema;

/**
 * 
 * The act of taking money from a buyer in exchange for goods or services
 * rendered. An agent sells an object, product, or service to a buyer for a
 * price. Reciprocal of BuyAction.
 * 
 * @fullPath Thing > Action > TradeAction > SellAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class SellAction extends TradeAction {

	private Person buyer;
	private WarrantyPromise warrantyPromise;

	/**
	 * A sub property of participant. The participant/person/organization that
	 * bought the object.
	 */
	public Person getBuyer() {
		return this.buyer;
	}

	/**
	 * A sub property of participant. The participant/person/organization that
	 * bought the object.
	 */
	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	/**
	 * The warranty promise(s) included in the offer.
	 */
	public WarrantyPromise getWarrantyPromise() {
		return this.warrantyPromise;
	}

	/**
	 * The warranty promise(s) included in the offer.
	 */
	public void setWarrantyPromise(WarrantyPromise warrantyPromise) {
		this.warrantyPromise = warrantyPromise;
	}
}
