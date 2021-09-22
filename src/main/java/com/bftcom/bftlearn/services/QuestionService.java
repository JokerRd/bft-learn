package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.dto.question.QuestionPage;

import java.util.List;

public interface QuestionService extends EntityService<QuestionDto> {

    QuestionPage getAllEntities(long idTest, int page, int limit);
}
