package com.sandy.blog.service;

import java.util.Set;

import com.sandy.blog.model.Blog;
import com.sandy.blog.model.Comment;

public interface BlogServices {
	Blog getBlogById(Integer blogId);

	Set<Comment> getCommentsByBlogId(Integer blogId);

	String saveBlogTest();

	Blog saveBlog(Blog blog);

	Blog updateBlog(Blog blog);

	Blog deleteBlog(Integer blogId);
}
