package org.schema;

/**
 * 
 * The act of expressing a preference from a set of options or a large or
 * unbounded set of choices/options.
 * 
 * @fullPath Thing > Action > AssessAction > ChooseAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ChooseAction extends AssessAction {

	private Object option;

	/**
	 * A sub property of object. The options subject to this action.
	 * 
	 * @see Thing
	 * @see Text
	 */
	public Object getOption() {
		return this.option;
	}

	/**
	 * A sub property of object. The options subject to this action.
	 * 
	 * @see Thing
	 * @see Text
	 */
	public void setOption(Object option) {
		this.option = option;
	}
}
