package org.schema;

/**
 * 
 * A blog
 * 
 * @fullPath Thing > CreativeWork > Blog
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Blog extends CreativeWork {

	private BlogPosting blogPost;

	/**
	 * A posting that is part of this blog. Supercedes <a
	 * href="blogPosts">blogPosts</a>.
	 */
	public BlogPosting getBlogPost() {
		return this.blogPost;
	}

	/**
	 * A posting that is part of this blog. Supercedes <a
	 * href="blogPosts">blogPosts</a>.
	 */
	public void setBlogPost(BlogPosting blogPost) {
		this.blogPost = blogPost;
	}
}
