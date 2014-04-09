package org.schema;

/**
 * 
 * A point value or interval for product characteristics and other purposes.
 * 
 * @fullPath Thing > Intangible > StructuredValue > QuantitativeValue
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class QuantitativeValue extends StructuredValue {

	private Double maxValue;
	private Double minValue;
	private String unitCode;
	private Double value;
	private Object valueReference;

	/**
	 * The upper of the product characteristic.
	 */
	public Double getMaxValue() {
		return this.maxValue;
	}

	/**
	 * The upper of the product characteristic.
	 */
	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}

	/**
	 * The lower value of the product characteristic.
	 */
	public Double getMinValue() {
		return this.minValue;
	}

	/**
	 * The lower value of the product characteristic.
	 */
	public void setMinValue(Double minValue) {
		this.minValue = minValue;
	}

	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3
	 * characters).
	 */
	public String getUnitCode() {
		return this.unitCode;
	}

	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3
	 * characters).
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	/**
	 * The value of the product characteristic.
	 */
	public Double getValue() {
		return this.value;
	}

	/**
	 * The value of the product characteristic.
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * A pointer to a secondary value that provides additional information on
	 * the original value, e.g. a reference temperature.
	 * 
	 * @see Enumeration
	 * @see StructuredValue
	 */
	public Object getValueReference() {
		return this.valueReference;
	}

	/**
	 * A pointer to a secondary value that provides additional information on
	 * the original value, e.g. a reference temperature.
	 * 
	 * @see Enumeration
	 * @see StructuredValue
	 */
	public void setValueReference(Object valueReference) {
		this.valueReference = valueReference;
	}
}
