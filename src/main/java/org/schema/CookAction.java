package org.schema;

/**
 * 
 * The act of producing/preparing food.
 * 
 * @fullPath Thing > Action > CreateAction > CookAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class CookAction extends CreateAction {

	private Object foodEstablishment;
	private FoodEvent foodEvent;
	private Recipe recipe;

	/**
	 * A sub property of location. The specific food establishment where the
	 * action occurreed.
	 * 
	 * @see Place
	 * @see FoodEstablishment
	 */
	public Object getFoodEstablishment() {
		return this.foodEstablishment;
	}

	/**
	 * A sub property of location. The specific food establishment where the
	 * action occurreed.
	 * 
	 * @see Place
	 * @see FoodEstablishment
	 */
	public void setFoodEstablishment(Object foodEstablishment) {
		this.foodEstablishment = foodEstablishment;
	}

	/**
	 * A sub property of location. The specific food event where the action
	 * occurred.
	 */
	public FoodEvent getFoodEvent() {
		return this.foodEvent;
	}

	/**
	 * A sub property of location. The specific food event where the action
	 * occurred.
	 */
	public void setFoodEvent(FoodEvent foodEvent) {
		this.foodEvent = foodEvent;
	}

	/**
	 * A sub property of instrument. The recipe/instructions used to perform the
	 * action.
	 */
	public Recipe getRecipe() {
		return this.recipe;
	}

	/**
	 * A sub property of instrument. The recipe/instructions used to perform the
	 * action.
	 */
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
}
