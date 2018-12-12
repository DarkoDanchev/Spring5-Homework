package com.darko.danchev.simple.blogging.SimpleBlogging.repository;

import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {

    @Query("SELECT bp FROM BlogPost bp")
    Optional<List<BlogPost>> findBlogPosts(Pageable pageable);

    @Query("SELECT bp FROM BlogPost bp WHERE bp.status = :status ORDER BY bp.createdAt DESC")
    Optional<List<BlogPost>> findAllFiltered(Boolean status,Pageable pageable);
}
