package org.schema;

/**
 * 
 * The act of being defeated in a competitive activity.
 * 
 * @fullPath Thing > Action > AchieveAction > LoseAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class LoseAction extends AchieveAction {

	private Person winner;

	/**
	 * A sub property of participant. The winner of the action.
	 */
	public Person getWinner() {
		return this.winner;
	}

	/**
	 * A sub property of participant. The winner of the action.
	 */
	public void setWinner(Person winner) {
		this.winner = winner;
	}
}
