package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.question.QuestionDto;

import java.util.List;

public interface QuestionService extends EntityService<QuestionDto> {

    List<QuestionDto> getAllEntities(long idTest);
}
