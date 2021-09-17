package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.entity.QuestionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionModelMapper extends AbstractMapper<QuestionDto, QuestionEntity> {

}
