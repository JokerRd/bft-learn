package com.bftcom.bftlearn.dto.question;

import lombok.Data;

@Data
public class QuestionDto {

    private final long id;

    private final long idTest;

    private final String  nameQuestion;

    private final String descriptionQuestion;

    private final String typeQuestion;
}
