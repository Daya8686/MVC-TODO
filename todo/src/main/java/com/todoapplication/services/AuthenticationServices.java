package com.todoapplication.services;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServices {
	
	public boolean userAuthentication(String username, String password) {
		return (username.equals("Daya")&&password.equals("Dev"));
	}

}
