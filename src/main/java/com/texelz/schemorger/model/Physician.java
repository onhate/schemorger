package com.texelz.schemorger.model;

/**
 *
 * A doctor's office.
 * @fullPath Thing > Organization > LocalBusiness > MedicalOrganization > Physician
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
	 * @see MedicalTest
	 * @see MedicalProcedure
	 * @see MedicalTherapy
	 */
	public Object getAvailableService() {
		return this.availableService;
	}
	public void setAvailableService(Object availableService) {
		this.availableService = availableService;
	}
	/**
	 * A hospital with which the physician or office is affiliated.
	 */
	public Hospital getHospitalAffiliation() {
		return this.hospitalAffiliation;
	}
	public void setHospitalAffiliation(Hospital hospitalAffiliation) {
		this.hospitalAffiliation = hospitalAffiliation;
	}
	/**
	 * A medical specialty of the provider.
	 */
	public MedicalSpecialty getMedicalSpecialty() {
		return this.medicalSpecialty;
	}
	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}
}
