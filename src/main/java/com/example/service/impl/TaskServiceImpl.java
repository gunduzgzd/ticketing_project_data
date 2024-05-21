package com.example.service.impl;

import com.example.dto.TaskDTO;
import com.example.entity.Role;
import com.example.entity.Task;
import com.example.mapper.TaskMapper;
import com.example.repository.TaskRepository;
import com.example.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }


    @Override
    public List<TaskDTO> listAllTasks() {
        List<Task> roleList = taskRepository.findAll();

        return roleList.stream().map(taskMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public void save(TaskDTO dto) {

    }

    @Override
    public void update(TaskDTO dto) {

    }

    @Override
    public TaskDTO findById(Long id) {
        return null;
    }
}
