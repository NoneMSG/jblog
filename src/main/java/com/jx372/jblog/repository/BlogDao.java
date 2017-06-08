package com.jx372.jblog.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jx372.jblog.vo.BlogVo;

@Repository
public class BlogDao {

	@Autowired
	private SqlSession sqlSession;

	public Map<String, Object> mainView(Long userNo) {
		BlogVo blogVo = sqlSession.selectOne("blog.viewBlogMain", userNo);
		
		Map<String, Object> map = new  HashMap<String, Object>();
		map.put("categoryList", categoryList());
		map.put("postList", postList());
		map.put("blogVo",blogVo);
		return map;
	}

	public List<BlogVo> categoryList() {
		List<BlogVo> list = sqlSession.selectList("blog.viewCategory");
		return list;
	}

	public List<BlogVo> postList() {
		List<BlogVo> list = sqlSession.selectList("blog.viewPost");
		return list;
	}

}
