package com.darko.danchev.simple.blogging.SimpleBlogging.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BlogPostDto {

    private String title;

    private String author;

    private String text;

    private String image; // to be change to file

    private List<String> tags;

    private Boolean status;
}
