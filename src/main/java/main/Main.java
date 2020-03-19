package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyBeanConfig;
import entity.User;
import service.UserService;

public class Main {
	



	public static void main(String[] args) {
		BeanFactory factory = new AnnotationConfigApplicationContext(MyBeanConfig.class);
		UserService userService = factory.getBean("userService", UserService.class);
		userService.save(new User("pera", "peric"));

	}

	
	







	


}
