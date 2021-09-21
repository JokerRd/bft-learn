package com.bftcom.bftlearn.services;


import com.bftcom.bftlearn.mappers.AbstractMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@RequiredArgsConstructor
public abstract class EntityAbstractService<EntityDto, Entity> implements EntityService<EntityDto> {

    protected final AbstractMapper<EntityDto, Entity> mapper;
    protected final JpaRepository<Entity, Long> repository;


    public EntityDto transformDto(EntityDto inputDto){
        return inputDto;
    }

    public String getMessageNotFoundId() {
        return "Неверный id";
    }


    @Override
    public void createEntity(EntityDto newTest) {
        Entity entity = mapper.dtoToEntity(transformDto(newTest));
        repository.save(entity);
    }

    @Override
    public void updateEntity(EntityDto updatedTest, long id) {
        createEntity(updatedTest);
    }

    @Override
    public List<EntityDto> getAllEntities() {
        List<Entity> entities = repository.findAll();
        return mapper.entityToDtoList(entities);
    }

    @Override
    public EntityDto getEntity(long id) {
        return mapper.entityToDto(repository.getById(id));
    }

    @Override
    public void deleteEntity(long id) {
        repository.deleteById(id);
    }

    @Override
    public String getNotFoundIdEntity() {
        return "Неверный id";
    }
}
