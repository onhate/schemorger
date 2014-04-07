package com.texelz.schemorger.model;

/**
 *
 * Any rule set or interactive tool for estimating the risk of developing a complication or condition.
 * @fullPath Thing > MedicalEntity > MedicalRiskEstimator
 *
 * @author Texelz (by Onhate)
 *
 */
public class MedicalRiskEstimator extends MedicalEntity {

	private MedicalEntity estimatesRiskOf;
	private MedicalRiskFactor includedRiskFactor;
	/**
	 * The condition, complication, or symptom whose risk is being estimated.
	 */
	public MedicalEntity getEstimatesRiskOf() {
		return this.estimatesRiskOf;
	}
	public void setEstimatesRiskOf(MedicalEntity estimatesRiskOf) {
		this.estimatesRiskOf = estimatesRiskOf;
	}
	/**
	 * A modifiable or non-modifiable risk factor included in the calculation, e.g. age, coexisting condition.
	 */
	public MedicalRiskFactor getIncludedRiskFactor() {
		return this.includedRiskFactor;
	}
	public void setIncludedRiskFactor(MedicalRiskFactor includedRiskFactor) {
		this.includedRiskFactor = includedRiskFactor;
	}
}
