package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.AnswersUser;
import com.bftcom.bftlearn.dto.MessageForQueue;
import com.bftcom.bftlearn.dto.VerifiedAnswersUser;
import com.bftcom.bftlearn.queueservices.MessageSender;
import com.bftcom.bftlearn.services.MessageQueueService;
import com.bftcom.bftlearn.services.ValidatedAnswersUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RabbitMqController {

    private final MessageSender sender;
    private final MessageQueueService messageQueueService;
    private final ValidatedAnswersUserService validatedAnswersUserService;

    @PostMapping("/queue")
    public void AddMessageInQueue(@RequestBody MessageForQueue message) {
        sender.send(message);
    }

    @GetMapping("/queue/{theme}")
    public List<MessageForQueue> getAllMessagesByTheme(@PathVariable String theme) {
        return messageQueueService.getAllMessagesByTheme(theme);
    }

    @GetMapping("/queue/even/{number}")
    public Boolean isEvenNumber(@PathVariable int number) {
        return messageQueueService.isEvenNumber(number);
    }


    @PostMapping("queue/answers")
    public void sendAnswersUserOnChecking(@RequestBody AnswersUser answersUser) {
        validatedAnswersUserService.sendAnswersUserOnChecking(answersUser);
    }

    @GetMapping("queue/answers/verified/{username}/{idTest}")
    public List<VerifiedAnswersUser> getVerifiedTest(@PathVariable String username,
                                                     @PathVariable long idTest) {
        return validatedAnswersUserService.getVerifiedAnswersUsers(username, idTest);
    }

}
