package org.schema;

/**
 * 
 * A means for accessing a service, e.g. a government office location, web site,
 * or phone number.
 * 
 * @fullPath Thing > Intangible > ServiceChannel
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ServiceChannel extends Intangible {

	private Language availableLanguage;
	private Duration processingTime;
	private Service providesService;
	private Place serviceLocation;
	private ContactPoint servicePhone;
	private PostalAddress servicePostalAddress;
	private ContactPoint serviceSmsNumber;
	private org.schema.base.URL serviceUrl;

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
	 * Estimated processing time for the service using this channel.
	 */
	public Duration getProcessingTime() {
		return this.processingTime;
	}

	/**
	 * Estimated processing time for the service using this channel.
	 */
	public void setProcessingTime(Duration processingTime) {
		this.processingTime = processingTime;
	}

	/**
	 * The service provided by this channel.
	 */
	public Service getProvidesService() {
		return this.providesService;
	}

	/**
	 * The service provided by this channel.
	 */
	public void setProvidesService(Service providesService) {
		this.providesService = providesService;
	}

	/**
	 * The location (e.g. civic structure, local business, etc.) where a person
	 * can go to access the service.
	 */
	public Place getServiceLocation() {
		return this.serviceLocation;
	}

	/**
	 * The location (e.g. civic structure, local business, etc.) where a person
	 * can go to access the service.
	 */
	public void setServiceLocation(Place serviceLocation) {
		this.serviceLocation = serviceLocation;
	}

	/**
	 * The phone number to use to access the service.
	 */
	public ContactPoint getServicePhone() {
		return this.servicePhone;
	}

	/**
	 * The phone number to use to access the service.
	 */
	public void setServicePhone(ContactPoint servicePhone) {
		this.servicePhone = servicePhone;
	}

	/**
	 * The address for accessing the service by mail.
	 */
	public PostalAddress getServicePostalAddress() {
		return this.servicePostalAddress;
	}

	/**
	 * The address for accessing the service by mail.
	 */
	public void setServicePostalAddress(PostalAddress servicePostalAddress) {
		this.servicePostalAddress = servicePostalAddress;
	}

	/**
	 * The number to access the service by text message.
	 */
	public ContactPoint getServiceSmsNumber() {
		return this.serviceSmsNumber;
	}

	/**
	 * The number to access the service by text message.
	 */
	public void setServiceSmsNumber(ContactPoint serviceSmsNumber) {
		this.serviceSmsNumber = serviceSmsNumber;
	}

	/**
	 * The website to access the service.
	 */
	public org.schema.base.URL getServiceUrl() {
		return this.serviceUrl;
	}

	/**
	 * The website to access the service.
	 */
	public void setServiceUrl(org.schema.base.URL serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
}
