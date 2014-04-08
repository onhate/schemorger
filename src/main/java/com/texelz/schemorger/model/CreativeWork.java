package com.texelz.schemorger.model;

<<<<<<< HEAD
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
=======
import javax.xml.datatype.Duration;

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
	private Thing author;
	private String award;
	private Thing citation;
	private Thing comment;
	private Integer commentCount;
	private Place contentLocation;
	private String contentRating;
	private Thing contributor;
	private Thing copyrightHolder;
	private Double copyrightYear;
	private Thing creator;
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
	private Thing provider;
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

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The subject matter of the content.
	 */
	public Thing getAbout() {
		return this.about;
	}
<<<<<<< HEAD
	public void setAbout(Thing about) {
		this.about = about;
	}
	/**
	 * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
=======

	public void setAbout(Thing about) {
		this.about = about;
	}

	/**
	 * Indicates that the resource is compatible with the referenced
	 * accessibility API (<a
	 * href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki
	 * lists possible values</a>).
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getAccessibilityAPI() {
		return this.accessibilityAPI;
	}
<<<<<<< HEAD
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
=======

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
	 * The overall rating, based on a collection of reviews or ratings, of the
	 * item.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public AggregateRating getAggregateRating() {
		return this.aggregateRating;
	}
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A secondary title of the CreativeWork.
	 */
	public String getAlternativeHeadline() {
		return this.alternativeHeadline;
	}
<<<<<<< HEAD
	public void setAlternativeHeadline(String alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}
	/**
	 * The media objects that encode this creative work. This property is a synonym for encodings.
=======

	public void setAlternativeHeadline(String alternativeHeadline) {
		this.alternativeHeadline = alternativeHeadline;
	}

	/**
	 * The media objects that encode this creative work. This property is a
	 * synonym for encodings.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public MediaObject getAssociatedMedia() {
		return this.associatedMedia;
	}
<<<<<<< HEAD
	public void setAssociatedMedia(MediaObject associatedMedia) {
		this.associatedMedia = associatedMedia;
	}
	/**
	 * The intended audience of the item, i.e. the group for whom the item was created.
=======

	public void setAssociatedMedia(MediaObject associatedMedia) {
		this.associatedMedia = associatedMedia;
	}

	/**
	 * The intended audience of the item, i.e. the group for whom the item was
	 * created.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Audience getAudience() {
		return this.audience;
	}
<<<<<<< HEAD
	public void setAudience(Audience audience) {
		this.audience = audience;
	}
=======

	public void setAudience(Audience audience) {
		this.audience = audience;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * An embedded audio object.
	 */
	public AudioObject getAudio() {
		return this.audio;
	}
<<<<<<< HEAD
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
=======

	public void setAudio(AudioObject audio) {
		this.audio = audio;
	}

	/**
	 * The author of this content. Please note that author is special in that
	 * HTML 5 provides a special mechanism for indicating authorship via the rel
	 * tag. That is equivalent to this and may be used interchangeably.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getAuthor() {
		return this.author;
	}

	public void setAuthor(Thing author) {
		this.author = author;
	}

	/**
	 * An award won by this person or for this creative work. Supercedes <a
	 * href="awards">awards</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getAward() {
		return this.award;
	}
<<<<<<< HEAD
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
=======

	public void setAward(String award) {
		this.award = award;
	}

	/**
	 * A citation or reference to another creative work, such as another
	 * publication, web page, scholarly article, etc. NOTE: Candidate for
	 * promotion to ScholarlyArticle.
	 * 
	 * @see CreativeWork
	 * @see Text
	 */
	public Thing getCitation() {
		return this.citation;
	}

	public void setCitation(Thing citation) {
		this.citation = citation;
	}

	/**
	 * Comments, typically from users, on this CreativeWork.
	 * 
	 * @see UserComments
	 * @see Comment
	 */
	public Thing getComment() {
		return this.comment;
	}

	public void setComment(Thing comment) {
		this.comment = comment;
	}

	/**
	 * The number of comments this CreativeWork (e.g. Article, Question or
	 * Answer) has received. This is most applicable to works published in Web
	 * sites with commenting system; additional comments may exist elsewhere.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Integer getCommentCount() {
		return this.commentCount;
	}
<<<<<<< HEAD
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
=======

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The location of the content.
	 */
	public Place getContentLocation() {
		return this.contentLocation;
	}
