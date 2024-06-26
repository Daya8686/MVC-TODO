package com.todoapplication.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapplication.entity.Todo;
import com.todoapplication.repository.TodoRepository;

@Service
public class TodoServices {
	
	private static List<Todo> todoList =new ArrayList<>();
	
	@Autowired
	private TodoRepository repository;
	
	public List<Todo> findByUsername(String username){
		 todoList = repository.findByUsername(username);
		List<Todo> forUser=todoList.stream().filter(todo->todo.getUsername().equals(username)).toList();
		return forUser;
	}

	public void addTodo(Todo todo) {
		System.out.println(todo);
		
		repository.save(todo);
		
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate= todo->todo.getId()==id;
		Todo todo = todoList.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo( Todo todo) {
		Todo updatedTodo = findById(todo.getId());
		updatedTodo.setAuthorName(todo.getAuthorName());
		updatedTodo.setCourseName(todo.getCourseName());
		updatedTodo.setTargetDate(todo.getTargetDate());
		updatedTodo.setIsDone(todo.getIsDone());
		repository.save(updatedTodo);
		
		
	}

	public void deleteById(int id) {
		repository.deleteById(id);
		
	}
	

}
