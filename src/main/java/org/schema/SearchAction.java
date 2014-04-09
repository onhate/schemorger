package org.schema;

/**
 * 
 * The act of searching for an object.
 * <p>
 * Related actions:
 * </p>
 * <ul>
 * <li><a href="http://schema.org/FindAction">FindAction</a>: SearchAction
 * generally leads to a FindAction, but not necessarily.</li>
 * </ul>
 * 
 * @fullPath Thing > Action > SearchAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class SearchAction extends Action {

	private Object query;

	/**
	 * A sub property of instrument. The query used on this action.
	 * 
	 * @see Text
	 * @see Class
	 */
	public Object getQuery() {
		return this.query;
	}

	/**
	 * A sub property of instrument. The query used on this action.
	 * 
	 * @see Text
	 * @see Class
	 */
	public void setQuery(Object query) {
		this.query = query;
	}
}
