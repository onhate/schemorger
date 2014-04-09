package org.schema;

/**
 * 
 * A property, used to indicate attributes and relationships of some Thing;
 * equivalent to rdf:Property.
 * 
 * @fullPath Thing > Property
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Property extends Thing {

	private Class domainIncludes;
	private Class rangeIncludes;

	/**
	 * Relates a property to a class that is (one of) the type(s) the property
	 * is expected to be used on.
	 */
	public Class getDomainIncludes() {
		return this.domainIncludes;
	}

	/**
	 * Relates a property to a class that is (one of) the type(s) the property
	 * is expected to be used on.
	 */
	public void setDomainIncludes(Class domainIncludes) {
		this.domainIncludes = domainIncludes;
	}

	/**
	 * Relates a property to a class that constitutes (one of) the expected
	 * type(s) for values of the property.
	 */
	public Class getRangeIncludes() {
		return this.rangeIncludes;
	}

	/**
	 * Relates a property to a class that constitutes (one of) the expected
	 * type(s) for values of the property.
	 */
	public void setRangeIncludes(Class rangeIncludes) {
		this.rangeIncludes = rangeIncludes;
	}
}
