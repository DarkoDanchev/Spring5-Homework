package com.darko.danchev.simple.blogging.SimpleBlogging.service.implementation;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.TagDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.BlogPost;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.Tag;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.TagRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.TagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag createTag(TagDto tagDto) {
        Tag tag = new Tag();
        setTagDto(tag,tagDto);
        return tagRepository.save(tag);
    }

    @Override
    public List<Tag> allTags(Pageable pageable) {
        Optional<List<Tag>> tags = tagRepository.allTags(pageable);
        return tags.orElseGet(ArrayList::new);
    }

    @Override
    public List<Tag> allTagsInBlogPost(BlogPost blogPost) {
        return blogPost.getTags();
    }

    @Override
    public Tag findTag(Long tagId) {
        Optional<Tag> tag = tagRepository.findById(tagId);

        return tag.orElse(null);
    }

    @Override
    public Tag updateTag(Long tagId, TagDto tagDto) {
        Optional<Tag> tag = tagRepository.findById(tagId);
        if(tag.isPresent()){
            setTagDto(tag.get(),tagDto);
            tagRepository.save(tag.get());
            return tag.get();
        }
        return null;
    }

    @Override
    public Boolean deleteTag(Long tagId) {
        Optional<Tag> tag = tagRepository.findById(tagId);
        if(tag.isPresent()){
            tagRepository.delete(tag.get());
            return true;
        }
        return false;

    }

    private void setTagDto(Tag tag, TagDto tagDto){
        tag.setName(tagDto.getName());
    }
}
