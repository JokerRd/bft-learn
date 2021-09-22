package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.dto.question.QuestionPage;
import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.entity.TestEntity;
import com.bftcom.bftlearn.mappers.QuestionModelMapper;
import com.bftcom.bftlearn.repository.QuestionRepository;
import com.bftcom.bftlearn.repository.TestRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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



    public QuestionPage getAllEntities(long idTest, int page, int limit) {
        TestEntity testEntity = testRepository.getById(idTest);
        Pageable pageable = PageRequest.of(page - 1, limit);
        List<QuestionDto> questions = mapper
                .entityToDtoList(questionRepository.findAllByTestEntity(testEntity, pageable));
        long total = questionRepository.count();
        return new QuestionPage(total, questions);
    }

    @Override
    public String getMessageNotFoundId() {
        return "Неверный id вопроса";
    }


    @Override
    public QuestionDto transformDto(QuestionDto inputDto) {
        return inputDto.getId() == -1 ? new QuestionDto(null, inputDto.getIdTest(),
                inputDto.getNameQuestion(),
                inputDto.getDescriptionQuestion(),
                inputDto.getTypeQuestion(),
                inputDto.getAnswers())
                : inputDto;
    }
}
