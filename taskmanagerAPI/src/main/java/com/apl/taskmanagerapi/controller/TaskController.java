package com.apl.taskmanagerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apl.taskmanagerapi.model.Task;
import com.apl.taskmanagerapi.repository.TaskRepository;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	@Autowired
    private TaskRepository taskRepository;
	
	
	@GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
	


}
