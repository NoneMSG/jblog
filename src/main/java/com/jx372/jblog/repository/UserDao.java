package com.jx372.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jx372.jblog.vo.UserVo;

@Repository
public class UserDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public boolean signUp(UserVo userVo) {
		int count = sqlSession.insert("user.createUser",userVo);
		createBlog(userVo);
		return count==1;
	}
	
	private boolean createBlog(UserVo userVo){
		String blogTitle = userVo.getName()+"의 블로그";
		String logoPath = "/jblog/assets/images/spring-logo.jpg";
		
		Long userNo = userVo.getNo();
		Map<String, String> map = new HashMap<String, String>();
		map.put("userNo", Long.toString(userNo));
		map.put("title", blogTitle);
		map.put("logoPath", logoPath);
		
		int count = sqlSession.insert("blog.createBlog",map);
		return count==1;
	}

	public UserVo logIn(String id, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);
		UserVo vo = sqlSession.selectOne("user.userInfo", map);
		System.out.println(vo);
		return vo;
	}
}
