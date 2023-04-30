package com.todoapp.todoapp.mapper;

import com.todoapp.todoapp.persistence.entity.Task;
import com.todoapp.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task> {

    @Override
     public Task map(TaskInDTO in) {
        return null;
    }
}
