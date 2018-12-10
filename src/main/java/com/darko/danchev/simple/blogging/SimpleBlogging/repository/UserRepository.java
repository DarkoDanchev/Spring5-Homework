package com.darko.danchev.simple.blogging.SimpleBlogging.repository;

import com.darko.danchev.simple.blogging.SimpleBlogging.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);

}
