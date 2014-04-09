package org.schema;

/**
 * 
 * A class of medical drugs, e.g., statins. Classes can represent general
 * pharmacological class, common mechanisms of action, common physiological
 * effects, etc.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTherapy > DrugClass
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DrugClass extends MedicalTherapy {

	private Drug drug;

	/**
	 * A drug in this drug class.
	 */
	public Drug getDrug() {
		return this.drug;
	}

	/**
	 * A drug in this drug class.
	 */
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
}
