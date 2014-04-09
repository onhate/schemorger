package org.schema;

/**
 * 
 * The price for the delivery of an offer using a particular delivery method.
 * 
 * @fullPath Thing > Intangible > StructuredValue > PriceSpecification >
 *           DeliveryChargeSpecification
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DeliveryChargeSpecification extends PriceSpecification {

	private DeliveryMethod appliesToDeliveryMethod;
	private Object eligibleRegion;

	/**
	 * The delivery method(s) to which the delivery charge or payment charge
	 * specification applies.
	 */
	public DeliveryMethod getAppliesToDeliveryMethod() {
		return this.appliesToDeliveryMethod;
	}

	/**
	 * The delivery method(s) to which the delivery charge or payment charge
	 * specification applies.
	 */
	public void setAppliesToDeliveryMethod(DeliveryMethod appliesToDeliveryMethod) {
		this.appliesToDeliveryMethod = appliesToDeliveryMethod;
	}

	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, or the GeoShape
	 * for the geo-political region(s) for which the offer or delivery charge
	 * specification is valid.
	 * 
	 * @see Text
	 * @see GeoShape
	 */
	public Object getEligibleRegion() {
		return this.eligibleRegion;
	}

	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, or the GeoShape
	 * for the geo-political region(s) for which the offer or delivery charge
	 * specification is valid.
	 * 
	 * @see Text
	 * @see GeoShape
	 */
	public void setEligibleRegion(Object eligibleRegion) {
		this.eligibleRegion = eligibleRegion;
	}
}
