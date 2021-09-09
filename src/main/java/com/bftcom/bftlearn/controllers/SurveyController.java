package com.bftcom.bftlearn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SurveyController {

    @GetMapping(value = "/survey")
    public String viewSurvey(){
        return "index";
    }

    @GetMapping(value = "/constructor")
    public String viewConstructor() {
        return "constructor";
    }

}
