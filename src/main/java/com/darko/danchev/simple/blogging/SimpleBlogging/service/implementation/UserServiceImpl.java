package com.darko.danchev.simple.blogging.SimpleBlogging.service.implementation;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.UserDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.User;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.UserRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUsers(Pageable pageable) {
        return null;
    }

    @Override
    public User findUser(Long userId) {
        return null;
    }

    @Override
    public User updateUser(Long userId, UserDto userDto) {
        return null;
    }

    @Override
    public User deleteUser(Long userId) {
        return null;
    }

    @Override
    public User createUser(UserDto userDto) {
        return null;
    }
}
