package com.texelz.schemorger.model;

/**
 *
 * A short TV or radio program or a segment/part of a program.
 * @fullPath Thing > CreativeWork > Clip
 *
 * @author Texelz (by Onhate)
 *
 */
public class Clip extends CreativeWork {

	private Integer clipNumber;
	private Episode partOfEpisode;
	private Season partOfSeason;
	private Series partOfSeries;
	private String position;
	private PublicationEvent publication;
	/**
	 * Position of the clip within an ordered group of clips.
	 */
	public Integer getClipNumber() {
		return this.clipNumber;
	}
	public void setClipNumber(Integer clipNumber) {
		this.clipNumber = clipNumber;
	}
	/**
	 * The episode to which this clip belongs.
	 */
	public Episode getPartOfEpisode() {
		return this.partOfEpisode;
	}
	public void setPartOfEpisode(Episode partOfEpisode) {
		this.partOfEpisode = partOfEpisode;
	}
	/**
	 * The season to which this episode belongs.
	 */
	public Season getPartOfSeason() {
		return this.partOfSeason;
	}
	public void setPartOfSeason(Season partOfSeason) {
		this.partOfSeason = partOfSeason;
	}
	/**
	 * The series to which this episode or season belongs. Supercedes <a href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public Series getPartOfSeries() {
		return this.partOfSeries;
	}
	public void setPartOfSeries(Series partOfSeries) {
		this.partOfSeries = partOfSeries;
	}
	/**
	 * Free text to define other than pure numerical ranking of an episode or a season in an ordered list of items (further formatting restrictions may apply within particular user groups).
	 */
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * A publication event associated with the episode, clip or media object.
	 */
	public PublicationEvent getPublication() {
		return this.publication;
	}
	public void setPublication(PublicationEvent publication) {
		this.publication = publication;
	}
}
