package com.bftcom.bftlearn.controllers;

import com.bftcom.bftlearn.dto.test.TestDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestController {

    @GetMapping
    public List<TestDto> getAllTest(){
        return new ArrayList<>();
    }
    @GetMapping("/{id}")
    public TestDto getTest(@PathVariable(name = "id") long id){
        return new TestDto(id,"q", "d", true );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTest(@RequestBody TestDto newTest){

    }

    @PutMapping()
    public void updateTest(@RequestBody TestDto updatedTest){

    }
}
