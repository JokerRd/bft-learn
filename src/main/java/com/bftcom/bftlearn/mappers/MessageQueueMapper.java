package com.bftcom.bftlearn.mappers;

import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.entity.MessageQueueEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageQueueMapper extends AbstractMapper<MessageForQueue, MessageQueueEntity>{
}
