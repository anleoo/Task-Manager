package com.apl.taskmanagerapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apl.taskmanagerapi.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {

}
