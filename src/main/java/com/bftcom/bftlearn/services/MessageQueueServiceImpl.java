package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.AnswersUser;
import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.dto.ResultQuestionChecking;
import com.bftcom.bftlearn.mappers.MessageQueueMapper;
import com.bftcom.bftlearn.queueservices.MessageRpcSender;
import com.bftcom.bftlearn.repository.MessageQueueRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MessageQueueServiceImpl implements MessageQueueService {

    private final MessageQueueRepository messageQueueRepository;

    private final MessageQueueMapper messageQueueMapper;

    private final MessageRpcSender messageRpcSender;

    public MessageQueueServiceImpl(MessageQueueRepository messageQueueRepository,
                                   MessageQueueMapper messageQueueMapper,
                                   MessageRpcSender messageRpcSender) {
        this.messageQueueRepository = messageQueueRepository;
        this.messageQueueMapper = messageQueueMapper;
        this.messageRpcSender = messageRpcSender;
    }

    @Override
    public List<MessageForQueue> getAllMessagesByTheme(String theme) {
        return messageQueueMapper.entityToDtoList(messageQueueRepository.findAllByTheme(theme));
    }

    @Override
    public Boolean isEvenNumber(int number) {
        return messageRpcSender.send(number);
    }

    @Override
    public void sendAnswersUserOnChecking(AnswersUser answersUser) {

    }

    @Override
    public List<ResultQuestionChecking> getVerifiedTest(String username, long idTest) {
        return null;
    }


}
