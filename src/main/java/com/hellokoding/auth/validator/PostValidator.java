package com.hellokoding.auth.validator;

import com.hellokoding.auth.model.Post;
import com.hellokoding.auth.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PostValidator implements Validator {
    @Autowired
    private PostService postService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Post.class.equals(aClass);
    }

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}
}
