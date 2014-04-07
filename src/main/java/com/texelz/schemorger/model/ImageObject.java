package com.texelz.schemorger.model;

/**
 *
 * An image file.
 * @fullPath Thing > CreativeWork > MediaObject > ImageObject
 *
 * @author Texelz (by Onhate)
 *
 */
public class ImageObject extends MediaObject {

	private String caption;
	private String exifData;
	private Boolean representativeOfPage;
	private ImageObject thumbnail;
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
	 * exif data for this object.
	 */
	public String getExifData() {
		return this.exifData;
	}
	public void setExifData(String exifData) {
		this.exifData = exifData;
	}
	/**
	 * Indicates whether this image is representative of the content of the page.
	 */
	public Boolean getRepresentativeOfPage() {
		return this.representativeOfPage;
	}
	public void setRepresentativeOfPage(Boolean representativeOfPage) {
		this.representativeOfPage = representativeOfPage;
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
}
