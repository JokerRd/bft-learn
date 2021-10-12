package com.bftcom.bftlearn.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class VerifiedAnswersUser {

    private String username;
    private Long idTest;
    private String nameQuestion;
    private List<String> answerUser;
    private List<String> rightAnswer;
    private boolean isRight;

    public VerifiedAnswersUser(String username, Long idTest, String nameQuestion, List<String> answerUser,
                               List<String> rightAnswer, boolean isRight) {
        this.username = username;
        this.idTest = idTest;
        this.nameQuestion = nameQuestion;
        this.answerUser = answerUser;
        this.rightAnswer = rightAnswer;
        this.isRight = isRight;
    }
}
