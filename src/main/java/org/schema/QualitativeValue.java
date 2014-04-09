package org.schema;

/**
 * 
 * A predefined value for a product characteristic, e.g. the the power cord plug
 * type &quot;US&quot; or the garment sizes &quot;S&quot;, &quot;M&quot;,
 * &quot;L&quot;, and &quot;XL&quot;
 * 
 * @fullPath Thing > Intangible > Enumeration > QualitativeValue
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class QualitativeValue extends Enumeration {

	private QualitativeValue equal;
	private QualitativeValue greater;
	private QualitativeValue greaterOrEqual;
	private QualitativeValue lesser;
	private QualitativeValue lesserOrEqual;
	private QualitativeValue nonEqual;
	private Object valueReference;

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is equal to the object.
	 */
	public QualitativeValue getEqual() {
		return this.equal;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is equal to the object.
	 */
	public void setEqual(QualitativeValue equal) {
		this.equal = equal;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is greater than the object.
	 */
	public QualitativeValue getGreater() {
		return this.greater;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is greater than the object.
	 */
	public void setGreater(QualitativeValue greater) {
		this.greater = greater;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is greater than or equal to the object.
	 */
	public QualitativeValue getGreaterOrEqual() {
		return this.greaterOrEqual;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is greater than or equal to the object.
	 */
	public void setGreaterOrEqual(QualitativeValue greaterOrEqual) {
		this.greaterOrEqual = greaterOrEqual;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is lesser than the object.
	 */
	public QualitativeValue getLesser() {
		return this.lesser;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is lesser than the object.
	 */
	public void setLesser(QualitativeValue lesser) {
		this.lesser = lesser;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is lesser than or equal to the object.
	 */
	public QualitativeValue getLesserOrEqual() {
		return this.lesserOrEqual;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is lesser than or equal to the object.
	 */
	public void setLesserOrEqual(QualitativeValue lesserOrEqual) {
		this.lesserOrEqual = lesserOrEqual;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is not equal to the object.
	 */
	public QualitativeValue getNonEqual() {
		return this.nonEqual;
	}

	/**
	 * This ordering relation for qualitative values indicates that the subject
	 * is not equal to the object.
	 */
	public void setNonEqual(QualitativeValue nonEqual) {
		this.nonEqual = nonEqual;
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
