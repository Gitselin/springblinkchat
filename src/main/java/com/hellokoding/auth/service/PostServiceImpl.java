package com.hellokoding.auth.service;

import com.hellokoding.auth.model.Post;
import com.hellokoding.auth.model.User;
import com.hellokoding.auth.repository.PostRepository;
import com.hellokoding.auth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    
	@Autowired
    private PostRepository postRepository;


    @Override
    public void save(Post post) {
        postRepository.save(post);
    }
    @Override
    public List<Post> findAll() {
		return postRepository.findAll();
    }



}
