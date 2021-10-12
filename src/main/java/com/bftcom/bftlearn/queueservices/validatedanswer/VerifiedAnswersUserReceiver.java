package com.bftcom.bftlearn.queueservices.validatedanswer;

import com.bftcom.bftlearn.dto.VerifiedAnswersUser;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class VerifiedAnswersUserReceiver implements VerifiedAnswerFromQueue {

    private final List<VerifiedAnswersUser> allVerifiedAnswersUsers;

    public VerifiedAnswersUserReceiver() {
        this.allVerifiedAnswersUsers = new ArrayList<>();
    }

    @RabbitListener(queues = "exchange.rpc.verified",
            messageConverter = "jsonMessageConverter")
    public void receive(List<VerifiedAnswersUser> checkingList) {
        allVerifiedAnswersUsers.addAll(checkingList);
    }

    @Override
    public List<VerifiedAnswersUser> getAllVerifiedAnswers() {
        return allVerifiedAnswersUsers;
    }
}
