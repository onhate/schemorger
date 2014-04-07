package com.texelz.schemorger.model;

/**
 *
 * A specific strength in which a medical drug is available in a specific country.
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
	 * An active ingredient, typically chemical compounds and/or biologic substances.
	 */
	public String getActiveIngredient() {
		return this.activeIngredient;
	}
	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}
	/**
	 * The location in which the strength is available.
	 */
	public AdministrativeArea getAvailableIn() {
		return this.availableIn;
	}
	public void setAvailableIn(AdministrativeArea availableIn) {
		this.availableIn = availableIn;
	}
	/**
	 * The units of an active ingredient's strength, e.g. mg.
	 */
	public String getStrengthUnit() {
		return this.strengthUnit;
	}
	public void setStrengthUnit(String strengthUnit) {
		this.strengthUnit = strengthUnit;
	}
	/**
	 * The value of an active ingredient's strength, e.g. 325.
	 */
	public Double getStrengthValue() {
		return this.strengthValue;
	}
	public void setStrengthValue(Double strengthValue) {
		this.strengthValue = strengthValue;
	}
}
