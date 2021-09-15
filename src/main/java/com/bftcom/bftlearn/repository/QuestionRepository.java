package com.bftcom.bftlearn.repository;

import com.bftcom.bftlearn.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {
}
