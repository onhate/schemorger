package org.schema;

/**
 * 
 * A risk factor is anything that increases a person's likelihood of developing
 * or contracting a disease, medical condition, or complication.
 * 
 * @fullPath Thing > MedicalEntity > MedicalRiskFactor
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalRiskFactor extends MedicalEntity {

	private MedicalEntity increasesRiskOf;

	/**
	 * The condition, complication, etc. influenced by this factor.
	 */
	public MedicalEntity getIncreasesRiskOf() {
		return this.increasesRiskOf;
	}

	/**
	 * The condition, complication, etc. influenced by this factor.
	 */
	public void setIncreasesRiskOf(MedicalEntity increasesRiskOf) {
		this.increasesRiskOf = increasesRiskOf;
	}
}
