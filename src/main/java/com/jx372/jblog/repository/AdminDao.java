package com.jx372.jblog.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jx372.jblog.vo.AdminVo;
import com.jx372.jblog.vo.BlogVo;

@Repository
public class AdminDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public BlogVo getBlogInfo(Long userNo) {
		BlogVo blogVo = sqlSession.selectOne("blog.blogInfoByNo",userNo);
		return blogVo;
	}

	public void getBlogInfo(BlogVo blogVo) {
		sqlSession.update("blog.blogInfoUpdate",blogVo);
	}

	public List<AdminVo> getCategoryList(Long userNo) {
		List<AdminVo> list = sqlSession.selectList("blog.cateList", userNo);
		return list;
	}
	public void addCategory(AdminVo adminVo) {
		sqlSession.insert("blog.insetCategory",adminVo);
	}

	public void insertPost(AdminVo adminVo) {
		sqlSession.insert("blog.insertPost",adminVo);
	}

	public List<AdminVo> getCategoryListAjax(Long userNo, Long startNo) {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("userNo", userNo);
		map.put("startNo", startNo);
		List<AdminVo> list = sqlSession.selectList("blog.cateListAjax",map);
		return list;
	}

}
