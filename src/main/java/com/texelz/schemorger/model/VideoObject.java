package com.texelz.schemorger.model;

/**
 *
 * A video file.
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
	public void setCaption(String caption) {
		this.caption = caption;
	}
	/**
	 * The production company or studio that made the movie, tv/radio series, season, or episode, or media object.
	 */
	public Organization getProductionCompany() {
		return this.productionCompany;
	}
	public void setProductionCompany(Organization productionCompany) {
		this.productionCompany = productionCompany;
	}
	/**
	 * Thumbnail image for an image or video.
	 */
	public ImageObject getThumbnail() {
		return this.thumbnail;
	}
	public void setThumbnail(ImageObject thumbnail) {
		this.thumbnail = thumbnail;
	}
	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
	 */
	public String getTranscript() {
		return this.transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	/**
	 * The frame size of the video.
	 */
	public String getVideoFrameSize() {
		return this.videoFrameSize;
	}
	public void setVideoFrameSize(String videoFrameSize) {
		this.videoFrameSize = videoFrameSize;
	}
	/**
	 * The quality of the video.
	 */
	public String getVideoQuality() {
		return this.videoQuality;
	}
	public void setVideoQuality(String videoQuality) {
		this.videoQuality = videoQuality;
	}
}
