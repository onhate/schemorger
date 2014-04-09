package org.schema;

/**
 * 
 * Fitness-related activity designed for a specific health-related purpose,
 * including defined exercise routines as well as activity prescribed by a
 * clinician.
 * 
 * @fullPath Thing > CreativeWork > ExercisePlan
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ExercisePlan extends CreativeWork {

	private Duration activityDuration;
	private String activityFrequency;
	private String additionalVariable;
	private String exerciseType;
	private String intensity;
	private Double repetitions;
	private String restPeriods;
	private Energy workload;

	/**
	 * Length of time to engage in the activity.
	 */
	public Duration getActivityDuration() {
		return this.activityDuration;
	}

	/**
	 * Length of time to engage in the activity.
	 */
	public void setActivityDuration(Duration activityDuration) {
		this.activityDuration = activityDuration;
	}

	/**
	 * How often one should engage in the activity.
	 */
	public String getActivityFrequency() {
		return this.activityFrequency;
	}

	/**
	 * How often one should engage in the activity.
	 */
	public void setActivityFrequency(String activityFrequency) {
		this.activityFrequency = activityFrequency;
	}

	/**
	 * Any additional component of the exercise prescription that may need to be
	 * articulated to the patient. This may include the order of exercises, the
	 * number of repetitions of movement, quantitative distance, progressions
	 * over time, etc.
	 */
	public String getAdditionalVariable() {
		return this.additionalVariable;
	}

	/**
	 * Any additional component of the exercise prescription that may need to be
	 * articulated to the patient. This may include the order of exercises, the
	 * number of repetitions of movement, quantitative distance, progressions
	 * over time, etc.
	 */
	public void setAdditionalVariable(String additionalVariable) {
		this.additionalVariable = additionalVariable;
	}

	/**
	 * Type(s) of exercise or activity, such as strength training, flexibility
	 * training, aerobics, cardiac rehabilitation, etc.
	 */
	public String getExerciseType() {
		return this.exerciseType;
	}

	/**
	 * Type(s) of exercise or activity, such as strength training, flexibility
	 * training, aerobics, cardiac rehabilitation, etc.
	 */
	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	/**
	 * Quantitative measure gauging the degree of force involved in the
	 * exercise, for example, heartbeats per minute. May include the velocity of
	 * the movement.
	 */
	public String getIntensity() {
		return this.intensity;
	}

	/**
	 * Quantitative measure gauging the degree of force involved in the
	 * exercise, for example, heartbeats per minute. May include the velocity of
	 * the movement.
	 */
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	/**
	 * Number of times one should repeat the activity.
	 */
	public Double getRepetitions() {
		return this.repetitions;
	}

	/**
	 * Number of times one should repeat the activity.
	 */
	public void setRepetitions(Double repetitions) {
		this.repetitions = repetitions;
	}

	/**
	 * How often one should break from the activity.
	 */
	public String getRestPeriods() {
		return this.restPeriods;
	}

	/**
	 * How often one should break from the activity.
	 */
	public void setRestPeriods(String restPeriods) {
		this.restPeriods = restPeriods;
	}

	/**
	 * Quantitative measure of the physiologic output of the exercise; also
	 * referred to as energy expenditure.
	 */
	public Energy getWorkload() {
		return this.workload;
	}

	/**
	 * Quantitative measure of the physiologic output of the exercise; also
	 * referred to as energy expenditure.
	 */
	public void setWorkload(Energy workload) {
		this.workload = workload;
	}
}
