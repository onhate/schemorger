package com.texelz.schemorger.model;

/**
 *
 * Computer programming source code. Example: Full (compile ready) solutions, code snippet samples, scripts, templates.
 * @fullPath Thing > CreativeWork > Code
 *
 * @author Texelz (by Onhate)
 *
 */
public class Code extends CreativeWork {

	private com.texelz.schemorger.definition.Link codeRepository;
	private Thing programmingLanguage;
	private String runtime;
	private String sampleType;
	private SoftwareApplication targetProduct;
	/**
	 * Link to the repository where the un-compiled, human readable code and related code is located (SVN, github, CodePlex)
	 */
	public com.texelz.schemorger.definition.Link getCodeRepository() {
		return this.codeRepository;
	}
	public void setCodeRepository(com.texelz.schemorger.definition.Link codeRepository) {
		this.codeRepository = codeRepository;
	}
	/**
	 * The computer programming language.
	 */
	public Thing getProgrammingLanguage() {
		return this.programmingLanguage;
	}
	public void setProgrammingLanguage(Thing programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	/**
	 * Runtime platform or script interpreter dependencies (Example - Java v1, Python2.3, .Net Framework 3.0)
	 */
	public String getRuntime() {
		return this.runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	/**
	 * Full (compile ready) solution, code snippet, inline code, scripts, template.
	 */
	public String getSampleType() {
		return this.sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	/**
	 * Target Operating System / Product to which the code applies. If applies to several versions, just the product name can be used.
	 */
	public SoftwareApplication getTargetProduct() {
		return this.targetProduct;
	}
	public void setTargetProduct(SoftwareApplication targetProduct) {
		this.targetProduct = targetProduct;
	}
}
