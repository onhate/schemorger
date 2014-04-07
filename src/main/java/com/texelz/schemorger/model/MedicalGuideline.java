package com.texelz.schemorger.model;

/**
 *
 * Any recommendation made by a standard society (e.g. ACC/AHA) or consensus statement that denotes how to diagnose and treat a particular condition. Note: this type should be used to tag the actual guideline recommendation; if the guideline recommendation occurs in a larger scholarly article, use MedicalScholarlyArticle to tag the overall article, not this type. Note also: the organization making the recommendation should be captured in the recognizingAuthority base property of MedicalEntity.
 * @fullPath Thing > MedicalEntity > MedicalGuideline
 *
 * @author Texelz (by Onhate)
 *
 */
public class MedicalGuideline extends MedicalEntity {

	private MedicalEvidenceLevel evidenceLevel;
	private String evidenceOrigin;
	private java.util.Date guidelineDate;
	private MedicalEntity guidelineSubject;
	/**
	 * Strength of evidence of the data used to formulate the guideline (enumerated).
	 */
	public MedicalEvidenceLevel getEvidenceLevel() {
		return this.evidenceLevel;
	}
	public void setEvidenceLevel(MedicalEvidenceLevel evidenceLevel) {
		this.evidenceLevel = evidenceLevel;
	}
	/**
	 * Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc.
	 */
	public String getEvidenceOrigin() {
		return this.evidenceOrigin;
	}
	public void setEvidenceOrigin(String evidenceOrigin) {
		this.evidenceOrigin = evidenceOrigin;
	}
	/**
	 * Date on which this guideline's recommendation was made.
	 */
	public java.util.Date getGuidelineDate() {
		return this.guidelineDate;
	}
	public void setGuidelineDate(java.util.Date guidelineDate) {
		this.guidelineDate = guidelineDate;
	}
	/**
	 * The medical conditions, treatments, etc. that are the subject of the guideline.
	 */
	public MedicalEntity getGuidelineSubject() {
		return this.guidelineSubject;
	}
	public void setGuidelineSubject(MedicalEntity guidelineSubject) {
		this.guidelineSubject = guidelineSubject;
	}
}
