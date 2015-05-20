package com.sandy.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.sandy.blog.model.Comment;


public interface CommentRepository extends CrudRepository<Comment, Integer> {
	
}
