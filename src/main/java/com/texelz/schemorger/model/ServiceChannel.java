package com.texelz.schemorger.model;

/**
 *
 * A means for accessing a service, e.g. a government office location, web site, or phone number.
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
	private com.texelz.schemorger.definition.Link serviceUrl;
	/**
	 * A language someone may use with the item.
	 */
	public Language getAvailableLanguage() {
		return this.availableLanguage;
	}
	public void setAvailableLanguage(Language availableLanguage) {
		this.availableLanguage = availableLanguage;
	}
	/**
	 * Estimated processing time for the service using this channel.
	 */
	public Duration getProcessingTime() {
		return this.processingTime;
	}
	public void setProcessingTime(Duration processingTime) {
		this.processingTime = processingTime;
	}
	/**
	 * The service provided by this channel.
	 */
	public Service getProvidesService() {
		return this.providesService;
	}
	public void setProvidesService(Service providesService) {
		this.providesService = providesService;
	}
	/**
	 * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
	 */
	public Place getServiceLocation() {
		return this.serviceLocation;
	}
	public void setServiceLocation(Place serviceLocation) {
		this.serviceLocation = serviceLocation;
	}
	/**
	 * The phone number to use to access the service.
	 */
	public ContactPoint getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(ContactPoint servicePhone) {
		this.servicePhone = servicePhone;
	}
	/**
	 * The address for accessing the service by mail.
	 */
	public PostalAddress getServicePostalAddress() {
		return this.servicePostalAddress;
	}
	public void setServicePostalAddress(PostalAddress servicePostalAddress) {
		this.servicePostalAddress = servicePostalAddress;
	}
	/**
	 * The number to access the service by text message.
	 */
	public ContactPoint getServiceSmsNumber() {
		return this.serviceSmsNumber;
	}
	public void setServiceSmsNumber(ContactPoint serviceSmsNumber) {
		this.serviceSmsNumber = serviceSmsNumber;
	}
	/**
	 * The website to access the service.
	 */
	public com.texelz.schemorger.definition.Link getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(com.texelz.schemorger.definition.Link serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
}
