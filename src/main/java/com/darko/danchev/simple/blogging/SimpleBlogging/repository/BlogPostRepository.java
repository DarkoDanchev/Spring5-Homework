package com.darko.danchev.simple.blogging.SimpleBlogging.repository;

import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
}
