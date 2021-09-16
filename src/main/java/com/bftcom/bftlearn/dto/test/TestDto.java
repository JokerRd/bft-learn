package com.bftcom.bftlearn.dto.test;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;


@Data
public class TestDto {

    @NotNull(message = "Остутствует id теста", groups = {UpdateTest.class})
    @Min(value = 1, message = "Неверный id", groups = {UpdateTest.class})
    @Null(message = "При создании был передан id", groups = {NewTest.class})
    private final Long id;

    @NotNull(message = "Отсутствует название теста", groups = {NewTest.class, UpdateTest.class})
    private final String nameTest;

    @NotNull(message = "Отсутствует описание теста", groups = {NewTest.class, UpdateTest.class})
    private final String descriptionTest;

    @NotNull(message = "Остутствует флаг показа результат", groups = {UpdateTest.class})
    private final Boolean isShowResult;


}
