package org.schema;

/**
 * 
 * A strategy of regulating the intake of food to achieve or maintain a specific
 * health-related goal.
 * 
 * @fullPath Thing > CreativeWork > Diet
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Diet extends CreativeWork {

	private String dietFeatures;
	private Object endorsers;
	private String expertConsiderations;
	private String overview;
	private String physiologicalBenefits;
	private String proprietaryName;
	private String risks;

	/**
	 * Nutritional information specific to the dietary plan. May include dietary
	 * recommendations on what foods to avoid, what foods to consume, and
	 * specific alterations/deviations from the USDA or other regulatory body's
	 * approved dietary guidelines.
	 */
	public String getDietFeatures() {
		return this.dietFeatures;
	}

	/**
	 * Nutritional information specific to the dietary plan. May include dietary
	 * recommendations on what foods to avoid, what foods to consume, and
	 * specific alterations/deviations from the USDA or other regulatory body's
	 * approved dietary guidelines.
	 */
	public void setDietFeatures(String dietFeatures) {
		this.dietFeatures = dietFeatures;
	}

	/**
	 * People or organizations that endorse the plan.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getEndorsers() {
		return this.endorsers;
	}

	/**
	 * People or organizations that endorse the plan.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setEndorsers(Object endorsers) {
		this.endorsers = endorsers;
	}

	/**
	 * Medical expert advice related to the plan.
	 */
	public String getExpertConsiderations() {
		return this.expertConsiderations;
	}

	/**
	 * Medical expert advice related to the plan.
	 */
	public void setExpertConsiderations(String expertConsiderations) {
		this.expertConsiderations = expertConsiderations;
	}

	/**
	 * Descriptive information establishing the overarching theory/philosophy of
	 * the plan. May include the rationale for the name, the population where
	 * the plan first came to prominence, etc.
	 */
	public String getOverview() {
		return this.overview;
	}

	/**
	 * Descriptive information establishing the overarching theory/philosophy of
	 * the plan. May include the rationale for the name, the population where
	 * the plan first came to prominence, etc.
	 */
	public void setOverview(String overview) {
		this.overview = overview;
	}

	/**
	 * Specific physiologic benefits associated to the plan.
	 */
	public String getPhysiologicalBenefits() {
		return this.physiologicalBenefits;
	}

	/**
	 * Specific physiologic benefits associated to the plan.
	 */
	public void setPhysiologicalBenefits(String physiologicalBenefits) {
		this.physiologicalBenefits = physiologicalBenefits;
	}

	/**
	 * Proprietary name given to the diet plan, typically by its originator or
	 * creator.
	 */
	public String getProprietaryName() {
		return this.proprietaryName;
	}

	/**
	 * Proprietary name given to the diet plan, typically by its originator or
	 * creator.
	 */
	public void setProprietaryName(String proprietaryName) {
		this.proprietaryName = proprietaryName;
	}

	/**
	 * Specific physiologic risks associated to the plan.
	 */
	public String getRisks() {
		return this.risks;
	}

	/**
	 * Specific physiologic risks associated to the plan.
	 */
	public void setRisks(String risks) {
		this.risks = risks;
	}
}
