package com.bftcom.bftlearn.services;
;
import com.bftcom.bftlearn.exceptions.TestException;
import com.bftcom.bftlearn.mappers.AbstractMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RequiredArgsConstructor
public class EntityAbstractService<EntityDto, Entity>  implements EntityService<EntityDto>{

    protected final AbstractMapper<EntityDto, Entity> mapper;
    protected final JpaRepository<Entity, Long> repository;

    @Override
    public void createEntity(EntityDto newTest) {
        Entity entity = mapper.dtoToEntity(newTest);
        repository.save(entity);
    }

    @Override
    public void updateEntity(EntityDto updatedTest, long id) {
        if (repository.findById(id).isPresent()) {
            createEntity(updatedTest);
        } else {
            throw new TestException("Неверный id");
        }
    }

    @Override
    public List<EntityDto> getAllEntities() {
        List<Entity> entities = repository.findAll();
        return mapper.entityToDtoList(entities);
    }

    @Override
    public EntityDto getEntity(long id) {
        try {
            Entity entity = repository.getById(id);
            return mapper.entityToDto(entity);
        } catch (EntityNotFoundException exception) {
            throw new TestException("Неверный id");
        }
    }

    @Override
    public void deleteEntity(long id) {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new TestException("Неверный id");
        }
    }
}
