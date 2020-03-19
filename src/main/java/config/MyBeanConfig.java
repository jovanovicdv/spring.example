package config;

import org.springframework.context.annotation.Bean;

import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;
import service.impl.UserServiceImpl;

public class MyBeanConfig {
	@Bean(name = "userRepository")
	public UserRepository getUserRepository() {
		return new UserRepositoryImpl();
	}
	
	@Bean(name = "userService")
	public UserService getUserService() {
		return new UserServiceImpl();
	}

}
