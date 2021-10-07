package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.UserDto;
import com.bftcom.bftlearn.entity.Authority;
import com.bftcom.bftlearn.entity.User;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;


@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Autowired
    protected PasswordEncoder passwordEncoder;

    public User dtoToEntity(UserDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setEnabled(true);
        user.setAuthoritySet(Collections.singleton(new Authority(dto.getUsername(),"ROLE_USER", user )));
        return user;
    }
}
