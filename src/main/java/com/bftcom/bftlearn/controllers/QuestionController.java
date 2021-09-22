package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.question.QuestionDto;
import com.bftcom.bftlearn.dto.test.NewTest;
import com.bftcom.bftlearn.dto.test.UpdateTest;
import com.bftcom.bftlearn.services.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;

@RestController
@RequestMapping("/tests")
@Validated
public class QuestionController extends AbstractController<QuestionDto> {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        super(questionService);
        this.questionService = questionService;
    }

    @GetMapping("/{idTest}/questions")
    public List<QuestionDto> getAllQuestions(@PathVariable @Min(value = 1, message = "Неверный id теста") long idTest) {
        return questionService.getAllEntities(idTest);
    }

    @GetMapping("/questions/{id}")
    public QuestionDto getQuestion(@PathVariable @Min(value = 1, message = "Неверный id вопроса") long id) {
        return questionService.getEntity(id);
    }

    @PutMapping("/questions/{id}")
    public void updateQuestion(@Validated({UpdateTest.class}) @RequestBody QuestionDto questionDto,
                               @PathVariable long id) {
        questionService.updateEntity(questionDto, questionDto.getId());
    }

    @PostMapping("/questions")
    @ResponseStatus(HttpStatus.OK)
    public void createQuestion(@Validated({NewTest.class}) @RequestBody QuestionDto questionDto) {
        questionService.createEntity(questionDto);
    }

    @DeleteMapping("/questions/{id}")
    public void deleteQuestion(@PathVariable @Min(value = 1, message = "Неверный id вопроса") long id) {
        questionService.deleteEntity(id);
    }
}
