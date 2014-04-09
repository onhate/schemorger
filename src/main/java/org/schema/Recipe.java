package org.schema;

/**
 * 
 * A recipe.
 * 
 * @fullPath Thing > CreativeWork > Recipe
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Recipe extends CreativeWork {

	private Duration cookTime;
	private String cookingMethod;
	private String ingredients;
	private NutritionInformation nutrition;
	private Duration prepTime;
	private String recipeCategory;
	private String recipeCuisine;
	private String recipeInstructions;
	private String recipeYield;
	private Duration totalTime;

	/**
	 * The time it takes to actually cook the dish, in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration
	 * format</a>.
	 */
	public Duration getCookTime() {
		return this.cookTime;
	}

	/**
	 * The time it takes to actually cook the dish, in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration
	 * format</a>.
	 */
	public void setCookTime(Duration cookTime) {
		this.cookTime = cookTime;
	}

	/**
	 * The method of cooking, such as Frying, Steaming, ...
	 */
	public String getCookingMethod() {
		return this.cookingMethod;
	}

	/**
	 * The method of cooking, such as Frying, Steaming, ...
	 */
	public void setCookingMethod(String cookingMethod) {
		this.cookingMethod = cookingMethod;
	}

	/**
	 * An ingredient used in the recipe.
	 */
	public String getIngredients() {
		return this.ingredients;
	}

	/**
	 * An ingredient used in the recipe.
	 */
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Nutrition information about the recipe.
	 */
	public NutritionInformation getNutrition() {
		return this.nutrition;
	}

	/**
	 * Nutrition information about the recipe.
	 */
	public void setNutrition(NutritionInformation nutrition) {
		this.nutrition = nutrition;
	}

	/**
	 * The length of time it takes to prepare the recipe, in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration
	 * format</a>.
	 */
	public Duration getPrepTime() {
		return this.prepTime;
	}

	/**
	 * The length of time it takes to prepare the recipe, in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration
	 * format</a>.
	 */
	public void setPrepTime(Duration prepTime) {
		this.prepTime = prepTime;
	}

	/**
	 * The category of the recipe—for example, appetizer, entree, etc.
	 */
	public String getRecipeCategory() {
		return this.recipeCategory;
	}

	/**
	 * The category of the recipe—for example, appetizer, entree, etc.
	 */
	public void setRecipeCategory(String recipeCategory) {
		this.recipeCategory = recipeCategory;
	}

	/**
	 * The cuisine of the recipe (for example, French or Ethopian).
	 */
	public String getRecipeCuisine() {
		return this.recipeCuisine;
	}

	/**
	 * The cuisine of the recipe (for example, French or Ethopian).
	 */
	public void setRecipeCuisine(String recipeCuisine) {
		this.recipeCuisine = recipeCuisine;
	}

	/**
	 * The steps to make the dish.
	 */
	public String getRecipeInstructions() {
		return this.recipeInstructions;
	}

	/**
	 * The steps to make the dish.
	 */
	public void setRecipeInstructions(String recipeInstructions) {
		this.recipeInstructions = recipeInstructions;
	}

	/**
	 * The quantity produced by the recipe (for example, number of people
	 * served, number of servings, etc).
	 */
	public String getRecipeYield() {
		return this.recipeYield;
	}

	/**
	 * The quantity produced by the recipe (for example, number of people
	 * served, number of servings, etc).
	 */
	public void setRecipeYield(String recipeYield) {
		this.recipeYield = recipeYield;
	}

	/**
	 * The total time it takes to prepare and cook the recipe, in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration
	 * format</a>.
	 */
	public Duration getTotalTime() {
		return this.totalTime;
	}

	/**
	 * The total time it takes to prepare and cook the recipe, in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration
	 * format</a>.
	 */
	public void setTotalTime(Duration totalTime) {
		this.totalTime = totalTime;
	}
}
