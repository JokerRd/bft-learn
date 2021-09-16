package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
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

    }

    @Override
    public List<TestDto> getAllTest() {
        return null;
    }

    @Override
    public TestDto getTest(long id) {
        return null;
    }
}
