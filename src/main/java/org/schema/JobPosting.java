package org.schema;

/**
 * 
 * A listing that describes a job opening in a certain organization.
 * 
 * @fullPath Thing > Intangible > JobPosting
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class JobPosting extends Intangible {

	private Double baseSalary;
	private String benefits;
	private java.util.Date datePosted;
	private String educationRequirements;
	private String employmentType;
	private String experienceRequirements;
	private Organization hiringOrganization;
	private String incentives;
	private String industry;
	private Place jobLocation;
	private String occupationalCategory;
	private String qualifications;
	private String responsibilities;
	private String salaryCurrency;
	private String skills;
	private String specialCommitments;
	private String title;
	private String workHours;

	/**
	 * The base salary of the job.
	 */
	public Double getBaseSalary() {
		return this.baseSalary;
	}

	/**
	 * The base salary of the job.
	 */
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	/**
	 * Description of benefits associated with the job.
	 */
	public String getBenefits() {
		return this.benefits;
	}

	/**
	 * Description of benefits associated with the job.
	 */
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	/**
	 * Publication date for the job posting.
	 */
	public java.util.Date getDatePosted() {
		return this.datePosted;
	}

	/**
	 * Publication date for the job posting.
	 */
	public void setDatePosted(java.util.Date datePosted) {
		this.datePosted = datePosted;
	}

	/**
	 * Educational background needed for the position.
	 */
	public String getEducationRequirements() {
		return this.educationRequirements;
	}

	/**
	 * Educational background needed for the position.
	 */
	public void setEducationRequirements(String educationRequirements) {
		this.educationRequirements = educationRequirements;
	}

	/**
	 * Type of employment (e.g. full-time, part-time, contract, temporary,
	 * seasonal, internship).
	 */
	public String getEmploymentType() {
		return this.employmentType;
	}

	/**
	 * Type of employment (e.g. full-time, part-time, contract, temporary,
	 * seasonal, internship).
	 */
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	/**
	 * Description of skills and experience needed for the position.
	 */
	public String getExperienceRequirements() {
		return this.experienceRequirements;
	}

	/**
	 * Description of skills and experience needed for the position.
	 */
	public void setExperienceRequirements(String experienceRequirements) {
		this.experienceRequirements = experienceRequirements;
	}

	/**
	 * Organization offering the job position.
	 */
	public Organization getHiringOrganization() {
		return this.hiringOrganization;
	}

	/**
	 * Organization offering the job position.
	 */
	public void setHiringOrganization(Organization hiringOrganization) {
		this.hiringOrganization = hiringOrganization;
	}

	/**
	 * Description of bonus and commission compensation aspects of the job.
	 */
	public String getIncentives() {
		return this.incentives;
	}

	/**
	 * Description of bonus and commission compensation aspects of the job.
	 */
	public void setIncentives(String incentives) {
		this.incentives = incentives;
	}

	/**
	 * The industry associated with the job position.
	 */
	public String getIndustry() {
		return this.industry;
	}

	/**
	 * The industry associated with the job position.
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * A (typically single) geographic location associated with the job
	 * position.
	 */
	public Place getJobLocation() {
		return this.jobLocation;
	}

	/**
	 * A (typically single) geographic location associated with the job
	 * position.
	 */
	public void setJobLocation(Place jobLocation) {
		this.jobLocation = jobLocation;
	}

	/**
	 * Category or categories describing the job. Use BLS O*NET-SOC taxonomy:
	 * http://www.onetcenter.org/taxonomy.html. Ideally includes textual label
	 * and formal code, with the property repeated for each applicable value.
	 */
	public String getOccupationalCategory() {
		return this.occupationalCategory;
	}

	/**
	 * Category or categories describing the job. Use BLS O*NET-SOC taxonomy:
	 * http://www.onetcenter.org/taxonomy.html. Ideally includes textual label
	 * and formal code, with the property repeated for each applicable value.
	 */
	public void setOccupationalCategory(String occupationalCategory) {
		this.occupationalCategory = occupationalCategory;
	}

	/**
	 * Specific qualifications required for this role.
	 */
	public String getQualifications() {
		return this.qualifications;
	}

	/**
	 * Specific qualifications required for this role.
	 */
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	/**
	 * Responsibilities associated with this role.
	 */
	public String getResponsibilities() {
		return this.responsibilities;
	}

	/**
	 * Responsibilities associated with this role.
	 */
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}

	/**
	 * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217
	 * used for the main salary information in this job posting.
	 */
	public String getSalaryCurrency() {
		return this.salaryCurrency;
	}

	/**
	 * The currency (coded using ISO 4217, http://en.wikipedia.org/wiki/ISO_4217
	 * used for the main salary information in this job posting.
	 */
	public void setSalaryCurrency(String salaryCurrency) {
		this.salaryCurrency = salaryCurrency;
	}

	/**
	 * Skills required to fulfill this role.
	 */
	public String getSkills() {
		return this.skills;
	}

	/**
	 * Skills required to fulfill this role.
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * Any special commitments associated with this job posting. Valid entries
	 * include VeteranCommit, MilitarySpouseCommit, etc.
	 */
	public String getSpecialCommitments() {
		return this.specialCommitments;
	}

	/**
	 * Any special commitments associated with this job posting. Valid entries
	 * include VeteranCommit, MilitarySpouseCommit, etc.
	 */
	public void setSpecialCommitments(String specialCommitments) {
		this.specialCommitments = specialCommitments;
	}

	/**
	 * The title of the job.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * The title of the job.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * The typical working hours for this job (e.g. 1st shift, night shift,
	 * 8am-5pm).
	 */
	public String getWorkHours() {
		return this.workHours;
	}

	/**
	 * The typical working hours for this job (e.g. 1st shift, night shift,
	 * 8am-5pm).
	 */
	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}
}
