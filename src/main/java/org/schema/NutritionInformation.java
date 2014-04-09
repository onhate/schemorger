package org.schema;

/**
 * 
 * Nutritional information about the recipe.
 * 
 * @fullPath Thing > Intangible > StructuredValue > NutritionInformation
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class NutritionInformation extends StructuredValue {

	private Energy calories;
	private Mass carbohydrateContent;
	private Mass cholesterolContent;
	private Mass fatContent;
	private Mass fiberContent;
	private Mass proteinContent;
	private Mass saturatedFatContent;
	private String servingSize;
	private Mass sodiumContent;
	private Mass sugarContent;
	private Mass transFatContent;
	private Mass unsaturatedFatContent;

	/**
	 * The number of calories
	 */
	public Energy getCalories() {
		return this.calories;
	}

	/**
	 * The number of calories
	 */
	public void setCalories(Energy calories) {
		this.calories = calories;
	}

	/**
	 * The number of grams of carbohydrates.
	 */
	public Mass getCarbohydrateContent() {
		return this.carbohydrateContent;
	}

	/**
	 * The number of grams of carbohydrates.
	 */
	public void setCarbohydrateContent(Mass carbohydrateContent) {
		this.carbohydrateContent = carbohydrateContent;
	}

	/**
	 * The number of milligrams of cholesterol.
	 */
	public Mass getCholesterolContent() {
		return this.cholesterolContent;
	}

	/**
	 * The number of milligrams of cholesterol.
	 */
	public void setCholesterolContent(Mass cholesterolContent) {
		this.cholesterolContent = cholesterolContent;
	}

	/**
	 * The number of grams of fat.
	 */
	public Mass getFatContent() {
		return this.fatContent;
	}

	/**
	 * The number of grams of fat.
	 */
	public void setFatContent(Mass fatContent) {
		this.fatContent = fatContent;
	}

	/**
	 * The number of grams of fiber.
	 */
	public Mass getFiberContent() {
		return this.fiberContent;
	}

	/**
	 * The number of grams of fiber.
	 */
	public void setFiberContent(Mass fiberContent) {
		this.fiberContent = fiberContent;
	}

	/**
	 * The number of grams of protein.
	 */
	public Mass getProteinContent() {
		return this.proteinContent;
	}

	/**
	 * The number of grams of protein.
	 */
	public void setProteinContent(Mass proteinContent) {
		this.proteinContent = proteinContent;
	}

	/**
	 * The number of grams of saturated fat.
	 */
	public Mass getSaturatedFatContent() {
		return this.saturatedFatContent;
	}

	/**
	 * The number of grams of saturated fat.
	 */
	public void setSaturatedFatContent(Mass saturatedFatContent) {
		this.saturatedFatContent = saturatedFatContent;
	}

	/**
	 * The serving size, in terms of the number of volume or mass
	 */
	public String getServingSize() {
		return this.servingSize;
	}

	/**
	 * The serving size, in terms of the number of volume or mass
	 */
	public void setServingSize(String servingSize) {
		this.servingSize = servingSize;
	}

	/**
	 * The number of milligrams of sodium.
	 */
	public Mass getSodiumContent() {
		return this.sodiumContent;
	}

	/**
	 * The number of milligrams of sodium.
	 */
	public void setSodiumContent(Mass sodiumContent) {
		this.sodiumContent = sodiumContent;
	}

	/**
	 * The number of grams of sugar.
	 */
	public Mass getSugarContent() {
		return this.sugarContent;
	}

	/**
	 * The number of grams of sugar.
	 */
	public void setSugarContent(Mass sugarContent) {
		this.sugarContent = sugarContent;
	}

	/**
	 * The number of grams of trans fat.
	 */
	public Mass getTransFatContent() {
		return this.transFatContent;
	}

	/**
	 * The number of grams of trans fat.
	 */
	public void setTransFatContent(Mass transFatContent) {
		this.transFatContent = transFatContent;
	}

	/**
	 * The number of grams of unsaturated fat.
	 */
	public Mass getUnsaturatedFatContent() {
		return this.unsaturatedFatContent;
	}

	/**
	 * The number of grams of unsaturated fat.
	 */
	public void setUnsaturatedFatContent(Mass unsaturatedFatContent) {
		this.unsaturatedFatContent = unsaturatedFatContent;
	}
}
