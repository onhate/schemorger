package com.texelz.schemorger.model;

/**
 *
 * A set of characteristics belonging to people, e.g. who compose an item's target audience.
 * @fullPath Thing > Intangible > Audience > PeopleAudience
 *
 * @author Texelz (by Onhate)
 *
 */
public class PeopleAudience extends Audience {

	private MedicalCondition healthCondition;
	private String requiredGender;
	private Integer requiredMaxAge;
	private Integer requiredMinAge;
	private String suggestedGender;
	private Double suggestedMaxAge;
	private Double suggestedMinAge;
	/**
	 * Expectations for health conditions of target audience
	 */
	public MedicalCondition getHealthCondition() {
		return this.healthCondition;
	}
	public void setHealthCondition(MedicalCondition healthCondition) {
		this.healthCondition = healthCondition;
	}
	/**
	 * Audiences defined by a person's gender.
	 */
	public String getRequiredGender() {
		return this.requiredGender;
	}
	public void setRequiredGender(String requiredGender) {
		this.requiredGender = requiredGender;
	}
	/**
	 * Audiences defined by a person's maximum age.
	 */
	public Integer getRequiredMaxAge() {
		return this.requiredMaxAge;
	}
	public void setRequiredMaxAge(Integer requiredMaxAge) {
		this.requiredMaxAge = requiredMaxAge;
	}
	/**
	 * Audiences defined by a person's minimum age.
	 */
	public Integer getRequiredMinAge() {
		return this.requiredMinAge;
	}
	public void setRequiredMinAge(Integer requiredMinAge) {
		this.requiredMinAge = requiredMinAge;
	}
	/**
	 * The gender of the person or audience.
	 */
	public String getSuggestedGender() {
		return this.suggestedGender;
	}
	public void setSuggestedGender(String suggestedGender) {
		this.suggestedGender = suggestedGender;
	}
	/**
	 * Maximal age recommended for viewing content
	 */
	public Double getSuggestedMaxAge() {
		return this.suggestedMaxAge;
	}
	public void setSuggestedMaxAge(Double suggestedMaxAge) {
		this.suggestedMaxAge = suggestedMaxAge;
	}
	/**
	 * Minimal age recommended for viewing content
	 */
	public Double getSuggestedMinAge() {
		return this.suggestedMinAge;
	}
	public void setSuggestedMinAge(Double suggestedMinAge) {
		this.suggestedMinAge = suggestedMinAge;
	}
}
