package com.bftcom.bftlearn.mappers;

import java.util.List;

public interface AbstractMapper<EntityDto, Entity> {


    EntityDto entityToDto(Entity entity);

    Entity dtoToEntity(EntityDto dto);

    List<EntityDto> entityToDtoList(List<Entity> testEntities);

    List<Entity> dtoToEntityList(List<EntityDto> entityDtoList);

}

