package com.darko.danchev.simple.blogging.SimpleBlogging.repository;

import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag,Long> {
}
