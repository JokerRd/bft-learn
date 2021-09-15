package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.answer.AnswerDto;
import com.bftcom.bftlearn.entity.AnswerEntity;
import org.mapstruct.Mapper;

@Mapper
public interface AnswerModelMapper {

    AnswerDto entityToDto(AnswerEntity entity);

    AnswerEntity dtoToEntity(AnswerDto dto);
}
