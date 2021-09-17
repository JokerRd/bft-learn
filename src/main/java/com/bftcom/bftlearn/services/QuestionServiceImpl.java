package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.entity.TestEntity;
import com.bftcom.bftlearn.mappers.QuestionModelMapper;
import com.bftcom.bftlearn.repository.QuestionRepository;
import com.bftcom.bftlearn.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl
        extends EntityAbstractService<QuestionDto, QuestionEntity>
        implements QuestionService {

    private final QuestionModelMapper mapper;
    private final QuestionRepository questionRepository;
    private final TestRepository testRepository;

    public QuestionServiceImpl(QuestionModelMapper mapper,
                               QuestionRepository repository,
                               TestRepository testRepository) {
        super(mapper, repository);
        this.mapper = mapper;
        this.testRepository = testRepository;
        this.questionRepository = repository;
    }

    @Override
    public void createEntity(QuestionDto newTest) {
        TestEntity testEntity = testRepository.getById(newTest.getIdTest());
        QuestionEntity questionEntity = mapper.dtoToEntityWithOtherEntity(newTest, testEntity);
        questionRepository.saveAndFlush(questionEntity);
    }

    public List<QuestionDto> getAllEntities(long idTest) {
        TestEntity testEntity = testRepository.getById(idTest);
        return mapper.entityToDtoList(questionRepository.findAllByTestEntity(testEntity));
    }
}
