package org.schema;

/**
 * 
 * The act of conveying information to another person via a communication medium
 * (instrument) such as speech, email, or telephone conversation.
 * 
 * @fullPath Thing > Action > InteractAction > CommunicateAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class CommunicateAction extends InteractAction {

	private Thing about;
	private Language language;
	private Object recipient;

	/**
	 * The subject matter of the content.
	 */
	public Thing getAbout() {
		return this.about;
	}

	/**
	 * The subject matter of the content.
	 */
	public void setAbout(Thing about) {
		this.about = about;
	}

	/**
	 * A sub property of instrument. The languaged used on this action.
	 */
	public Language getLanguage() {
		return this.language;
	}

	/**
	 * A sub property of instrument. The languaged used on this action.
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}

	/**
	 * A sub property of participant. The participant who is at the receiving
	 * end of the action.
	 * 
	 * @see Audience
	 * @see Organization
	 * @see Person
	 */
	public Object getRecipient() {
		return this.recipient;
	}

	/**
	 * A sub property of participant. The participant who is at the receiving
	 * end of the action.
	 * 
	 * @see Audience
	 * @see Organization
	 * @see Person
	 */
	public void setRecipient(Object recipient) {
		this.recipient = recipient;
	}
}
