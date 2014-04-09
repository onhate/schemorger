package org.schema;

/**
 * 
 * A specific dosing schedule for a drug or supplement.
 * 
 * @fullPath Thing > MedicalEntity > MedicalIntangible > DoseSchedule
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class DoseSchedule extends MedicalIntangible {

	private String doseUnit;
	private Double doseValue;
	private String frequency;
	private String targetPopulation;

	/**
	 * The unit of the dose, e.g. 'mg'.
	 */
	public String getDoseUnit() {
		return this.doseUnit;
	}

	/**
	 * The unit of the dose, e.g. 'mg'.
	 */
	public void setDoseUnit(String doseUnit) {
		this.doseUnit = doseUnit;
	}

	/**
	 * The value of the dose, e.g. 500.
	 */
	public Double getDoseValue() {
		return this.doseValue;
	}

	/**
	 * The value of the dose, e.g. 500.
	 */
	public void setDoseValue(Double doseValue) {
		this.doseValue = doseValue;
	}

	/**
	 * How often the dose is taken, e.g. 'daily'.
	 */
	public String getFrequency() {
		return this.frequency;
	}

	/**
	 * How often the dose is taken, e.g. 'daily'.
	 */
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	/**
	 * Characteristics of the population for which this is intended, or which
	 * typically uses it, e.g. 'adults'.
	 */
	public String getTargetPopulation() {
		return this.targetPopulation;
	}

	/**
	 * Characteristics of the population for which this is intended, or which
	 * typically uses it, e.g. 'adults'.
	 */
	public void setTargetPopulation(String targetPopulation) {
		this.targetPopulation = targetPopulation;
	}
}
