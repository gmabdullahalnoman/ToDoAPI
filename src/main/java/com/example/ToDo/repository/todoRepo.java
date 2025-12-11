package com.example.ToDo.repository;

import com.example.ToDo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepo extends JpaRepository<Task, Long> {
}

