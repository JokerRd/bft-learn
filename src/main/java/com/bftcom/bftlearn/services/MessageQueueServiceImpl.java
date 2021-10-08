package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.mappers.MessageQueueMapper;
import com.bftcom.bftlearn.repository.MessageQueueRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MessageQueueServiceImpl implements MessageQueueService {

    private final MessageQueueRepository messageQueueRepository;

    private final MessageQueueMapper messageQueueMapper;

    public MessageQueueServiceImpl(MessageQueueRepository messageQueueRepository,
                                   MessageQueueMapper messageQueueMapper) {
        this.messageQueueRepository = messageQueueRepository;
        this.messageQueueMapper = messageQueueMapper;
    }

    @Override
    public List<MessageForQueue> getAllMessagesByTheme(String theme) {
        return messageQueueMapper.entityToDtoList(messageQueueRepository.findAllByTheme(theme));
    }
}
