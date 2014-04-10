package org.schema;

/**
 * 
 * Computer programming source code. Example: Full (compile ready) solutions,
 * code snippet samples, scripts, templates.
 * 
 * @fullPath Thing > CreativeWork > Code
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Code extends CreativeWork {

	private org.schema.base.URL codeRepository;
	private Thing programmingLanguage;
	private String runtime;
	private String sampleType;
	private SoftwareApplication targetProduct;

	/**
	 * URL to the repository where the un-compiled, human readable code and
	 * related code is located (SVN, github, CodePlex)
	 */
	public org.schema.base.URL getCodeRepository() {
		return this.codeRepository;
	}

	/**
	 * URL to the repository where the un-compiled, human readable code and
	 * related code is located (SVN, github, CodePlex)
	 */
	public void setCodeRepository(org.schema.base.URL codeRepository) {
		this.codeRepository = codeRepository;
	}

	/**
	 * The computer programming language.
	 */
	public Thing getProgrammingLanguage() {
		return this.programmingLanguage;
	}

	/**
	 * The computer programming language.
	 */
	public void setProgrammingLanguage(Thing programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	/**
	 * Runtime platform or script interpreter dependencies (Example - Java v1,
	 * Python2.3, .Net Framework 3.0)
	 */
	public String getRuntime() {
		return this.runtime;
	}

	/**
	 * Runtime platform or script interpreter dependencies (Example - Java v1,
	 * Python2.3, .Net Framework 3.0)
	 */
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	/**
	 * Full (compile ready) solution, code snippet, inline code, scripts,
	 * template.
	 */
	public String getSampleType() {
		return this.sampleType;
	}

	/**
	 * Full (compile ready) solution, code snippet, inline code, scripts,
	 * template.
	 */
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	/**
	 * Target Operating System / Product to which the code applies. If applies
	 * to several versions, just the product name can be used.
	 */
	public SoftwareApplication getTargetProduct() {
		return this.targetProduct;
	}

	/**
	 * Target Operating System / Product to which the code applies. If applies
	 * to several versions, just the product name can be used.
	 */
	public void setTargetProduct(SoftwareApplication targetProduct) {
		this.targetProduct = targetProduct;
	}
}
