package org.schema;

/**
 * 
 * The act of obtaining an object under an agreement to return it at a later
 * date. Reciprocal of LendAction.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/LendAction">LendAction</a>: Reciprocal of
 * BorrowAction.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > TransferAction > BorrowAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class BorrowAction extends TransferAction {

	private Person lender;

	/**
	 * A sub property of participant. The person that lends the object being
	 * borrowed.
	 */
	public Person getLender() {
		return this.lender;
	}

	/**
	 * A sub property of participant. The person that lends the object being
	 * borrowed.
	 */
	public void setLender(Person lender) {
		this.lender = lender;
	}
}
