package com.hellokoding.auth.service;
import java.util.ArrayList;
import java.util.List;

import com.hellokoding.auth.model.Post;
import com.hellokoding.auth.model.User;

public interface PostService {
    public void save(Post post);

	List<Post> findAll();

}
