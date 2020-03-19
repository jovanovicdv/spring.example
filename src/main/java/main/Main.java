package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;
import entity.User;
import service.UserService;

public class Main {
	



	public static void main(String[] args) {
		Main main = new Main();
		main.saveUser(new User("pera", "peric"));

	}

	
	


	private void saveUser(User user) {
		BeanFactory factory = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		UserService userService = factory.getBean("userService", UserService.class);
		userService.save(user);
		
	}



}
