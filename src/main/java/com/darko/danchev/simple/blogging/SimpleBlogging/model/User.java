package com.darko.danchev.simple.blogging.SimpleBlogging.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;

@EqualsAndHashCode(callSuper = false)
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "users") //this is necessary due to conflict with the table user of the postgresql database configuration
public class User extends Model implements Serializable, UserDetails {

    @NotNull
    @Length(min = 4, max = 128)
    private String username;

    @NotNull
    @Length(min = 8,max = 64)
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
