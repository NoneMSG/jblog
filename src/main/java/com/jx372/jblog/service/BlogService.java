package com.jx372.jblog.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.jx372.jblog.repository.BlogDao;

@Service
public class BlogService {
	
	@Autowired
	private BlogDao blogDao;
	
	public Map<String, Object> getMainView(Long userNo) {
		
		return blogDao.mainView(userNo);
	}

}
