package com.bftcom.bftlearn.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResultQuestionChecking {

    private Long idQuestion;
    private String nameQuestion;
    private boolean isRight;
}
