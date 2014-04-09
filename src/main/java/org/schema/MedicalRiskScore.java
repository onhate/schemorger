package org.schema;

/**
 * 
 * A simple system that adds up the number of risk factors to yield a score that
 * is associated with prognosis, e.g. CHAD score, TIMI risk score.
 * 
 * @fullPath Thing > MedicalEntity > MedicalRiskEstimator > MedicalRiskScore
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalRiskScore extends MedicalRiskEstimator {

	private String algorithm;

	/**
	 * The algorithm or rules to follow to compute the score.
	 */
	public String getAlgorithm() {
		return this.algorithm;
	}

	/**
	 * The algorithm or rules to follow to compute the score.
	 */
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
}
