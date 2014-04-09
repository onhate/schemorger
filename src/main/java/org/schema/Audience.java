package org.schema;

/**
 * 
 * Intended audience for an item, i.e. the group for whom the item was created.
 * 
 * @fullPath Thing > Intangible > Audience
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Audience extends Intangible {

	private String audienceType;
	private AdministrativeArea geographicArea;

	/**
	 * The target group associated with a given audience (e.g. veterans, car
	 * owners, musicians, etc.) domain: Audience Range: Text
	 */
	public String getAudienceType() {
		return this.audienceType;
	}

	/**
	 * The target group associated with a given audience (e.g. veterans, car
	 * owners, musicians, etc.) domain: Audience Range: Text
	 */
	public void setAudienceType(String audienceType) {
		this.audienceType = audienceType;
	}

	/**
	 * The geographic area associated with the audience.
	 */
	public AdministrativeArea getGeographicArea() {
		return this.geographicArea;
	}

	/**
	 * The geographic area associated with the audience.
	 */
	public void setGeographicArea(AdministrativeArea geographicArea) {
		this.geographicArea = geographicArea;
	}
}
