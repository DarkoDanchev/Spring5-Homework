package com.darko.danchev.simple.blogging.SimpleBlogging.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tags")
@Entity
public class Tag extends Model implements Serializable {

    @NotNull
    @Length(min = 3, max = 24)
    String name;
}
