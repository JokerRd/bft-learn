package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.UserDto;
import com.bftcom.bftlearn.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User dtoToEntity(UserDto dto);
}
