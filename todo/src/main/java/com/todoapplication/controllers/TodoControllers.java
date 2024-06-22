package com.todoapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todoapplication.entity.Todo;
import com.todoapplication.services.TodoServices;

@Controller
public class TodoControllers {
	@Autowired
	public TodoServices todoServices;
	
	@RequestMapping("todos")
	public String todos(ModelMap model) {
		List<Todo> allTodos = todoServices.findByUsername("");
		
		model.put("todos", allTodos);
		return "todos";
	}

}
