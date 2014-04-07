package com.texelz.schemorger.model;

/**
 *
 * An organization such as a school, NGO, corporation, club, etc.
 * @fullPath Thing > Organization
 *
 * @author Texelz (by Onhate)
 *
 */
public class Organization extends Thing {

	private PostalAddress address;
	private AggregateRating aggregateRating;
	private Object brand;
	private ContactPoint contactPoint;
	private Organization department;
	private String duns;
	private String email;
	private Person employee;
	private Event event;
	private String faxNumber;
	private Person founder;
	private java.util.Date foundingDate;
	private String globalLocationNumber;
	private Place hasPOS;
	private String interactionCount;
	private String isicV4;
	private String legalName;
	private Object location;
	private Object logo;
	private Offer makesOffer;
	private Object member;
	private String naics;
	private Object owns;
	private Review review;
	private Demand seeks;
	private Organization subOrganization;
	private String taxID;
	private String telephone;
	private String vatID;
	/**
	 * Physical address of the item.
	 */
	public PostalAddress getAddress() {
		return this.address;
	}
	public void setAddress(PostalAddress address) {
		this.address = address;
	}
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	/**
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 * @see Organization
	 * @see Brand
	 */
	public Object getBrand() {
		return this.brand;
	}
	public void setBrand(Object brand) {
		this.brand = brand;
	}
	/**
	 * A contact point for a person or organization. Supercedes <a href="contactPoints">contactPoints</a>.
	 */
	public ContactPoint getContactPoint() {
		return this.contactPoint;
	}
	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}
	/**
	 * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
	 */
	public Organization getDepartment() {
		return this.department;
	}
	public void setDepartment(Organization department) {
		this.department = department;
	}
	/**
	 * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
	 */
	public String getDuns() {
		return this.duns;
	}
	public void setDuns(String duns) {
		this.duns = duns;
	}
	/**
	 * Email address.
	 */
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Someone working for this organization. Supercedes <a href="employees">employees</a>.
	 */
	public Person getEmployee() {
		return this.employee;
	}
	public void setEmployee(Person employee) {
		this.employee = employee;
	}
	/**
	 * Upcoming or past event associated with this place or organization. Supercedes <a href="events">events</a>.
	 */
	public Event getEvent() {
		return this.event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	/**
	 * The fax number.
	 */
	public String getFaxNumber() {
		return this.faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	/**
	 * A person who founded this organization. Supercedes <a href="founders">founders</a>.
	 */
	public Person getFounder() {
		return this.founder;
	}
	public void setFounder(Person founder) {
		this.founder = founder;
	}
	/**
	 * The date that this organization was founded.
	 */
	public java.util.Date getFoundingDate() {
		return this.foundingDate;
	}
	public void setFoundingDate(java.util.Date foundingDate) {
		this.foundingDate = foundingDate;
	}
	/**
	 * The Global Location Number (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 */
	public String getGlobalLocationNumber() {
		return this.globalLocationNumber;
	}
	public void setGlobalLocationNumber(String globalLocationNumber) {
		this.globalLocationNumber = globalLocationNumber;
	}
	/**
	 * Points-of-Sales operated by the organization or person.
	 */
	public Place getHasPOS() {
		return this.hasPOS;
	}
	public void setHasPOS(Place hasPOS) {
		this.hasPOS = hasPOS;
	}
	/**
	 * A count of a specific user interactions with this item—for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href="UserInteraction">UserInteraction</a>.
	 */
	public String getInteractionCount() {
		return this.interactionCount;
	}
	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}
	/**
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 */
	public String getIsicV4() {
		return this.isicV4;
	}
	public void setIsicV4(String isicV4) {
		this.isicV4 = isicV4;
	}
	/**
	 * The official name of the organization, e.g. the registered company name.
	 */
	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	/**
	 * The location of the event, organization or action.
	 * @see Place
	 * @see PostalAddress
	 */
	public Object getLocation() {
		return this.location;
	}
	public void setLocation(Object location) {
		this.location = location;
	}
	/**
	 * A logo associated with an organization.
	 * @see URL
	 * @see ImageObject
	 */
	public Object getLogo() {
		return this.logo;
	}
	public void setLogo(Object logo) {
		this.logo = logo;
	}
	/**
	 * A pointer to products or services offered by the organization or person.
	 */
	public Offer getMakesOffer() {
		return this.makesOffer;
	}
	public void setMakesOffer(Offer makesOffer) {
		this.makesOffer = makesOffer;
	}
	/**
	 * A member of this organization. Supercedes <a href="members">members</a>.
	 * @see Person
	 * @see Organization
	 */
	public Object getMember() {
		return this.member;
	}
	public void setMember(Object member) {
		this.member = member;
	}
	/**
	 * The North American Industry Classification System (NAICS) code for a particular organization or business person.
	 */
	public String getNaics() {
		return this.naics;
	}
	public void setNaics(String naics) {
		this.naics = naics;
	}
	/**
	 * Products owned by the organization or person.
	 * @see OwnershipInfo
	 * @see Product
	 */
	public Object getOwns() {
		return this.owns;
	}
	public void setOwns(Object owns) {
		this.owns = owns;
	}
	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	/**
	 * A pointer to products or services sought by the organization or person (demand).
	 */
	public Demand getSeeks() {
		return this.seeks;
	}
	public void setSeeks(Demand seeks) {
		this.seeks = seeks;
	}
	/**
	 * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
	 */
	public Organization getSubOrganization() {
		return this.subOrganization;
	}
	public void setSubOrganization(Organization subOrganization) {
		this.subOrganization = subOrganization;
	}
	/**
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
	 */
	public String getTaxID() {
		return this.taxID;
	}
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
	/**
	 * The telephone number.
	 */
	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * The Value-added Tax ID of the organisation or person.
	 */
	public String getVatID() {
		return this.vatID;
	}
	public void setVatID(String vatID) {
		this.vatID = vatID;
	}
}
