package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.entity.QuestionEntity;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionModelMapper {

    QuestionDto entityToDto(QuestionEntity entity);
    
    QuestionEntity dtoToEntity(QuestionDto dto);
}
