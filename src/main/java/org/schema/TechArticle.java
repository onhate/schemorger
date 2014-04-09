package org.schema;

/**
 * 
 * A technical article - Example: How-to (task) topics, step-by-step, procedural
 * troubleshooting, specifications, etc.
 * 
 * @fullPath Thing > CreativeWork > Article > TechArticle
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TechArticle extends Article {

	private String dependencies;
	private String proficiencyLevel;

	/**
	 * Prerequisites needed to fulfill steps in article.
	 */
	public String getDependencies() {
		return this.dependencies;
	}

	/**
	 * Prerequisites needed to fulfill steps in article.
	 */
	public void setDependencies(String dependencies) {
		this.dependencies = dependencies;
	}

	/**
	 * Proficiency needed for this content; expected values: 'Beginner',
	 * 'Expert'.
	 */
	public String getProficiencyLevel() {
		return this.proficiencyLevel;
	}

	/**
	 * Proficiency needed for this content; expected values: 'Beginner',
	 * 'Expert'.
	 */
	public void setProficiencyLevel(String proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}
}
