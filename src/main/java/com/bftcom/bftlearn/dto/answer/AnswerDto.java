package com.bftcom.bftlearn.dto.answer;

import lombok.Data;

@Data
public class AnswerDto {

    private final long id;

    private final long idQuestion;

    private final String answer;

    private final boolean isRight;
}
