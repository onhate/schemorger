package org.schema;

/**
 * 
 * A structured value representing the duration and scope of services that will
 * be provided to a customer free of charge in case of a defect or malfunction
 * of a product.
 * 
 * @fullPath Thing > Intangible > StructuredValue > WarrantyPromise
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class WarrantyPromise extends StructuredValue {

	private QuantitativeValue durationOfWarranty;
	private WarrantyScope warrantyScope;

	/**
	 * The duration of the warranty promise. Common unitCode values are ANN for
	 * year, MON for months, or DAY for days.
	 */
	public QuantitativeValue getDurationOfWarranty() {
		return this.durationOfWarranty;
	}

	/**
	 * The duration of the warranty promise. Common unitCode values are ANN for
	 * year, MON for months, or DAY for days.
	 */
	public void setDurationOfWarranty(QuantitativeValue durationOfWarranty) {
		this.durationOfWarranty = durationOfWarranty;
	}

	/**
	 * The scope of the warranty promise.
	 */
	public WarrantyScope getWarrantyScope() {
		return this.warrantyScope;
	}

	/**
	 * The scope of the warranty promise.
	 */
	public void setWarrantyScope(WarrantyScope warrantyScope) {
		this.warrantyScope = warrantyScope;
	}
}
