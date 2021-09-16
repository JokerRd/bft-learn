package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/{idTest}/questions")
    public List<QuestionDto> getAllQuestions(@PathVariable long idTest) {
        return null;
    }

    @GetMapping("/questions/{id}")
    public QuestionDto getQuestion(@PathVariable long id) {
        return questionService.getEntity(id);
    }

    @PutMapping("/questions")
    public void updateQuestion(@RequestBody QuestionDto questionDto) {

    }

    @PostMapping("/questions")
    public void createQuestion(@RequestBody QuestionDto questionDto) {
        questionService.createEntity(questionDto);
    }

    @DeleteMapping("/questions/{id}")
    public void deleteQuestion(@PathVariable long id) {
        questionService.deleteEntity(id);
    }
}
