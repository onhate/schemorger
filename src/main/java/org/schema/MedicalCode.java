package org.schema;

/**
 * 
 * A code for a medical entity.
 * 
 * @fullPath Thing > MedicalEntity > MedicalIntangible > MedicalCode
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalCode extends MedicalIntangible {

	private String codeValue;
	private String codingSystem;

	/**
	 * The actual code.
	 */
	public String getCodeValue() {
		return this.codeValue;
	}

	/**
	 * The actual code.
	 */
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	/**
	 * The coding system, e.g. 'ICD-10'.
	 */
	public String getCodingSystem() {
		return this.codingSystem;
	}

	/**
	 * The coding system, e.g. 'ICD-10'.
	 */
	public void setCodingSystem(String codingSystem) {
		this.codingSystem = codingSystem;
	}
}
