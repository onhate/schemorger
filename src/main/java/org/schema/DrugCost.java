package org.schema;

/**
 * 
 * The cost per unit of a medical drug. Note that this type is not meant to
 * represent the price in an offer of a drug for sale; see the Offer type for
 * that. This type will typically be used to tag wholesale or average retail
 * cost of a drug, or maximum reimbursable cost. Costs of medical drugs vary
 * widely depending on how and where they are paid for, so while this type
 * captures some of the variables, costs should be used with caution by
 * consumers of this schema's markup.
 * 
 * @fullPath Thing > MedicalEntity > MedicalIntangible > DrugCost
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DrugCost extends MedicalIntangible {

	private AdministrativeArea applicableLocation;
	private DrugCostCategory costCategory;
	private String costCurrency;
	private String costOrigin;
	private Object costPerUnit;
	private String drugUnit;

	/**
	 * The location in which the status applies.
	 */
	public AdministrativeArea getApplicableLocation() {
		return this.applicableLocation;
	}

	/**
	 * The location in which the status applies.
	 */
	public void setApplicableLocation(AdministrativeArea applicableLocation) {
		this.applicableLocation = applicableLocation;
	}

	/**
	 * The category of cost, such as wholesale, retail, reimbursement cap, etc.
	 */
	public DrugCostCategory getCostCategory() {
		return this.costCategory;
	}

	/**
	 * The category of cost, such as wholesale, retail, reimbursement cap, etc.
	 */
	public void setCostCategory(DrugCostCategory costCategory) {
		this.costCategory = costCategory;
	}

	/**
	 * The currency (in 3-letter <a
	 * href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 format</a>) of the
	 * drug cost.
	 */
	public String getCostCurrency() {
		return this.costCurrency;
	}

	/**
	 * The currency (in 3-letter <a
	 * href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 format</a>) of the
	 * drug cost.
	 */
	public void setCostCurrency(String costCurrency) {
		this.costCurrency = costCurrency;
	}

	/**
	 * Additional details to capture the origin of the cost data. For example,
	 * 'Medicare Part B'.
	 */
	public String getCostOrigin() {
		return this.costOrigin;
	}

	/**
	 * Additional details to capture the origin of the cost data. For example,
	 * 'Medicare Part B'.
	 */
	public void setCostOrigin(String costOrigin) {
		this.costOrigin = costOrigin;
	}

	/**
	 * The cost per unit of the drug.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getCostPerUnit() {
		return this.costPerUnit;
	}

	/**
	 * The cost per unit of the drug.
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setCostPerUnit(Object costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	/**
	 * The unit in which the drug is measured, e.g. '5 mg tablet'.
	 */
	public String getDrugUnit() {
		return this.drugUnit;
	}

	/**
	 * The unit in which the drug is measured, e.g. '5 mg tablet'.
	 */
	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}
}
