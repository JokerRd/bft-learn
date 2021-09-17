package com.bftcom.bftlearn.services;

import com.bftcom.bftlearn.exceptions.TestException;
import com.bftcom.bftlearn.mappers.AbstractMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RequiredArgsConstructor
public class EntityAbstractService<EntityDto, Entity> implements EntityService<EntityDto> {

    protected final AbstractMapper<EntityDto, Entity> mapper;
    protected final JpaRepository<Entity, Long> repository;
    private final String messageNotFoundId = "Неверный id";


    @Override
    public void createEntity(EntityDto newTest) {
        Entity entity = mapper.dtoToEntity(newTest);
        repository.save(entity);
    }

    @Override
    public void updateEntity(EntityDto updatedTest, long id) {
        checkId(repository, id, messageNotFoundId);
        createEntity(updatedTest);
    }

    @Override
    public List<EntityDto> getAllEntities() {
        List<Entity> entities = repository.findAll();
        return mapper.entityToDtoList(entities);
    }

    @Override
    public EntityDto getEntity(long id) {
        checkId(repository, id, messageNotFoundId);
        return mapper.entityToDto(repository.getById(id));
    }

    @Override
    public void deleteEntity(long id) {
        checkId(repository, id, messageNotFoundId);
        repository.deleteById(id);
    }

    protected void checkId(JpaRepository<Entity, Long> repository,
                           long id,
                           String message) {
        if (!repository.findById(id).isPresent()) {
            throw new TestException(message);
        }
    }
}
