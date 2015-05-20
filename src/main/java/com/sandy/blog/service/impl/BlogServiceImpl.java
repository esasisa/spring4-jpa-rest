package com.sandy.blog.service.impl;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sandy.blog.model.Blog;
import com.sandy.blog.model.Comment;
import com.sandy.blog.repository.BlogRepository;
import com.sandy.blog.repository.CommentRepository;
import com.sandy.blog.service.BlogServices;

@Service
public class BlogServiceImpl implements BlogServices{

	@Resource
	private BlogRepository blogRepo;

	@Resource
	private CommentRepository commentRepo;
	
	@Override
	public Blog getBlogById(Integer blogId) {
		System.out.println("Blog Service Start ------------------------------------------------------------------------------------------------");
		Blog blog = blogRepo.findOne(blogId);
		
		System.out.println("Blog Service End ------------------------------------------------------------------------------------------------");
		return blog;
	}
	
	@Override
	public Set<Comment> getCommentsByBlogId(Integer blogId) {
		Blog blog = blogRepo.findOne(blogId);
		Set<Comment> comments = null;
				if(blog != null){
			comments = blog.getComments();			
				
		}
		return comments;
	}
	
	@Override
	public Blog saveBlog(Blog blog) {		
		return blogRepo.save(blog);
	}

	@Override
	public Blog updateBlog(Blog blog) {		
		return blogRepo.save(blog);
	}

	@Override
	public Blog deleteBlog(Integer blogId) {
		blogRepo.delete(blogId);
		return null;
	}

	@Override
	public String saveBlogTest() {

		Blog blog = new Blog();
		blog.setBlogName("I am Sandeep :: Blog 2");

		Comment comment1 = new Comment();
		comment1.setCommentDescription("I am Sandeep :: Blog 2 :: Comment 1");

		Comment comment2 = new Comment();
		comment2.setCommentDescription("I am Sandeep :: Blog 2 :: Comment 2");

		Comment comment3 = new Comment();
		comment3.setCommentDescription("I am Sandeep :: Blog 2 :: Comment 3");

		Set<Comment> commentSet = new HashSet<Comment>();
		commentSet.add(comment1);
		commentSet.add(comment2);
		commentSet.add(comment3);

		commentRepo.save(commentSet);
		blog.setComments(commentSet);
		blog = blogRepo.save(blog);

		return "Saved sucessfully !";
	
	}

	

}
