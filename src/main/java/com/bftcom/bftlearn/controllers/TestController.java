package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.test.NewTest;
import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.dto.test.UpdateTest;
import com.bftcom.bftlearn.services.TestService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;


@RestController
@RequestMapping("/tests")
@Validated
public class TestController extends AbstractController<TestDto> {

    private final TestService testService;

    protected TestController(TestService testService) {
        super(testService);
        this.testService = testService;
    }

    @GetMapping
    @Operation(summary = "Получить все тесты")
    public List<TestDto> getAllTest() {
        return testService.getAllEntities();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Получить тест по id")
    public TestDto getTest(@PathVariable(name = "id")
                           @Min(value = 1, message = "Неверный id") long id) {
        return testService.getEntity(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Создать тест")
    public void createTest(@Validated({NewTest.class}) @RequestBody TestDto newTest) {
        testService.createEntity(newTest);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Обновить тест")
    public void updateTest(@Validated({UpdateTest.class}) @RequestBody TestDto updatedTest, @PathVariable int id) {
        testService.updateEntity(updatedTest);
    }
}

