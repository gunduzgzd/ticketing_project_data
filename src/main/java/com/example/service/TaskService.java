package com.example.service;

import com.example.dto.ProjectDTO;
import com.example.dto.TaskDTO;
import com.example.dto.UserDTO;
import com.example.entity.User;
import com.example.enums.Status;

import java.util.List;

public interface TaskService {

    List<TaskDTO> listAllTasks();

    void save(TaskDTO dto);

    void update(TaskDTO dto);

    TaskDTO findById(Long id);

    void delete(Long id);

    int totalNonCompletedTask(String projectCode);
    int totalCompletedTask(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);

    void completeByProject(ProjectDTO projectDTO);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);
    List<TaskDTO> listAllTasksByStatus(Status status);
    List<TaskDTO> listAllNonCompletedByAssignedEmployee(UserDTO assignedEmployee);
}
