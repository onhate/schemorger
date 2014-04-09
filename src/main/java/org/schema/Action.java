package org.schema;

/**
 * 
 * An action performed by a direct agent and indirect participants upon a direct
 * object. Optionally happens at a location with the help of an inanimate
 * instrument. The execution of the action may produce a result. Specific action
 * sub-type documentation specifies the exact expectation of each argument/role.
 * 
 * @fullPath Thing > Action
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Action extends Thing {

	private Object agent;
	private java.util.Date endTime;
	private Thing instrument;
	private Object location;
	private Thing object;
	private Object participant;
	private Thing result;
	private java.util.Date startTime;

	/**
	 * The direct performer or driver of the action (animate or inanimate). e.g.
	 * *John* wrote a book.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getAgent() {
		return this.agent;
	}

	/**
	 * The direct performer or driver of the action (animate or inanimate). e.g.
	 * *John* wrote a book.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setAgent(Object agent) {
		this.agent = agent;
	}

	/**
	 * When the Action was performed: end time. This is for actions that span a
	 * period of time. e.g. John wrote a book from January to *December*.
	 */
	public java.util.Date getEndTime() {
		return this.endTime;
	}

	/**
	 * When the Action was performed: end time. This is for actions that span a
	 * period of time. e.g. John wrote a book from January to *December*.
	 */
	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * The object that helped the agent perform the action. e.g. John wrote a
	 * book with *a pen*.
	 */
	public Thing getInstrument() {
		return this.instrument;
	}

	/**
	 * The object that helped the agent perform the action. e.g. John wrote a
	 * book with *a pen*.
	 */
	public void setInstrument(Thing instrument) {
		this.instrument = instrument;
	}

	/**
	 * The location of the event, organization or action.
	 * 
	 * @see Place
	 * @see PostalAddress
	 */
	public Object getLocation() {
		return this.location;
	}

	/**
	 * The location of the event, organization or action.
	 * 
	 * @see Place
	 * @see PostalAddress
	 */
	public void setLocation(Object location) {
		this.location = location;
	}

	/**
	 * The object upon the action is carried out, whose state is kept intact or
	 * changed. Also known as the semantic roles patient, affected or undergoer
	 * (which change their state) or theme (which doesn't). e.g. John read *a
	 * book*.
	 */
	public Thing getObject() {
		return this.object;
	}

	/**
	 * The object upon the action is carried out, whose state is kept intact or
	 * changed. Also known as the semantic roles patient, affected or undergoer
	 * (which change their state) or theme (which doesn't). e.g. John read *a
	 * book*.
	 */
	public void setObject(Thing object) {
		this.object = object;
	}

	/**
	 * Other co-agents that participated in the action indirectly. e.g. John
	 * wrote a book with *Steve*.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getParticipant() {
		return this.participant;
	}

	/**
	 * Other co-agents that participated in the action indirectly. e.g. John
	 * wrote a book with *Steve*.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setParticipant(Object participant) {
		this.participant = participant;
	}

	/**
	 * The result produced in the action. e.g. John wrote *a book*.
	 */
	public Thing getResult() {
		return this.result;
	}

	/**
	 * The result produced in the action. e.g. John wrote *a book*.
	 */
	public void setResult(Thing result) {
		this.result = result;
	}

	/**
	 * When the Action was performed: start time. This is for actions that span
	 * a period of time. e.g. John wrote a book from *January* to December.
	 */
	public java.util.Date getStartTime() {
		return this.startTime;
	}

	/**
	 * When the Action was performed: start time. This is for actions that span
	 * a period of time. e.g. John wrote a book from *January* to December.
	 */
	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}
}
