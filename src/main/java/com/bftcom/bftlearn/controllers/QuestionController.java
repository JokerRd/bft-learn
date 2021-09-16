package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class QuestionController {

    @GetMapping("/{idTest}/questions")
    public List<QuestionDto> getAllQuestions(@PathVariable long idTest) {
        return null;
    }

    @GetMapping("/questions/{id}")
    public QuestionDto getQuestion(@PathVariable long id) {
        return null;
    }

    @PutMapping("/questions")
    public void updateQuestion(@RequestBody QuestionDto questionDto) {

    }

    @PostMapping("/questions")
    public void createQuestion(@RequestBody QuestionDto questionDto) {

    }

    @DeleteMapping("/questions/{id}")
    public void deleteQuestion(@PathVariable long id) {

    }
}
