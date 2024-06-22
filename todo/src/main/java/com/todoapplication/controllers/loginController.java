package com.todoapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.todoapplication.services.AuthenticationServices;

@Controller
public class loginController {
	
	@Autowired
	private AuthenticationServices authenticationServices;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
		
	}
	
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginPage(@RequestParam String username, @RequestParam String password, ModelMap model) {
		System.out.println(username+" ------ "+password);
		if(!authenticationServices.userAuthentication(username, password)) {
			model.put("error", "Invalide username or password");
			return "login";
		}
		model.put("username", username);
		return "welcome";
		
	}

}
