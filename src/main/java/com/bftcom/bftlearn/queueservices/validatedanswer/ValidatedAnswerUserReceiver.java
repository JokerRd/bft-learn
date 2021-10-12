package com.bftcom.bftlearn.queueservices.validatedanswer;

import com.bftcom.bftlearn.dto.AnswersUser;
import com.bftcom.bftlearn.dto.VerifiedAnswersUser;
import com.bftcom.bftlearn.entity.AnswerEntity;
import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.entity.TestEntity;
import com.bftcom.bftlearn.repository.QuestionRepository;
import com.bftcom.bftlearn.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ValidatedAnswerUserReceiver {

    private final TestRepository testRepository;

    private final QuestionRepository questionRepository;


    @RabbitListener(queues = "exchange.rpc.answersUser",
            messageConverter = "jsonMessageConverter")
    @SendTo("exchange.rpc.verified")
    public List<VerifiedAnswersUser> validate(AnswersUser answersUser){
        TestEntity testEntity = testRepository.getById(answersUser.getIdTest());
        List<QuestionEntity> questionEntities  = questionRepository.findAllByTestEntity(testEntity);
        Map<Long, List<String>> mapAnswersUser = answersUser.getAnswersByIdQuestion();
        return getResultsQuestionChecking(questionEntities, mapAnswersUser);
    }

    private List<VerifiedAnswersUser> getResultsQuestionChecking(List<QuestionEntity> questionEntities,
                                                                 Map<Long, List<String>> mapAnswersUser){
        return questionEntities.stream()
                .map(questionEntity -> createResultQuestionChecking(questionEntity, mapAnswersUser))
                .collect(Collectors.toList());
    }

    private VerifiedAnswersUser createResultQuestionChecking(QuestionEntity questionEntity,
                                                             Map<Long, List<String>> mapAnswersUser){
        String nameQuestion = questionEntity.getNameQuestion();
        List<String> currentAnswersUser = mapAnswersUser.get(questionEntity.getId());
        List<String> rightAnswers = getRightAnswers(questionEntity);
        boolean isRightAnswersUser = isRightAnswersUser(rightAnswers, currentAnswersUser);
        return new VerifiedAnswersUser(nameQuestion, currentAnswersUser, rightAnswers, isRightAnswersUser);
    }


    private List<String> getRightAnswers(QuestionEntity questionEntity){
        return questionEntity.getAnswers().stream()
                .filter(AnswerEntity::isRight)
                .map(AnswerEntity::getAnswer)
                .collect(Collectors.toList());
    }

    private boolean isRightAnswersUser(List<String> answersUser, List<String> rightAnswers){
        if (rightAnswers == null || rightAnswers.isEmpty()) {
            return true;
        }
        if (answersUser.size() > 1){
            return rightAnswers.containsAll(answersUser);
        }
        String answer = answersUser.get(0);
        return rightAnswers.contains(answer);
    }
}
