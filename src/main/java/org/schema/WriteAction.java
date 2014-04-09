package org.schema;

/**
 * 
 * The act of authoring written creative content.
 * 
 * @fullPath Thing > Action > CreateAction > WriteAction
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class WriteAction extends CreateAction {

	private Language language;

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
}
