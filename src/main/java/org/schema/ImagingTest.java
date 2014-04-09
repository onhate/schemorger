package org.schema;

/**
 * 
 * Any medical imaging modality typically used for diagnostic purposes.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTest > ImagingTest
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ImagingTest extends MedicalTest {

	private MedicalImagingTechnique imagingTechnique;

	/**
	 * Imaging technique used.
	 */
	public MedicalImagingTechnique getImagingTechnique() {
		return this.imagingTechnique;
	}

	/**
	 * Imaging technique used.
	 */
	public void setImagingTechnique(MedicalImagingTechnique imagingTechnique) {
		this.imagingTechnique = imagingTechnique;
	}
}
