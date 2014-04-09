package org.schema;

/**
 * 
 * A specific strength in which a medical drug is available in a specific
 * country.
 * 
 * @fullPath Thing > MedicalEntity > MedicalIntangible > DrugStrength
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DrugStrength extends MedicalIntangible {

	private String activeIngredient;
	private AdministrativeArea availableIn;
	private String strengthUnit;
	private Double strengthValue;

	/**
	 * An active ingredient, typically chemical compounds and/or biologic
	 * substances.
	 */
	public String getActiveIngredient() {
		return this.activeIngredient;
	}

	/**
	 * An active ingredient, typically chemical compounds and/or biologic
	 * substances.
	 */
	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}

	/**
	 * The location in which the strength is available.
	 */
	public AdministrativeArea getAvailableIn() {
		return this.availableIn;
	}

	/**
	 * The location in which the strength is available.
	 */
	public void setAvailableIn(AdministrativeArea availableIn) {
		this.availableIn = availableIn;
	}

	/**
	 * The units of an active ingredient's strength, e.g. mg.
	 */
	public String getStrengthUnit() {
		return this.strengthUnit;
	}

	/**
	 * The units of an active ingredient's strength, e.g. mg.
	 */
	public void setStrengthUnit(String strengthUnit) {
		this.strengthUnit = strengthUnit;
	}

	/**
	 * The value of an active ingredient's strength, e.g. 325.
	 */
	public Double getStrengthValue() {
		return this.strengthValue;
	}

	/**
	 * The value of an active ingredient's strength, e.g. 325.
	 */
	public void setStrengthValue(Double strengthValue) {
		this.strengthValue = strengthValue;
	}
}
