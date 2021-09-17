package com.bftcom.bftlearn.dto.question;

import com.bftcom.bftlearn.dto.answer.AnswerDto;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

@Data
public class QuestionDto {

    @NotNull(message = "Остутствует id вопроса", groups = {UpdateQuestion.class})
    @Min(value = 1, message = "Неправильный id вопроса", groups = {UpdateQuestion.class})
    @Null(message = "При создании был передан id вопроса", groups = {NewQuestion.class})
    private final long id;

    @NotNull(message = "Остутствует id теста", groups = {UpdateQuestion.class, NewQuestion.class})
    @Min(value = 1, message = "Неправильный id вопроса", groups = {UpdateQuestion.class, NewQuestion.class})
    private final Long idTest;

    @NotNull(message = "Отсутствует название вопроса", groups = {NewQuestion.class, UpdateQuestion.class})
    private final String  nameQuestion;

    @NotNull(message = "Отсутствует описание вопроса", groups = {NewQuestion.class, UpdateQuestion.class})
    private final String descriptionQuestion;

    @NotNull(message = "Отсутствует тип вопроса", groups = {NewQuestion.class, UpdateQuestion.class})
    private final String typeQuestion;

    @NotNull(message = "Остутствуют ответы", groups = {NewQuestion.class, UpdateQuestion.class})
    private final List<AnswerDto> answers;

}
