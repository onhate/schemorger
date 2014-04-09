package org.schema;

/**
 * 
 * A short TV or radio program or a segment/part of a program.
 * 
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

	/**
	 * Position of the clip within an ordered group of clips.
	 */
	public void setClipNumber(Integer clipNumber) {
		this.clipNumber = clipNumber;
	}

	/**
	 * The episode to which this clip belongs.
	 */
	public Episode getPartOfEpisode() {
		return this.partOfEpisode;
	}

	/**
	 * The episode to which this clip belongs.
	 */
	public void setPartOfEpisode(Episode partOfEpisode) {
		this.partOfEpisode = partOfEpisode;
	}

	/**
	 * The season to which this episode belongs.
	 */
	public Season getPartOfSeason() {
		return this.partOfSeason;
	}

	/**
	 * The season to which this episode belongs.
	 */
	public void setPartOfSeason(Season partOfSeason) {
		this.partOfSeason = partOfSeason;
	}

	/**
	 * The series to which this episode or season belongs. Supercedes <a
	 * href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public Series getPartOfSeries() {
		return this.partOfSeries;
	}

	/**
	 * The series to which this episode or season belongs. Supercedes <a
	 * href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public void setPartOfSeries(Series partOfSeries) {
		this.partOfSeries = partOfSeries;
	}

	/**
	 * Free text to define other than pure numerical ranking of an episode or a
	 * season in an ordered list of items (further formatting restrictions may
	 * apply within particular user groups).
	 */
	public String getPosition() {
		return this.position;
	}

	/**
	 * Free text to define other than pure numerical ranking of an episode or a
	 * season in an ordered list of items (further formatting restrictions may
	 * apply within particular user groups).
	 */
	public void setPosition(String position) {
		this.position = position;
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
}
