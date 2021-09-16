package com.bftcom.bftlearn.dto.test;

import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class TestDto {

    private final long id;

    @NotNull(message = "Отсутствует название теста")
    private final String nameTest;

    @NotNull(message = "Отсутствует описание теста")
    private final String descriptionTest;

    private final boolean isShowResult;


}
