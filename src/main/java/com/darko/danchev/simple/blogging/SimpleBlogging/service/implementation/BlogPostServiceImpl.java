package com.darko.danchev.simple.blogging.SimpleBlogging.service.implementation;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.BlogPostDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.BlogPostRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.TagRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private TagRepository tagRepository;

    @Override
    public BlogPost createBlogPost(BlogPostDto blogPostDto) {
        BlogPost blogPost = new BlogPost();
        setBlogPostDto(blogPost,blogPostDto);
        return blogPostRepository.save(blogPost);
    }

    @Override
    public List<BlogPost> allBlogPosts(Pageable pageable) {
        Optional<List<BlogPost>> blogPosts = blogPostRepository.findBlogPosts(pageable);
        // returning empty list if not found
        return blogPosts.orElseGet(ArrayList::new);

    }

    @Override
    public List<BlogPost> findBlogPostsFiltered(Boolean status,Pageable pageable) {
        Optional<List<BlogPost>> blogPosts = blogPostRepository.findAllFiltered(status,pageable);
        return blogPosts.orElseGet(ArrayList::new);
    }

    @Override
    public BlogPost findBlogPost(Long blogPostId) {
        Optional<BlogPost> blogPost = blogPostRepository.findById(blogPostId);
        return blogPost.orElse(null);
    }

    @Override
    public BlogPost updateBlogPost(Long blogPostId, BlogPostDto blogPostDto) {
        Optional<BlogPost> blogPost = blogPostRepository.findById(blogPostId);
        if(blogPost.isPresent()){
            setBlogPostDto(blogPost.get(),blogPostDto);
            return blogPostRepository.save(blogPost.get());
        }
        return null;

    }

    @Override
    public Boolean deleteBlogPost(Long blogPostId) {
        Optional<BlogPost> blogPost = blogPostRepository.findById(blogPostId);
        if(blogPost.isPresent()){
            blogPostRepository.delete(blogPost.get());
            return true;
        }
        return false;
    }

    private void setBlogPostDto(BlogPost blogPost,BlogPostDto blogPostDto){
        blogPost.setAuthor(blogPostDto.getAuthor());
        blogPost.setText(blogPostDto.getText());
        blogPost.setImage(blogPostDto.getImage());
        blogPost.setStatus(blogPostDto.getStatus());

        for(String tagName: blogPostDto.getTags()){
            Optional<Tag> tag = tagRepository.findByName(tagName);
            if(tag.isPresent()){
                blogPost.addTag(tag.get());
            }else {
                Tag add = new Tag();
                add.setName(tagName);
                tagRepository.save(add);
                blogPost.addTag(add);
            }
        }
    }
}
