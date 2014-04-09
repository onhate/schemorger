package org.schema;

/**
 * 
 * The act of editing a recipient by replacing an old object with a new object.
 * 
 * @fullPath Thing > Action > UpdateAction > ReplaceAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ReplaceAction extends UpdateAction {

	private Thing replacee;
	private Thing replacer;

	/**
	 * A sub property of object. The object that is being replaced.
	 */
	public Thing getReplacee() {
		return this.replacee;
	}

	/**
	 * A sub property of object. The object that is being replaced.
	 */
	public void setReplacee(Thing replacee) {
		this.replacee = replacee;
	}

	/**
	 * A sub property of object. The object that replaces.
	 */
	public Thing getReplacer() {
		return this.replacer;
	}

	/**
	 * A sub property of object. The object that replaces.
	 */
	public void setReplacer(Thing replacer) {
		this.replacer = replacer;
	}
}
