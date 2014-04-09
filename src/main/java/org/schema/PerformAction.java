package org.schema;

/**
 * 
 * The act of participating in performance arts.
 * 
 * @fullPath Thing > Action > PlayAction > PerformAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PerformAction extends PlayAction {

	private EntertainmentBusiness entertainmentBusiness;

	/**
	 * A sub property of location. The entertainment business where the action
	 * occurred.
	 */
	public EntertainmentBusiness getEntertainmentBusiness() {
		return this.entertainmentBusiness;
	}

	/**
	 * A sub property of location. The entertainment business where the action
	 * occurred.
	 */
	public void setEntertainmentBusiness(EntertainmentBusiness entertainmentBusiness) {
		this.entertainmentBusiness = entertainmentBusiness;
	}
}
