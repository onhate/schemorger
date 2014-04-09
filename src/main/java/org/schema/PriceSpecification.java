package org.schema;

/**
 * 
 * A structured value representing a monetary amount. Typically, only the
 * subclasses of this type are used for markup.
 * 
 * @fullPath Thing > Intangible > StructuredValue > PriceSpecification
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PriceSpecification extends StructuredValue {

	private QuantitativeValue eligibleQuantity;
	private PriceSpecification eligibleTransactionVolume;
	private Double maxPrice;
	private Double minPrice;
	private Object price;
	private String priceCurrency;
	private java.util.Date validFrom;
	private java.util.Date validThrough;
	private Boolean valueAddedTaxIncluded;

	/**
	 * The interval and unit of measurement of ordering quantities for which the
	 * offer or price specification is valid. This allows e.g. specifying that a
	 * certain freight charge is valid only for a certain quantity.
	 */
	public QuantitativeValue getEligibleQuantity() {
		return this.eligibleQuantity;
	}

	/**
	 * The interval and unit of measurement of ordering quantities for which the
	 * offer or price specification is valid. This allows e.g. specifying that a
	 * certain freight charge is valid only for a certain quantity.
	 */
	public void setEligibleQuantity(QuantitativeValue eligibleQuantity) {
		this.eligibleQuantity = eligibleQuantity;
	}

	/**
	 * The transaction volume, in a monetary unit, for which the offer or price
	 * specification is valid, e.g. for indicating a minimal purchasing volume,
	 * to express free shipping above a certain order volume, or to limit the
	 * acceptance of credit cards to purchases to a certain minimal amount.
	 */
	public PriceSpecification getEligibleTransactionVolume() {
		return this.eligibleTransactionVolume;
	}

	/**
	 * The transaction volume, in a monetary unit, for which the offer or price
	 * specification is valid, e.g. for indicating a minimal purchasing volume,
	 * to express free shipping above a certain order volume, or to limit the
	 * acceptance of credit cards to purchases to a certain minimal amount.
	 */
	public void setEligibleTransactionVolume(PriceSpecification eligibleTransactionVolume) {
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}

	/**
	 * The highest price if the price is a range.
	 */
	public Double getMaxPrice() {
		return this.maxPrice;
	}

	/**
	 * The highest price if the price is a range.
	 */
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	/**
	 * The lowest price if the price is a range.
	 */
	public Double getMinPrice() {
		return this.minPrice;
	}

	/**
	 * The lowest price if the price is a range.
	 */
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	/**
	 * The offer price of a product, or of a price component when attached to
	 * PriceSpecification and its subtypes.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getPrice() {
		return this.price;
	}

	/**
	 * The offer price of a product, or of a price component when attached to
	 * PriceSpecification and its subtypes.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setPrice(Object price) {
		this.price = price;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price
	 * component, when attached to PriceSpecification and its subtypes.
	 */
	public String getPriceCurrency() {
		return this.priceCurrency;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price
	 * component, when attached to PriceSpecification and its subtypes.
	 */
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	/**
	 * The date when the item becomes valid.
	 */
	public java.util.Date getValidFrom() {
		return this.validFrom;
	}

	/**
	 * The date when the item becomes valid.
	 */
	public void setValidFrom(java.util.Date validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * The end of the validity of offer, price specification, or opening hours
	 * data.
	 */
	public java.util.Date getValidThrough() {
		return this.validThrough;
	}

	/**
	 * The end of the validity of offer, price specification, or opening hours
	 * data.
	 */
	public void setValidThrough(java.util.Date validThrough) {
		this.validThrough = validThrough;
	}

	/**
	 * Specifies whether the applicable value-added tax (VAT) is included in the
	 * price specification or not.
	 */
	public Boolean getValueAddedTaxIncluded() {
		return this.valueAddedTaxIncluded;
	}

	/**
	 * Specifies whether the applicable value-added tax (VAT) is included in the
	 * price specification or not.
	 */
	public void setValueAddedTaxIncluded(Boolean valueAddedTaxIncluded) {
		this.valueAddedTaxIncluded = valueAddedTaxIncluded;
	}
}
