package org.schema;

/**
 * 
 * A product is anything that is made available for sale—for example, a pair of
 * shoes, a concert ticket, or a car. Commodity services, like haircuts, can
 * also be represented using this type.
 * 
 * @fullPath Thing > Product
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Product extends Thing {

	private AggregateRating aggregateRating;
	private Audience audience;
	private Object brand;
	private String color;
	private Object depth;
	private String gtin13;
	private String gtin14;
	private String gtin8;
	private Object height;
	private Product isAccessoryOrSparePartFor;
	private Product isConsumableFor;
	private Product isRelatedTo;
	private Product isSimilarTo;
	private OfferItemCondition itemCondition;
	private Object logo;
	private Organization manufacturer;
	private Object model;
	private String mpn;
	private Offer offers;
	private String productID;
	private java.util.Date releaseDate;
	private Review review;
	private String sku;
	private QuantitativeValue weight;
	private Object width;

	/**
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}

	/**
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
	 */
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
	 */
	public Audience getAudience() {
		return this.audience;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
	 */
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	/**
	 * The brand(s) associated with a product or service, or the brand(s)
	 * maintained by an organization or business person.
	 * 
	 * @see Brand
	 * @see Organization
	 */
	public Object getBrand() {
		return this.brand;
	}

	/**
	 * The brand(s) associated with a product or service, or the brand(s)
	 * maintained by an organization or business person.
	 * 
	 * @see Brand
	 * @see Organization
	 */
	public void setBrand(Object brand) {
		this.brand = brand;
	}

	/**
	 * The color of the product.
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * The color of the product.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * The depth of the product.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getDepth() {
		return this.depth;
	}

	/**
	 * The depth of the product.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public void setDepth(Object depth) {
		this.depth = depth;
	}

	/**
	 * The GTIN-13 code of the product, or the product to which the offer
	 * refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former
	 * 12-digit UPC codes can be converted into a GTIN-13 code by simply adding
	 * a preceeding zero.
	 */
	public String getGtin13() {
		return this.gtin13;
	}

	/**
	 * The GTIN-13 code of the product, or the product to which the offer
	 * refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former
	 * 12-digit UPC codes can be converted into a GTIN-13 code by simply adding
	 * a preceeding zero.
	 */
	public void setGtin13(String gtin13) {
		this.gtin13 = gtin13;
	}

	/**
	 * The GTIN-14 code of the product, or the product to which the offer
	 * refers.
	 */
	public String getGtin14() {
		return this.gtin14;
	}

	/**
	 * The GTIN-14 code of the product, or the product to which the offer
	 * refers.
	 */
	public void setGtin14(String gtin14) {
		this.gtin14 = gtin14;
	}

	/**
	 * The GTIN-8 code of the product, or the product to which the offer refers.
	 * This code is also known as EAN/UCC-8 or 8-digit EAN.
	 */
	public String getGtin8() {
		return this.gtin8;
	}

	/**
	 * The GTIN-8 code of the product, or the product to which the offer refers.
	 * This code is also known as EAN/UCC-8 or 8-digit EAN.
	 */
	public void setGtin8(String gtin8) {
		this.gtin8 = gtin8;
	}

	/**
	 * The height of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getHeight() {
		return this.height;
	}

	/**
	 * The height of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public void setHeight(Object height) {
		this.height = height;
	}

	/**
	 * A pointer to another product (or multiple products) for which this
	 * product is an accessory or spare part.
	 */
	public Product getIsAccessoryOrSparePartFor() {
		return this.isAccessoryOrSparePartFor;
	}

	/**
	 * A pointer to another product (or multiple products) for which this
	 * product is an accessory or spare part.
	 */
	public void setIsAccessoryOrSparePartFor(Product isAccessoryOrSparePartFor) {
		this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
	}

	/**
	 * A pointer to another product (or multiple products) for which this
	 * product is a consumable.
	 */
	public Product getIsConsumableFor() {
		return this.isConsumableFor;
	}

	/**
	 * A pointer to another product (or multiple products) for which this
	 * product is a consumable.
	 */
	public void setIsConsumableFor(Product isConsumableFor) {
		this.isConsumableFor = isConsumableFor;
	}

	/**
	 * A pointer to another, somehow related product (or multiple products).
	 */
	public Product getIsRelatedTo() {
		return this.isRelatedTo;
	}

	/**
	 * A pointer to another, somehow related product (or multiple products).
	 */
	public void setIsRelatedTo(Product isRelatedTo) {
		this.isRelatedTo = isRelatedTo;
	}

	/**
	 * A pointer to another, functionally similar product (or multiple
	 * products).
	 */
	public Product getIsSimilarTo() {
		return this.isSimilarTo;
	}

	/**
	 * A pointer to another, functionally similar product (or multiple
	 * products).
	 */
	public void setIsSimilarTo(Product isSimilarTo) {
		this.isSimilarTo = isSimilarTo;
	}

	/**
	 * A predefined value from OfferItemCondition or a textual description of
	 * the condition of the product or service, or the products or services
	 * included in the offer.
	 */
	public OfferItemCondition getItemCondition() {
		return this.itemCondition;
	}

	/**
	 * A predefined value from OfferItemCondition or a textual description of
	 * the condition of the product or service, or the products or services
	 * included in the offer.
	 */
	public void setItemCondition(OfferItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}

	/**
	 * A logo associated with an organization.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public Object getLogo() {
		return this.logo;
	}

	/**
	 * A logo associated with an organization.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public void setLogo(Object logo) {
		this.logo = logo;
	}

	/**
	 * The manufacturer of the product.
	 */
	public Organization getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * The manufacturer of the product.
	 */
	public void setManufacturer(Organization manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * The model of the product. Use with the URL of a ProductModel or a textual
	 * representation of the model identifier. The URL of the ProductModel can
	 * be from an external source. It is recommended to additionally provide
	 * strong product identifiers via the gtin8/gtin13/gtin14 and mpn
	 * properties.
	 * 
	 * @see Text
	 * @see ProductModel
	 */
	public Object getModel() {
		return this.model;
	}

	/**
	 * The model of the product. Use with the URL of a ProductModel or a textual
	 * representation of the model identifier. The URL of the ProductModel can
	 * be from an external source. It is recommended to additionally provide
	 * strong product identifiers via the gtin8/gtin13/gtin14 and mpn
	 * properties.
	 * 
	 * @see Text
	 * @see ProductModel
	 */
	public void setModel(Object model) {
		this.model = model;
	}

	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to
	 * which the offer refers.
	 */
	public String getMpn() {
		return this.mpn;
	}

	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to
	 * which the offer refers.
	 */
	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	/**
	 * An offer to transfer some rights to an item or to provide a service—for
	 * example, an offer to sell tickets to an event, to rent the DVD of a
	 * movie, to stream a TV show over the internet, to repair a motorcycle, or
	 * to loan a book.
	 */
	public Offer getOffers() {
		return this.offers;
	}

	/**
	 * An offer to transfer some rights to an item or to provide a service—for
	 * example, an offer to sell tickets to an event, to rent the DVD of a
	 * movie, to stream a TV show over the internet, to repair a motorcycle, or
	 * to loan a book.
	 */
	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	/**
	 * The product identifier, such as ISBN. For example:
	 * <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>
	 * .
	 */
	public String getProductID() {
		return this.productID;
	}

	/**
	 * The product identifier, such as ISBN. For example:
	 * <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>
	 * .
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * The release date of a product or product model. This can be used to
	 * distinguish the exact variant of a product.
	 */
	public java.util.Date getReleaseDate() {
		return this.releaseDate;
	}

	/**
	 * The release date of a product or product model. This can be used to
	 * distinguish the exact variant of a product.
	 */
	public void setReleaseDate(java.util.Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}

	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public void setReview(Review review) {
		this.review = review;
	}

	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a
	 * product or service, or the product to which the offer refers.
	 */
	public String getSku() {
		return this.sku;
	}

	/**
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a
	 * product or service, or the product to which the offer refers.
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * The weight of the product.
	 */
	public QuantitativeValue getWeight() {
		return this.weight;
	}

	/**
	 * The weight of the product.
	 */
	public void setWeight(QuantitativeValue weight) {
		this.weight = weight;
	}

	/**
	 * The width of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getWidth() {
		return this.width;
	}

	/**
	 * The width of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public void setWidth(Object width) {
		this.width = width;
	}
}
