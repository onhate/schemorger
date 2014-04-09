package org.schema;

/**
 * 
 * A set of characteristics describing parents, who can be interested in viewing
 * some content
 * 
 * @fullPath Thing > Intangible > Audience > PeopleAudience > ParentAudience
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ParentAudience extends PeopleAudience {

	private Double childMaxAge;
	private Double childMinAge;

	/**
	 * Maximal age of the child
	 */
	public Double getChildMaxAge() {
		return this.childMaxAge;
	}

	/**
	 * Maximal age of the child
	 */
	public void setChildMaxAge(Double childMaxAge) {
		this.childMaxAge = childMaxAge;
	}

	/**
	 * Minimal age of the child
	 */
	public Double getChildMinAge() {
		return this.childMinAge;
	}

	/**
	 * Minimal age of the child
	 */
	public void setChildMinAge(Double childMinAge) {
		this.childMinAge = childMinAge;
	}
}
