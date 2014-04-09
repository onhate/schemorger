package org.schema;

/**
 * 
 * A news article
 * 
 * @fullPath Thing > CreativeWork > Article > NewsArticle
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class NewsArticle extends Article {

	private String dateline;
	private String printColumn;
	private String printEdition;
	private String printPage;
	private String printSection;

	/**
	 * The location where the NewsArticle was produced.
	 */
	public String getDateline() {
		return this.dateline;
	}

	/**
	 * The location where the NewsArticle was produced.
	 */
	public void setDateline(String dateline) {
		this.dateline = dateline;
	}

	/**
	 * The number of the column in which the NewsArticle appears in the print
	 * edition.
	 */
	public String getPrintColumn() {
		return this.printColumn;
	}

	/**
	 * The number of the column in which the NewsArticle appears in the print
	 * edition.
	 */
	public void setPrintColumn(String printColumn) {
		this.printColumn = printColumn;
	}

	/**
	 * The edition of the print product in which the NewsArticle appears.
	 */
	public String getPrintEdition() {
		return this.printEdition;
	}

	/**
	 * The edition of the print product in which the NewsArticle appears.
	 */
	public void setPrintEdition(String printEdition) {
		this.printEdition = printEdition;
	}

	/**
	 * If this NewsArticle appears in print, this field indicates the name of
	 * the page on which the article is found. Please note that this field is
	 * intended for the exact page name (e.g. A5, B18).
	 */
	public String getPrintPage() {
		return this.printPage;
	}

	/**
	 * If this NewsArticle appears in print, this field indicates the name of
	 * the page on which the article is found. Please note that this field is
	 * intended for the exact page name (e.g. A5, B18).
	 */
	public void setPrintPage(String printPage) {
		this.printPage = printPage;
	}

	/**
	 * If this NewsArticle appears in print, this field indicates the print
	 * section in which the article appeared.
	 */
	public String getPrintSection() {
		return this.printSection;
	}

	/**
	 * If this NewsArticle appears in print, this field indicates the print
	 * section in which the article appeared.
	 */
	public void setPrintSection(String printSection) {
		this.printSection = printSection;
	}
}
