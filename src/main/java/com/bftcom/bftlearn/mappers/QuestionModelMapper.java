package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.entity.TestEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface QuestionModelMapper extends AbstractMapper<QuestionDto, QuestionEntity> {

    @Mappings({
            @Mapping(target = "testEntity", source = "entity"),
            @Mapping(target = "id", source = "dto.id")
    })
    QuestionEntity dtoToEntityWithOtherEntity(QuestionDto dto, TestEntity entity);
}
