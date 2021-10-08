package com.bftcom.bftlearn.repository;

import com.bftcom.bftlearn.entity.MessageQueueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageQueueRepository extends JpaRepository<MessageQueueEntity, Long> {

    List<MessageQueueEntity> findAllByTheme(String theme);
}
