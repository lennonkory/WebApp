package com.kcomp;


import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImp implements UserService{

	
	private IUserDAO userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);
		
	}
	
	public void setUserDao(IUserDAO i){
		this.userDao = i;
	}

}
