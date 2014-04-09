package org.schema;

/**
 * 
 * A datasheet or vendor specification of a product (in the sense of a
 * prototypical description).
 * 
 * @fullPath Thing > Product > ProductModel
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ProductModel extends Product {

	private ProductModel isVariantOf;
	private ProductModel predecessorOf;
	private ProductModel successorOf;

	/**
	 * A pointer to a base product from which this product is a variant. It is
	 * safe to infer that the variant inherits all product features from the
	 * base model, unless defined locally. This is not transitive.
	 */
	public ProductModel getIsVariantOf() {
		return this.isVariantOf;
	}

	/**
	 * A pointer to a base product from which this product is a variant. It is
	 * safe to infer that the variant inherits all product features from the
	 * base model, unless defined locally. This is not transitive.
	 */
	public void setIsVariantOf(ProductModel isVariantOf) {
		this.isVariantOf = isVariantOf;
	}

	/**
	 * A pointer from a previous, often discontinued variant of the product to
	 * its newer variant.
	 */
	public ProductModel getPredecessorOf() {
		return this.predecessorOf;
	}

	/**
	 * A pointer from a previous, often discontinued variant of the product to
	 * its newer variant.
	 */
	public void setPredecessorOf(ProductModel predecessorOf) {
		this.predecessorOf = predecessorOf;
	}

	/**
	 * A pointer from a newer variant of a product to its previous, often
	 * discontinued predecessor.
	 */
	public ProductModel getSuccessorOf() {
		return this.successorOf;
	}

	/**
	 * A pointer from a newer variant of a product to its previous, often
	 * discontinued predecessor.
	 */
	public void setSuccessorOf(ProductModel successorOf) {
		this.successorOf = successorOf;
	}
}
