package com.darko.danchev.simple.blogging.SimpleBlogging.model;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blog_posts")
@Entity
public class BlogPost extends Model implements Serializable {

    @NotNull
    @Length(min = 12,max = 256)
    private String title;

    @NotNull
    @Length(min = 4, max = 64)
    private String author;

    @NotNull
    @Length(min = 48, max = 2048)
    private String text;

    @NotNull
    private String image;

    @NotNull
    @ManyToMany
    private List<Tag> tags;

    @NotNull
    @ColumnDefault("false")
    private Boolean status;
}
