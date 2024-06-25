package com.todoapplication.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.todoapplication.entity.Todo;

import jakarta.validation.Valid;

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

	public Todo findById(int id) {
		Predicate<? super Todo> predicate= todo->todo.getId()==id;
		Todo todo = todoList.stream().filter(predicate).findFirst().get();
		return todo;
	}

	public void updateTodo( Todo todo) {
		Todo todoOrg=todoList.stream().filter(t->t.getId()==todo.getId()).findFirst().orElseThrow(()-> new IllegalArgumentException());
		todoOrg.setAuthorName(todo.getAuthorName());
		todoOrg.setCourseName(todo.getCourseName());
		todoOrg.setTargetDate(todo.getTargetDate());
		todoOrg.setIsDone(todo.getIsDone());
		
		
	}

	public void deleteById(int id) {
		Todo todo = todoList.stream().filter(t->t.getId()==id).findFirst().get();
		todoList.remove(todo);
		
	}

}
