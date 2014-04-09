package org.schema;

/**
 * 
 * A medical clinic.
 * 
 * @fullPath Thing > Place > LocalBusiness > MedicalOrganization > MedicalClinic
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalClinic extends MedicalOrganization {

	private Object availableService;
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
