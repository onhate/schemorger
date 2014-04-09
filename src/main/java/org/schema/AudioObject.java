package org.schema;

/**
 * 
 * An audio file.
 * 
 * @fullPath Thing > CreativeWork > MediaObject > AudioObject
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class AudioObject extends MediaObject {

	private String transcript;

	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of
	 * that object.
	 */
	public String getTranscript() {
		return this.transcript;
	}

	/**
	 * If this MediaObject is an AudioObject or VideoObject, the transcript of
	 * that object.
	 */
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
}
