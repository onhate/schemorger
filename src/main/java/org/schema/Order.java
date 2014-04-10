package org.schema;

/**
 * 
 * An order is a confirmation of a transaction (a receipt), which can contain
 * multiple line items, each represented by an Offer that has been accepted by
 * the customer.
 * 
 * @fullPath Thing > Intangible > Order
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Order extends Intangible {

	private Offer acceptedOffer;
	private PostalAddress billingAddress;
	private String confirmationNumber;
	private Object customer;
	private Object discount;
	private String discountCode;
	private String discountCurrency;
	private Boolean isGift;
	private Object merchant;
	private java.util.Date orderDate;
	private String orderNumber;
	private OrderStatus orderStatus;
	private Product orderedItem;
	private java.util.Date paymentDue;
	private PaymentMethod paymentMethod;
	private String paymentMethodId;
	private org.schema.base.URL paymentUrl;

	/**
	 * The offer(s) -- e.g., product, quantity and price combinations --
	 * included in the order.
	 */
	public Offer getAcceptedOffer() {
		return this.acceptedOffer;
	}

	/**
	 * The offer(s) -- e.g., product, quantity and price combinations --
	 * included in the order.
	 */
	public void setAcceptedOffer(Offer acceptedOffer) {
		this.acceptedOffer = acceptedOffer;
	}

	/**
	 * The billing address for the order.
	 */
	public PostalAddress getBillingAddress() {
		return this.billingAddress;
	}

	/**
	 * The billing address for the order.
	 */
	public void setBillingAddress(PostalAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * A number that confirms the given order.
	 */
	public String getConfirmationNumber() {
		return this.confirmationNumber;
	}

	/**
	 * A number that confirms the given order.
	 */
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	/**
	 * Party placing the order.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getCustomer() {
		return this.customer;
	}

	/**
	 * Party placing the order.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setCustomer(Object customer) {
		this.customer = customer;
	}

	/**
	 * Any discount applied (to an Order).
	 * 
	 * @see Text
	 * @see Number
	 */
	public Object getDiscount() {
		return this.discount;
	}

	/**
	 * Any discount applied (to an Order).
	 * 
	 * @see Text
	 * @see Number
	 */
	public void setDiscount(Object discount) {
		this.discount = discount;
	}

	/**
	 * Code used to redeem a discount.
	 */
	public String getDiscountCode() {
		return this.discountCode;
	}

	/**
	 * Code used to redeem a discount.
	 */
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the discount.
	 */
	public String getDiscountCurrency() {
		return this.discountCurrency;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the discount.
	 */
	public void setDiscountCurrency(String discountCurrency) {
		this.discountCurrency = discountCurrency;
	}

	/**
	 * Was the offer accepted as a gift for someone other than the buyer.
	 */
	public Boolean getIsGift() {
		return this.isGift;
	}

	/**
	 * Was the offer accepted as a gift for someone other than the buyer.
	 */
	public void setIsGift(Boolean isGift) {
		this.isGift = isGift;
	}

	/**
	 * The party taking the order (e.g. Amazon.com is a merchant for many
	 * sellers).
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getMerchant() {
		return this.merchant;
	}

	/**
	 * The party taking the order (e.g. Amazon.com is a merchant for many
	 * sellers).
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setMerchant(Object merchant) {
		this.merchant = merchant;
	}

	/**
	 * Date order was placed.
	 */
	public java.util.Date getOrderDate() {
		return this.orderDate;
	}

	/**
	 * Date order was placed.
	 */
	public void setOrderDate(java.util.Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * The identifier of the transaction.
	 */
	public String getOrderNumber() {
		return this.orderNumber;
	}

	/**
	 * The identifier of the transaction.
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * The current status of the order.
	 */
	public OrderStatus getOrderStatus() {
		return this.orderStatus;
	}

	/**
	 * The current status of the order.
	 */
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * The item ordered.
	 */
	public Product getOrderedItem() {
		return this.orderedItem;
	}

	/**
	 * The item ordered.
	 */
	public void setOrderedItem(Product orderedItem) {
		this.orderedItem = orderedItem;
	}

	/**
	 * The date that payment is due.
	 */
	public java.util.Date getPaymentDue() {
		return this.paymentDue;
	}

	/**
	 * The date that payment is due.
	 */
	public void setPaymentDue(java.util.Date paymentDue) {
		this.paymentDue = paymentDue;
	}

	/**
	 * The name of the credit card or other method of payment for the order.
	 */
	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	/**
	 * The name of the credit card or other method of payment for the order.
	 */
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * An identifier for the method of payment used (e.g. the last 4 digits of
	 * the credit card).
	 */
	public String getPaymentMethodId() {
		return this.paymentMethodId;
	}

	/**
	 * An identifier for the method of payment used (e.g. the last 4 digits of
	 * the credit card).
	 */
	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	/**
	 * The URL for sending a payment.
	 */
	public org.schema.base.URL getPaymentUrl() {
		return this.paymentUrl;
	}

	/**
	 * The URL for sending a payment.
	 */
	public void setPaymentUrl(org.schema.base.URL paymentUrl) {
		this.paymentUrl = paymentUrl;
	}
}
