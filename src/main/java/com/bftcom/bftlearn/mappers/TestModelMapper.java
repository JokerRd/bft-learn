package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TestModelMapper {

    TestDto entityToDto(TestEntity entity);
    TestEntity dtoToEntity(TestDto dto);
}
