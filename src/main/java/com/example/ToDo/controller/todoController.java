package com.example.ToDo.controller;

import com.example.ToDo.model.Task;
import com.example.ToDo.repository.todoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class todoController {

    @Autowired
    private todoRepo todoRepo;

    @GetMapping
    public List<Task> findAll(){
        return todoRepo.findAll();
    }
    @PostMapping
    public Task save(@RequestBody Task task){
        return todoRepo.save(task);
    }
    @PutMapping
    public Task update(@RequestBody Task task){
        return todoRepo.save(task);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        todoRepo.deleteById(id);
    }
}
