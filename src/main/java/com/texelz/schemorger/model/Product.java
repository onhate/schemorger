package com.texelz.schemorger.model;

<<<<<<< HEAD
/**
 *
 * A product is anything that is made available for sale—for example, a pair of shoes, a concert ticket, or a car. Commodity services, like haircuts, can also be represented using this type.
 * @fullPath Thing > Product
 *
 * @author Texelz (by Onhate)
 *
=======
import java.net.URL;

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
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
 */
public class Product extends Thing {

	private AggregateRating aggregateRating;
	private Audience audience;
<<<<<<< HEAD
	private Object brand;
	private String color;
	private Object depth;
	private String gtin13;
	private String gtin14;
	private String gtin8;
	private Object height;
=======
	private Thing brand;
	private String color;
	private Thing depth;
	private String gtin13;
	private String gtin14;
	private String gtin8;
	private Thing height;
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	private Product isAccessoryOrSparePartFor;
	private Product isConsumableFor;
	private Product isRelatedTo;
	private Product isSimilarTo;
	private OfferItemCondition itemCondition;
<<<<<<< HEAD
	private Object logo;
	private Organization manufacturer;
	private Object model;
=======
	private Thing logo;
	private Organization manufacturer;
	private Thing model;
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	private String mpn;
	private Offer offers;
	private String productID;
	private java.util.Date releaseDate;
	private Review review;
	private String sku;
	private QuantitativeValue weight;
<<<<<<< HEAD
	private Object width;
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
=======
	private Thing width;

