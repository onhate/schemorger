package com.texelz.schemorger.model;

/**
 *
 * The price asked for a given offer by the respective organization or person.
 * @fullPath Thing > Intangible > StructuredValue > PriceSpecification > UnitPriceSpecification
 *
 * @author Texelz (by Onhate)
 *
 */
public class UnitPriceSpecification extends PriceSpecification {

	private Double billingIncrement;
	private String priceType;
	private String unitCode;
	/**
	 * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
	 */
	public Double getBillingIncrement() {
		return this.billingIncrement;
	}
	public void setBillingIncrement(Double billingIncrement) {
		this.billingIncrement = billingIncrement;
	}
	/**
	 * A short text or acronym indicating multiple price specifications for the same offer, e.g. SRP for the suggested retail price or INVOICE for the invoice price, mostly used in the car industry.
	 */
	public String getPriceType() {
		return this.priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3 characters).
	 */
	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
}
