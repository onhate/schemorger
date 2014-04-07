package com.texelz.schemorger.model;

/**
 *
 * A person (alive, dead, undead, or fictional).
 * @fullPath Thing > Person
 *
 * @author Texelz (by Onhate)
 *
 */
public class Person extends Thing {

	private String additionalName;
	private PostalAddress address;
	private Organization affiliation;
	private EducationalOrganization alumniOf;
	private String award;
	private java.util.Date birthDate;
	private Object brand;
	private Person children;
	private Person colleague;
	private ContactPoint contactPoint;
	private java.util.Date deathDate;
	private String duns;
	private String email;
	private String familyName;
	private String faxNumber;
	private Person follows;
	private String gender;
	private String givenName;
	private String globalLocationNumber;
	private Place hasPOS;
	private Object homeLocation;
	private String honorificPrefix;
	private String honorificSuffix;
	private String interactionCount;
	private String isicV4;
	private String jobTitle;
	private Person knows;
	private Offer makesOffer;
	private Organization memberOf;
	private String naics;
	private Country nationality;
	private Object owns;
	private Person parent;
	private Event performerIn;
	private Person relatedTo;
	private Demand seeks;
	private Person sibling;
	private Person spouse;
	private String taxID;
	private String telephone;
	private String vatID;
	private Object workLocation;
	private Organization worksFor;
	/**
	 * An additional name for a Person, can be used for a middle name.
	 */
	public String getAdditionalName() {
		return this.additionalName;
	}
	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}
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
	 * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
	 */
	public Organization getAffiliation() {
		return this.affiliation;
	}
	public void setAffiliation(Organization affiliation) {
		this.affiliation = affiliation;
	}
	/**
	 * An educational organizations that the person is an alumni of.
	 */
	public EducationalOrganization getAlumniOf() {
		return this.alumniOf;
	}
	public void setAlumniOf(EducationalOrganization alumniOf) {
		this.alumniOf = alumniOf;
	}
	/**
	 * An award won by this person or for this creative work. Supercedes <a href="awards">awards</a>.
	 */
	public String getAward() {
		return this.award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	/**
	 * Date of birth.
	 */
	public java.util.Date getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
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
	 * A child of the person.
	 */
	public Person getChildren() {
		return this.children;
	}
	public void setChildren(Person children) {
		this.children = children;
	}
	/**
	 * A colleague of the person. Supercedes <a href="colleagues">colleagues</a>.
	 */
	public Person getColleague() {
		return this.colleague;
	}
	public void setColleague(Person colleague) {
		this.colleague = colleague;
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
	 * Date of death.
	 */
	public java.util.Date getDeathDate() {
		return this.deathDate;
	}
	public void setDeathDate(java.util.Date deathDate) {
		this.deathDate = deathDate;
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
	 * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the Name property.
	 */
	public String getFamilyName() {
		return this.familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
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
	 * The most generic uni-directional social relation.
	 */
	public Person getFollows() {
		return this.follows;
	}
	public void setFollows(Person follows) {
		this.follows = follows;
	}
	/**
	 * Gender of the person.
	 */
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the Name property.
	 */
	public String getGivenName() {
		return this.givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
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
	 * A contact location for a person's residence.
	 * @see ContactPoint
	 * @see Place
	 */
	public Object getHomeLocation() {
		return this.homeLocation;
	}
	public void setHomeLocation(Object homeLocation) {
		this.homeLocation = homeLocation;
	}
	/**
	 * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
	 */
	public String getHonorificPrefix() {
		return this.honorificPrefix;
	}
	public void setHonorificPrefix(String honorificPrefix) {
		this.honorificPrefix = honorificPrefix;
	}
	/**
	 * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
	 */
	public String getHonorificSuffix() {
		return this.honorificSuffix;
	}
	public void setHonorificSuffix(String honorificSuffix) {
		this.honorificSuffix = honorificSuffix;
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
	 * The job title of the person (for example, Financial Manager).
	 */
	public String getJobTitle() {
		return this.jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * The most generic bi-directional social/work relation.
	 */
	public Person getKnows() {
		return this.knows;
	}
	public void setKnows(Person knows) {
		this.knows = knows;
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
	 * An organization to which the person belongs.
	 */
	public Organization getMemberOf() {
		return this.memberOf;
	}
	public void setMemberOf(Organization memberOf) {
		this.memberOf = memberOf;
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
	 * Nationality of the person.
	 */
	public Country getNationality() {
		return this.nationality;
	}
	public void setNationality(Country nationality) {
		this.nationality = nationality;
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
	 * A parent of this person. Supercedes <a href="parents">parents</a>.
	 */
	public Person getParent() {
		return this.parent;
	}
	public void setParent(Person parent) {
		this.parent = parent;
	}
	/**
	 * Event that this person is a performer or participant in.
	 */
	public Event getPerformerIn() {
		return this.performerIn;
	}
	public void setPerformerIn(Event performerIn) {
		this.performerIn = performerIn;
	}
	/**
	 * The most generic familial relation.
	 */
	public Person getRelatedTo() {
		return this.relatedTo;
	}
	public void setRelatedTo(Person relatedTo) {
		this.relatedTo = relatedTo;
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
	 * A sibling of the person. Supercedes <a href="siblings">siblings</a>.
	 */
	public Person getSibling() {
		return this.sibling;
	}
	public void setSibling(Person sibling) {
		this.sibling = sibling;
	}
	/**
	 * The person's spouse.
	 */
	public Person getSpouse() {
		return this.spouse;
	}
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
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
	/**
	 * A contact location for a person's place of work.
	 * @see ContactPoint
	 * @see Place
	 */
	public Object getWorkLocation() {
		return this.workLocation;
	}
	public void setWorkLocation(Object workLocation) {
		this.workLocation = workLocation;
	}
	/**
	 * Organizations that the person works for.
	 */
	public Organization getWorksFor() {
		return this.worksFor;
	}
	public void setWorksFor(Organization worksFor) {
		this.worksFor = worksFor;
	}
}
