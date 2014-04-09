package org.schema;

/**
 * 
 * A set of characteristics belonging to people, e.g. who compose an item's
 * target audience.
 * 
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

	/**
	 * Expectations for health conditions of target audience
	 */
	public void setHealthCondition(MedicalCondition healthCondition) {
		this.healthCondition = healthCondition;
	}

	/**
	 * Audiences defined by a person's gender.
	 */
	public String getRequiredGender() {
		return this.requiredGender;
	}

	/**
	 * Audiences defined by a person's gender.
	 */
	public void setRequiredGender(String requiredGender) {
		this.requiredGender = requiredGender;
	}

	/**
	 * Audiences defined by a person's maximum age.
	 */
	public Integer getRequiredMaxAge() {
		return this.requiredMaxAge;
	}

	/**
	 * Audiences defined by a person's maximum age.
	 */
	public void setRequiredMaxAge(Integer requiredMaxAge) {
		this.requiredMaxAge = requiredMaxAge;
	}

	/**
	 * Audiences defined by a person's minimum age.
	 */
	public Integer getRequiredMinAge() {
		return this.requiredMinAge;
	}

	/**
	 * Audiences defined by a person's minimum age.
	 */
	public void setRequiredMinAge(Integer requiredMinAge) {
		this.requiredMinAge = requiredMinAge;
	}

	/**
	 * The gender of the person or audience.
	 */
	public String getSuggestedGender() {
		return this.suggestedGender;
	}

	/**
	 * The gender of the person or audience.
	 */
	public void setSuggestedGender(String suggestedGender) {
		this.suggestedGender = suggestedGender;
	}

	/**
	 * Maximal age recommended for viewing content
	 */
	public Double getSuggestedMaxAge() {
		return this.suggestedMaxAge;
	}

	/**
	 * Maximal age recommended for viewing content
	 */
	public void setSuggestedMaxAge(Double suggestedMaxAge) {
		this.suggestedMaxAge = suggestedMaxAge;
	}

	/**
	 * Minimal age recommended for viewing content
	 */
	public Double getSuggestedMinAge() {
		return this.suggestedMinAge;
	}

	/**
	 * Minimal age recommended for viewing content
	 */
	public void setSuggestedMinAge(Double suggestedMinAge) {
		this.suggestedMinAge = suggestedMinAge;
	}
}
