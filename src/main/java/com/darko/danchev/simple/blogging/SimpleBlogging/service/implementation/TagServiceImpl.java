package com.darko.danchev.simple.blogging.SimpleBlogging.service.implementation;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.TagDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.TagRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.TagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;
import java.util.List;

public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag createTag(TagDto tagDto) {
        return null;
    }

    @Override
    public List<Tag> allTags(Pageable pageable) {
        return null;
    }

    @Override
    public List<Tag> allTagsInBlogPost(BlogPost blogPost, Pageable pageable) {
        return null;
    }

    @Override
    public Tag findTag(Long tagId) {
        return null;
    }

    @Override
    public Tag updateTag(Long tagId, TagDto tagDto) {
        return null;
    }

    @Override
    public Tag deleteTag(Long tagId) {
        return null;
    }
}
