package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.UserDto;
import com.bftcom.bftlearn.repository.TestRepository;
import com.bftcom.bftlearn.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
public class SurveyController {

    private final TestRepository testRepository;
    private final UserService userService;

    @GetMapping(value = "/survey")
    public String viewSurvey() {
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
    public String viewLogin() {
        return "login";
    }


    @GetMapping(value = "/registration")
    public String viewRegistration() {
        return "registration";
    }

    @PostMapping(value = "/registration")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public void registerUser(@RequestBody UserDto userDto){
        userService.AddUser(userDto);
    }
}
