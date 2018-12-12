package com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.BlogPostDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;

import java.awt.print.Pageable;
import java.util.List;

public interface BlogPostService {

    BlogPost createBlogPost(BlogPostDto blogPostDto);

    List<BlogPost> allBlogPosts(Pageable pageable);

    List<BlogPost> findBlogPostsFiltered(Boolean status,Pageable pageable); // it returns the first 15 blog posts filtered by status sorted by createdAt

    BlogPost findBlogPost(Long blogPostId);

    BlogPost updateBlogPost(Long blogPostId, BlogPostDto blogPostDto);

    Boolean deleteBlogPost(Long blogPostId);
}
