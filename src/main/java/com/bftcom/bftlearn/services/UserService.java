package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.UserDto;
import com.bftcom.bftlearn.entity.Authority;
import com.bftcom.bftlearn.entity.User;
import com.bftcom.bftlearn.exceptions.RegistrationException;
import com.bftcom.bftlearn.mappers.UserMapper;
import com.bftcom.bftlearn.repository.AuthorityRepository;
import com.bftcom.bftlearn.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

@Component
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository,
                       AuthorityRepository authorityRepository,
                       UserMapper userMapper) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findById(s);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException("User not found");
        }
        return userOptional.get();
    }

    public void AddUser(UserDto dto) {
        if (userRepository.findById(dto.getUsername()).isPresent()) {
            throw new RegistrationException("User was added");
        }
        User user = userMapper.dtoToEntity(dto);
        userRepository.save(user);
        Authority authority = new Authority(dto.getUsername(), "ROLE_USER");
        authorityRepository.save(authority);
    }
}
