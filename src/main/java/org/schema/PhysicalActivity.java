package org.schema;

/**
 * 
 * Any bodily activity that enhances or maintains physical fitness and overall
 * health and wellness. Includes activity that is part of daily living and
 * routine, structured exercise, and exercise prescribed as part of a medical
 * treatment or recovery plan.
 * 
 * @fullPath Thing > MedicalEntity > MedicalTherapy > LifestyleModification >
 *           PhysicalActivity
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class PhysicalActivity extends LifestyleModification {

	private Object associatedAnatomy;
	private Object category;
	private String epidemiology;
	private String pathophysiology;

	/**
	 * The anatomy of the underlying organ system or structures associated with
	 * this entity.
	 * 
	 * @see SuperficialAnatomy
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public Object getAssociatedAnatomy() {
		return this.associatedAnatomy;
	}

	/**
	 * The anatomy of the underlying organ system or structures associated with
	 * this entity.
	 * 
	 * @see SuperficialAnatomy
	 * @see AnatomicalSystem
	 * @see AnatomicalStructure
	 */
	public void setAssociatedAnatomy(Object associatedAnatomy) {
		this.associatedAnatomy = associatedAnatomy;
	}

	/**
	 * A category for the item. Greater signs or slashes can be used to
	 * informally indicate a category hierarchy.
	 * 
	 * @see Thing
	 * @see Text
	 * @see PhysicalActivityCategory
	 */
	public Object getCategory() {
		return this.category;
	}

	/**
	 * A category for the item. Greater signs or slashes can be used to
	 * informally indicate a category hierarchy.
	 * 
	 * @see Thing
	 * @see Text
	 * @see PhysicalActivityCategory
	 */
	public void setCategory(Object category) {
		this.category = category;
	}

	/**
	 * The characteristics of associated patients, such as age, gender, race
	 * etc.
	 */
	public String getEpidemiology() {
		return this.epidemiology;
	}

	/**
	 * The characteristics of associated patients, such as age, gender, race
	 * etc.
	 */
	public void setEpidemiology(String epidemiology) {
		this.epidemiology = epidemiology;
	}

	/**
	 * Changes in the normal mechanical, physical, and biochemical functions
	 * that are associated with this activity or condition.
	 */
	public String getPathophysiology() {
		return this.pathophysiology;
	}

	/**
	 * Changes in the normal mechanical, physical, and biochemical functions
	 * that are associated with this activity or condition.
	 */
	public void setPathophysiology(String pathophysiology) {
		this.pathophysiology = pathophysiology;
	}
}
