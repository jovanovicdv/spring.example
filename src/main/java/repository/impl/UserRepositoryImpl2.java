package repository.impl;

import entity.User;
import repository.UserRepository;

public class UserRepositoryImpl2 implements UserRepository {

	@Override
	public void save(User user) {
		System.out.println("userRepoImpl 2"+ user.toString());

	}

}
