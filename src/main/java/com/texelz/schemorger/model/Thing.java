package com.texelz.schemorger.model;

/**
<<<<<<< HEAD
 *
 * The most generic type of item.
 * @fullPath Thing
 *
 * @author Texelz (by Onhate)
 *
=======
 * 
 * The most generic type of item.
 * 
 * @fullPath Thing
 * 
 * @author Texelz (by Onhate)
 * 
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
 */
public class Thing extends com.texelz.schemorger.definition.Scoped {

	private com.texelz.schemorger.definition.Link additionalType;
	private String alternateName;
	private String description;
	private com.texelz.schemorger.definition.Link image;
	private String name;
	private com.texelz.schemorger.definition.Link sameAs;
	private com.texelz.schemorger.definition.Link url;
<<<<<<< HEAD
	/**
	 * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
=======

	/**
	 * An additional type for the item, typically used for adding more specific
	 * types from external vocabularies in microdata syntax. This is a
	 * relationship between something and a class that the thing is in. In RDFa
	 * syntax, it is better to use the native RDFa syntax - the 'typeof'
	 * attribute - for multiple types. Schema.org tools may have only weaker
	 * understanding of extra types, in particular those defined externally.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public com.texelz.schemorger.definition.Link getAdditionalType() {
		return this.additionalType;
	}
<<<<<<< HEAD
	public void setAdditionalType(com.texelz.schemorger.definition.Link additionalType) {
		this.additionalType = additionalType;
	}
=======

	public void setAdditionalType(com.texelz.schemorger.definition.Link additionalType) {
		this.additionalType = additionalType;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * An alias for the item.
	 */
	public String getAlternateName() {
		return this.alternateName;
	}
	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A short description of the item.
	 */
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * URL of an image of the item.
	 */
	public com.texelz.schemorger.definition.Link getImage() {
		return this.image;
	}
<<<<<<< HEAD
	public void setImage(com.texelz.schemorger.definition.Link image) {
		this.image = image;
	}
=======

	public void setImage(com.texelz.schemorger.definition.Link image) {
		this.image = image;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The name of the item.
	 */
	public String getName() {
		return this.name;
	}
<<<<<<< HEAD
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
=======

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * URL of a reference Web page that unambiguously indicates the item's
	 * identity. E.g. the URL of the item's Wikipedia page, Freebase page, or
	 * official website.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public com.texelz.schemorger.definition.Link getSameAs() {
		return this.sameAs;
	}
<<<<<<< HEAD
	public void setSameAs(com.texelz.schemorger.definition.Link sameAs) {
		this.sameAs = sameAs;
	}
=======

	public void setSameAs(com.texelz.schemorger.definition.Link sameAs) {
		this.sameAs = sameAs;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * URL of the item.
	 */
	public com.texelz.schemorger.definition.Link getUrl() {
		return this.url;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	public void setUrl(com.texelz.schemorger.definition.Link url) {
		this.url = url;
	}
}
