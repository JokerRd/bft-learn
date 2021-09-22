package com.bftcom.bftlearn.repository;

import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.entity.TestEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {

    public List<QuestionEntity> findAllByTestEntity(TestEntity testEntity);

    List<QuestionEntity> findAllByTestEntity(TestEntity entity, Pageable pageable);
}
