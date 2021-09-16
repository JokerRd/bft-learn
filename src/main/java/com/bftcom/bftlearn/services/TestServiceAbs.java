package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;

public interface TestServiceAbs extends EntityService<TestDto> {


    void updateEntity(TestDto updatedTest);
}
