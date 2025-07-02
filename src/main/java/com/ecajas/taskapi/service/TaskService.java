package com.ecajas.taskapi.service;

import com.ecajas.taskapi.dto.TaskRequestDTO;
import com.ecajas.taskapi.dto.TaskResponseDTO;
import com.ecajas.taskapi.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    TaskResponseDTO createTask(TaskRequestDTO dto);
    List<TaskResponseDTO> getAllTasks();
    TaskResponseDTO getTaskById(Long id);
    TaskResponseDTO updateTask(Long id, TaskRequestDTO dto);
    void deleteTask(Long id);

}
