package com.todoapplication.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.todoapplication.entity.Todo;

@Service
public class TodoServices {
	
	private static List<Todo> todoList =new ArrayList<>();
	static int indexCounter=0;
	
	static {
		todoList.add(new Todo(++indexCounter, "in28minutes", "Spring Boot", LocalDate.now().plusYears(1), false));
		todoList.add(new Todo(++indexCounter, "telusuko", "Spring ", LocalDate.now().plusYears(2), false));
		todoList.add(new Todo(++indexCounter, "selinumExpress", "Microservices", LocalDate.now().plusYears(1), false));
		
	}
	
	public List<Todo> findByUsername(String username){
		return todoList;
	}

	public void addTodo(Todo todo) {
		todo.setId(++indexCounter);
		todoList.add(todo);
	}

}
