package com.jx372.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx372.jblog.repository.UserDao;
import com.jx372.jblog.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public void getSignUp(UserVo userVo) {
		userDao.signUp(userVo);
	}
	
	public UserVo getUser(String id, String password){
		return userDao.logIn(id, password);
	}
}
