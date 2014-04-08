package com.texelz.schemorger.model;

<<<<<<< HEAD
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
=======
import java.net.URL;

/**
 * 
 * An organization such as a school, NGO, corporation, club, etc.
 * 
 * @fullPath Thing > Organization
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Organization extends Thing {

	private PostalAddress address;
	private AggregateRating aggregateRating;
	private Thing brand;
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
	private Thing location;
	private Thing logo;
	private Offer makesOffer;
	private Thing member;
	private String naics;
	private Thing owns;
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
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	/**
	 * The brand(s) associated with a product or service, or the brand(s)
	 * maintained by an organization or business person.
	 * 
	 * @see Brand
	 * @see Organization
	 */
	public Thing getBrand() {
		return this.brand;
	}

	public void setBrand(Thing brand) {
		this.brand = brand;
	}

	/**
	 * A contact point for a person or organization. Supercedes <a
	 * href="contactPoints">contactPoints</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public ContactPoint getContactPoint() {
		return this.contactPoint;
	}
<<<<<<< HEAD
	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}
	/**
	 * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
=======

	public void setContactPoint(ContactPoint contactPoint) {
		this.contactPoint = contactPoint;
	}

	/**
	 * A relationship between an organization and a department of that
	 * organization, also described as an organization (allowing different urls,
	 * logos, opening hours). For example: a store with a pharmacy, or a bakery
	 * with a cafe.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Organization getDepartment() {
		return this.department;
	}
<<<<<<< HEAD
	public void setDepartment(Organization department) {
		this.department = department;
	}
	/**
	 * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
=======

	public void setDepartment(Organization department) {
		this.department = department;
	}

	/**
	 * The Dun &amp; Bradstreet DUNS number for identifying an organization or
	 * business person.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getDuns() {
		return this.duns;
	}
<<<<<<< HEAD
	public void setDuns(String duns) {
		this.duns = duns;
	}
=======

	public void setDuns(String duns) {
		this.duns = duns;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Email address.
	 */
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
<<<<<<< HEAD
	/**
	 * Someone working for this organization. Supercedes <a href="employees">employees</a>.
=======

	/**
	 * Someone working for this organization. Supercedes <a
	 * href="employees">employees</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Person getEmployee() {
		return this.employee;
	}
<<<<<<< HEAD
	public void setEmployee(Person employee) {
		this.employee = employee;
	}
	/**
	 * Upcoming or past event associated with this place or organization. Supercedes <a href="events">events</a>.
=======

	public void setEmployee(Person employee) {
		this.employee = employee;
	}

	/**
	 * Upcoming or past event associated with this place or organization.
	 * Supercedes <a href="events">events</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Event getEvent() {
		return this.event;
	}
<<<<<<< HEAD
	public void setEvent(Event event) {
		this.event = event;
	}
=======

	public void setEvent(Event event) {
		this.event = event;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The fax number.
	 */
	public String getFaxNumber() {
		return this.faxNumber;
	}
<<<<<<< HEAD
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	/**
	 * A person who founded this organization. Supercedes <a href="founders">founders</a>.
=======

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	/**
	 * A person who founded this organization. Supercedes <a
	 * href="founders">founders</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Person getFounder() {
		return this.founder;
	}
<<<<<<< HEAD
	public void setFounder(Person founder) {
		this.founder = founder;
	}
=======

	public void setFounder(Person founder) {
		this.founder = founder;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The date that this organization was founded.
	 */
	public java.util.Date getFoundingDate() {
		return this.foundingDate;
	}
<<<<<<< HEAD
	public void setFoundingDate(java.util.Date foundingDate) {
		this.foundingDate = foundingDate;
	}
	/**
	 * The Global Location Number (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
=======

	public void setFoundingDate(java.util.Date foundingDate) {
		this.foundingDate = foundingDate;
	}

	/**
	 * The Global Location Number (GLN, sometimes also referred to as
	 * International Location Number or ILN) of the respective organization,
	 * person, or place. The GLN is a 13-digit number used to identify parties
	 * and physical locations.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getGlobalLocationNumber() {
		return this.globalLocationNumber;
	}
<<<<<<< HEAD
	public void setGlobalLocationNumber(String globalLocationNumber) {
		this.globalLocationNumber = globalLocationNumber;
	}
=======

	public void setGlobalLocationNumber(String globalLocationNumber) {
		this.globalLocationNumber = globalLocationNumber;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Points-of-Sales operated by the organization or person.
	 */
	public Place getHasPOS() {
		return this.hasPOS;
	}
