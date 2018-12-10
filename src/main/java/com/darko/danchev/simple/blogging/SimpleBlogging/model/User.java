package com.darko.danchev.simple.blogging.SimpleBlogging.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "users") //this is necessary due to conflict with the table user of the postgresql database configuration
public class User extends Model implements Serializable {

    @NotNull
    @Length(min = 4, max = 128)
    private String username;

    @NotNull
    @Length(min = 8,max = 64)
    private String password;
}
