package com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.UserDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.User;

import java.awt.print.Pageable;
import java.lang.management.LockInfo;
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> allUsers(Pageable pageable);

    User findUser(Long userId);

    User updateUser(Long userId, UserDto userDto);

    User deleteUser(Long userId);

    User createUser(UserDto userDto);

}
