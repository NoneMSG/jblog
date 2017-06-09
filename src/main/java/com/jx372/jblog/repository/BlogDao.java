package com.jx372.jblog.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jx372.jblog.vo.BlogVo;
import com.jx372.jblog.vo.CategoryVo;
import com.jx372.jblog.vo.PostVo;

@Repository
public class BlogDao {

	@Autowired
	private SqlSession sqlSession;

	public Map<String, Object> mainView(Long userNo) {
		BlogVo blogVo = sqlSession.selectOne("blog.viewBlogMain", userNo);
		blogVo.setUserNo(userNo);
		Map<String, Object> map = new  HashMap<String, Object>();
		map.put("categoryList", categoryList(userNo));
		map.put("postList", postList(userNo));
		map.put("blogVo",blogVo);
		return map;
	}

	public List<CategoryVo> categoryList(Long userNo) {
		List<CategoryVo> list = sqlSession.selectList("blog.viewCategory",userNo);
		return list;
	}

	public List<PostVo> postList(Long userNo) {
		List<PostVo> list = sqlSession.selectList("blog.viewPostList",userNo);
		return list;
	}

	public PostVo postView(Map<String,Long> map) {		
		PostVo postVo = sqlSession.selectOne("blog.viewPost", map);
		return postVo;
	}

	public List<PostVo> postListByCategoryNo(Long categoryNo, Long userNo) {
		Map<String, Long> map = new  HashMap<String, Long>();
		map.put("categoryNo", categoryNo);
		map.put("userNo", userNo);
		List<PostVo> list = sqlSession.selectList("blog.viewPostListByNo",map);
		return list;
	}

}
