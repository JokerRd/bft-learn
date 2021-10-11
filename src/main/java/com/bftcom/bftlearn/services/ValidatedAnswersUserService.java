package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.AnswersUser;
import com.bftcom.bftlearn.dto.VerifiedAnswersUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ValidatedAnswersUserService {
    void sendAnswersUserOnChecking(AnswersUser answersUser);

    List<VerifiedAnswersUser> getVerifiedAnswersUsers(String username, long idTest);

}
