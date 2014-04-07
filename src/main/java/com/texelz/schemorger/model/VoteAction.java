package com.texelz.schemorger.model;

/**
 *
 * The act of expressing a preference from a fixed/finite/structured set of choices/options.
 * @fullPath Thing > Action > AssessAction > ChooseAction > VoteAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class VoteAction extends ChooseAction {

	private Person candidate;
	/**
	 * A sub property of object. The candidate subject of this action.
	 */
	public Person getCandidate() {
		return this.candidate;
	}
	public void setCandidate(Person candidate) {
		this.candidate = candidate;
	}
}
