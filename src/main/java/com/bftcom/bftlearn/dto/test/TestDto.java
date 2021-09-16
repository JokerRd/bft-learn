package com.bftcom.bftlearn.dto.test;

import lombok.Data;


@Data
public class TestDto {

    private final long id;
    
    private final String nameTest;

    private final String descriptionTest;

    private final boolean isShowResult;


}
