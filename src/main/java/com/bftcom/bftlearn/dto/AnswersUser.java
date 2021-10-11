package com.bftcom.bftlearn.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@NoArgsConstructor
@Setter
public class AnswersUser {

    private String username;

    private Long idTest;

    private Map<Long, String> answersByIdQuestion;
}
