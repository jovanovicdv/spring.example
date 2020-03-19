package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import entity.User;
import repository.UserRepository;
import service.UserService;


public class UserServiceImpl implements UserService{
	private  UserRepository userRepository;
	
	
	
	


	public void save(User user) {
		userRepository.save(user);
		
	}

	@Autowired
	@Qualifier(value = "userRepository")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
