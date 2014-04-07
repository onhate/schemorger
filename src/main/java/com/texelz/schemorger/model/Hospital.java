package com.texelz.schemorger.model;

/**
 *
 * A hospital.
 * @fullPath Thing > Organization > LocalBusiness > MedicalOrganization > Hospital
 *
 * @author Texelz (by Onhate)
 *
 */
public class Hospital extends MedicalOrganization {

	private Object availableService;
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
	 * A medical specialty of the provider.
	 */
	public MedicalSpecialty getMedicalSpecialty() {
		return this.medicalSpecialty;
	}
	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}
}
