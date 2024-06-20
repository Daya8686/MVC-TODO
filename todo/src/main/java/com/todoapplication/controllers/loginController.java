package com.todoapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String loginPage(@RequestParam String username, @RequestParam String password) {
		System.out.println(username+" ------ "+password);
		if(!authenticationServices.userAuthentication(username, password)) {
			
			return "login";
		}
		return "welcome";
		
	}

}
