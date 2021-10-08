package com.bftcom.bftlearn.repository;

import com.bftcom.bftlearn.entity.MessageQueueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageQueueRepository extends JpaRepository<MessageQueueEntity, Long> {

}
