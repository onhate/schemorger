package com.texelz.schemorger.model;

/**
<<<<<<< HEAD
 *
 * An offer to sell an item—for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
 * @fullPath Thing > Intangible > Offer
 *
 * @author Texelz (by Onhate)
 *
=======
 * 
 * An offer to sell an item—for example, an offer to sell a product, the DVD of
 * a movie, or tickets to an event.
 * 
 * @fullPath Thing > Intangible > Offer
 * 
 * @author Texelz (by Onhate)
 * 
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
 */
public class Offer extends Intangible {

	private PaymentMethod acceptedPaymentMethod;
	private Offer addOn;
	private QuantitativeValue advanceBookingRequirement;
	private AggregateRating aggregateRating;
	private ItemAvailability availability;
	private java.util.Date availabilityEnds;
	private java.util.Date availabilityStarts;
	private Place availableAtOrFrom;
	private DeliveryMethod availableDeliveryMethod;
	private BusinessFunction businessFunction;
<<<<<<< HEAD
	private Object category;
=======
	private Thing category;
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	private QuantitativeValue deliveryLeadTime;
	private BusinessEntityType eligibleCustomerType;
	private QuantitativeValue eligibleDuration;
	private QuantitativeValue eligibleQuantity;
<<<<<<< HEAD
	private Object eligibleRegion;
=======
	private Thing eligibleRegion;
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	private PriceSpecification eligibleTransactionVolume;
	private String gtin13;
	private String gtin14;
	private String gtin8;
	private TypeAndQuantityNode includesObject;
	private QuantitativeValue inventoryLevel;
	private OfferItemCondition itemCondition;
	private Product itemOffered;
	private String mpn;
<<<<<<< HEAD
	private Object price;
=======
	private Thing price;
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	private String priceCurrency;
	private PriceSpecification priceSpecification;
	private java.util.Date priceValidUntil;
	private Review review;
<<<<<<< HEAD
	private Object seller;
=======
	private Thing seller;
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	private String serialNumber;
	private String sku;
	private java.util.Date validFrom;
	private java.util.Date validThrough;
	private WarrantyPromise warranty;
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The payment method(s) accepted by seller for this offer.
	 */
	public PaymentMethod getAcceptedPaymentMethod() {
		return this.acceptedPaymentMethod;
<<<<<<< HEAD
	}
	public void setAcceptedPaymentMethod(PaymentMethod acceptedPaymentMethod) {
		this.acceptedPaymentMethod = acceptedPaymentMethod;
	}
	/**
	 * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
	 */
	public Offer getAddOn() {
		return this.addOn;
	}
	public void setAddOn(Offer addOn) {
		this.addOn = addOn;
	}
	/**
	 * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
	 */
	public QuantitativeValue getAdvanceBookingRequirement() {
		return this.advanceBookingRequirement;
	}
	public void setAdvanceBookingRequirement(QuantitativeValue advanceBookingRequirement) {
		this.advanceBookingRequirement = advanceBookingRequirement;
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
	 * The availability of this item—for example In stock, Out of stock, Pre-order, etc.
	 */
	public ItemAvailability getAvailability() {
		return this.availability;
	}
	public void setAvailability(ItemAvailability availability) {
		this.availability = availability;
	}
	/**
	 * The end of the availability of the product or service included in the offer.
=======
	}

	public void setAcceptedPaymentMethod(PaymentMethod acceptedPaymentMethod) {
		this.acceptedPaymentMethod = acceptedPaymentMethod;
	}

	/**
	 * An additional offer that can only be obtained in combination with the
	 * first base offer (e.g. supplements and extensions that are available for
	 * a surcharge).
	 */
	public Offer getAddOn() {
		return this.addOn;
	}

	public void setAddOn(Offer addOn) {
		this.addOn = addOn;
	}

	/**
	 * The amount of time that is required between accepting the offer and the
	 * actual usage of the resource or service.
	 */
	public QuantitativeValue getAdvanceBookingRequirement() {
		return this.advanceBookingRequirement;
	}

	public void setAdvanceBookingRequirement(QuantitativeValue advanceBookingRequirement) {
		this.advanceBookingRequirement = advanceBookingRequirement;
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
	 * The availability of this item—for example In stock, Out of stock,
	 * Pre-order, etc.
	 */
	public ItemAvailability getAvailability() {
		return this.availability;
	}

	public void setAvailability(ItemAvailability availability) {
		this.availability = availability;
	}

	/**
	 * The end of the availability of the product or service included in the
	 * offer.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public java.util.Date getAvailabilityEnds() {
		return this.availabilityEnds;
	}
<<<<<<< HEAD
	public void setAvailabilityEnds(java.util.Date availabilityEnds) {
		this.availabilityEnds = availabilityEnds;
	}
	/**
	 * The beginning of the availability of the product or service included in the offer.
=======

	public void setAvailabilityEnds(java.util.Date availabilityEnds) {
		this.availabilityEnds = availabilityEnds;
	}

	/**
	 * The beginning of the availability of the product or service included in
	 * the offer.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public java.util.Date getAvailabilityStarts() {
		return this.availabilityStarts;
	}
<<<<<<< HEAD
	public void setAvailabilityStarts(java.util.Date availabilityStarts) {
		this.availabilityStarts = availabilityStarts;
	}
=======

	public void setAvailabilityStarts(java.util.Date availabilityStarts) {
		this.availabilityStarts = availabilityStarts;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The place(s) from which the offer can be obtained (e.g. store locations).
	 */
	public Place getAvailableAtOrFrom() {
		return this.availableAtOrFrom;
	}
<<<<<<< HEAD
	public void setAvailableAtOrFrom(Place availableAtOrFrom) {
		this.availableAtOrFrom = availableAtOrFrom;
	}
=======

	public void setAvailableAtOrFrom(Place availableAtOrFrom) {
		this.availableAtOrFrom = availableAtOrFrom;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The delivery method(s) available for this offer.
	 */
	public DeliveryMethod getAvailableDeliveryMethod() {
		return this.availableDeliveryMethod;
	}
<<<<<<< HEAD
	public void setAvailableDeliveryMethod(DeliveryMethod availableDeliveryMethod) {
		this.availableDeliveryMethod = availableDeliveryMethod;
	}
	/**
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
=======

	public void setAvailableDeliveryMethod(DeliveryMethod availableDeliveryMethod) {
		this.availableDeliveryMethod = availableDeliveryMethod;
	}

	/**
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or
	 * component of a bundle (TypeAndQuantityNode). The default is
	 * http://purl.org/goodrelations/v1#Sell.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public BusinessFunction getBusinessFunction() {
		return this.businessFunction;
	}
<<<<<<< HEAD
	public void setBusinessFunction(BusinessFunction businessFunction) {
		this.businessFunction = businessFunction;
	}
	/**
	 * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
	 * @see Text
	 * @see Thing
	 * @see PhysicalActivityCategory
	 */
	public Object getCategory() {
		return this.category;
	}
	public void setCategory(Object category) {
		this.category = category;
	}
	/**
	 * The typical delay between the receipt of the order and the goods leaving the warehouse.
=======

	public void setBusinessFunction(BusinessFunction businessFunction) {
		this.businessFunction = businessFunction;
	}

	/**
	 * A category for the item. Greater signs or slashes can be used to
	 * informally indicate a category hierarchy.
	 * 
	 * @see PhysicalActivityCategory
	 * @see Thing
	 * @see Text
	 */
	public Thing getCategory() {
		return this.category;
	}

	public void setCategory(Thing category) {
		this.category = category;
	}

	/**
	 * The typical delay between the receipt of the order and the goods leaving
	 * the warehouse.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public QuantitativeValue getDeliveryLeadTime() {
		return this.deliveryLeadTime;
	}
<<<<<<< HEAD
	public void setDeliveryLeadTime(QuantitativeValue deliveryLeadTime) {
		this.deliveryLeadTime = deliveryLeadTime;
	}
=======

	public void setDeliveryLeadTime(QuantitativeValue deliveryLeadTime) {
		this.deliveryLeadTime = deliveryLeadTime;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The type(s) of customers for which the given offer is valid.
	 */
	public BusinessEntityType getEligibleCustomerType() {
		return this.eligibleCustomerType;
	}
<<<<<<< HEAD
	public void setEligibleCustomerType(BusinessEntityType eligibleCustomerType) {
		this.eligibleCustomerType = eligibleCustomerType;
	}
=======

	public void setEligibleCustomerType(BusinessEntityType eligibleCustomerType) {
		this.eligibleCustomerType = eligibleCustomerType;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The duration for which the given offer is valid.
	 */
	public QuantitativeValue getEligibleDuration() {
		return this.eligibleDuration;
	}
<<<<<<< HEAD
	public void setEligibleDuration(QuantitativeValue eligibleDuration) {
		this.eligibleDuration = eligibleDuration;
	}
	/**
	 * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
=======

	public void setEligibleDuration(QuantitativeValue eligibleDuration) {
		this.eligibleDuration = eligibleDuration;
	}

	/**
	 * The interval and unit of measurement of ordering quantities for which the
	 * offer or price specification is valid. This allows e.g. specifying that a
	 * certain freight charge is valid only for a certain quantity.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public QuantitativeValue getEligibleQuantity() {
		return this.eligibleQuantity;
	}
<<<<<<< HEAD
	public void setEligibleQuantity(QuantitativeValue eligibleQuantity) {
		this.eligibleQuantity = eligibleQuantity;
	}
	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
	 * @see Text
	 * @see GeoShape
	 */
	public Object getEligibleRegion() {
		return this.eligibleRegion;
	}
	public void setEligibleRegion(Object eligibleRegion) {
		this.eligibleRegion = eligibleRegion;
	}
	/**
	 * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
=======

	public void setEligibleQuantity(QuantitativeValue eligibleQuantity) {
		this.eligibleQuantity = eligibleQuantity;
	}

	/**
	 * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, or the GeoShape
	 * for the geo-political region(s) for which the offer or delivery charge
	 * specification is valid.
	 * 
	 * @see Text
	 * @see GeoShape
	 */
	public Thing getEligibleRegion() {
		return this.eligibleRegion;
	}

	public void setEligibleRegion(Thing eligibleRegion) {
		this.eligibleRegion = eligibleRegion;
	}

	/**
	 * The transaction volume, in a monetary unit, for which the offer or price
	 * specification is valid, e.g. for indicating a minimal purchasing volume,
	 * to express free shipping above a certain order volume, or to limit the
	 * acceptance of credit cards to purchases to a certain minimal amount.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public PriceSpecification getEligibleTransactionVolume() {
		return this.eligibleTransactionVolume;
	}
<<<<<<< HEAD
	public void setEligibleTransactionVolume(PriceSpecification eligibleTransactionVolume) {
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}
	/**
	 * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero.
=======

	public void setEligibleTransactionVolume(PriceSpecification eligibleTransactionVolume) {
		this.eligibleTransactionVolume = eligibleTransactionVolume;
	}

	/**
	 * The GTIN-13 code of the product, or the product to which the offer
	 * refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former
	 * 12-digit UPC codes can be converted into a GTIN-13 code by simply adding
	 * a preceeding zero.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getGtin13() {
		return this.gtin13;
	}
<<<<<<< HEAD
	public void setGtin13(String gtin13) {
		this.gtin13 = gtin13;
	}
	/**
	 * The GTIN-14 code of the product, or the product to which the offer refers.
=======

	public void setGtin13(String gtin13) {
		this.gtin13 = gtin13;
	}

	/**
	 * The GTIN-14 code of the product, or the product to which the offer
	 * refers.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getGtin14() {
		return this.gtin14;
	}
<<<<<<< HEAD
	public void setGtin14(String gtin14) {
		this.gtin14 = gtin14;
	}
	/**
	 * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN.
=======

	public void setGtin14(String gtin14) {
		this.gtin14 = gtin14;
	}

	/**
	 * The GTIN-8 code of the product, or the product to which the offer refers.
	 * This code is also known as EAN/UCC-8 or 8-digit EAN.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getGtin8() {
		return this.gtin8;
	}
<<<<<<< HEAD
	public void setGtin8(String gtin8) {
		this.gtin8 = gtin8;
	}
	/**
	 * This links to a node or nodes indicating the exact quantity of the products included in the offer.
=======

	public void setGtin8(String gtin8) {
		this.gtin8 = gtin8;
	}

	/**
	 * This links to a node or nodes indicating the exact quantity of the
	 * products included in the offer.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public TypeAndQuantityNode getIncludesObject() {
		return this.includesObject;
	}
<<<<<<< HEAD
	public void setIncludesObject(TypeAndQuantityNode includesObject) {
		this.includesObject = includesObject;
	}
=======

	public void setIncludesObject(TypeAndQuantityNode includesObject) {
		this.includesObject = includesObject;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The current approximate inventory level for the item or items.
	 */
	public QuantitativeValue getInventoryLevel() {
		return this.inventoryLevel;
	}
<<<<<<< HEAD
	public void setInventoryLevel(QuantitativeValue inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}
	/**
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
=======

	public void setInventoryLevel(QuantitativeValue inventoryLevel) {
		this.inventoryLevel = inventoryLevel;
	}

	/**
	 * A predefined value from OfferItemCondition or a textual description of
	 * the condition of the product or service, or the products or services
	 * included in the offer.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public OfferItemCondition getItemCondition() {
		return this.itemCondition;
	}
<<<<<<< HEAD
	public void setItemCondition(OfferItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}
=======

	public void setItemCondition(OfferItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The item being sold.
	 */
	public Product getItemOffered() {
		return this.itemOffered;
	}
<<<<<<< HEAD
	public void setItemOffered(Product itemOffered) {
		this.itemOffered = itemOffered;
	}
	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
=======

	public void setItemOffered(Product itemOffered) {
		this.itemOffered = itemOffered;
	}

	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to
	 * which the offer refers.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getMpn() {
		return this.mpn;
	}
<<<<<<< HEAD
	public void setMpn(String mpn) {
		this.mpn = mpn;
	}
	/**
	 * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
	 * @see Text
	 * @see Number
	 */
	public Object getPrice() {
		return this.price;
	}
	public void setPrice(Object price) {
		this.price = price;
	}
	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price component, when attached to PriceSpecification and its subtypes.
=======

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	/**
	 * The offer price of a product, or of a price component when attached to
	 * PriceSpecification and its subtypes.
	 * 
	 * @see Text
	 * @see Number
	 */
	public Thing getPrice() {
		return this.price;
	}

	public void setPrice(Thing price) {
		this.price = price;
	}

	/**
	 * The currency (in 3-letter ISO 4217 format) of the offer price or a price
	 * component, when attached to PriceSpecification and its subtypes.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getPriceCurrency() {
		return this.priceCurrency;
	}
<<<<<<< HEAD
	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}
	/**
	 * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
=======

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	/**
	 * One or more detailed price specifications, indicating the unit price and
	 * delivery or payment charges.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public PriceSpecification getPriceSpecification() {
		return this.priceSpecification;
	}
<<<<<<< HEAD
	public void setPriceSpecification(PriceSpecification priceSpecification) {
		this.priceSpecification = priceSpecification;
	}
=======

	public void setPriceSpecification(PriceSpecification priceSpecification) {
		this.priceSpecification = priceSpecification;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The date after which the price is no longer available.
	 */
	public java.util.Date getPriceValidUntil() {
		return this.priceValidUntil;
	}
<<<<<<< HEAD
	public void setPriceValidUntil(java.util.Date priceValidUntil) {
		this.priceValidUntil = priceValidUntil;
	}
=======

	public void setPriceValidUntil(java.util.Date priceValidUntil) {
		this.priceValidUntil = priceValidUntil;
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
	 * The seller.
	 * @see Person
	 * @see Organization
	 */
	public Object getSeller() {
		return this.seller;
	}
	public void setSeller(Object seller) {
		this.seller = seller;
	}
	/**
	 * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
=======

	public void setReview(Review review) {
		this.review = review;
	}

	/**
	 * The seller.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getSeller() {
		return this.seller;
	}

	public void setSeller(Thing seller) {
		this.seller = seller;
	}

	/**
	 * The serial number or any alphanumeric identifier of a particular product.
	 * When attached to an offer, it is a shortcut for the serial number of the
	 * product included in the offer.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getSerialNumber() {
		return this.serialNumber;
	}
<<<<<<< HEAD
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
=======

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a
	 * product or service, or the product to which the offer refers.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getSku() {
		return this.sku;
	}
<<<<<<< HEAD
	public void setSku(String sku) {
		this.sku = sku;
	}
=======

	public void setSku(String sku) {
		this.sku = sku;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The date when the item becomes valid.
	 */
	public java.util.Date getValidFrom() {
		return this.validFrom;
	}
<<<<<<< HEAD
	public void setValidFrom(java.util.Date validFrom) {
		this.validFrom = validFrom;
	}
	/**
	 * The end of the validity of offer, price specification, or opening hours data.
=======

	public void setValidFrom(java.util.Date validFrom) {
		this.validFrom = validFrom;
	}

	/**
	 * The end of the validity of offer, price specification, or opening hours
	 * data.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public java.util.Date getValidThrough() {
		return this.validThrough;
	}
<<<<<<< HEAD
	public void setValidThrough(java.util.Date validThrough) {
		this.validThrough = validThrough;
	}
=======

	public void setValidThrough(java.util.Date validThrough) {
		this.validThrough = validThrough;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The warranty promise(s) included in the offer.
	 */
	public WarrantyPromise getWarranty() {
		return this.warranty;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	public void setWarranty(WarrantyPromise warranty) {
		this.warranty = warranty;
	}
}
