package org.schema;

/**
 * 
 * Reference documentation for application programming interfaces (APIs).
 * 
 * @fullPath Thing > CreativeWork > Article > TechArticle > APIReference
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class APIReference extends TechArticle {

	private String assembly;
	private String assemblyVersion;
	private String programmingModel;
	private String targetPlatform;

	/**
	 * Library file name e.g., mscorlib.dll, system.web.dll
	 */
	public String getAssembly() {
		return this.assembly;
	}

	/**
	 * Library file name e.g., mscorlib.dll, system.web.dll
	 */
	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	/**
	 * Associated product/technology version. e.g., .NET Framework 4.5
	 */
	public String getAssemblyVersion() {
		return this.assemblyVersion;
	}

	/**
	 * Associated product/technology version. e.g., .NET Framework 4.5
	 */
	public void setAssemblyVersion(String assemblyVersion) {
		this.assemblyVersion = assemblyVersion;
	}

	/**
	 * Indicates whether API is managed or unmanaged.
	 */
	public String getProgrammingModel() {
		return this.programmingModel;
	}

	/**
	 * Indicates whether API is managed or unmanaged.
	 */
	public void setProgrammingModel(String programmingModel) {
		this.programmingModel = programmingModel;
	}

	/**
	 * Type of app development: phone, Metro style, desktop, XBox, etc.
	 */
	public String getTargetPlatform() {
		return this.targetPlatform;
	}

	/**
	 * Type of app development: phone, Metro style, desktop, XBox, etc.
	 */
	public void setTargetPlatform(String targetPlatform) {
		this.targetPlatform = targetPlatform;
	}
}
