package com.bftcom.bftlearn.services;


import com.bftcom.bftlearn.dto.MessageForQueue;

import java.util.List;

public interface MessageQueueService {

    List<MessageForQueue> getAllMessagesByTheme(String theme);

    Boolean isEvenNumber(int number);
}
