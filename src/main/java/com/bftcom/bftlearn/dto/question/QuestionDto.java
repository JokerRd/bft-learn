package com.bftcom.bftlearn.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {

    private final long id;

    private final long idTest;

    private final String  nameQuestion;

    private final String descriptionQuestion;

    private final String typeQuestion;

}