	/**
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}
<<<<<<< HEAD
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	/**
	 * The intended audience of the item, i.e. the group for whom the item was created.
=======

	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Audience getAudience() {
		return this.audience;
	}
<<<<<<< HEAD
	public void setAudience(Audience audience) {
		this.audience = audience;
	}
	/**
	 * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
	 * @see Organization
	 * @see Brand
	 */
	public Object getBrand() {
=======

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
	public Thing getBrand() {
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
		return this.brand;
	}
	public void setBrand(Object brand) {
		this.brand = brand;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The color of the product.
	 */
	public String getColor() {
		return this.color;
<<<<<<< HEAD
	}
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * The depth of the product.
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getDepth() {
		return this.depth;
	}
	public void setDepth(Object depth) {
		this.depth = depth;
	}
	/**
	 * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero.
	 */
	public String getGtin13() {
		return this.gtin13;
	}
	public void setGtin13(String gtin13) {
		this.gtin13 = gtin13;
	}
	/**
	 * The GTIN-14 code of the product, or the product to which the offer refers.
	 */
	public String getGtin14() {
		return this.gtin14;
	}
	public void setGtin14(String gtin14) {
		this.gtin14 = gtin14;
	}
	/**
	 * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN.
	 */
	public String getGtin8() {
		return this.gtin8;
	}
	public void setGtin8(String gtin8) {
		this.gtin8 = gtin8;
	}
	/**
	 * The height of the item.
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getHeight() {
		return this.height;
	}
	public void setHeight(Object height) {
		this.height = height;
	}
	/**
	 * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
	 */
	public Product getIsAccessoryOrSparePartFor() {
		return this.isAccessoryOrSparePartFor;
	}
	public void setIsAccessoryOrSparePartFor(Product isAccessoryOrSparePartFor) {
		this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
	}
	/**
	 * A pointer to another product (or multiple products) for which this product is a consumable.
	 */
	public Product getIsConsumableFor() {
		return this.isConsumableFor;
	}
	public void setIsConsumableFor(Product isConsumableFor) {
		this.isConsumableFor = isConsumableFor;
	}
	/**
	 * A pointer to another, somehow related product (or multiple products).
	 */
	public Product getIsRelatedTo() {
		return this.isRelatedTo;
	}
	public void setIsRelatedTo(Product isRelatedTo) {
		this.isRelatedTo = isRelatedTo;
	}
	/**
	 * A pointer to another, functionally similar product (or multiple products).
	 */
	public Product getIsSimilarTo() {
		return this.isSimilarTo;
	}
	public void setIsSimilarTo(Product isSimilarTo) {
		this.isSimilarTo = isSimilarTo;
	}
	/**
	 * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
=======
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * The depth of the product.
	 * 
	 * @see QuantitativeValue
	 * @see Distance
	 */
	public Thing getDepth() {
		return this.depth;
	}

	public void setDepth(Thing depth) {
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

	public void setGtin8(String gtin8) {
		this.gtin8 = gtin8;
	}

	/**
	 * The height of the item.
	 * 
	 * @see QuantitativeValue
	 * @see Distance
	 */
	public Thing getHeight() {
		return this.height;
	}

	public void setHeight(Thing height) {
		this.height = height;
	}

	/**
	 * A pointer to another product (or multiple products) for which this
	 * product is an accessory or spare part.
	 */
	public Product getIsAccessoryOrSparePartFor() {
		return this.isAccessoryOrSparePartFor;
	}

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

	public void setIsConsumableFor(Product isConsumableFor) {
		this.isConsumableFor = isConsumableFor;
	}

	/**
	 * A pointer to another, somehow related product (or multiple products).
	 */
	public Product getIsRelatedTo() {
		return this.isRelatedTo;
	}

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

	public void setIsSimilarTo(Product isSimilarTo) {
		this.isSimilarTo = isSimilarTo;
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
	/**
	 * A logo associated with an organization.
	 * @see URL
	 * @see ImageObject
	 */
	public Object getLogo() {
		return this.logo;
	}
	public void setLogo(Object logo) {
		this.logo = logo;
	}
=======

	public void setItemCondition(OfferItemCondition itemCondition) {
		this.itemCondition = itemCondition;
	}

	/**
	 * A logo associated with an organization.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public Thing getLogo() {
		return this.logo;
	}

	public void setLogo(Thing logo) {
		this.logo = logo;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The manufacturer of the product.
	 */
	public Organization getManufacturer() {
		return this.manufacturer;
	}
<<<<<<< HEAD
	public void setManufacturer(Organization manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
	 * @see ProductModel
	 * @see Text
	 */
	public Object getModel() {
		return this.model;
	}
	public void setModel(Object model) {
		this.model = model;
	}
	/**
	 * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
=======

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
	public Thing getModel() {
		return this.model;
	}

	public void setModel(Thing model) {
		this.model = model;
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
	 * An offer to sell this item—for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
=======

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	/**
	 * An offer to sell this item—for example, an offer to sell a product, the
	 * DVD of a movie, or tickets to an event.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Offer getOffers() {
		return this.offers;
	}
<<<<<<< HEAD
	public void setOffers(Offer offers) {
		this.offers = offers;
	}
	/**
	 * The product identifier, such as ISBN. For example: <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>.
=======

	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	/**
	 * The product identifier, such as ISBN. For example:
	 * <code>&lt;meta itemprop='productID' content='isbn:123-456-789'/&gt;</code>
	 * .
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getProductID() {
		return this.productID;
	}
<<<<<<< HEAD
	public void setProductID(String productID) {
		this.productID = productID;
	}
	/**
	 * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
=======

	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * The release date of a product or product model. This can be used to
	 * distinguish the exact variant of a product.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public java.util.Date getReleaseDate() {
		return this.releaseDate;
	}
<<<<<<< HEAD
	public void setReleaseDate(java.util.Date releaseDate) {
		this.releaseDate = releaseDate;
	}
=======

	public void setReleaseDate(java.util.Date releaseDate) {
		this.releaseDate = releaseDate;
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
	 * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
	 */
	public String getSku() {
		return this.sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * The weight of the product.
	 */
	public QuantitativeValue getWeight() {
		return this.weight;
	}
	public void setWeight(QuantitativeValue weight) {
		this.weight = weight;
	}
	/**
	 * The width of the item.
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getWidth() {
		return this.width;
	}
	public void setWidth(Object width) {
		this.width = width;
	}
=======

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

	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * The weight of the product.
	 */
	public QuantitativeValue getWeight() {
		return this.weight;
	}

	public void setWeight(QuantitativeValue weight) {
		this.weight = weight;
	}

	/**
	 * The width of the item.
	 * 
	 * @see QuantitativeValue
	 * @see Distance
	 */
	public Thing getWidth() {
		return this.width;
	}

	public void setWidth(Thing width) {
		this.width = width;
	}
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
}
