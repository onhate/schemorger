package org.schema;

/**
 * 
 * The legal availability status of a medical drug.
 * 
 * @fullPath Thing > MedicalEntity > MedicalIntangible > DrugLegalStatus
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DrugLegalStatus extends MedicalIntangible {

	private AdministrativeArea applicableLocation;

	/**
	 * The location in which the status applies.
	 */
	public AdministrativeArea getApplicableLocation() {
		return this.applicableLocation;
	}

	/**
	 * The location in which the status applies.
	 */
	public void setApplicableLocation(AdministrativeArea applicableLocation) {
		this.applicableLocation = applicableLocation;
	}
}
