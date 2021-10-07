package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.UserDto;
import com.bftcom.bftlearn.entity.User;
import com.bftcom.bftlearn.mappers.UserMapper;
import com.bftcom.bftlearn.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
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
            throw new IllegalArgumentException("User was added");
        }
        User user = userMapper.dtoToEntity(dto);
        userRepository.save(user);
    }
}
