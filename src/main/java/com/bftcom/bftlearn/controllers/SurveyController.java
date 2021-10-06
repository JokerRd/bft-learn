package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.entity.QuestionEntity;
import com.bftcom.bftlearn.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequiredArgsConstructor
public class SurveyController {

    private final TestRepository testRepository;

    @GetMapping(value = "/survey")
    public String viewSurvey(){
        return "index";
    }

    @GetMapping(value = "/constructor")
    public String viewConstructor() {
        return "constructor";
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {
        return String.valueOf(testRepository.count());
    }

    @GetMapping(value = "/login")
    public String viewLogin(){
        return "login";
    }
}
