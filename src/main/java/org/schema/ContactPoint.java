package org.schema;

/**
 * 
 * A contact point—for example, a Customer Complaints department.
 * 
 * @fullPath Thing > Intangible > StructuredValue > ContactPoint
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ContactPoint extends StructuredValue {

	private AdministrativeArea areaServed;
	private Language availableLanguage;
	private ContactPointOption contactOption;
	private String contactType;
	private String email;
	private String faxNumber;
	private OpeningHoursSpecification hoursAvailable;
	private Object productSupported;
	private String telephone;

	/**
	 * The location served by this contact point (e.g., a phone number intended
	 * for Europeans vs. North Americans or only within the United States.)
	 */
	public AdministrativeArea getAreaServed() {
		return this.areaServed;
	}

	/**
	 * The location served by this contact point (e.g., a phone number intended
	 * for Europeans vs. North Americans or only within the United States.)
	 */
	public void setAreaServed(AdministrativeArea areaServed) {
		this.areaServed = areaServed;
	}

	/**
	 * A language someone may use with the item.
	 */
	public Language getAvailableLanguage() {
		return this.availableLanguage;
	}

	/**
	 * A language someone may use with the item.
	 */
	public void setAvailableLanguage(Language availableLanguage) {
		this.availableLanguage = availableLanguage;
	}

	/**
	 * An option available on this contact point (e.g. a toll-free number or
	 * support for hearing-impaired callers.)
	 */
	public ContactPointOption getContactOption() {
		return this.contactOption;
	}

	/**
	 * An option available on this contact point (e.g. a toll-free number or
	 * support for hearing-impaired callers.)
	 */
	public void setContactOption(ContactPointOption contactOption) {
		this.contactOption = contactOption;
	}

	/**
	 * A person or organization can have different contact points, for different
	 * purposes. For example, a sales contact point, a PR contact point and so
	 * on. This property is used to specify the kind of contact point.
	 */
	public String getContactType() {
		return this.contactType;
	}

	/**
	 * A person or organization can have different contact points, for different
	 * purposes. For example, a sales contact point, a PR contact point and so
	 * on. This property is used to specify the kind of contact point.
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	/**
	 * Email address.
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Email address.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * The fax number.
	 */
	public String getFaxNumber() {
		return this.faxNumber;
	}

	/**
	 * The fax number.
	 */
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	/**
	 * The hours during which this contact point is available.
	 */
	public OpeningHoursSpecification getHoursAvailable() {
		return this.hoursAvailable;
	}

	/**
	 * The hours during which this contact point is available.
	 */
	public void setHoursAvailable(OpeningHoursSpecification hoursAvailable) {
		this.hoursAvailable = hoursAvailable;
	}

	/**
	 * The product or service this support contact point is related to (such as
	 * product support for a particular product line). This can be a specific
	 * product or product line (e.g. &quot;iPhone&quot;) or a general category
	 * of products or services (e.g. &quot;smartphones&quot;).
	 * 
	 * @see Product
	 * @see Text
	 */
	public Object getProductSupported() {
		return this.productSupported;
	}

	/**
	 * The product or service this support contact point is related to (such as
	 * product support for a particular product line). This can be a specific
	 * product or product line (e.g. &quot;iPhone&quot;) or a general category
	 * of products or services (e.g. &quot;smartphones&quot;).
	 * 
	 * @see Product
	 * @see Text
	 */
	public void setProductSupported(Object productSupported) {
		this.productSupported = productSupported;
	}

	/**
	 * The telephone number.
	 */
	public String getTelephone() {
		return this.telephone;
	}

	/**
	 * The telephone number.
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
