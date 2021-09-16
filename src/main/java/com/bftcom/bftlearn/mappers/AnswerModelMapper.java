package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.answer.AnswerDto;
import com.bftcom.bftlearn.entity.AnswerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnswerModelMapper extends AbstractMapper<AnswerDto, AnswerEntity> {

}
