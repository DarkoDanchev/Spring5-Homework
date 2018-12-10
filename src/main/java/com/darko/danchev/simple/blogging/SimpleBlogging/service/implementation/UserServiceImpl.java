package com.darko.danchev.simple.blogging.SimpleBlogging.service.implementation;

import com.darko.danchev.simple.blogging.SimpleBlogging.dto.UserDto;
import com.darko.danchev.simple.blogging.SimpleBlogging.model.User;
import com.darko.danchev.simple.blogging.SimpleBlogging.repository.UserRepository;
import com.darko.danchev.simple.blogging.SimpleBlogging.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

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

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return user;
    }
}