<<<<<<< HEAD
	public void setContentLocation(Place contentLocation) {
		this.contentLocation = contentLocation;
	}
=======

	public void setContentLocation(Place contentLocation) {
		this.contentLocation = contentLocation;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Official rating of a piece of content—for example,'MPAA PG-13'.
	 */
	public String getContentRating() {
		return this.contentRating;
	}
<<<<<<< HEAD
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
=======

	public void setContentRating(String contentRating) {
		this.contentRating = contentRating;
	}

	/**
	 * A secondary contributor to the CreativeWork.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getContributor() {
		return this.contributor;
	}

	public void setContributor(Thing contributor) {
		this.contributor = contributor;
	}

	/**
	 * The party holding the legal copyright to the CreativeWork.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getCopyrightHolder() {
		return this.copyrightHolder;
	}

	public void setCopyrightHolder(Thing copyrightHolder) {
		this.copyrightHolder = copyrightHolder;
	}

	/**
	 * The year during which the claimed copyright for the CreativeWork was
	 * first asserted.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Double getCopyrightYear() {
		return this.copyrightYear;
	}
<<<<<<< HEAD
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
=======

	public void setCopyrightYear(Double copyrightYear) {
		this.copyrightYear = copyrightYear;
	}

	/**
	 * The creator/author of this CreativeWork or UserComments. This is the same
	 * as the Author property for CreativeWork.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getCreator() {
		return this.creator;
	}

	public void setCreator(Thing creator) {
		this.creator = creator;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The date on which the CreativeWork was created.
	 */
	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}
<<<<<<< HEAD
	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}
=======

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The date on which the CreativeWork was most recently modified.
	 */
	public java.util.Date getDateModified() {
		return this.dateModified;
	}
<<<<<<< HEAD
	public void setDateModified(java.util.Date dateModified) {
		this.dateModified = dateModified;
	}
