package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.entity.User;
import com.bftcom.bftlearn.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findById(s);
        if (!userOptional.isPresent()){
            throw new UsernameNotFoundException("User not found");
        }
        return userOptional.get();
    }
}
