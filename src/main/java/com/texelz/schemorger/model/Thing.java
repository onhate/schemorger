package com.texelz.schemorger.model;

/**
 * 
 * The most generic type of item.
 * 
 * @fullPath Thing
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Thing extends com.texelz.schemorger.definition.Scoped {

	private com.texelz.schemorger.definition.Link additionalType;
	private String alternateName;
	private String description;
	private com.texelz.schemorger.definition.Link image;
	private String name;
	private com.texelz.schemorger.definition.Link sameAs;
	private com.texelz.schemorger.definition.Link url;

	/**
	 * An additional type for the item, typically used for adding more specific
	 * types from external vocabularies in microdata syntax. This is a
	 * relationship between something and a class that the thing is in. In RDFa
	 * syntax, it is better to use the native RDFa syntax - the 'typeof'
	 * attribute - for multiple types. Schema.org tools may have only weaker
	 * understanding of extra types, in particular those defined externally.
	 */
	public com.texelz.schemorger.definition.Link getAdditionalType() {
		return this.additionalType;
	}

	/**
	 * An additional type for the item, typically used for adding more specific
	 * types from external vocabularies in microdata syntax. This is a
	 * relationship between something and a class that the thing is in. In RDFa
	 * syntax, it is better to use the native RDFa syntax - the 'typeof'
	 * attribute - for multiple types. Schema.org tools may have only weaker
	 * understanding of extra types, in particular those defined externally.
	 */
	public void setAdditionalType(com.texelz.schemorger.definition.Link additionalType) {
		this.additionalType = additionalType;
	}

	/**
	 * An alias for the item.
	 */
	public String getAlternateName() {
		return this.alternateName;
	}

	/**
	 * An alias for the item.
	 */
	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	/**
	 * A short description of the item.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * A short description of the item.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * URL of an image of the item.
	 */
	public com.texelz.schemorger.definition.Link getImage() {
		return this.image;
	}

	/**
	 * URL of an image of the item.
	 */
	public void setImage(com.texelz.schemorger.definition.Link image) {
		this.image = image;
	}

	/**
	 * The name of the item.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * The name of the item.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * URL of a reference Web page that unambiguously indicates the item's
	 * identity. E.g. the URL of the item's Wikipedia page, Freebase page, or
	 * official website.
	 */
	public com.texelz.schemorger.definition.Link getSameAs() {
		return this.sameAs;
	}

	/**
	 * URL of a reference Web page that unambiguously indicates the item's
	 * identity. E.g. the URL of the item's Wikipedia page, Freebase page, or
	 * official website.
	 */
	public void setSameAs(com.texelz.schemorger.definition.Link sameAs) {
		this.sameAs = sameAs;
	}

	/**
	 * URL of the item.
	 */
	public com.texelz.schemorger.definition.Link getUrl() {
		return this.url;
	}

	/**
	 * URL of the item.
	 */
	public void setUrl(com.texelz.schemorger.definition.Link url) {
		this.url = url;
	}
}
