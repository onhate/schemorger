package org.schema;

/**
 * 
 * The act of participating in exertive activity for the purposes of improving
 * health and fitness
 * 
 * @fullPath Thing > Action > PlayAction > ExerciseAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ExerciseAction extends PlayAction {

	private Place course;
	private Diet diet;
	private Distance distance;
	private ExercisePlan exercisePlan;
	private String exerciseType;
	private Object fromLocation;
	private Person oponent;
	private SportsActivityLocation sportsActivityLocation;
	private SportsEvent sportsEvent;
	private SportsTeam sportsTeam;
	private Object toLocation;

	/**
	 * A sub property of location. The course where this action was taken.
	 */
	public Place getCourse() {
		return this.course;
	}

	/**
	 * A sub property of location. The course where this action was taken.
	 */
	public void setCourse(Place course) {
		this.course = course;
	}

	/**
	 * A sub property of instrument. The died used in this action.
	 */
	public Diet getDiet() {
		return this.diet;
	}

	/**
	 * A sub property of instrument. The died used in this action.
	 */
	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	/**
	 * A sub property of asset. The distance travelled.
	 */
	public Distance getDistance() {
		return this.distance;
	}

	/**
	 * A sub property of asset. The distance travelled.
	 */
	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	/**
	 * A sub property of instrument. The exercise plan used on this action.
	 */
	public ExercisePlan getExercisePlan() {
		return this.exercisePlan;
	}

	/**
	 * A sub property of instrument. The exercise plan used on this action.
	 */
	public void setExercisePlan(ExercisePlan exercisePlan) {
		this.exercisePlan = exercisePlan;
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
	 * A sub property of location. The original location of the object or the
	 * agent before the action.
	 * 
	 * @see Place
	 * @see Number
	 */
	public Object getFromLocation() {
		return this.fromLocation;
	}

	/**
	 * A sub property of location. The original location of the object or the
	 * agent before the action.
	 * 
	 * @see Place
	 * @see Number
	 */
	public void setFromLocation(Object fromLocation) {
		this.fromLocation = fromLocation;
	}

	/**
	 * A sub property of participant. The oponent on this action.
	 */
	public Person getOponent() {
		return this.oponent;
	}

	/**
	 * A sub property of participant. The oponent on this action.
	 */
	public void setOponent(Person oponent) {
		this.oponent = oponent;
	}

	/**
	 * A sub property of location. The sports activity location where this
	 * action occurred.
	 */
	public SportsActivityLocation getSportsActivityLocation() {
		return this.sportsActivityLocation;
	}

	/**
	 * A sub property of location. The sports activity location where this
	 * action occurred.
	 */
	public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation) {
		this.sportsActivityLocation = sportsActivityLocation;
	}

	/**
	 * A sub property of location. The sports event where this action occurred.
	 */
	public SportsEvent getSportsEvent() {
		return this.sportsEvent;
	}

	/**
	 * A sub property of location. The sports event where this action occurred.
	 */
	public void setSportsEvent(SportsEvent sportsEvent) {
		this.sportsEvent = sportsEvent;
	}

	/**
	 * A sub property of participant. The sports team that participated on this
	 * action.
	 */
	public SportsTeam getSportsTeam() {
		return this.sportsTeam;
	}

	/**
	 * A sub property of participant. The sports team that participated on this
	 * action.
	 */
	public void setSportsTeam(SportsTeam sportsTeam) {
		this.sportsTeam = sportsTeam;
	}

	/**
	 * A sub property of location. The final location of the object or the agent
	 * after the action.
	 * 
	 * @see Place
	 * @see Number
	 */
	public Object getToLocation() {
		return this.toLocation;
	}

	/**
	 * A sub property of location. The final location of the object or the agent
	 * after the action.
	 * 
	 * @see Place
	 * @see Number
	 */
	public void setToLocation(Object toLocation) {
		this.toLocation = toLocation;
	}
}
