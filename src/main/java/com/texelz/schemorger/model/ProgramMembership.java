package com.texelz.schemorger.model;

/**
 *
 * Used to describe membership in a loyalty programs (e.g. &quot;StarAliance&quot;), traveler clubs (e.g. &quot;AAA&quot;), purchase clubs (&quot;Safeway Club&quot;), etc.
 * @fullPath Thing > Intangible > ProgramMembership
 *
 * @author Texelz (by Onhate)
 *
 */
public class ProgramMembership extends Intangible {

	private Organization hostingOrganization;
	private Object member;
	private String membershipNumber;
	private String programName;
	/**
	 * The organization (airline, travelers' club, etc.) the membership is made with.
	 */
	public Organization getHostingOrganization() {
		return this.hostingOrganization;
	}
	public void setHostingOrganization(Organization hostingOrganization) {
		this.hostingOrganization = hostingOrganization;
	}
	/**
	 * A member of this organization. Supercedes <a href="members">members</a>.
	 * @see Person
	 * @see Organization
	 */
	public Object getMember() {
		return this.member;
	}
	public void setMember(Object member) {
		this.member = member;
	}
	/**
	 * A unique identifier for the membership.
	 */
	public String getMembershipNumber() {
		return this.membershipNumber;
	}
	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}
	/**
	 * The program providing the membership.
	 */
	public String getProgramName() {
		return this.programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
}
