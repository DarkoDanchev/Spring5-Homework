package com.darko.danchev.simple.blogging.SimpleBlogging.repository;

import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface TagRepository extends CrudRepository<Tag,Long> {

    Optional<Tag> findByName(String name);

    @Query("SELECT tg FROM Tag tg")
    Optional<List<Tag>> allTags(Pageable pageable);
}
