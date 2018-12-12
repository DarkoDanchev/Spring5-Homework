package com.darko.danchev.simple.blogging.SimpleBlogging.controller;

import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tags")
public class TagController {

    @Autowired
    TagService tagService;
}
