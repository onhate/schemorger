package com.texelz.schemorger.model;

/**
 *
 * The act of an agent relocating to a place.
<p>Related actions:</p>
<ul>
 <li><a href="http://schema.org/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.</li>
</ul>
 * @fullPath Thing > Action > MoveAction
 *
 * @author Texelz (by Onhate)
 *
 */
public class MoveAction extends Action {

	private Object fromLocation;
	private Object toLocation;
	/**
	 * A sub property of location. The original location of the object or the agent before the action.
	 * @see Number
	 * @see Place
	 */
	public Object getFromLocation() {
		return this.fromLocation;
	}
	public void setFromLocation(Object fromLocation) {
		this.fromLocation = fromLocation;
	}
	/**
	 * A sub property of location. The final location of the object or the agent after the action.
	 * @see Number
	 * @see Place
	 */
	public Object getToLocation() {
		return this.toLocation;
	}
	public void setToLocation(Object toLocation) {
		this.toLocation = toLocation;
	}
}
