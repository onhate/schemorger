package org.schema;

/**
 * 
 * A food-related business.
 * 
 * @fullPath Thing > Place > LocalBusiness > FoodEstablishment
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class FoodEstablishment extends LocalBusiness {

	private Object acceptsReservations;
	private Object menu;
	private String servesCuisine;

	/**
	 * Either <code>Yes/No</code>, or a URL at which reservations can be made.
	 * 
	 * @see URL
	 * @see Text
	 * @see Boolean
	 */
	public Object getAcceptsReservations() {
		return this.acceptsReservations;
	}

	/**
	 * Either <code>Yes/No</code>, or a URL at which reservations can be made.
	 * 
	 * @see URL
	 * @see Text
	 * @see Boolean
	 */
	public void setAcceptsReservations(Object acceptsReservations) {
		this.acceptsReservations = acceptsReservations;
	}

	/**
	 * Either the actual menu or a URL of the menu.
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getMenu() {
		return this.menu;
	}

	/**
	 * Either the actual menu or a URL of the menu.
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setMenu(Object menu) {
		this.menu = menu;
	}

	/**
	 * The cuisine of the restaurant.
	 */
	public String getServesCuisine() {
		return this.servesCuisine;
	}

	/**
	 * The cuisine of the restaurant.
	 */
	public void setServesCuisine(String servesCuisine) {
		this.servesCuisine = servesCuisine;
	}
}
