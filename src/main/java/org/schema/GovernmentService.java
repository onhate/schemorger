package org.schema;

/**
 * 
 * A service provided by a government organization, e.g. food stamps, veterans
 * benefits, etc.
 * 
 * @fullPath Thing > Intangible > Service > GovernmentService
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class GovernmentService extends Service {

	private Organization serviceOperator;

	/**
	 * The operating organization, if different from the provider. This enables
	 * the representation of services that are provided by an organization, but
	 * operated by another organization like a subcontractor.
	 */
	public Organization getServiceOperator() {
		return this.serviceOperator;
	}

	/**
	 * The operating organization, if different from the provider. This enables
	 * the representation of services that are provided by an organization, but
	 * operated by another organization like a subcontractor.
	 */
	public void setServiceOperator(Organization serviceOperator) {
		this.serviceOperator = serviceOperator;
	}
}
