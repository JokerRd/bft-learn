package com.bftcom.bftlearn.dto.answer;

import com.bftcom.bftlearn.dto.question.NewQuestion;
import com.bftcom.bftlearn.dto.question.UpdateQuestion;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AnswerDto {

    private final long id;

    @NotNull(message = "Отсутствует ответ")
    private final String answer;

    @NotNull(message = "Отсутствует флаг правильного ответа")
    private final Boolean isRight;
}
