package com.jx372.jblog.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.jx372.jblog.repository.BlogDao;
import com.jx372.jblog.vo.PostVo;

@Service
public class BlogService {
	
	@Autowired
	private BlogDao blogDao;
	
	public Map<String, Object> getMainView(Long userNo) {
		return blogDao.mainView(userNo);
	}

	public PostVo getPosts(Map<String, Long> map) {
		return blogDao.postView(map);
	}

	public List<PostVo> getPostList(Long categoryNo,Long userNo) {
		return blogDao.postListByCategoryNo(categoryNo, userNo);
	}

}
