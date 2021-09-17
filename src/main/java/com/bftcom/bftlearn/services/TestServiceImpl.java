package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
import com.bftcom.bftlearn.mappers.TestModelMapper;
import com.bftcom.bftlearn.repository.TestRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends EntityAbstractService<TestDto, TestEntity> implements TestService {

    public TestServiceImpl(TestModelMapper mapper,
                           TestRepository repository) {
        super(mapper, repository);
    }

    @Override
    public void updateEntity(TestDto updatedTest) {
        super.updateEntity(updatedTest, updatedTest.getId());
    }

    @Override
    public String getNotFoundIdEntity() {
        return "Неверный id теста";
    }
}
