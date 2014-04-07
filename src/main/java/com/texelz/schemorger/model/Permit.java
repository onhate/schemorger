package com.texelz.schemorger.model;

/**
 *
 * A permit issued by an organization, e.g. a parking pass.
 * @fullPath Thing > Intangible > Permit
 *
 * @author Texelz (by Onhate)
 *
 */
public class Permit extends Intangible {

	private Organization issuedBy;
	private Service issuedThrough;
	private Audience permitAudience;
	private Duration validFor;
	private java.util.Date validFrom;
	private AdministrativeArea validIn;
	private java.util.Date validUntil;
	/**
	 * The organization issuing the permit.
	 */
	public Organization getIssuedBy() {
		return this.issuedBy;
	}
	public void setIssuedBy(Organization issuedBy) {
		this.issuedBy = issuedBy;
	}
	/**
	 * The service through with the permit was granted.
	 */
	public Service getIssuedThrough() {
		return this.issuedThrough;
	}
	public void setIssuedThrough(Service issuedThrough) {
		this.issuedThrough = issuedThrough;
	}
	/**
	 * The target audience for this permit.
	 */
	public Audience getPermitAudience() {
		return this.permitAudience;
	}
	public void setPermitAudience(Audience permitAudience) {
		this.permitAudience = permitAudience;
	}
	/**
	 * The time validity of the permit.
	 */
	public Duration getValidFor() {
		return this.validFor;
	}
	public void setValidFor(Duration validFor) {
		this.validFor = validFor;
	}
	/**
	 * The date when the item becomes valid.
	 */
	public java.util.Date getValidFrom() {
		return this.validFrom;
	}
	public void setValidFrom(java.util.Date validFrom) {
		this.validFrom = validFrom;
	}
	/**
	 * The geographic area where the permit is valid.
	 */
	public AdministrativeArea getValidIn() {
		return this.validIn;
	}
	public void setValidIn(AdministrativeArea validIn) {
		this.validIn = validIn;
	}
	/**
	 * The date when the item is no longer valid.
	 */
	public java.util.Date getValidUntil() {
		return this.validUntil;
	}
	public void setValidUntil(java.util.Date validUntil) {
		this.validUntil = validUntil;
	}
}
