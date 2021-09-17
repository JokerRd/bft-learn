package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
@Validated
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/{idTest}/questions")
    public List<QuestionDto> getAllQuestions(@PathVariable @Min(value = 1, message = "Неверный id теста") long idTest) {
        return questionService.getAllEntities(idTest);
    }

    @GetMapping("/questions/{id}")
    public QuestionDto getQuestion(@PathVariable @Min(value = 1, message = "Неверный id вопроса") long id) {
        return questionService.getEntity(id);
    }

    @PutMapping("/questions")
    public void updateQuestion(@RequestBody QuestionDto questionDto) {

    }

    @PostMapping("/questions")
    @ResponseStatus(HttpStatus.CREATED)
    public void createQuestion(@RequestBody QuestionDto questionDto) {
        questionService.createEntity(questionDto);
    }

    @DeleteMapping("/questions/{id}")
    public void deleteQuestion(@PathVariable @Min(value = 1, message = "Неверный id вопроса") long id) {
        questionService.deleteEntity(id);
    }
}
