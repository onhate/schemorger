package org.schema;

/**
 * 
 * A scholarly article in the medical domain.
 * 
 * @fullPath Thing > CreativeWork > Article > ScholarlyArticle >
 *           MedicalScholarlyArticle
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalScholarlyArticle extends ScholarlyArticle {

	private String publicationType;

	/**
	 * The type of the medical article, taken from the US NLM MeSH <a
	 * href="http://www.nlm.nih.gov/mesh/pubtypes.html">publication type
	 * catalog.</a>
	 */
	public String getPublicationType() {
		return this.publicationType;
	}

	/**
	 * The type of the medical article, taken from the US NLM MeSH <a
	 * href="http://www.nlm.nih.gov/mesh/pubtypes.html">publication type
	 * catalog.</a>
	 */
	public void setPublicationType(String publicationType) {
		this.publicationType = publicationType;
	}
}
