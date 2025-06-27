package com.ToDoListApp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ToDoListApp.Service.TodoService;
import com.ToDoListApp.models.Todo;

@RestController
@RequestMapping("/todos")
public class ToDoController {

	@Autowired
	private TodoService todoservice;
	//create ToDo
	@PostMapping
	public Todo createTodo(@RequestBody Todo todo) {
		return todoservice.create(todo);
	}
	//get all ToDo
	@GetMapping
	public List<Todo> getAll(){
		return todoservice.getList();
	}
}