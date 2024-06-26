package com.todoapplication.configuration;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class springSecurityConfiguration {
	
	
	Function<String, String> passwordEncod= userInfo->passwordEncoder().encode(userInfo);
	@Bean
	public InMemoryUserDetailsManager creatingUserInformation() {
		
		UserDetails user1 = extracted("Daya", "Dev");
		UserDetails user2 =extracted("DayaSagar","Dev");
		return new InMemoryUserDetailsManager(user1,user2);
	}

	private UserDetails extracted(String username, String password) {
		UserDetails user = User.builder()
			.passwordEncoder(passwordEncod)
			.username(username)
			.password(password)
			.roles("ADMIN","USER").build();
		return user;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	
	
	

}
