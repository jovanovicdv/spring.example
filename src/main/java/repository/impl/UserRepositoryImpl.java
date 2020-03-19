package repository.impl;

import entity.User;
import repository.UserRepository;


public class UserRepositoryImpl implements UserRepository {

	public void save(User user) {
		System.out.println("userRepoImpl"+ user.toString());
		
	}

}
