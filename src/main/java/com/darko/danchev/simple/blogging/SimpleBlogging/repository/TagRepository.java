package com.darko.danchev.simple.blogging.SimpleBlogging.repository;

import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TagRepository extends CrudRepository<Tag,Long> {

    Optional<Tag> findByName(String name);
}
