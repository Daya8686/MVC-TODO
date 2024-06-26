package com.todoapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.todoapplication.util.UserInfo;


@Controller
@SessionAttributes("username")
public class welcomeController {
	
	@Autowired
	private UserInfo userInfo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		model.addAttribute("username",userInfo.getUsernameFromAuthentication());
		return "welcome";
		
	}
	
}
