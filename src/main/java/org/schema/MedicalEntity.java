package org.schema;

/**
 * 
 * The most generic type of entity related to health and the practice of
 * medicine.
 * 
 * @fullPath Thing > MedicalEntity
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalEntity extends Thing {

	private String alternateName;
	private MedicalCode code;
	private MedicalGuideline guideline;
	private MedicineSystem medicineSystem;
	private Organization recognizingAuthority;
	private MedicalSpecialty relevantSpecialty;
	private MedicalStudy study;

	/**
	 * An alias for the item.
	 */
	public String getAlternateName() {
		return this.alternateName;
	}

	/**
	 * An alias for the item.
	 */
	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	/**
	 * A medical code for the entity, taken from a controlled vocabulary or
	 * ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
	 */
	public MedicalCode getCode() {
		return this.code;
	}

	/**
	 * A medical code for the entity, taken from a controlled vocabulary or
	 * ontology such as ICD-9, DiseasesDB, MeSH, SNOMED-CT, RxNorm, etc.
	 */
	public void setCode(MedicalCode code) {
		this.code = code;
	}

	/**
	 * A medical guideline related to this entity.
	 */
	public MedicalGuideline getGuideline() {
		return this.guideline;
	}

	/**
	 * A medical guideline related to this entity.
	 */
	public void setGuideline(MedicalGuideline guideline) {
		this.guideline = guideline;
	}

	/**
	 * The system of medicine that includes this MedicalEntity, for example
	 * 'evidence-based', 'homeopathic', 'chiropractic', etc.
	 */
	public MedicineSystem getMedicineSystem() {
		return this.medicineSystem;
	}

	/**
	 * The system of medicine that includes this MedicalEntity, for example
	 * 'evidence-based', 'homeopathic', 'chiropractic', etc.
	 */
	public void setMedicineSystem(MedicineSystem medicineSystem) {
		this.medicineSystem = medicineSystem;
	}

	/**
	 * If applicable, the organization that officially recognizes this entity as
	 * part of its endorsed system of medicine.
	 */
	public Organization getRecognizingAuthority() {
		return this.recognizingAuthority;
	}

	/**
	 * If applicable, the organization that officially recognizes this entity as
	 * part of its endorsed system of medicine.
	 */
	public void setRecognizingAuthority(Organization recognizingAuthority) {
		this.recognizingAuthority = recognizingAuthority;
	}

	/**
	 * If applicable, a medical specialty in which this entity is relevant.
	 */
	public MedicalSpecialty getRelevantSpecialty() {
		return this.relevantSpecialty;
	}

	/**
	 * If applicable, a medical specialty in which this entity is relevant.
	 */
	public void setRelevantSpecialty(MedicalSpecialty relevantSpecialty) {
		this.relevantSpecialty = relevantSpecialty;
	}

	/**
	 * A medical study or trial related to this entity.
	 */
	public MedicalStudy getStudy() {
		return this.study;
	}

	/**
	 * A medical study or trial related to this entity.
	 */
	public void setStudy(MedicalStudy study) {
		this.study = study;
	}
}
