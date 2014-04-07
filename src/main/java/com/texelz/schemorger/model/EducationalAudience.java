package com.texelz.schemorger.model;

/**
 *
 * An EducationalAudience
 * @fullPath Thing > Intangible > Audience > EducationalAudience
 *
 * @author Texelz (by Onhate)
 *
 */
public class EducationalAudience extends Audience {

	private String educationalRole;
	/**
	 * An educationalRole of an EducationalAudience
	 */
	public String getEducationalRole() {
		return this.educationalRole;
	}
	public void setEducationalRole(String educationalRole) {
		this.educationalRole = educationalRole;
	}
}
