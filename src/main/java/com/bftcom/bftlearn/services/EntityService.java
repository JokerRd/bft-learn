package com.bftcom.bftlearn.services;

import java.util.List;

public interface EntityService<EntityDto> {

    /**
     * Создание сущности теста.
     */
    void createEntity(EntityDto newTest);

    /**
     * Обновление сущности теста.
     */
    void updateEntity(EntityDto updatedTest, long id);

    /**
     * Получить все тесты.
     * @return - лист дто тестов.
     */
    List<EntityDto> getAllEntities();

    /**
     * Получить определенный тест.
     * @param id - ид теста.
     * @return - дто теста.
     */
    EntityDto getEntity(long id);

    void deleteEntity(long id);

    String getNotFoundIdEntity();
}
