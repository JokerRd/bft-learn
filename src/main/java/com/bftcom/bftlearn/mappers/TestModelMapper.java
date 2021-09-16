package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TestModelMapper extends AbstractMapper<TestDto, TestEntity> {

}
