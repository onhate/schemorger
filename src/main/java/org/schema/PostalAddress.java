package org.schema;

/**
 * 
 * The mailing address.
 * 
 * @fullPath Thing > Intangible > StructuredValue > ContactPoint > PostalAddress
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PostalAddress extends ContactPoint {

	private Country addressCountry;
	private String addressLocality;
	private String addressRegion;
	private String postOfficeBoxNumber;
	private String postalCode;
	private String streetAddress;

	/**
	 * The country. For example, USA. You can also provide the two-letter <a
	 * href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country
	 * code</a>.
	 */
	public Country getAddressCountry() {
		return this.addressCountry;
	}

	/**
	 * The country. For example, USA. You can also provide the two-letter <a
	 * href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country
	 * code</a>.
	 */
	public void setAddressCountry(Country addressCountry) {
		this.addressCountry = addressCountry;
	}

	/**
	 * The locality. For example, Mountain View.
	 */
	public String getAddressLocality() {
		return this.addressLocality;
	}

	/**
	 * The locality. For example, Mountain View.
	 */
	public void setAddressLocality(String addressLocality) {
		this.addressLocality = addressLocality;
	}

	/**
	 * The region. For example, CA.
	 */
	public String getAddressRegion() {
		return this.addressRegion;
	}

	/**
	 * The region. For example, CA.
	 */
	public void setAddressRegion(String addressRegion) {
		this.addressRegion = addressRegion;
	}

	/**
	 * The post offce box number for PO box addresses.
	 */
	public String getPostOfficeBoxNumber() {
		return this.postOfficeBoxNumber;
	}

	/**
	 * The post offce box number for PO box addresses.
	 */
	public void setPostOfficeBoxNumber(String postOfficeBoxNumber) {
		this.postOfficeBoxNumber = postOfficeBoxNumber;
	}

	/**
	 * The postal code. For example, 94043.
	 */
	public String getPostalCode() {
		return this.postalCode;
	}

	/**
	 * The postal code. For example, 94043.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * The street address. For example, 1600 Amphitheatre Pkwy.
	 */
	public String getStreetAddress() {
		return this.streetAddress;
	}

	/**
	 * The street address. For example, 1600 Amphitheatre Pkwy.
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
}
