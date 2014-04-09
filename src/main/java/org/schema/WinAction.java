package org.schema;

/**
 * 
 * The act of achieving victory in a competitive activity.
 * 
 * @fullPath Thing > Action > AchieveAction > WinAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class WinAction extends AchieveAction {

	private Person loser;

	/**
	 * A sub property of participant. The loser of the action.
	 */
	public Person getLoser() {
		return this.loser;
	}

	/**
	 * A sub property of participant. The loser of the action.
	 */
	public void setLoser(Person loser) {
		this.loser = loser;
	}
}
