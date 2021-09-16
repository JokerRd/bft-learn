package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.dto.test.TestDto;
import java.util.List;

public interface TestService {

    /**
     * Создание сущности теста.
     */
    void createTest(TestDto newTest);

    /**
     * Обновление сущности теста.
     */
    void updateTest(TestDto updatedTest);

    /**
     * Получить все тесты.
     * @return - лист дто тестов.
     */
    List<TestDto> getAllTest();

    /**
     * Получить определенный тест.
     * @param id - ид теста.
     * @return - дто теста.
     */
    TestDto getTest(long id);

}
