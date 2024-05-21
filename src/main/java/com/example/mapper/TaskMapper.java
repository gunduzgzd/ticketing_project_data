package com.example.mapper;


import com.example.dto.TaskDTO;
import com.example.dto.UserDTO;
import com.example.entity.Task;
import com.example.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    private final ModelMapper modelMapper;


    public TaskMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;

    }

    public Task convertToEntity(TaskDTO dto) {
        return modelMapper.map(dto, Task.class);
    }

    public TaskDTO convertToDto(Task entity) {

        return modelMapper.map(entity, TaskDTO.class);
    }
}
