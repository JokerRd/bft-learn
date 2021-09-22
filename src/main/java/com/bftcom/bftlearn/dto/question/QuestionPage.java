package com.bftcom.bftlearn.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class QuestionPage {

    private final long total;

    private final List<QuestionDto> questions;
}
