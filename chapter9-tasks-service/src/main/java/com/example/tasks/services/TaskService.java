package com.example.tasks.services;

import com.example.tasks.model.Tasks;
import com.example.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Tasks> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    public Tasks createTask(Tasks task) {
        return taskRepository.save(task);
    }
}
