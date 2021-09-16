package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TestModelMapper {

    TestDto entityToDto(TestEntity entity);
    TestEntity dtoToEntity(TestDto dto);

    List<TestDto> entityToDtoList(List<TestEntity> testEntities);
}
