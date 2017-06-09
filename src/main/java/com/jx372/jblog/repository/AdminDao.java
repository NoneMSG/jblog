package com.jx372.jblog.repository;

import java.util.List;

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
	private Long getPostCountInCategory(){
		return 0L;
	}
	public void addCategory(AdminVo adminVo) {
		sqlSession.insert("blog.insetCategory",adminVo);
	}

}
