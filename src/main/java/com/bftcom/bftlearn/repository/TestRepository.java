package com.bftcom.bftlearn.repository;

import com.bftcom.bftlearn.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

}
