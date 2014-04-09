package org.schema;

/**
 * 
 * An anatomical system is a group of anatomical structures that work together
 * to perform a certain task. Anatomical systems, such as organ systems, are one
 * organizing principle of anatomy, and can includes circulatory, digestive,
 * endocrine, integumentary, immune, lymphatic, muscular, nervous, reproductive,
 * respiratory, skeletal, urinary, vestibular, and other systems.
 * 
 * @fullPath Thing > MedicalEntity > AnatomicalSystem
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AnatomicalSystem extends MedicalEntity {

	private String associatedPathophysiology;
	private Object comprisedOf;
	private MedicalCondition relatedCondition;
	private AnatomicalStructure relatedStructure;
	private MedicalTherapy relatedTherapy;

	/**
	 * If applicable, a description of the pathophysiology associated with the
	 * anatomical system, including potential abnormal changes in the
	 * mechanical, physical, and biochemical functions of the system.
	 */
	public String getAssociatedPathophysiology() {
		return this.associatedPathophysiology;
	}

	/**
	 * If applicable, a description of the pathophysiology associated with the
	 * anatomical system, including potential abnormal changes in the
	 * mechanical, physical, and biochemical functions of the system.
	 */
	public void setAssociatedPathophysiology(String associatedPathophysiology) {
		this.associatedPathophysiology = associatedPathophysiology;
	}

	/**
	 * The underlying anatomical structures, such as organs, that comprise the
	 * anatomical system.
	 * 
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public Object getComprisedOf() {
		return this.comprisedOf;
	}

	/**
	 * The underlying anatomical structures, such as organs, that comprise the
	 * anatomical system.
	 * 
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public void setComprisedOf(Object comprisedOf) {
		this.comprisedOf = comprisedOf;
	}

	/**
	 * A medical condition associated with this anatomy.
	 */
	public MedicalCondition getRelatedCondition() {
		return this.relatedCondition;
	}

	/**
	 * A medical condition associated with this anatomy.
	 */
	public void setRelatedCondition(MedicalCondition relatedCondition) {
		this.relatedCondition = relatedCondition;
	}

	/**
	 * Related anatomical structure(s) that are not part of the system but
	 * relate or connect to it, such as vascular bundles associated with an
	 * organ system.
	 */
	public AnatomicalStructure getRelatedStructure() {
		return this.relatedStructure;
	}

	/**
	 * Related anatomical structure(s) that are not part of the system but
	 * relate or connect to it, such as vascular bundles associated with an
	 * organ system.
	 */
	public void setRelatedStructure(AnatomicalStructure relatedStructure) {
		this.relatedStructure = relatedStructure;
	}

	/**
	 * A medical therapy related to this anatomy.
	 */
	public MedicalTherapy getRelatedTherapy() {
		return this.relatedTherapy;
	}

	/**
	 * A medical therapy related to this anatomy.
	 */
	public void setRelatedTherapy(MedicalTherapy relatedTherapy) {
		this.relatedTherapy = relatedTherapy;
	}
}
