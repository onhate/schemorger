package com.texelz.schemorger.model;

/**
 *
 * An article, such as a news article or piece of investigative report. Newspapers and magazines have articles of many different types and this is intended to cover them all.
 * @fullPath Thing > CreativeWork > Article
 *
 * @author Texelz (by Onhate)
 *
 */
public class Article extends CreativeWork {

	private String articleBody;
	private String articleSection;
	private Integer wordCount;
	/**
	 * The actual body of the article.
	 */
	public String getArticleBody() {
		return this.articleBody;
	}
	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody;
	}
	/**
	 * Articles may belong to one or more 'sections' in a magazine or newspaper, such as Sports, Lifestyle, etc.
	 */
	public String getArticleSection() {
		return this.articleSection;
	}
	public void setArticleSection(String articleSection) {
		this.articleSection = articleSection;
	}
	/**
	 * The number of words in the text of the Article.
	 */
	public Integer getWordCount() {
		return this.wordCount;
	}
	public void setWordCount(Integer wordCount) {
		this.wordCount = wordCount;
	}
}
