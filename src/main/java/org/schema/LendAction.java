package org.schema;

/**
 * 
 * The act of providing an object under an agreement that it will be returned at
 * a later date. Reciprocal of BorrowAction.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/BorrowAction">BorrowAction</a>: Reciprocal of
 * LendAction.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > TransferAction > LendAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class LendAction extends TransferAction {

	private Person borrower;

	/**
	 * A sub property of participant. The person that borrows the object being
	 * lent.
	 */
	public Person getBorrower() {
		return this.borrower;
	}

	/**
	 * A sub property of participant. The person that borrows the object being
	 * lent.
	 */
	public void setBorrower(Person borrower) {
		this.borrower = borrower;
	}
}
