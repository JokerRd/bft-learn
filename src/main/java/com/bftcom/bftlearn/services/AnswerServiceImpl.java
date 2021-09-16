package com.bftcom.bftlearn.services;


import com.bftcom.bftlearn.dto.answer.AnswerDto;
import com.bftcom.bftlearn.entity.AnswerEntity;
import com.bftcom.bftlearn.mappers.AnswerModelMapper;
import com.bftcom.bftlearn.repository.AnswerRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl
        extends EntityAbstractService<AnswerDto, AnswerEntity>
        implements AnswerService {

    public AnswerServiceImpl(AnswerModelMapper mapper,
                             AnswerRepository repository) {
        super(mapper, repository);
    }
}
