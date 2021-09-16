package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.mappers.QuestionModelMapper;
import com.bftcom.bftlearn.repository.QuestionRepository;

public class QuestionServiceImpl
        extends EntityAbstractService<QuestionDto, QuestionEntity>
        implements QuestionService {

    public QuestionServiceImpl(QuestionModelMapper mapper,QuestionRepository repository) {
        super(mapper, repository);
    }


}
