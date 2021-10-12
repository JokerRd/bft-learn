package com.bftcom.bftlearn.queueservices.validatedanswer;

import com.bftcom.bftlearn.dto.KeyVerifiedTest;
import com.bftcom.bftlearn.dto.VerifiedAnswersUser;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class VerifiedAnswersUserReceiver implements VerifiedAnswerFromQueue {

    private final Map<KeyVerifiedTest, VerifiedAnswersUser> answersUserMap;

    public VerifiedAnswersUserReceiver() {
        this.answersUserMap = new HashMap<>();
    }

    @RabbitListener(queues = "exchange.rpc.verified",
            messageConverter = "jsonMessageConverter")
    public void receive(List<VerifiedAnswersUser> checkingList) {
        checkingList.forEach(answer ->
                answersUserMap.put(new KeyVerifiedTest(answer.getUsername(), answer.getIdTest()), answer));
    }

    @Override
    public List<VerifiedAnswersUser> getAllVerifiedAnswers() {
        return new ArrayList<>(answersUserMap.values());
    }

    @Override
    public VerifiedAnswersUser getVerifiedAnswersByUsernameAndByIdTes(String username, long idTest) {
        KeyVerifiedTest key = new KeyVerifiedTest(username, idTest);
        return answersUserMap.getOrDefault(key, null);
    }
}
