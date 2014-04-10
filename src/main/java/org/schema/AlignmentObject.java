package org.schema;

/**
 * 
 * An intangible item that describes an alignment between a learning resource
 * and a node in an educational framework.
 * 
 * @fullPath Thing > Intangible > AlignmentObject
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AlignmentObject extends Intangible {

	private String alignmentType;
	private String educationalFramework;
	private String targetDescription;
	private String targetName;
	private org.schema.base.URL targetUrl;

	/**
	 * A category of alignment between the learning resource and the framework
	 * node. Recommended values include: 'assesses', 'teaches', 'requires',
	 * 'textComplexity', 'readingLevel', 'educationalSubject', and
	 * 'educationLevel'.
	 */
	public String getAlignmentType() {
		return this.alignmentType;
	}

	/**
	 * A category of alignment between the learning resource and the framework
	 * node. Recommended values include: 'assesses', 'teaches', 'requires',
	 * 'textComplexity', 'readingLevel', 'educationalSubject', and
	 * 'educationLevel'.
	 */
	public void setAlignmentType(String alignmentType) {
		this.alignmentType = alignmentType;
	}

	/**
	 * The framework to which the resource being described is aligned.
	 */
	public String getEducationalFramework() {
		return this.educationalFramework;
	}

	/**
	 * The framework to which the resource being described is aligned.
	 */
	public void setEducationalFramework(String educationalFramework) {
		this.educationalFramework = educationalFramework;
	}

	/**
	 * The description of a node in an established educational framework.
	 */
	public String getTargetDescription() {
		return this.targetDescription;
	}

	/**
	 * The description of a node in an established educational framework.
	 */
	public void setTargetDescription(String targetDescription) {
		this.targetDescription = targetDescription;
	}

	/**
	 * The name of a node in an established educational framework.
	 */
	public String getTargetName() {
		return this.targetName;
	}

	/**
	 * The name of a node in an established educational framework.
	 */
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	/**
	 * The URL of a node in an established educational framework.
	 */
	public org.schema.base.URL getTargetUrl() {
		return this.targetUrl;
	}

	/**
	 * The URL of a node in an established educational framework.
	 */
	public void setTargetUrl(org.schema.base.URL targetUrl) {
		this.targetUrl = targetUrl;
	}
}
