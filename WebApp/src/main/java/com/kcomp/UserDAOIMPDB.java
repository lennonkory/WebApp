package com.kcomp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserDAOIMPDB implements IUserDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(User user) {
       entityManager.persist(user);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
