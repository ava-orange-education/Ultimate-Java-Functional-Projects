package com.example.tasks.controllers;

import com.example.tasks.model.Tasks;
import com.example.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Tasks> getAllTasks() {
        // Retrieve all tasks
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tasks> getTaskById(@PathVariable String id) {
        // Retrieve a task by ID, return 404 if not found
        return taskService.getTaskById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tasks createTask(@RequestBody Tasks task) {
        // Create a new task
        return taskService.createTask(task);
    }
}
