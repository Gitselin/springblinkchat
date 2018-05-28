package com.hellokoding.auth.repository;

import com.hellokoding.auth.model.Post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	List<Post> findAll();
}
