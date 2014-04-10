package org.schema;

/**
 * 
 * A web page. Every web page is implicitly assumed to be declared to be of type
 * WebPage, so the various properties about that webpage, such as
 * <code>breadcrumb</code> may be used. We recommend explicit declaration if
 * these properties are specified, but if they are found outside of an
 * itemscope, they will be assumed to be about the page
 * 
 * @fullPath Thing > CreativeWork > WebPage
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class WebPage extends CreativeWork {

	private String breadcrumb;
	private CollectionPage isPartOf;
	private java.util.Date lastReviewed;
	private WebPageElement mainContentOfPage;
	private ImageObject primaryImageOfPage;
	private org.schema.base.URL relatedLink;
	private Object reviewedBy;
	private org.schema.base.URL significantLink;
	private Specialty specialty;

	/**
	 * A set of links that can help a user understand and navigate a website
	 * hierarchy.
	 */
	public String getBreadcrumb() {
		return this.breadcrumb;
	}

	/**
	 * A set of links that can help a user understand and navigate a website
	 * hierarchy.
	 */
	public void setBreadcrumb(String breadcrumb) {
		this.breadcrumb = breadcrumb;
	}

	/**
	 * Indicates the collection or gallery to which the item belongs.
	 */
	public CollectionPage getIsPartOf() {
		return this.isPartOf;
	}

	/**
	 * Indicates the collection or gallery to which the item belongs.
	 */
	public void setIsPartOf(CollectionPage isPartOf) {
		this.isPartOf = isPartOf;
	}

	/**
	 * Date on which the content on this web page was last reviewed for accuracy
	 * and/or completeness.
	 */
	public java.util.Date getLastReviewed() {
		return this.lastReviewed;
	}

	/**
	 * Date on which the content on this web page was last reviewed for accuracy
	 * and/or completeness.
	 */
	public void setLastReviewed(java.util.Date lastReviewed) {
		this.lastReviewed = lastReviewed;
	}

	/**
	 * Indicates if this web page element is the main subject of the page.
	 */
	public WebPageElement getMainContentOfPage() {
		return this.mainContentOfPage;
	}

	/**
	 * Indicates if this web page element is the main subject of the page.
	 */
	public void setMainContentOfPage(WebPageElement mainContentOfPage) {
		this.mainContentOfPage = mainContentOfPage;
	}

	/**
	 * Indicates the main image on the page
	 */
	public ImageObject getPrimaryImageOfPage() {
		return this.primaryImageOfPage;
	}

	/**
	 * Indicates the main image on the page
	 */
	public void setPrimaryImageOfPage(ImageObject primaryImageOfPage) {
		this.primaryImageOfPage = primaryImageOfPage;
	}

	/**
	 * A link related to this web page, for example to other related web pages.
	 */
	public org.schema.base.URL getRelatedLink() {
		return this.relatedLink;
	}

	/**
	 * A link related to this web page, for example to other related web pages.
	 */
	public void setRelatedLink(org.schema.base.URL relatedLink) {
		this.relatedLink = relatedLink;
	}

	/**
	 * People or organizations that have reviewed the content on this web page
	 * for accuracy and/or completeness.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getReviewedBy() {
		return this.reviewedBy;
	}

	/**
	 * People or organizations that have reviewed the content on this web page
	 * for accuracy and/or completeness.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setReviewedBy(Object reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	/**
	 * One of the more significant URLs on the page. Typically, these are the
	 * non-navigation links that are clicked on the most. Supercedes <a
	 * href="significantLinks">significantLinks</a>.
	 */
	public org.schema.base.URL getSignificantLink() {
		return this.significantLink;
	}

	/**
	 * One of the more significant URLs on the page. Typically, these are the
	 * non-navigation links that are clicked on the most. Supercedes <a
	 * href="significantLinks">significantLinks</a>.
	 */
	public void setSignificantLink(org.schema.base.URL significantLink) {
		this.significantLink = significantLink;
	}

	/**
	 * One of the domain specialities to which this web page's content applies.
	 */
	public Specialty getSpecialty() {
		return this.specialty;
	}

	/**
	 * One of the domain specialities to which this web page's content applies.
	 */
	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}
}
