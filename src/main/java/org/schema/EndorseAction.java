package org.schema;

/**
 * 
 * An agent approves/certifies/likes/supports/sanction an object.
 * 
 * @fullPath Thing > Action > AssessAction > ReactAction > EndorseAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class EndorseAction extends ReactAction {

	private Object endorsee;

	/**
	 * A sub property of participant. The person/organization being supported.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getEndorsee() {
		return this.endorsee;
	}

	/**
	 * A sub property of participant. The person/organization being supported.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setEndorsee(Object endorsee) {
		this.endorsee = endorsee;
	}
}