=======

	public void setDateModified(java.util.Date dateModified) {
		this.dateModified = dateModified;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Date of first broadcast/publication.
	 */
	public java.util.Date getDatePublished() {
		return this.datePublished;
	}
<<<<<<< HEAD
	public void setDatePublished(java.util.Date datePublished) {
		this.datePublished = datePublished;
	}
=======

	public void setDatePublished(java.util.Date datePublished) {
		this.datePublished = datePublished;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A link to the page containing the comments of the CreativeWork.
	 */
	public com.texelz.schemorger.definition.Link getDiscussionUrl() {
		return this.discussionUrl;
	}
<<<<<<< HEAD
	public void setDiscussionUrl(com.texelz.schemorger.definition.Link discussionUrl) {
		this.discussionUrl = discussionUrl;
	}
=======

	public void setDiscussionUrl(com.texelz.schemorger.definition.Link discussionUrl) {
		this.discussionUrl = discussionUrl;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Specifies the Person who edited the CreativeWork.
	 */
	public Person getEditor() {
		return this.editor;
	}
<<<<<<< HEAD
	public void setEditor(Person editor) {
		this.editor = editor;
	}
=======

	public void setEditor(Person editor) {
		this.editor = editor;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * An alignment to an established educational framework.
	 */
	public AlignmentObject getEducationalAlignment() {
		return this.educationalAlignment;
	}
<<<<<<< HEAD
	public void setEducationalAlignment(AlignmentObject educationalAlignment) {
		this.educationalAlignment = educationalAlignment;
	}
	/**
	 * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
=======

	public void setEducationalAlignment(AlignmentObject educationalAlignment) {
		this.educationalAlignment = educationalAlignment;
	}

	/**
	 * The purpose of a work in the context of education; for example,
	 * 'assignment', 'group work'.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getEducationalUse() {
		return this.educationalUse;
	}
<<<<<<< HEAD
	public void setEducationalUse(String educationalUse) {
		this.educationalUse = educationalUse;
	}
	/**
	 * A media object that encode this CreativeWork. Supercedes <a href="encodings">encodings</a>.
=======

	public void setEducationalUse(String educationalUse) {
		this.educationalUse = educationalUse;
	}

	/**
	 * A media object that encode this CreativeWork. Supercedes <a
	 * href="encodings">encodings</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public MediaObject getEncoding() {
		return this.encoding;
	}
<<<<<<< HEAD
	public void setEncoding(MediaObject encoding) {
		this.encoding = encoding;
	}
=======

	public void setEncoding(MediaObject encoding) {
		this.encoding = encoding;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Genre of the creative work
	 */
	public String getGenre() {
		return this.genre;
	}
<<<<<<< HEAD
	public void setGenre(String genre) {
		this.genre = genre;
	}
=======

	public void setGenre(String genre) {
		this.genre = genre;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Headline of the article
	 */
	public String getHeadline() {
		return this.headline;
	}
<<<<<<< HEAD
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	/**
	 * The language of the content. please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard.</a>
=======

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	/**
	 * The language of the content. please use one of the language codes from
	 * the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard.</a>
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getInLanguage() {
		return this.inLanguage;
	}
<<<<<<< HEAD
	public void setInLanguage(String inLanguage) {
		this.inLanguage = inLanguage;
	}
	/**
	 * A count of a specific user interactions with this item—for example, <code>20 UserLikes</code>, <code>5 UserComments</code>, or <code>300 UserDownloads</code>. The user interaction type should be one of the sub types of <a href="UserInteraction">UserInteraction</a>.
=======

	public void setInLanguage(String inLanguage) {
		this.inLanguage = inLanguage;
	}

	/**
	 * A count of a specific user interactions with this item—for example,
	 * <code>20 UserLikes</code>, <code>5 UserComments</code>, or
	 * <code>300 UserDownloads</code>. The user interaction type should be one
	 * of the sub types of <a href="UserInteraction">UserInteraction</a>.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getInteractionCount() {
		return this.interactionCount;
	}
<<<<<<< HEAD
	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}
	/**
	 * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
=======

	public void setInteractionCount(String interactionCount) {
		this.interactionCount = interactionCount;
	}

	/**
	 * The predominant mode of learning supported by the learning resource.
	 * Acceptable values are 'active', 'expositive', or 'mixed'.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getInteractivityType() {
		return this.interactivityType;
	}
<<<<<<< HEAD
	public void setInteractivityType(String interactivityType) {
		this.interactivityType = interactivityType;
	}
	/**
	 * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html
=======

	public void setInteractivityType(String interactivityType) {
		this.interactivityType = interactivityType;
	}

	/**
	 * A resource that was used in the creation of this resource. This term can
	 * be repeated for multiple sources. For example,
	 * http://example.com/great-multiplication-intro.html
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public com.texelz.schemorger.definition.Link getIsBasedOnUrl() {
		return this.isBasedOnUrl;
	}
<<<<<<< HEAD
	public void setIsBasedOnUrl(com.texelz.schemorger.definition.Link isBasedOnUrl) {
		this.isBasedOnUrl = isBasedOnUrl;
	}
=======

	public void setIsBasedOnUrl(com.texelz.schemorger.definition.Link isBasedOnUrl) {
		this.isBasedOnUrl = isBasedOnUrl;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * Indicates whether this content is family friendly.
	 */
	public Boolean getIsFamilyFriendly() {
		return this.isFamilyFriendly;
	}
<<<<<<< HEAD
	public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}
=======

	public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The keywords/tags used to describe this content.
	 */
	public String getKeywords() {
		return this.keywords;
	}
<<<<<<< HEAD
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
=======

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	/**
	 * The predominant type or kind characterizing the learning resource. For
	 * example, 'presentation', 'handout'.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public String getLearningResourceType() {
		return this.learningResourceType;
	}
<<<<<<< HEAD
	public void setLearningResourceType(String learningResourceType) {
		this.learningResourceType = learningResourceType;
	}
	/**
	 * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
=======

	public void setLearningResourceType(String learningResourceType) {
		this.learningResourceType = learningResourceType;
	}

	/**
	 * Indicates that the CreativeWork contains a reference to, but is not
	 * necessarily about a concept.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Thing getMentions() {
		return this.mentions;
	}
<<<<<<< HEAD
	public void setMentions(Thing mentions) {
		this.mentions = mentions;
	}
	/**
	 * An offer to sell this item—for example, an offer to sell a product, the DVD of a movie, or tickets to an event.
=======

	public void setMentions(Thing mentions) {
		this.mentions = mentions;
	}

	/**
	 * An offer to sell this item—for example, an offer to sell a product, the
	 * DVD of a movie, or tickets to an event.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Offer getOffers() {
		return this.offers;
	}
<<<<<<< HEAD
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
=======

	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	/**
	 * The organization or agency that is providing the service.
	 * 
	 * @see Person
	 * @see Organization
	 */
	public Thing getProvider() {
		return this.provider;
	}

	public void setProvider(Thing provider) {
		this.provider = provider;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The publisher of the creative work.
	 */
	public Organization getPublisher() {
		return this.publisher;
	}
<<<<<<< HEAD
	public void setPublisher(Organization publisher) {
		this.publisher = publisher;
	}
	/**
	 * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
=======

	public void setPublisher(Organization publisher) {
		this.publisher = publisher;
	}

	/**
	 * Link to page describing the editorial principles of the organization
	 * primarily responsible for the creation of the CreativeWork.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public com.texelz.schemorger.definition.Link getPublishingPrinciples() {
		return this.publishingPrinciples;
	}
<<<<<<< HEAD
	public void setPublishingPrinciples(com.texelz.schemorger.definition.Link publishingPrinciples) {
		this.publishingPrinciples = publishingPrinciples;
	}
=======

	public void setPublishingPrinciples(com.texelz.schemorger.definition.Link publishingPrinciples) {
		this.publishingPrinciples = publishingPrinciples;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A review of the item. Supercedes <a href="reviews">reviews</a>.
	 */
	public Review getReview() {
		return this.review;
	}
<<<<<<< HEAD
	public void setReview(Review review) {
		this.review = review;
	}
=======

	public void setReview(Review review) {
		this.review = review;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The Organization on whose behalf the creator was working.
	 */
	public Organization getSourceOrganization() {
		return this.sourceOrganization;
	}
<<<<<<< HEAD
	public void setSourceOrganization(Organization sourceOrganization) {
		this.sourceOrganization = sourceOrganization;
	}
=======

	public void setSourceOrganization(Organization sourceOrganization) {
		this.sourceOrganization = sourceOrganization;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The textual content of this CreativeWork.
	 */
	public String getText() {
		return this.text;
	}
<<<<<<< HEAD
	public void setText(String text) {
		this.text = text;
	}
=======

	public void setText(String text) {
		this.text = text;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * A thumbnail image relevant to the Thing.
	 */
	public com.texelz.schemorger.definition.Link getThumbnailUrl() {
		return this.thumbnailUrl;
	}
<<<<<<< HEAD
	public void setThumbnailUrl(com.texelz.schemorger.definition.Link thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	/**
	 * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
=======

	public void setThumbnailUrl(com.texelz.schemorger.definition.Link thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	/**
	 * Approximate or typical time it takes to work with or through this
	 * learning resource for the typical intended target audience, e.g. 'P30M',
	 * 'P1H25M'.
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	 */
	public Duration getTimeRequired() {
		return this.timeRequired;
	}
<<<<<<< HEAD
	public void setTimeRequired(Duration timeRequired) {
		this.timeRequired = timeRequired;
	}
=======

	public void setTimeRequired(Duration timeRequired) {
		this.timeRequired = timeRequired;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The typical expected age range, e.g. '7-9', '11-'.
	 */
	public String getTypicalAgeRange() {
		return this.typicalAgeRange;
	}
<<<<<<< HEAD
	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}
=======

	public void setTypicalAgeRange(String typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The version of the CreativeWork embodied by a specified resource.
	 */
	public Double getVersion() {
		return this.version;
	}
<<<<<<< HEAD
	public void setVersion(Double version) {
		this.version = version;
	}
=======

	public void setVersion(Double version) {
		this.version = version;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * An embedded video object.
	 */
	public VideoObject getVideo() {
		return this.video;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	public void setVideo(VideoObject video) {
		this.video = video;
	}
}
