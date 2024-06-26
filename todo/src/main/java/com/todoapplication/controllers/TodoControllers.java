package com.todoapplication.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.todoapplication.entity.Todo;
import com.todoapplication.services.TodoServices;
import com.todoapplication.util.UserInfo;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("username")
public class TodoControllers {
	@Autowired
	private TodoServices todoServices;

	@Autowired
	private UserInfo userInfo;

	@RequestMapping("todos")
	public String todos(ModelMap model) {
		String username = userInfo.getUsernameFromAuthentication();
		List<Todo> allTodos = todoServices.findByUsername(username);
		System.out.println(username);
		model.addAttribute("username", username);
		model.put("todos", allTodos);
		return "todos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String addTodoPage(ModelMap model, HttpSession httpSession) { // Writing Modelmap here because we have
																			// written modelAttribute in JSP
		String username = (String) httpSession.getAttribute("username");
		System.out.println(username);
		Todo todo = new Todo(0, "", username, "", LocalDate.now(), false);
		model.addAttribute("todo", todo);
		return "addTodo";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addedTodo(@Valid Todo todo, BindingResult bindingResult, HttpSession httpSession, ModelMap model) {
		if (bindingResult.hasErrors()) {
			return "addTodo";
		}
		String username = (String) httpSession.getAttribute("username");
		todo.setUsername(username);
		todo.setIsDone(false);
		todoServices.addTodo(todo);
		return "redirect:todos";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String updateTodoPage(ModelMap modelMap, @RequestParam int id, Todo todo) {
		todo = todoServices.findById(id);
		modelMap.addAttribute("todo", todo);
		return "updateTodo";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodo(@Valid Todo todo, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for (ObjectError e : allErrors) {
				System.out.println(e);
			}
			return "updateTodo";
		}
		todoServices.updateTodo(todo);
		return "redirect:todos";
	}

	@RequestMapping(value = "delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		todoServices.deleteById(id);
		return "redirect:todos";
	}

}
