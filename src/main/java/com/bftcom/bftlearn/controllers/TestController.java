package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.test.NewTest;
import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.dto.test.UpdateTest;
import com.bftcom.bftlearn.services.TestService;
import io.swagger.v3.oas.annotations.Operation;
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
public class TestController {

    private final TestService testService;

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

    @PutMapping
    @Operation(summary = "Обновить тест")
    public void updateTest(@Validated({UpdateTest.class}) @RequestBody TestDto updatedTest) {
        testService.updateEntity(updatedTest);
    }
}

