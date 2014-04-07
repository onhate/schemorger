package com.texelz.schemorger.model;

/**
 *
 * The anatomical location at which two or more bones make contact.
 * @fullPath Thing > MedicalEntity > AnatomicalStructure > Joint
 *
 * @author Texelz (by Onhate)
 *
 */
public class Joint extends AnatomicalStructure {

	private String biomechnicalClass;
	private String functionalClass;
	private String structuralClass;
	/**
	 * The biomechanical properties of the bone.
	 */
	public String getBiomechnicalClass() {
		return this.biomechnicalClass;
	}
	public void setBiomechnicalClass(String biomechnicalClass) {
		this.biomechnicalClass = biomechnicalClass;
	}
	/**
	 * The degree of mobility the joint allows.
	 */
	public String getFunctionalClass() {
		return this.functionalClass;
	}
	public void setFunctionalClass(String functionalClass) {
		this.functionalClass = functionalClass;
	}
	/**
	 * The name given to how bone physically connects to each other.
	 */
	public String getStructuralClass() {
		return this.structuralClass;
	}
	public void setStructuralClass(String structuralClass) {
		this.structuralClass = structuralClass;
	}
}
