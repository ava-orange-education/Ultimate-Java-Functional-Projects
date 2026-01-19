package com.example.tasks.repository;

import com.example.tasks.model.Tasks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Tasks, String> {
    // additional query methods can be added here
}
