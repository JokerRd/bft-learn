package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.test.TestDto;
import com.bftcom.bftlearn.services.TestService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping
    @Operation(summary = "Получить все тесты")
    public List<TestDto> getAllTest(){
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable(name = "id") long id){
        return new TestDto(id,"q", "d", true );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTest(@Valid @RequestBody TestDto newTest){
        System.out.println(newTest);
        //testService.createTest(newTest);
    }

    @PutMapping()
    public void updateTest(@RequestBody TestDto updatedTest){

    }
}

