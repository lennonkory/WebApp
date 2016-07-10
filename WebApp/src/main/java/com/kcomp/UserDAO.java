package com.kcomp;

import java.util.*;

public class UserDAO implements IUserDAO{

	private List<User> users;
	
	@Override
	public void save(User user) {
		users.add(user);
	}

	@Override
	public User getUser(int id) {
		for(User u : users){
			if(u.getId() == id){
				return u;
			}
		}
		return null;
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

	@Override
	public List<User> getUsers(String name) {
		
		List<User> requestedUsers = new ArrayList<>();
		
		for(User u : users){
			if(u.getName().equals(name)){
				requestedUsers.add(u);
			}
		}
		return requestedUsers;
	}

}
