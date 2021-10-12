package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.AnswersUser;
import com.bftcom.bftlearn.dto.VerifiedAnswersUser;
import com.bftcom.bftlearn.queueservices.validatedanswer.AnswersUserSender;
import com.bftcom.bftlearn.queueservices.validatedanswer.VerifiedAnswerFromQueue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidatedAnswersUserWithRabbit implements ValidatedAnswersUserService{

    private final AnswersUserSender answersUserSender;
    private final VerifiedAnswerFromQueue verifiedAnswerFromQueue;

    @Override
    public void sendAnswersUserOnChecking(AnswersUser answersUser) {
        answersUserSender.send(answersUser);
    }

    @Override
    public VerifiedAnswersUser getVerifiedAnswersUsers(String username, long idTest) {
        return verifiedAnswerFromQueue.getVerifiedAnswersByUsernameAndByIdTes(username, idTest);
    }
}
