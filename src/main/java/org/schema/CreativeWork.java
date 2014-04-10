package org.schema;

/**
 * 
 * The most generic kind of creative work, including books, movies, photographs,
 * software programs, etc.
 * 
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
	private org.schema.base.URL discussionUrl;
	private Person editor;
	private AlignmentObject educationalAlignment;
	private String educationalUse;
	private MediaObject encoding;
	private String genre;
	private String headline;
	private String inLanguage;
	private String interactionCount;
	private String interactivityType;
	private org.schema.base.URL isBasedOnUrl;
	private Boolean isFamilyFriendly;
	private String keywords;
	private String learningResourceType;
	private Thing mentions;
	private Offer offers;
	private Object provider;
	private Organization publisher;
	private org.schema.base.URL publishingPrinciples;
	private Review review;
	private Organization sourceOrganization;
	private String text;
	private org.schema.base.URL thumbnailUrl;
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

	/**
	 * The subject matter of the content.
	 */
	public void setAbout(Thing about) {
		this.about = about;
	}

	/**
	 * Indicates that the resource is compatible with the referenced
	 * accessibility API (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
	 */
	public String getAccessibilityAPI() {
		return this.accessibilityAPI;
	}

	/**
	 * Indicates that the resource is compatible with the referenced
	 * accessibility API (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
	 */
	public void setAccessibilityAPI(String accessibilityAPI) {
		this.accessibilityAPI = accessibilityAPI;
	}

	/**
	 * Identifies input methods that are sufficient to fully control the
	 * described resource (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
	 */
	public String getAccessibilityControl() {
		return this.accessibilityControl;
	}

	/**
	 * Identifies input methods that are sufficient to fully control the
	 * described resource (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
	 */
	public void setAccessibilityControl(String accessibilityControl) {
		this.accessibilityControl = accessibilityControl;
	}

	/**
	 * Content features of the resource, such as accessible media, alternatives
	 * and supported enhancements for accessibility (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
	 */
	public String getAccessibilityFeature() {
		return this.accessibilityFeature;
	}

	/**
	 * Content features of the resource, such as accessible media, alternatives
	 * and supported enhancements for accessibility (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
	 */
	public void setAccessibilityFeature(String accessibilityFeature) {
		this.accessibilityFeature = accessibilityFeature;
	}

	/**
	 * A characteristic of the described resource that is physiologically
	 * dangerous to some users. Related to WCAG 2.0 guideline 2.3. (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>)
	 */
	public String getAccessibilityHazard() {
		return this.accessibilityHazard;
	}

	/**
	 * A characteristic of the described resource that is physiologically
	 * dangerous to some users. Related to WCAG 2.0 guideline 2.3. (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>)
	 */
	public void setAccessibilityHazard(String accessibilityHazard) {
		this.accessibilityHazard = accessibilityHazard;
	}

	/**
	 * Specifies the Person that is legally accountable for the CreativeWork.
	 */
	public Person getAccountablePerson() {
		return this.accountablePerson;
	}

	/**
	 * Specifies the Person that is legally accountable for the CreativeWork.
	 */
	public void setAccountablePerson(Person accountablePerson) {
		this.accountablePerson = accountablePerson;
	}

	/**
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}

	/**
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
	 */
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	/**
	 * A secondary title of the CreativeWork.
	 */
	public String getAlternativeHeadline() {
		return this.alternativeHeadline;
	}

	/**
	 * A secondary title of the CreativeWork.
	 */
	public void setAlternativeHeadline(String alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}

	/**
	 * The media objects that encode this creative work. This property is a
	 * synonym for encodings.
	 */
	public MediaObject getAssociatedMedia() {
		return this.associatedMedia;
	}

	/**
	 * The media objects that encode this creative work. This property is a
	 * synonym for encodings.
	 */
	public void setAssociatedMedia(MediaObject associatedMedia) {
		this.associatedMedia = associatedMedia;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
	 */
	public Audience getAudience() {
		return this.audience;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
	 */
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	/**
	 * An embedded audio object.
	 */
	public AudioObject getAudio() {
		return this.audio;
	}

	/**
	 * An embedded audio object.
	 */
	public void setAudio(AudioObject audio) {
		this.audio = audio;
	}

	/**
	 * The author of this content. Please note that author is special in that
	 * HTML 5 provides a special mechanism for indicating authorship via the rel
	 * tag. That is equivalent to this and may be used interchangeably.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getAuthor() {
		return this.author;
	}

	/**
	 * The author of this content. Please note that author is special in that
	 * HTML 5 provides a special mechanism for indicating authorship via the rel
	 * tag. That is equivalent to this and may be used interchangeably.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setAuthor(Object author) {
		this.author = author;
	}

	/**
	 * An award won by this person or for this creative work. Supercedes <a
	 * href="awards">awards</a>.
	 */
	public String getAward() {
		return this.award;
	}

	/**
	 * An award won by this person or for this creative work. Supercedes <a
	 * href="awards">awards</a>.
	 */
	public void setAward(String award) {
		this.award = award;
	}

	/**
	 * A citation or reference to another creative work, such as another
	 * publication, web page, scholarly article, etc.
	 * 
	 * @see CreativeWork
	 * @see Text
	 */
	public Object getCitation() {
		return this.citation;
	}

	/**
	 * A citation or reference to another creative work, such as another
	 * publication, web page, scholarly article, etc.
	 * 
	 * @see CreativeWork
	 * @see Text
	 */
	public void setCitation(Object citation) {
		this.citation = citation;
	}

	/**
	 * Comments, typically from users, on this CreativeWork.
	 * 
	 * @see UserComments
	 * @see Comment
	 */
	public Object getComment() {
		return this.comment;
	}

	/**
	 * Comments, typically from users, on this CreativeWork.
	 * 
	 * @see UserComments
	 * @see Comment
	 */
	public void setComment(Object comment) {
		this.comment = comment;
	}

	/**
	 * The number of comments this CreativeWork (e.g. Article, Question or
	 * Answer) has received. This is most applicable to works published in Web
	 * sites with commenting system; additional comments may exist elsewhere.
	 */
	public Integer getCommentCount() {
		return this.commentCount;
	}

	/**
	 * The number of comments this CreativeWork (e.g. Article, Question or
	 * Answer) has received. This is most applicable to works published in Web
	 * sites with commenting system; additional comments may exist elsewhere.
	 */
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	/**
	 * The location of the content.
	 */
	public Place getContentLocation() {
		return this.contentLocation;
	}

	/**
	 * The location of the content.
	 */
	public void setContentLocation(Place contentLocation) {
		this.contentLocation = contentLocation;
	}

	/**
	 * Official rating of a piece of content—for example,'MPAA PG-13'.
	 */
	public String getContentRating() {
		return this.contentRating;
	}

	/**
	 * Official rating of a piece of content—for example,'MPAA PG-13'.
	 */
	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}

	/**
	 * A secondary contributor to the CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getContributor() {
		return this.contributor;
	}

	/**
	 * A secondary contributor to the CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setContributor(Object contributor) {
		this.contributor = contributor;
	}

	/**
	 * The party holding the legal copyright to the CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getCopyrightHolder() {
		return this.copyrightHolder;
	}

	/**
	 * The party holding the legal copyright to the CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setCopyrightHolder(Object copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}

	/**
	 * The year during which the claimed copyright for the CreativeWork was
	 * first asserted.
	 */
	public Double getCopyrightYear() {
		return this.copyrightYear;
	}

	/**
	 * The year during which the claimed copyright for the CreativeWork was
	 * first asserted.
	 */
	public void setCopyrightYear(Double copyrightYear) {
		this.copyrightYear = copyrightYear;
	}

	/**
	 * The creator/author of this CreativeWork or UserComments. This is the same
	 * as the Author property for CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getCreator() {
		return this.creator;
	}

	/**
	 * The creator/author of this CreativeWork or UserComments. This is the same
	 * as the Author property for CreativeWork.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setCreator(Object creator) {
		this.creator = creator;
	}

	/**
	 * The date on which the CreativeWork was created.
	 */
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}

	/**
	 * The date on which the CreativeWork was created.
	 */
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * The date on which the CreativeWork was most recently modified.
	 */
	public java.util.Date getDateModified() {
		return this.dateModified;
	}

	/**
	 * The date on which the CreativeWork was most recently modified.
	 */
	public void setDateModified(java.util.Date dateModified) {
		this.dateModified = dateModified;
	}

	/**
	 * Date of first broadcast/publication.
	 */
	public java.util.Date getDatePublished() {
		return this.datePublished;
	}

	/**
	 * Date of first broadcast/publication.
	 */
	public void setDatePublished(java.util.Date datePublished) {
		this.datePublished = datePublished;
	}

	/**
	 * A link to the page containing the comments of the CreativeWork.
	 */
	public org.schema.base.URL getDiscussionUrl() {
		return this.discussionUrl;
	}

	/**
	 * A link to the page containing the comments of the CreativeWork.
	 */
	public void setDiscussionUrl(org.schema.base.URL discussionUrl) {
		this.discussionUrl = discussionUrl;
	}

	/**
	 * Specifies the Person who edited the CreativeWork.
	 */
	public Person getEditor() {
		return this.editor;
	}

	/**
	 * Specifies the Person who edited the CreativeWork.
	 */
	public void setEditor(Person editor) {
		this.editor = editor;
	}

	/**
	 * An alignment to an established educational framework.
	 */
	public AlignmentObject getEducationalAlignment() {
		return this.educationalAlignment;
	}

	/**
	 * An alignment to an established educational framework.
	 */
	public void setEducationalAlignment(AlignmentObject educationalAlignment) {
		this.educationalAlignment = educationalAlignment;
	}

	/**
	 * The purpose of a work in the context of education; for example,
	 * 'assignment', 'group work'.
	 */
	public String getEducationalUse() {
		return this.educationalUse;
	}

	/**
	 * The purpose of a work in the context of education; for example,
	 * 'assignment', 'group work'.
	 */
	public void setEducationalUse(String educationalUse) {
		this.educationalUse = educationalUse;
	}

	/**
	 * A media object that encode this CreativeWork. Supercedes <a
	 * href="encodings">encodings</a>.
	 */
	public MediaObject getEncoding() {
		return this.encoding;
	}

	/**
	 * A media object that encode this CreativeWork. Supercedes <a
	 * href="encodings">encodings</a>.
	 */
	public void setEncoding(MediaObject encoding) {
		this.encoding = encoding;
	}

	/**
	 * Genre of the creative work
	 */
	public String getGenre() {
		return this.genre;
	}

	/**
	 * Genre of the creative work
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Headline of the article
	 */
	public String getHeadline() {
		return this.headline;
	}

	/**
	 * Headline of the article
	 */
	public void setHeadline(String headline) {
		this.headline = headline;
	}

	/**
	 * The language of the content. please use one of the language codes from
	 * the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard.</a>
	 */
	public String getInLanguage() {
		return this.inLanguage;
	}

	/**
	 * The language of the content. please use one of the language codes from
	 * the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard.</a>
	 */
	public void setInLanguage(String inLanguage) {
		this.inLanguage = inLanguage;
	}

	/**
	 * A count of a specific user interactions with this item—for example,
	 * <code>20 UserLikes</code>, <code>5 UserComments</code>, or
	 * <code>300 UserDownloads</code>. The user interaction type should be one
	 * of the sub types of <a href="UserInteraction">UserInteraction</a>.
	 */
	public String getInteractionCount() {
		return this.interactionCount;
	}

	/**
	 * A count of a specific user interactions with this item—for example,
	 * <code>20 UserLikes</code>, <code>5 UserComments</code>, or
	 * <code>300 UserDownloads</code>. The user interaction type should be one
	 * of the sub types of <a href="UserInteraction">UserInteraction</a>.
	 */
	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}

	/**
	 * The predominant mode of learning supported by the learning resource.
	 * Acceptable values are 'active', 'expositive', or 'mixed'.
	 */
	public String getInteractivityType() {
		return this.interactivityType;
	}

	/**
	 * The predominant mode of learning supported by the learning resource.
	 * Acceptable values are 'active', 'expositive', or 'mixed'.
	 */
	public void setInteractivityType(String interactivityType) {
		this.interactivityType = interactivityType;
	}

	/**
	 * A resource that was used in the creation of this resource. This term can
	 * be repeated for multiple sources. For example,
	 * http://example.com/great-multiplication-intro.html
	 */
	public org.schema.base.URL getIsBasedOnUrl() {
		return this.isBasedOnUrl;
	}

	/**
	 * A resource that was used in the creation of this resource. This term can
	 * be repeated for multiple sources. For example,
	 * http://example.com/great-multiplication-intro.html
	 */
	public void setIsBasedOnUrl(org.schema.base.URL isBasedOnUrl) {
		this.isBasedOnUrl = isBasedOnUrl;
	}

	/**
	 * Indicates whether this content is family friendly.
	 */
	public Boolean getIsFamilyFriendly() {
		return this.isFamilyFriendly;
	}

	/**
	 * Indicates whether this content is family friendly.
	 */
	public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}

	/**
	 * The keywords/tags used to describe this content.
	 */
	public String getKeywords() {
		return this.keywords;
	}

	/**
	 * The keywords/tags used to describe this content.
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * The predominant type or kind characterizing the learning resource. For
	 * example, 'presentation', 'handout'.
	 */
	public String getLearningResourceType() {
		return this.learningResourceType;
	}

	/**
	 * The predominant type or kind characterizing the learning resource. For
	 * example, 'presentation', 'handout'.
	 */
	public void setLearningResourceType(String learningResourceType) {
		this.learningResourceType = learningResourceType;
	}

	/**
	 * Indicates that the CreativeWork contains a reference to, but is not
	 * necessarily about a concept.
	 */
	public Thing getMentions() {
		return this.mentions;
	}

	/**
	 * Indicates that the CreativeWork contains a reference to, but is not
	 * necessarily about a concept.
	 */
	public void setMentions(Thing mentions) {
		this.mentions = mentions;
	}

	/**
	 * An offer to transfer some rights to an item or to provide a service—for
	 * example, an offer to sell tickets to an event, to rent the DVD of a
	 * movie, to stream a TV show over the internet, to repair a motorcycle, or
	 * to loan a book.
	 */
	public Offer getOffers() {
		return this.offers;
	}

	/**
	 * An offer to transfer some rights to an item or to provide a service—for
	 * example, an offer to sell tickets to an event, to rent the DVD of a
	 * movie, to stream a TV show over the internet, to repair a motorcycle, or
	 * to loan a book.
	 */
	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public Object getProvider() {
		return this.provider;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Organization
	 * @see Person
	 */
	public void setProvider(Object provider) {
		this.provider = provider;
	}

	/**
	 * The publisher of the creative work.
	 */
	public Organization getPublisher() {
		return this.publisher;
	}

	/**
	 * The publisher of the creative work.
	 */
	public void setPublisher(Organization publisher) {
		this.publisher = publisher;
	}

	/**
	 * URL to page describing the editorial principles of the organization
	 * primarily responsible for the creation of the CreativeWork.
	 */
	public org.schema.base.URL getPublishingPrinciples() {
		return this.publishingPrinciples;
	}

	/**
	 * URL to page describing the editorial principles of the organization
	 * primarily responsible for the creation of the CreativeWork.
	 */
	public void setPublishingPrinciples(org.schema.base.URL publishingPrinciples) {
		this.publishingPrinciples = publishingPrinciples;
	}

	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}

	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public void setReview(Review review) {
		this.review = review;
	}

	/**
	 * The Organization on whose behalf the creator was working.
	 */
	public Organization getSourceOrganization() {
		return this.sourceOrganization;
	}

	/**
	 * The Organization on whose behalf the creator was working.
	 */
	public void setSourceOrganization(Organization sourceOrganization) {
		this.sourceOrganization = sourceOrganization;
	}

	/**
	 * The textual content of this CreativeWork.
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * The textual content of this CreativeWork.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * A thumbnail image relevant to the Thing.
	 */
	public org.schema.base.URL getThumbnailUrl() {
		return this.thumbnailUrl;
	}

	/**
	 * A thumbnail image relevant to the Thing.
	 */
	public void setThumbnailUrl(org.schema.base.URL thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	/**
	 * Approximate or typical time it takes to work with or through this
	 * learning resource for the typical intended target audience, e.g. 'P30M',
	 * 'P1H25M'.
	 */
	public Duration getTimeRequired() {
		return this.timeRequired;
	}

	/**
	 * Approximate or typical time it takes to work with or through this
	 * learning resource for the typical intended target audience, e.g. 'P30M',
	 * 'P1H25M'.
	 */
	public void setTimeRequired(Duration timeRequired) {
		this.timeRequired = timeRequired;
	}

	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public String getTypicalAgeRange() {
		return this.typicalAgeRange;
	}

	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}

	/**
	 * The version of the CreativeWork embodied by a specified resource.
	 */
	public Double getVersion() {
		return this.version;
	}

	/**
	 * The version of the CreativeWork embodied by a specified resource.
	 */
	public void setVersion(Double version) {
		this.version = version;
	}

	/**
	 * An embedded video object.
	 */
	public VideoObject getVideo() {
		return this.video;
	}

	/**
	 * An embedded video object.
	 */
	public void setVideo(VideoObject video) {
		this.video = video;
	}
}
