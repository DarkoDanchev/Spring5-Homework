package com.darko.danchev.simple.blogging.SimpleBlogging.service.implementation;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.BlogPostDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.BlogPostRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;
import java.util.List;

public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Override
    public BlogPost createBlogPost(BlogPostDto blogPostDto) {
        return null;
    }

    @Override
    public List<BlogPost> allBlogPosts(Pageable pageable) {
        return null;
    }

    @Override
    public List<BlogPost> findBlogPostsFiltered() {
        return null;
    }

    @Override
    public BlogPost findBlogPost(Long blogPostId) {
        return null;
    }

    @Override
    public BlogPost updateBlogPost(Long blogPostId, BlogPostDto blogPostDto) {
        return null;
    }

    @Override
    public BlogPost deleteBlogPost(Long blogPostId) {
        return null;
    }
}
