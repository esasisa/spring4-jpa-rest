package com.sandy.blog.controller;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sandy.blog.model.Blog;
import com.sandy.blog.model.Comment;
import com.sandy.blog.repository.CommentRepository;
import com.sandy.blog.service.BlogServices;

@RestController
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogServices blogService;

	@Resource
	private CommentRepository commentRepo;

	@RequestMapping(value = "/{blogId}", method = RequestMethod.GET)
	public Blog getBlogDetail(@PathVariable("blogId") Integer blogId) {
		Blog blog = blogService.getBlogById(blogId);
		return blog;
	}

	@RequestMapping(value = "/{blogId}/comment", method = RequestMethod.GET)
	public Set<Comment> getcomments(@PathVariable("blogId") Integer blogId) {
		Set<Comment> comments = blogService.getCommentsByBlogId(blogId);
		return comments;
	}

	@RequestMapping(value = "/{blogId}", method = RequestMethod.DELETE)
	public Blog deleteBlog(@PathVariable("blogId") Integer blogId) {
		Blog blog = blogService.deleteBlog(blogId);
		return blog;
	}

	@RequestMapping(method = RequestMethod.POST)
	public Blog saveBlog(Blog blog) {
		blog = blogService.saveBlog(blog);
		return blog;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Blog updateBlog(Blog blog) {
		blog = blogService.updateBlog(blog);
		return blog;
	}

	@RequestMapping("/saveBlog")
	public String saveBlogDetail() {
		return blogService.saveBlogTest();
	}

}