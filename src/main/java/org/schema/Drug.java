package org.schema;

/**
 * 
 * A chemical or biologic substance, used as a medical therapy, that has a
 * physiological effect on an organism.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTherapy > Drug
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Drug extends MedicalTherapy {

	private String activeIngredient;
	private String administrationRoute;
	private String alcoholWarning;
	private DrugStrength availableStrength;
	private String breastfeedingWarning;
	private String clincalPharmacology;
	private DrugCost cost;
	private String dosageForm;
	private DoseSchedule doseSchedule;
	private DrugClass drugClass;
	private String foodWarning;
	private Drug interactingDrug;
	private Boolean isAvailableGenerically;
	private Boolean isProprietary;
	private org.schema.base.URL labelDetails;
	private DrugLegalStatus legalStatus;
	private Organization manufacturer;
	private String mechanismOfAction;
	private String nonProprietaryName;
	private String overdosage;
	private DrugPregnancyCategory pregnancyCategory;
	private String pregnancyWarning;
	private org.schema.base.URL prescribingInfo;
	private DrugPrescriptionStatus prescriptionStatus;
	private Drug relatedDrug;
	private Object warning;

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
	 * A route by which this drug may be administered, e.g. 'oral'.
	 */
	public String getAdministrationRoute() {
		return this.administrationRoute;
	}

	/**
	 * A route by which this drug may be administered, e.g. 'oral'.
	 */
	public void setAdministrationRoute(String administrationRoute) {
		this.administrationRoute = administrationRoute;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to consumption
	 * of alcohol while taking this drug.
	 */
	public String getAlcoholWarning() {
		return this.alcoholWarning;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to consumption
	 * of alcohol while taking this drug.
	 */
	public void setAlcoholWarning(String alcoholWarning) {
		this.alcoholWarning = alcoholWarning;
	}

	/**
	 * An available dosage strength for the drug.
	 */
	public DrugStrength getAvailableStrength() {
		return this.availableStrength;
	}

	/**
	 * An available dosage strength for the drug.
	 */
	public void setAvailableStrength(DrugStrength availableStrength) {
		this.availableStrength = availableStrength;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to this drug's
	 * use by breastfeeding mothers.
	 */
	public String getBreastfeedingWarning() {
		return this.breastfeedingWarning;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to this drug's
	 * use by breastfeeding mothers.
	 */
	public void setBreastfeedingWarning(String breastfeedingWarning) {
		this.breastfeedingWarning = breastfeedingWarning;
	}

	/**
	 * Description of the absorption and elimination of drugs, including their
	 * concentration (pharmacokinetics, pK) and biological effects
	 * (pharmacodynamics, pD).
	 */
	public String getClincalPharmacology() {
		return this.clincalPharmacology;
	}

	/**
	 * Description of the absorption and elimination of drugs, including their
	 * concentration (pharmacokinetics, pK) and biological effects
	 * (pharmacodynamics, pD).
	 */
	public void setClincalPharmacology(String clincalPharmacology) {
		this.clincalPharmacology = clincalPharmacology;
	}

	/**
	 * Cost per unit of the drug, as reported by the source being tagged.
	 */
	public DrugCost getCost() {
		return this.cost;
	}

	/**
	 * Cost per unit of the drug, as reported by the source being tagged.
	 */
	public void setCost(DrugCost cost) {
		this.cost = cost;
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
	 * A dosing schedule for the drug for a given population, either observed,
	 * recommended, or maximum dose based on the type used.
	 */
	public DoseSchedule getDoseSchedule() {
		return this.doseSchedule;
	}

	/**
	 * A dosing schedule for the drug for a given population, either observed,
	 * recommended, or maximum dose based on the type used.
	 */
	public void setDoseSchedule(DoseSchedule doseSchedule) {
		this.doseSchedule = doseSchedule;
	}

	/**
	 * The class of drug this belongs to (e.g., statins).
	 */
	public DrugClass getDrugClass() {
		return this.drugClass;
	}

	/**
	 * The class of drug this belongs to (e.g., statins).
	 */
	public void setDrugClass(DrugClass drugClass) {
		this.drugClass = drugClass;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to consumption
	 * of specific foods while taking this drug.
	 */
	public String getFoodWarning() {
		return this.foodWarning;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to consumption
	 * of specific foods while taking this drug.
	 */
	public void setFoodWarning(String foodWarning) {
		this.foodWarning = foodWarning;
	}

	/**
	 * Another drug that is known to interact with this drug in a way that
	 * impacts the effect of this drug or causes a risk to the patient. Note:
	 * disease interactions are typically captured as contraindications.
	 */
	public Drug getInteractingDrug() {
		return this.interactingDrug;
	}

	/**
	 * Another drug that is known to interact with this drug in a way that
	 * impacts the effect of this drug or causes a risk to the patient. Note:
	 * disease interactions are typically captured as contraindications.
	 */
	public void setInteractingDrug(Drug interactingDrug) {
		this.interactingDrug = interactingDrug;
	}

	/**
	 * True if the drug is available in a generic form (regardless of name).
	 */
	public Boolean getIsAvailableGenerically() {
		return this.isAvailableGenerically;
	}

	/**
	 * True if the drug is available in a generic form (regardless of name).
	 */
	public void setIsAvailableGenerically(Boolean isAvailableGenerically) {
		this.isAvailableGenerically = isAvailableGenerically;
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
	 * URL to the drug's label details.
	 */
	public org.schema.base.URL getLabelDetails() {
		return this.labelDetails;
	}

	/**
	 * URL to the drug's label details.
	 */
	public void setLabelDetails(org.schema.base.URL labelDetails) {
		this.labelDetails = labelDetails;
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
	 * Any information related to overdose on a drug, including signs or
	 * symptoms, treatments, contact information for emergency response.
	 */
	public String getOverdosage() {
		return this.overdosage;
	}

	/**
	 * Any information related to overdose on a drug, including signs or
	 * symptoms, treatments, contact information for emergency response.
	 */
	public void setOverdosage(String overdosage) {
		this.overdosage = overdosage;
	}

	/**
	 * Pregnancy category of this drug.
	 */
	public DrugPregnancyCategory getPregnancyCategory() {
		return this.pregnancyCategory;
	}

	/**
	 * Pregnancy category of this drug.
	 */
	public void setPregnancyCategory(DrugPregnancyCategory pregnancyCategory) {
		this.pregnancyCategory = pregnancyCategory;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to this drug's
	 * use during pregnancy.
	 */
	public String getPregnancyWarning() {
		return this.pregnancyWarning;
	}

	/**
	 * Any precaution, guidance, contraindication, etc. related to this drug's
	 * use during pregnancy.
	 */
	public void setPregnancyWarning(String pregnancyWarning) {
		this.pregnancyWarning = pregnancyWarning;
	}

	/**
	 * URL to prescribing information for the drug.
	 */
	public org.schema.base.URL getPrescribingInfo() {
		return this.prescribingInfo;
	}

	/**
	 * URL to prescribing information for the drug.
	 */
	public void setPrescribingInfo(org.schema.base.URL prescribingInfo) {
		this.prescribingInfo = prescribingInfo;
	}

	/**
	 * Indicates whether this drug is available by prescription or
	 * over-the-counter.
	 */
	public DrugPrescriptionStatus getPrescriptionStatus() {
		return this.prescriptionStatus;
	}

	/**
	 * Indicates whether this drug is available by prescription or
	 * over-the-counter.
	 */
	public void setPrescriptionStatus(DrugPrescriptionStatus prescriptionStatus) {
		this.prescriptionStatus = prescriptionStatus;
	}

	/**
	 * Any other drug related to this one, for example commonly-prescribed
	 * alternatives.
	 */
	public Drug getRelatedDrug() {
		return this.relatedDrug;
	}

	/**
	 * Any other drug related to this one, for example commonly-prescribed
	 * alternatives.
	 */
	public void setRelatedDrug(Drug relatedDrug) {
		this.relatedDrug = relatedDrug;
	}

	/**
	 * Any FDA or other warnings about the drug (text or URL).
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getWarning() {
		return this.warning;
	}

	/**
	 * Any FDA or other warnings about the drug (text or URL).
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setWarning(Object warning) {
		this.warning = warning;
	}
}
