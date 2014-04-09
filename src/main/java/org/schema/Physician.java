package org.schema;

/**
 * 
 * A doctor's office.
 * 
 * @fullPath Thing > Place > LocalBusiness > MedicalOrganization > Physician
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Physician extends MedicalOrganization {

	private Object availableService;
	private Hospital hospitalAffiliation;
	private MedicalSpecialty medicalSpecialty;

	/**
	 * A medical service available from this provider.
	 * 
	 * @see MedicalTest
	 * @see MedicalTherapy
	 * @see MedicalProcedure
	 */
	public Object getAvailableService() {
		return this.availableService;
	}

	/**
	 * A medical service available from this provider.
	 * 
	 * @see MedicalTest
	 * @see MedicalTherapy
	 * @see MedicalProcedure
	 */
	public void setAvailableService(Object availableService) {
		this.availableService = availableService;
	}

	/**
	 * A hospital with which the physician or office is affiliated.
	 */
	public Hospital getHospitalAffiliation() {
		return this.hospitalAffiliation;
	}

	/**
	 * A hospital with which the physician or office is affiliated.
	 */
	public void setHospitalAffiliation(Hospital hospitalAffiliation) {
		this.hospitalAffiliation = hospitalAffiliation;
	}

	/**
	 * A medical specialty of the provider.
	 */
	public MedicalSpecialty getMedicalSpecialty() {
		return this.medicalSpecialty;
	}

	/**
	 * A medical specialty of the provider.
	 */
	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}
}
