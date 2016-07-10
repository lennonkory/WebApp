package com.kcomp;

import java.util.List;

public interface IUserDAO {

	public void save(User user);
	public User getUser(int id);
	public List<User> getUsers();
	public List<User> getUsers(String name);
	
	
}