<<<<<<< HEAD
	public void setHasPOS(Place hasPOS) {
		this.hasPOS = hasPOS;
	}
	/**
	 * A count of a specific user interactions with this item—for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href="UserInteraction">UserInteraction</a>.
=======

	public void setHasPOS(Place hasPOS) {
		this.hasPOS = hasPOS;
	}

	/**
	 * A count of a specific user interactions with this item—for example,
	 * <code>20 UserLikes</code>, <code>5 UserComments</code>, or
	 * <code>300 UserDownloads</code>. The user interaction type should be one
	 * of the sub types of <a href="UserInteraction">UserInteraction</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getInteractionCount() {
		return this.interactionCount;
	}
<<<<<<< HEAD
	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}
	/**
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
=======

	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}

	/**
	 * The International Standard of Industrial Classification of All Economic
	 * Activities (ISIC), Revision 4 code for a particular organization,
	 * business person, or place.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getIsicV4() {
		return this.isicV4;
	}
<<<<<<< HEAD
	public void setIsicV4(String isicV4) {
		this.isicV4 = isicV4;
	}
=======

	public void setIsicV4(String isicV4) {
		this.isicV4 = isicV4;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The official name of the organization, e.g. the registered company name.
	 */
	public String getLegalName() {
		return this.legalName;
	}
<<<<<<< HEAD
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
=======

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	/**
	 * The location of the event, organization or action.
	 * 
	 * @see Place
	 * @see PostalAddress
	 */
	public Thing getLocation() {
		return this.location;
	}

	public void setLocation(Thing location) {
		this.location = location;
	}

	/**
	 * A logo associated with an organization.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public Thing getLogo() {
		return this.logo;
	}

	public void setLogo(Thing logo) {
		this.logo = logo;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A pointer to products or services offered by the organization or person.
	 */
	public Offer getMakesOffer() {
		return this.makesOffer;
	}
<<<<<<< HEAD
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
=======

	public void setMakesOffer(Offer makesOffer) {
		this.makesOffer = makesOffer;
	}

	/**
	 * A member of this organization. Supercedes <a href="members">members</a>.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getMember() {
		return this.member;
	}

	public void setMember(Thing member) {
		this.member = member;
	}

	/**
	 * The North American Industry Classification System (NAICS) code for a
	 * particular organization or business person.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getNaics() {
		return this.naics;
	}
<<<<<<< HEAD
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
=======

	public void setNaics(String naics) {
		this.naics = naics;
	}

	/**
	 * Products owned by the organization or person.
	 * 
	 * @see OwnershipInfo
	 * @see Product
	 */
	public Thing getOwns() {
		return this.owns;
	}

	public void setOwns(Thing owns) {
		this.owns = owns;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}
<<<<<<< HEAD
	public void setReview(Review review) {
		this.review = review;
	}
	/**
	 * A pointer to products or services sought by the organization or person (demand).
=======

	public void setReview(Review review) {
		this.review = review;
	}

	/**
	 * A pointer to products or services sought by the organization or person
	 * (demand).
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Demand getSeeks() {
		return this.seeks;
	}
<<<<<<< HEAD
	public void setSeeks(Demand seeks) {
		this.seeks = seeks;
	}
	/**
	 * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
=======

	public void setSeeks(Demand seeks) {
		this.seeks = seeks;
	}

	/**
	 * A relationship between two organizations where the first includes the
	 * second, e.g., as a subsidiary. See also: the more specific 'department'
	 * property.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Organization getSubOrganization() {
		return this.subOrganization;
	}
<<<<<<< HEAD
	public void setSubOrganization(Organization subOrganization) {
		this.subOrganization = subOrganization;
	}
	/**
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
=======

	public void setSubOrganization(Organization subOrganization) {
		this.subOrganization = subOrganization;
	}

	/**
	 * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US
	 * or the CIF/NIF in Spain.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getTaxID() {
		return this.taxID;
	}
<<<<<<< HEAD
	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}
=======

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The telephone number.
	 */
	public String getTelephone() {
		return this.telephone;
	}
<<<<<<< HEAD
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
=======

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The Value-added Tax ID of the organisation or person.
	 */
	public String getVatID() {
		return this.vatID;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	public void setVatID(String vatID) {
		this.vatID = vatID;
	}
}
