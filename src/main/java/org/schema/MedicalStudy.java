package org.schema;

/**
 * 
 * A medical study is an umbrella type covering all kinds of research studies
 * relating to human medicine or health, including observational studies and
 * interventional trials and registries, randomized, controlled or not. When the
 * specific type of study is known, use one of the extensions of this type, such
 * as MedicalTrial or MedicalObservationalStudy. Also, note that this type
 * should be used to mark up data that describes the study itself; to tag an
 * article that publishes the results of a study, use MedicalScholarlyArticle.
 * Note: use the code property of MedicalEntity to store study IDs, e.g.
 * clinicaltrials.gov ID.
 * 
 * @fullPath Thing > MedicalEntity > MedicalStudy
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MedicalStudy extends MedicalEntity {

	private String outcome;
	private String population;
	private Organization sponsor;
	private MedicalStudyStatus status;
	private AdministrativeArea studyLocation;
	private MedicalEntity studySubject;

	/**
	 * Expected or actual outcomes of the study.
	 */
	public String getOutcome() {
		return this.outcome;
	}

	/**
	 * Expected or actual outcomes of the study.
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	/**
	 * Any characteristics of the population used in the study, e.g. 'males
	 * under 65'.
	 */
	public String getPopulation() {
		return this.population;
	}

	/**
	 * Any characteristics of the population used in the study, e.g. 'males
	 * under 65'.
	 */
	public void setPopulation(String population) {
		this.population = population;
	}

	/**
	 * Sponsor of the study.
	 */
	public Organization getSponsor() {
		return this.sponsor;
	}

	/**
	 * Sponsor of the study.
	 */
	public void setSponsor(Organization sponsor) {
		this.sponsor = sponsor;
	}

	/**
	 * The status of the study (enumerated).
	 */
	public MedicalStudyStatus getStatus() {
		return this.status;
	}

	/**
	 * The status of the study (enumerated).
	 */
	public void setStatus(MedicalStudyStatus status) {
		this.status = status;
	}

	/**
	 * The location in which the study is taking/took place.
	 */
	public AdministrativeArea getStudyLocation() {
		return this.studyLocation;
	}

	/**
	 * The location in which the study is taking/took place.
	 */
	public void setStudyLocation(AdministrativeArea studyLocation) {
		this.studyLocation = studyLocation;
	}

	/**
	 * A subject of the study, i.e. one of the medical conditions, therapies,
	 * devices, drugs, etc. investigated by the study.
	 */
	public MedicalEntity getStudySubject() {
		return this.studySubject;
	}

	/**
	 * A subject of the study, i.e. one of the medical conditions, therapies,
	 * devices, drugs, etc. investigated by the study.
	 */
	public void setStudySubject(MedicalEntity studySubject) {
		this.studySubject = studySubject;
	}
}
