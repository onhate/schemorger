package com.texelz.schemorger.model;

/**
 *
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
 * @fullPath Thing > CreativeWork
 *
 * @author Texelz (by Onhate)
 *
 */
public class CreativeWork extends Thing {

	private Thing about;
	private String accessibilityAPI;
	private String accessibilityControl;
	private String accessibilityFeature;
	private String accessibilityHazard;
	private Person accountablePerson;
	private AggregateRating aggregateRating;
	private String alternativeHeadline;
	private MediaObject associatedMedia;
	private Audience audience;
	private AudioObject audio;
	private Object author;
	private String award;
	private Object citation;
	private Object comment;
	private Integer commentCount;
	private Place contentLocation;
	private String contentRating;
	private Object contributor;
	private Object copyrightHolder;
	private Double copyrightYear;
	private Object creator;
	private java.util.Date dateCreated;
	private java.util.Date dateModified;
	private java.util.Date datePublished;
	private com.texelz.schemorger.definition.Link discussionUrl;
	private Person editor;
	private AlignmentObject educationalAlignment;
	private String educationalUse;
	private MediaObject encoding;
	private String genre;
	private String headline;
	private String inLanguage;
	private String interactionCount;
	private String interactivityType;
	private com.texelz.schemorger.definition.Link isBasedOnUrl;
	private Boolean isFamilyFriendly;
	private String keywords;
	private String learningResourceType;
	private Thing mentions;
	private Offer offers;
	private Object provider;
	private Organization publisher;
	private com.texelz.schemorger.definition.Link publishingPrinciples;
	private Review review;
	private Organization sourceOrganization;
	private String text;
	private com.texelz.schemorger.definition.Link thumbnailUrl;
	private Duration timeRequired;
	private String typicalAgeRange;
	private Double version;
	private VideoObject video;
	/**
	 * The subject matter of the content.
	 */
	public Thing getAbout() {
		return this.about;
	}
	public void setAbout(Thing about) {
		this.about = about;
	}
	/**
	 * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 */
	public String getAccessibilityAPI() {
		return this.accessibilityAPI;
	}
	public void setAccessibilityAPI(String accessibilityAPI) {
		this.accessibilityAPI = accessibilityAPI;
	}
	/**
	 * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 */
	public String getAccessibilityControl() {
		return this.accessibilityControl;
	}
	public void setAccessibilityControl(String accessibilityControl) {
		this.accessibilityControl = accessibilityControl;
	}
	/**
	 * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
	 */
	public String getAccessibilityFeature() {
		return this.accessibilityFeature;
	}
	public void setAccessibilityFeature(String accessibilityFeature) {
		this.accessibilityFeature = accessibilityFeature;
	}
	/**
	 * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3. (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>)
	 */
	public String getAccessibilityHazard() {
		return this.accessibilityHazard;
	}
	public void setAccessibilityHazard(String accessibilityHazard) {
		this.accessibilityHazard = accessibilityHazard;
	}
	/**
	 * Specifies the Person that is legally accountable for the CreativeWork.
	 */
	public Person getAccountablePerson() {
		return this.accountablePerson;
	}
	public void setAccountablePerson(Person accountablePerson) {
		this.accountablePerson = accountablePerson;
	}
	/**
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
	/**
	 * A secondary title of the CreativeWork.
	 */
	public String getAlternativeHeadline() {
		return this.alternativeHeadline;
	}
	public void setAlternativeHeadline(String alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}
	/**
	 * The media objects that encode this creative work. This property is a synonym for encodings.
	 */
	public MediaObject getAssociatedMedia() {
		return this.associatedMedia;
	}
	public void setAssociatedMedia(MediaObject associatedMedia) {
		this.associatedMedia = associatedMedia;
	}
	/**
	 * The intended audience of the item, i.e. the group for whom the item was created.
	 */
	public Audience getAudience() {
		return this.audience;
	}
	public void setAudience(Audience audience) {
		this.audience = audience;
	}
	/**
	 * An embedded audio object.
	 */
	public AudioObject getAudio() {
		return this.audio;
	}
	public void setAudio(AudioObject audio) {
		this.audio = audio;
	}
	/**
	 * The author of this content. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
	 * @see Person
	 * @see Organization
	 */
	public Object getAuthor() {
		return this.author;
	}
	public void setAuthor(Object author) {
		this.author = author;
	}
	/**
	 * An award won by this person or for this creative work. Supercedes <a href="awards">awards</a>.
	 */
	public String getAward() {
		return this.award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	/**
	 * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc. NOTE: Candidate for promotion to ScholarlyArticle.
	 * @see CreativeWork
	 * @see Text
	 */
	public Object getCitation() {
		return this.citation;
	}
	public void setCitation(Object citation) {
		this.citation = citation;
	}
	/**
	 * Comments, typically from users, on this CreativeWork.
	 * @see Comment
	 * @see UserComments
	 */
	public Object getComment() {
		return this.comment;
	}
	public void setComment(Object comment) {
		this.comment = comment;
	}
	/**
	 * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
	 */
	public Integer getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	/**
	 * The location of the content.
	 */
	public Place getContentLocation() {
		return this.contentLocation;
	}
	public void setContentLocation(Place contentLocation) {
		this.contentLocation = contentLocation;
	}
	/**
	 * Official rating of a piece of content—for example,'MPAA PG-13'.
	 */
	public String getContentRating() {
		return this.contentRating;
	}
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}
	/**
	 * A secondary contributor to the CreativeWork.
	 * @see Person
	 * @see Organization
	 */
	public Object getContributor() {
		return this.contributor;
	}
	public void setContributor(Object contributor) {
		this.contributor = contributor;
	}
	/**
	 * The party holding the legal copyright to the CreativeWork.
	 * @see Person
	 * @see Organization
	 */
	public Object getCopyrightHolder() {
		return this.copyrightHolder;
	}
	public void setCopyrightHolder(Object copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}
	/**
	 * The year during which the claimed copyright for the CreativeWork was first asserted.
	 */
	public Double getCopyrightYear() {
		return this.copyrightYear;
	}
	public void setCopyrightYear(Double copyrightYear) {
		this.copyrightYear = copyrightYear;
	}
	/**
	 * The creator/author of this CreativeWork or UserComments. This is the same as the Author property for CreativeWork.
	 * @see Person
	 * @see Organization
	 */
	public Object getCreator() {
		return this.creator;
	}
	public void setCreator(Object creator) {
		this.creator = creator;
	}
	/**
	 * The date on which the CreativeWork was created.
	 */
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	/**
	 * The date on which the CreativeWork was most recently modified.
	 */
	public java.util.Date getDateModified() {
		return this.dateModified;
	}
	public void setDateModified(java.util.Date dateModified) {
		this.dateModified = dateModified;
	}
	/**
	 * Date of first broadcast/publication.
	 */
	public java.util.Date getDatePublished() {
		return this.datePublished;
	}
	public void setDatePublished(java.util.Date datePublished) {
		this.datePublished = datePublished;
	}
	/**
	 * A link to the page containing the comments of the CreativeWork.
	 */
	public com.texelz.schemorger.definition.Link getDiscussionUrl() {
		return this.discussionUrl;
	}
	public void setDiscussionUrl(com.texelz.schemorger.definition.Link discussionUrl) {
		this.discussionUrl = discussionUrl;
	}
	/**
	 * Specifies the Person who edited the CreativeWork.
	 */
	public Person getEditor() {
		return this.editor;
	}
	public void setEditor(Person editor) {
		this.editor = editor;
	}
	/**
	 * An alignment to an established educational framework.
	 */
	public AlignmentObject getEducationalAlignment() {
		return this.educationalAlignment;
	}
	public void setEducationalAlignment(AlignmentObject educationalAlignment) {
		this.educationalAlignment = educationalAlignment;
	}
	/**
	 * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
	 */
	public String getEducationalUse() {
		return this.educationalUse;
	}
	public void setEducationalUse(String educationalUse) {
		this.educationalUse = educationalUse;
	}
	/**
	 * A media object that encode this CreativeWork. Supercedes <a href="encodings">encodings</a>.
	 */
	public MediaObject getEncoding() {
		return this.encoding;
	}
	public void setEncoding(MediaObject encoding) {
		this.encoding = encoding;
	}
	/**
	 * Genre of the creative work
	 */
	public String getGenre() {
		return this.genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * Headline of the article
	 */
	public String getHeadline() {
		return this.headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	/**
	 * The language of the content. please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard.</a>
	 */
	public String getInLanguage() {
		return this.inLanguage;
	}
	public void setInLanguage(String inLanguage) {
		this.inLanguage = inLanguage;
	}
	/**
	 * A count of a specific user interactions with this item—for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href="UserInteraction">UserInteraction</a>.
	 */
	public String getInteractionCount() {
		return this.interactionCount;
	}
	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}
	/**
	 * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
	 */
	public String getInteractivityType() {
		return this.interactivityType;
	}
	public void setInteractivityType(String interactivityType) {
		this.interactivityType = interactivityType;
	}
	/**
	 * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html
	 */
	public com.texelz.schemorger.definition.Link getIsBasedOnUrl() {
		return this.isBasedOnUrl;
	}
	public void setIsBasedOnUrl(com.texelz.schemorger.definition.Link isBasedOnUrl) {
		this.isBasedOnUrl = isBasedOnUrl;
	}
	/**
	 * Indicates whether this content is family friendly.
	 */
	public Boolean getIsFamilyFriendly() {
		return this.isFamilyFriendly;
	}
	public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}
	/**
	 * The keywords/tags used to describe this content.
	 */
	public String getKeywords() {
		return this.keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
	 */
	public String getLearningResourceType() {
		return this.learningResourceType;
	}
	public void setLearningResourceType(String learningResourceType) {
		this.learningResourceType = learningResourceType;
	}
	/**
	 * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
	 */
	public Thing getMentions() {
		return this.mentions;
	}
	public void setMentions(Thing mentions) {
		this.mentions = mentions;
	}
	/**
	 * An offer to sell this item—for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
	 */
	public Offer getOffers() {
		return this.offers;
	}
	public void setOffers(Offer offers) {
		this.offers = offers;
	}
	/**
	 * The organization or agency that is providing the service.
	 * @see Person
	 * @see Organization
	 */
	public Object getProvider() {
		return this.provider;
	}
	public void setProvider(Object provider) {
		this.provider = provider;
	}
	/**
	 * The publisher of the creative work.
	 */
	public Organization getPublisher() {
		return this.publisher;
	}
	public void setPublisher(Organization publisher) {
		this.publisher = publisher;
	}
	/**
	 * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
	 */
	public com.texelz.schemorger.definition.Link getPublishingPrinciples() {
		return this.publishingPrinciples;
	}
	public void setPublishingPrinciples(com.texelz.schemorger.definition.Link publishingPrinciples) {
		this.publishingPrinciples = publishingPrinciples;
	}
	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	/**
	 * The Organization on whose behalf the creator was working.
	 */
	public Organization getSourceOrganization() {
		return this.sourceOrganization;
	}
	public void setSourceOrganization(Organization sourceOrganization) {
		this.sourceOrganization = sourceOrganization;
	}
	/**
	 * The textual content of this CreativeWork.
	 */
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * A thumbnail image relevant to the Thing.
	 */
	public com.texelz.schemorger.definition.Link getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(com.texelz.schemorger.definition.Link thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	/**
	 * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
	 */
	public Duration getTimeRequired() {
		return this.timeRequired;
	}
	public void setTimeRequired(Duration timeRequired) {
		this.timeRequired = timeRequired;
	}
	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public String getTypicalAgeRange() {
		return this.typicalAgeRange;
	}
	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}
	/**
	 * The version of the CreativeWork embodied by a specified resource.
	 */
	public Double getVersion() {
		return this.version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	/**
	 * An embedded video object.
	 */
	public VideoObject getVideo() {
		return this.video;
	}
	public void setVideo(VideoObject video) {
		this.video = video;
	}
}
