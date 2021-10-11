package com.bftcom.bftlearn.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ResultQuestionChecking {
    private String nameQuestion;
    private List<String> answerUser;
    private List<String> rightAnswer;
    private boolean isRight;

    public ResultQuestionChecking(String nameQuestion, List<String> answerUser,
                                  List<String> rightAnswer, boolean isRight) {
        this.nameQuestion = nameQuestion;
        this.answerUser = answerUser;
        this.rightAnswer = rightAnswer;
        this.isRight = isRight;
    }
}
