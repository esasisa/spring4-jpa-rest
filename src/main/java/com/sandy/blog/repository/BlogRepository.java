package com.sandy.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.sandy.blog.model.Blog;


public interface BlogRepository extends CrudRepository<Blog, Integer> {	

}
