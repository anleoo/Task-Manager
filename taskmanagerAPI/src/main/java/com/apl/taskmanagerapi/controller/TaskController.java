package com.apl.taskmanagerapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
	
	@GetMapping("/{id}")
    public Task getTaskById(@PathVariable String id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }
	
	 @PostMapping
	    public Task createTask(@RequestBody Task task) {
	        return taskRepository.save(task);
	    }
	 
	 @PutMapping("/{id}")
	    public Task updateTask(@PathVariable String id, @RequestBody Task taskDetails) {
	        Optional<Task> optionalTask = taskRepository.findById(id);
	        if (optionalTask.isPresent()) {
	            Task task = optionalTask.get();
	            task.setTitle(taskDetails.getTitle());
	            task.setDescription(taskDetails.getDescription());
	            task.setCompleted(taskDetails.isCompleted());
	            return taskRepository.save(task);
	        }
	        return null;
	    }
	 @DeleteMapping("/{id}")
	    public void deleteTask(@PathVariable String id) {
	        taskRepository.deleteById(id);
	    }

}
