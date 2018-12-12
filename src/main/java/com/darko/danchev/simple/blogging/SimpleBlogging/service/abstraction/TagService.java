package com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.TagDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;

import java.awt.print.Pageable;
import java.util.List;

public interface TagService {

    Tag createTag(TagDto tagDto);

    List<Tag> allTags(Pageable pageable);

    List<Tag> allTagsInBlogPost(BlogPost blogPost);

    Tag findTag(Long tagId);

    Tag updateTag(Long tagId,TagDto tagDto);

    Boolean deleteTag(Long tagId);
}
