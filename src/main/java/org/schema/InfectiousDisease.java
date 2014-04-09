package org.schema;

/**
 * 
 * An infectious disease is a clinically evident human disease resulting from
 * the presence of pathogenic microbial agents, like pathogenic viruses,
 * pathogenic bacteria, fungi, protozoa, multicellular parasites, and prions. To
 * be considered an infectious disease, such pathogens are known to be able to
 * cause this disease.
 * 
 * @fullPath Thing > MedicalEntity > MedicalCondition > InfectiousDisease
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class InfectiousDisease extends MedicalCondition {

	private String infectiousAgent;
	private InfectiousAgentClass infectiousAgentClass;
	private String transmissionMethod;

	/**
	 * The actual infectious agent, such as a specific bacterium.
	 */
	public String getInfectiousAgent() {
		return this.infectiousAgent;
	}

	/**
	 * The actual infectious agent, such as a specific bacterium.
	 */
	public void setInfectiousAgent(String infectiousAgent) {
		this.infectiousAgent = infectiousAgent;
	}

	/**
	 * The class of infectious agent (bacteria, prion, etc.) that causes the
	 * disease.
	 */
	public InfectiousAgentClass getInfectiousAgentClass() {
		return this.infectiousAgentClass;
	}

	/**
	 * The class of infectious agent (bacteria, prion, etc.) that causes the
	 * disease.
	 */
	public void setInfectiousAgentClass(InfectiousAgentClass infectiousAgentClass) {
		this.infectiousAgentClass = infectiousAgentClass;
	}

	/**
	 * How the disease spreads, either as a route or vector, for example 'direct
	 * contact', 'Aedes aegypti', etc.
	 */
	public String getTransmissionMethod() {
		return this.transmissionMethod;
	}

	/**
	 * How the disease spreads, either as a route or vector, for example 'direct
	 * contact', 'Aedes aegypti', etc.
	 */
	public void setTransmissionMethod(String transmissionMethod) {
		this.transmissionMethod = transmissionMethod;
	}
}
