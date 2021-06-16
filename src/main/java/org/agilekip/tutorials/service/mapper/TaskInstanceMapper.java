package org.agilekip.tutorials.service.mapper;

import org.agilekip.tutorials.domain.*;
import org.agilekip.tutorials.service.dto.TaskInstanceDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TaskInstance} and its DTO {@link TaskInstanceDTO}.
 */
@Mapper(componentModel = "spring", uses = { ProcessDefinitionMapper.class, ProcessInstanceMapper.class })
public interface TaskInstanceMapper extends EntityMapper<TaskInstanceDTO, TaskInstance> {
    @Mapping(target = "processDefinition", source = "processDefinition", qualifiedByName = "name")
    @Mapping(target = "processInstance", source = "processInstance", qualifiedByName = "businessKey")
    TaskInstanceDTO toDto(TaskInstance s);

    @Named("loadTaskContext")
    @Mapping(target = "processDefinition", source = "processDefinition", qualifiedByName = "loadTaskContext")
    @Mapping(target = "processInstance", source = "processInstance", qualifiedByName = "loadTaskContext")
    TaskInstanceDTO toDTOLoadTaskContext(TaskInstance s);
}
