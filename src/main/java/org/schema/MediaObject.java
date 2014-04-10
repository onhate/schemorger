package org.schema;

/**
 * 
 * An image, video, or audio object embedded in a web page. Note that a creative
 * work may have many media objects associated with it on the same web page. For
 * example, a page about a single song (MusicRecording) may have a music video
 * (VideoObject), and a high and low bandwidth audio stream (2 AudioObject's).
 * 
 * @fullPath Thing > CreativeWork > MediaObject
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MediaObject extends CreativeWork {

	private NewsArticle associatedArticle;
	private String bitrate;
	private String contentSize;
	private org.schema.base.URL contentUrl;
	private Duration duration;
	private org.schema.base.URL embedUrl;
	private CreativeWork encodesCreativeWork;
	private String encodingFormat;
	private java.util.Date expires;
	private Object height;
	private String interactionCount;
	private Offer offers;
	private String playerType;
	private Organization productionCompany;
	private PublicationEvent publication;
	private Place regionsAllowed;
	private Boolean requiresSubscription;
	private java.util.Date uploadDate;
	private Object width;

	/**
	 * A NewsArticle associated with the Media Object.
	 */
	public NewsArticle getAssociatedArticle() {
		return this.associatedArticle;
	}

	/**
	 * A NewsArticle associated with the Media Object.
	 */
	public void setAssociatedArticle(NewsArticle associatedArticle) {
		this.associatedArticle = associatedArticle;
	}

	/**
	 * The bitrate of the media object.
	 */
	public String getBitrate() {
		return this.bitrate;
	}

	/**
	 * The bitrate of the media object.
	 */
	public void setBitrate(String bitrate) {
		this.bitrate = bitrate;
	}

	/**
	 * File size in (mega/kilo) bytes.
	 */
	public String getContentSize() {
		return this.contentSize;
	}

	/**
	 * File size in (mega/kilo) bytes.
	 */
	public void setContentSize(String contentSize) {
		this.contentSize = contentSize;
	}

	/**
	 * Actual bytes of the media object, for example the image file or video
	 * file. (previous spelling: contentURL)
	 */
	public org.schema.base.URL getContentUrl() {
		return this.contentUrl;
	}

	/**
	 * Actual bytes of the media object, for example the image file or video
	 * file. (previous spelling: contentURL)
	 */
	public void setContentUrl(org.schema.base.URL contentUrl) {
		this.contentUrl = contentUrl;
	}

	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public Duration getDuration() {
		return this.duration;
	}

	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	/**
	 * A URL pointing to a player for a specific video. In general, this is the
	 * information in the <code>src</code> element of an <code>embed</code> tag
	 * and should not be the same as the content of the <code>loc</code> tag.
	 * (previous spelling: embedURL)
	 */
	public org.schema.base.URL getEmbedUrl() {
		return this.embedUrl;
	}

	/**
	 * A URL pointing to a player for a specific video. In general, this is the
	 * information in the <code>src</code> element of an <code>embed</code> tag
	 * and should not be the same as the content of the <code>loc</code> tag.
	 * (previous spelling: embedURL)
	 */
	public void setEmbedUrl(org.schema.base.URL embedUrl) {
		this.embedUrl = embedUrl;
	}

	/**
	 * The creative work encoded by this media object
	 */
	public CreativeWork getEncodesCreativeWork() {
		return this.encodesCreativeWork;
	}

	/**
	 * The creative work encoded by this media object
	 */
	public void setEncodesCreativeWork(CreativeWork encodesCreativeWork) {
		this.encodesCreativeWork = encodesCreativeWork;
	}

	/**
	 * mp3, mpeg4, etc.
	 */
	public String getEncodingFormat() {
		return this.encodingFormat;
	}

	/**
	 * mp3, mpeg4, etc.
	 */
	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	/**
	 * Date the content expires and is no longer useful or available. Useful for
	 * videos.
	 */
	public java.util.Date getExpires() {
		return this.expires;
	}

	/**
	 * Date the content expires and is no longer useful or available. Useful for
	 * videos.
	 */
	public void setExpires(java.util.Date expires) {
		this.expires = expires;
	}

	/**
	 * The height of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getHeight() {
		return this.height;
	}

	/**
	 * The height of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public void setHeight(Object height) {
		this.height = height;
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
	 * Player type required—for example, Flash or Silverlight.
	 */
	public String getPlayerType() {
		return this.playerType;
	}

	/**
	 * Player type required—for example, Flash or Silverlight.
	 */
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	/**
	 * The production company or studio that made the movie, tv/radio series,
	 * season, or episode, or media object.
	 */
	public Organization getProductionCompany() {
		return this.productionCompany;
	}

	/**
	 * The production company or studio that made the movie, tv/radio series,
	 * season, or episode, or media object.
	 */
	public void setProductionCompany(Organization productionCompany) {
		this.productionCompany = productionCompany;
	}

	/**
	 * A publication event associated with the episode, clip or media object.
	 */
	public PublicationEvent getPublication() {
		return this.publication;
	}

	/**
	 * A publication event associated with the episode, clip or media object.
	 */
	public void setPublication(PublicationEvent publication) {
		this.publication = publication;
	}

	/**
	 * The regions where the media is allowed. If not specified, then it's
	 * assumed to be allowed everywhere. Specify the countries in <a
	 * href="http://en.wikipedia.org/wiki/ISO_3166">ISO 3166 format</a>.
	 */
	public Place getRegionsAllowed() {
		return this.regionsAllowed;
	}

	/**
	 * The regions where the media is allowed. If not specified, then it's
	 * assumed to be allowed everywhere. Specify the countries in <a
	 * href="http://en.wikipedia.org/wiki/ISO_3166">ISO 3166 format</a>.
	 */
	public void setRegionsAllowed(Place regionsAllowed) {
		this.regionsAllowed = regionsAllowed;
	}

	/**
	 * Indicates if use of the media require a subscription (either paid or
	 * free). Allowed values are <code>true</code> or <code>false</code> (note
	 * that an earlier version had 'yes', 'no').
	 */
	public Boolean getRequiresSubscription() {
		return this.requiresSubscription;
	}

	/**
	 * Indicates if use of the media require a subscription (either paid or
	 * free). Allowed values are <code>true</code> or <code>false</code> (note
	 * that an earlier version had 'yes', 'no').
	 */
	public void setRequiresSubscription(Boolean requiresSubscription) {
		this.requiresSubscription = requiresSubscription;
	}

	/**
	 * Date when this media object was uploaded to this site.
	 */
	public java.util.Date getUploadDate() {
		return this.uploadDate;
	}

	/**
	 * Date when this media object was uploaded to this site.
	 */
	public void setUploadDate(java.util.Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	/**
	 * The width of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public Object getWidth() {
		return this.width;
	}

	/**
	 * The width of the item.
	 * 
	 * @see Distance
	 * @see QuantitativeValue
	 */
	public void setWidth(Object width) {
		this.width = width;
	}
}
