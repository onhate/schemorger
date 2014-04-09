package org.schema;

/**
 * 
 * A product taken by mouth that contains a dietary ingredient intended to
 * supplement the diet. Dietary ingredients may include vitamins, minerals,
 * herbs or other botanicals, amino acids, and substances such as enzymes, organ
 * tissues, glandulars and metabolites.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTherapy > DietarySupplement
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DietarySupplement extends MedicalTherapy {

	private String activeIngredient;
	private String background;
	private String dosageForm;
	private Boolean isProprietary;
	private DrugLegalStatus legalStatus;
	private Organization manufacturer;
	private MaximumDoseSchedule maximumIntake;
	private String mechanismOfAction;
	private String nonProprietaryName;
	private RecommendedDoseSchedule recommendedIntake;
	private String safetyConsideration;
	private String targetPopulation;

	/**
	 * An active ingredient, typically chemical compounds and/or biologic
	 * substances.
	 */
	public String getActiveIngredient() {
		return this.activeIngredient;
	}

	/**
	 * An active ingredient, typically chemical compounds and/or biologic
	 * substances.
	 */
	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}

	/**
	 * Descriptive information establishing a historical perspective on the
	 * supplement. May include the rationale for the name, the population where
	 * the supplement first came to prominence, etc.
	 */
	public String getBackground() {
		return this.background;
	}

	/**
	 * Descriptive information establishing a historical perspective on the
	 * supplement. May include the rationale for the name, the population where
	 * the supplement first came to prominence, etc.
	 */
	public void setBackground(String background) {
		this.background = background;
	}

	/**
	 * A dosage form in which this drug/supplement is available, e.g. 'tablet',
	 * 'suspension', 'injection'.
	 */
	public String getDosageForm() {
		return this.dosageForm;
	}

	/**
	 * A dosage form in which this drug/supplement is available, e.g. 'tablet',
	 * 'suspension', 'injection'.
	 */
	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}

	/**
	 * True if this item's name is a proprietary/brand name (vs. generic name).
	 */
	public Boolean getIsProprietary() {
		return this.isProprietary;
	}

	/**
	 * True if this item's name is a proprietary/brand name (vs. generic name).
	 */
	public void setIsProprietary(Boolean isProprietary) {
		this.isProprietary = isProprietary;
	}

	/**
	 * The drug or supplement's legal status, including any controlled substance
	 * schedules that apply.
	 */
	public DrugLegalStatus getLegalStatus() {
		return this.legalStatus;
	}

	/**
	 * The drug or supplement's legal status, including any controlled substance
	 * schedules that apply.
	 */
	public void setLegalStatus(DrugLegalStatus legalStatus) {
		this.legalStatus = legalStatus;
	}

	/**
	 * The manufacturer of the product.
	 */
	public Organization getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * The manufacturer of the product.
	 */
	public void setManufacturer(Organization manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Recommended intake of this supplement for a given population as defined
	 * by a specific recommending authority.
	 */
	public MaximumDoseSchedule getMaximumIntake() {
		return this.maximumIntake;
	}

	/**
	 * Recommended intake of this supplement for a given population as defined
	 * by a specific recommending authority.
	 */
	public void setMaximumIntake(MaximumDoseSchedule maximumIntake) {
		this.maximumIntake = maximumIntake;
	}

	/**
	 * The specific biochemical interaction through which this drug or
	 * supplement produces its pharmacological effect.
	 */
	public String getMechanismOfAction() {
		return this.mechanismOfAction;
	}

	/**
	 * The specific biochemical interaction through which this drug or
	 * supplement produces its pharmacological effect.
	 */
	public void setMechanismOfAction(String mechanismOfAction) {
		this.mechanismOfAction = mechanismOfAction;
	}

	/**
	 * The generic name of this drug or supplement.
	 */
	public String getNonProprietaryName() {
		return this.nonProprietaryName;
	}

	/**
	 * The generic name of this drug or supplement.
	 */
	public void setNonProprietaryName(String nonProprietaryName) {
		this.nonProprietaryName = nonProprietaryName;
	}

	/**
	 * Recommended intake of this supplement for a given population as defined
	 * by a specific recommending authority.
	 */
	public RecommendedDoseSchedule getRecommendedIntake() {
		return this.recommendedIntake;
	}

	/**
	 * Recommended intake of this supplement for a given population as defined
	 * by a specific recommending authority.
	 */
	public void setRecommendedIntake(RecommendedDoseSchedule recommendedIntake) {
		this.recommendedIntake = recommendedIntake;
	}

	/**
	 * Any potential safety concern associated with the supplement. May include
	 * interactions with other drugs and foods, pregnancy, breastfeeding, known
	 * adverse reactions, and documented efficacy of the supplement.
	 */
	public String getSafetyConsideration() {
		return this.safetyConsideration;
	}

	/**
	 * Any potential safety concern associated with the supplement. May include
	 * interactions with other drugs and foods, pregnancy, breastfeeding, known
	 * adverse reactions, and documented efficacy of the supplement.
	 */
	public void setSafetyConsideration(String safetyConsideration) {
		this.safetyConsideration = safetyConsideration;
	}

	/**
	 * Characteristics of the population for which this is intended, or which
	 * typically uses it, e.g. 'adults'.
	 */
	public String getTargetPopulation() {
		return this.targetPopulation;
	}

	/**
	 * Characteristics of the population for which this is intended, or which
	 * typically uses it, e.g. 'adults'.
	 */
	public void setTargetPopulation(String targetPopulation) {
		this.targetPopulation = targetPopulation;
	}
}
