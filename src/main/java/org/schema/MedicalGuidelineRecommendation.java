package org.schema;

/**
 * 
 * A guideline recommendation that is regarded as efficacious and where quality
 * of the data supporting the recommendation is sound.
 * 
 * @fullPath Thing > MedicalEntity > MedicalGuideline >
 *           MedicalGuidelineRecommendation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalGuidelineRecommendation extends MedicalGuideline {

	private String recommendationStrength;

	/**
	 * Strength of the guideline's recommendation (e.g. 'class I').
	 */
	public String getRecommendationStrength() {
		return this.recommendationStrength;
	}

	/**
	 * Strength of the guideline's recommendation (e.g. 'class I').
	 */
	public void setRecommendationStrength(String recommendationStrength) {
		this.recommendationStrength = recommendationStrength;
	}
}
