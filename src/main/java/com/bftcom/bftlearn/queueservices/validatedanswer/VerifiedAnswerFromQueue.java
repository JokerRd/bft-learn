package com.bftcom.bftlearn.queueservices.validatedanswer;

import com.bftcom.bftlearn.dto.VerifiedAnswersUser;

import java.util.List;

public interface VerifiedAnswerFromQueue {

    List<VerifiedAnswersUser> getAllVerifiedAnswers();
}
