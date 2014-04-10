package org.schema;

/**
 * 
 * A software application.
 * 
 * @fullPath Thing > CreativeWork > SoftwareApplication
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class SoftwareApplication extends CreativeWork {

	private Object applicationCategory;
	private Object applicationSubCategory;
	private String applicationSuite;
	private String countriesNotSupported;
	private String countriesSupported;
	private String device;
	private org.schema.base.URL downloadUrl;
	private Object featureList;
	private String fileFormat;
	private Integer fileSize;
	private org.schema.base.URL installUrl;
	private Object memoryRequirements;
	private String operatingSystem;
	private String permissions;
	private String processorRequirements;
	private Object releaseNotes;
	private Object requirements;
	private Object screenshot;
	private String softwareVersion;
	private Object storageRequirements;

	/**
	 * Type of software application, e.g. &quot;Game, Multimedia&quot;.
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getApplicationCategory() {
		return this.applicationCategory;
	}

	/**
	 * Type of software application, e.g. &quot;Game, Multimedia&quot;.
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setApplicationCategory(Object applicationCategory) {
		this.applicationCategory = applicationCategory;
	}

	/**
	 * Subcategory of the application, e.g. &quot;Arcade Game&quot;.
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getApplicationSubCategory() {
		return this.applicationSubCategory;
	}

	/**
	 * Subcategory of the application, e.g. &quot;Arcade Game&quot;.
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setApplicationSubCategory(Object applicationSubCategory) {
		this.applicationSubCategory = applicationSubCategory;
	}

	/**
	 * The name of the application suite to which the application belongs (e.g.
	 * Excel belongs to Office)
	 */
	public String getApplicationSuite() {
		return this.applicationSuite;
	}

	/**
	 * The name of the application suite to which the application belongs (e.g.
	 * Excel belongs to Office)
	 */
	public void setApplicationSuite(String applicationSuite) {
		this.applicationSuite = applicationSuite;
	}

	/**
	 * Countries for which the application is not supported. You can also
	 * provide the two-letter ISO 3166-1 alpha-2 country code.
	 */
	public String getCountriesNotSupported() {
		return this.countriesNotSupported;
	}

	/**
	 * Countries for which the application is not supported. You can also
	 * provide the two-letter ISO 3166-1 alpha-2 country code.
	 */
	public void setCountriesNotSupported(String countriesNotSupported) {
		this.countriesNotSupported = countriesNotSupported;
	}

	/**
	 * Countries for which the application is supported. You can also provide
	 * the two-letter ISO 3166-1 alpha-2 country code.
	 */
	public String getCountriesSupported() {
		return this.countriesSupported;
	}

	/**
	 * Countries for which the application is supported. You can also provide
	 * the two-letter ISO 3166-1 alpha-2 country code.
	 */
	public void setCountriesSupported(String countriesSupported) {
		this.countriesSupported = countriesSupported;
	}

	/**
	 * Device required to run the application. Used in cases where a specific
	 * make/model is required to run the application.
	 */
	public String getDevice() {
		return this.device;
	}

	/**
	 * Device required to run the application. Used in cases where a specific
	 * make/model is required to run the application.
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * If the file can be downloaded, URL to download the binary.
	 */
	public org.schema.base.URL getDownloadUrl() {
		return this.downloadUrl;
	}

	/**
	 * If the file can be downloaded, URL to download the binary.
	 */
	public void setDownloadUrl(org.schema.base.URL downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * Features or modules provided by this application (and possibly required
	 * by other applications).
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getFeatureList() {
		return this.featureList;
	}

	/**
	 * Features or modules provided by this application (and possibly required
	 * by other applications).
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setFeatureList(Object featureList) {
		this.featureList = featureList;
	}

	/**
	 * MIME format of the binary (e.g. application/zip).
	 */
	public String getFileFormat() {
		return this.fileFormat;
	}

	/**
	 * MIME format of the binary (e.g. application/zip).
	 */
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	/**
	 * Size of the application / package (e.g. 18MB). In the absence of a unit
	 * (MB, KB etc.), KB will be assumed.
	 */
	public Integer getFileSize() {
		return this.fileSize;
	}

	/**
	 * Size of the application / package (e.g. 18MB). In the absence of a unit
	 * (MB, KB etc.), KB will be assumed.
	 */
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * URL at which the app may be installed, if different from the URL of the
	 * item.
	 */
	public org.schema.base.URL getInstallUrl() {
		return this.installUrl;
	}

	/**
	 * URL at which the app may be installed, if different from the URL of the
	 * item.
	 */
	public void setInstallUrl(org.schema.base.URL installUrl) {
		this.installUrl = installUrl;
	}

	/**
	 * Minimum memory requirements.
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getMemoryRequirements() {
		return this.memoryRequirements;
	}

	/**
	 * Minimum memory requirements.
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setMemoryRequirements(Object memoryRequirements) {
		this.memoryRequirements = memoryRequirements;
	}

	/**
	 * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
	 */
	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	/**
	 * Operating systems supported (Windows 7, OSX 10.6, Android 1.6).
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * Permission(s) required to run the app (for example, a mobile app may
	 * require full internet access or may run only on wifi).
	 */
	public String getPermissions() {
		return this.permissions;
	}

	/**
	 * Permission(s) required to run the app (for example, a mobile app may
	 * require full internet access or may run only on wifi).
	 */
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	/**
	 * Processor architecture required to run the application (e.g. IA64).
	 */
	public String getProcessorRequirements() {
		return this.processorRequirements;
	}

	/**
	 * Processor architecture required to run the application (e.g. IA64).
	 */
	public void setProcessorRequirements(String processorRequirements) {
		this.processorRequirements = processorRequirements;
	}

	/**
	 * Description of what changed in this version.
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getReleaseNotes() {
		return this.releaseNotes;
	}

	/**
	 * Description of what changed in this version.
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setReleaseNotes(Object releaseNotes) {
		this.releaseNotes = releaseNotes;
	}

	/**
	 * Component dependency requirements for application. This includes runtime
	 * environments and shared libraries that are not included in the
	 * application distribution package, but required to run the application
	 * (Examples: DirectX, Java or .NET runtime).
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getRequirements() {
		return this.requirements;
	}

	/**
	 * Component dependency requirements for application. This includes runtime
	 * environments and shared libraries that are not included in the
	 * application distribution package, but required to run the application
	 * (Examples: DirectX, Java or .NET runtime).
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setRequirements(Object requirements) {
		this.requirements = requirements;
	}

	/**
	 * A link to a screenshot image of the app.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public Object getScreenshot() {
		return this.screenshot;
	}

	/**
	 * A link to a screenshot image of the app.
	 * 
	 * @see ImageObject
	 * @see URL
	 */
	public void setScreenshot(Object screenshot) {
		this.screenshot = screenshot;
	}

	/**
	 * Version of the software instance.
	 */
	public String getSoftwareVersion() {
		return this.softwareVersion;
	}

	/**
	 * Version of the software instance.
	 */
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * Storage requirements (free space required).
	 * 
	 * @see URL
	 * @see Text
	 */
	public Object getStorageRequirements() {
		return this.storageRequirements;
	}

	/**
	 * Storage requirements (free space required).
	 * 
	 * @see URL
	 * @see Text
	 */
	public void setStorageRequirements(Object storageRequirements) {
		this.storageRequirements = storageRequirements;
	}
}
