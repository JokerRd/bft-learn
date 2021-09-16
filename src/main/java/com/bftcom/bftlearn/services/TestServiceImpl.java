package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
import com.bftcom.bftlearn.exceptions.TestException;
import com.bftcom.bftlearn.mappers.TestModelMapper;
import com.bftcom.bftlearn.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final TestRepository repository;
    private final TestModelMapper testModelMapper;

    @Override
    public void createTest(TestDto newTest) {
        TestEntity entity = testModelMapper.dtoToEntity(newTest);
        repository.save(entity);
    }

    @Override
    public void updateTest(TestDto updatedTest) {
        if (repository.findById(updatedTest.getId()).isPresent()) {
            createTest(updatedTest);
        } else {
            throw new TestException("Неверный id");
        }
    }

    @Override
    public List<TestDto> getAllTest() {
        List<TestEntity> entities = repository.findAll();
        return testModelMapper.entityToDtoList(entities);
    }

    @Override
    public TestDto getTest(long id) {
        return null;
    }
}
