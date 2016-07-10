package com.kcomp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String []args){
		  ApplicationContext applicationContext = 
		            new AnnotationConfigApplicationContext(Config.class);
		        
		        UserService userService = applicationContext.getBean(UserService.class);
		        
		        User user = new User();
		        user.setName("Bob");
		        userService.save(user);
	}
	
}
