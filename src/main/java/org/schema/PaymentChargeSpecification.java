package org.schema;

/**
 * 
 * The costs of settling the payment using a particular payment method.
 * 
 * @fullPath Thing > Intangible > StructuredValue > PriceSpecification >
 *           PaymentChargeSpecification
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PaymentChargeSpecification extends PriceSpecification {

	private DeliveryMethod appliesToDeliveryMethod;
	private PaymentMethod appliesToPaymentMethod;

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
	 * The payment method(s) to which the payment charge specification applies.
	 */
	public PaymentMethod getAppliesToPaymentMethod() {
		return this.appliesToPaymentMethod;
	}

	/**
	 * The payment method(s) to which the payment charge specification applies.
	 */
	public void setAppliesToPaymentMethod(PaymentMethod appliesToPaymentMethod) {
		this.appliesToPaymentMethod = appliesToPaymentMethod;
	}
}
