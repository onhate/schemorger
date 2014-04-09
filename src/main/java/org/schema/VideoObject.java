package org.schema;

/**
 * 
 * A video file.
 * 
 * @fullPath Thing > CreativeWork > MediaObject > VideoObject
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class VideoObject extends MediaObject {

	private String caption;
	private Organization productionCompany;
	private ImageObject thumbnail;
	private String transcript;
	private String videoFrameSize;
	private String videoQuality;

	/**
	 * The caption for this object.
	 */
	public String getCaption() {
		return this.caption;
	}

	/**
	 * The caption for this object.
	 */
	public void setCaption(String caption) {
		this.caption = caption;
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
	 * Thumbnail image for an image or video.
	 */
	public ImageObject getThumbnail() {
		return this.thumbnail;
	}

	/**
	 * Thumbnail image for an image or video.
	 */
	public void setThumbnail(ImageObject thumbnail) {
		this.thumbnail = thumbnail;
	}

	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of
	 * that object.
	 */
	public String getTranscript() {
		return this.transcript;
	}

	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of
	 * that object.
	 */
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}

	/**
	 * The frame size of the video.
	 */
	public String getVideoFrameSize() {
		return this.videoFrameSize;
	}

	/**
	 * The frame size of the video.
	 */
	public void setVideoFrameSize(String videoFrameSize) {
		this.videoFrameSize = videoFrameSize;
	}

	/**
	 * The quality of the video.
	 */
	public String getVideoQuality() {
		return this.videoQuality;
	}

	/**
	 * The quality of the video.
	 */
	public void setVideoQuality(String videoQuality) {
		this.videoQuality = videoQuality;
	}
}
