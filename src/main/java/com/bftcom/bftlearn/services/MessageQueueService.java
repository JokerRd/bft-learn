package com.bftcom.bftlearn.services;


import com.bftcom.bftlearn.dto.AnswersUser;
import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.dto.ResultQuestionChecking;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface MessageQueueService {

    List<MessageForQueue> getAllMessagesByTheme(String theme);

    Boolean isEvenNumber(int number);

    void sendAnswersUserOnChecking(AnswersUser answersUser);

    List<ResultQuestionChecking> getVerifiedTest(String username, long idTest);
}
