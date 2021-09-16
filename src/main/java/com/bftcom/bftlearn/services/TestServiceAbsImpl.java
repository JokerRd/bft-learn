package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.entity.TestEntity;
import com.bftcom.bftlearn.mappers.AbstractMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TestServiceAbsImpl extends EntityAbstractService<TestDto, TestEntity> implements TestServiceAbs {


    public TestServiceAbsImpl(AbstractMapper<TestDto, TestEntity> mapper,
                              JpaRepository<TestEntity, Long> repository) {
        super(mapper, repository);
    }

    @Override
    public void updateEntity(TestDto updatedTest) {
        super.updateEntity(updatedTest, updatedTest.getId());
    }
}
