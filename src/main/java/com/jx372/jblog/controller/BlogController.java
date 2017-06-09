package com.jx372.jblog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jx372.jblog.service.BlogService;
import com.jx372.jblog.vo.PostVo;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
		@Autowired
		private BlogService blogService;
				
		@RequestMapping("/blog-main/{uno}")
		public String viewBlogMain(
				@PathVariable("uno")Long userNo,
				Model model){
			Map<String, Object> map= blogService.getMainView(userNo);
//			System.out.println("category: "+map.get("categoryList"));
			//System.out.println("---------------------------------------");
			//System.out.println("post: "+map.get("postList"));
//			System.out.println("-----------------------------------------");
//			System.out.println("blog: "+map.get("blogVo"));
//			System.out.println("-----------------------------------------");
			model.addAttribute( "map", map );
			return "/blog/blog-main";
		}
		
		@RequestMapping("/blog-main/{uno}/{no}/{cno}")
		public String viewPosts(
				@PathVariable("no")Long postNo,
				@PathVariable("uno")Long userNo,
				@PathVariable("cno")Long categoyNo,
				Model model){
			Map<String, Object> mainMap= blogService.getMainView(userNo);
			
			Map<String, Long> contentsMap = new HashMap<String, Long>();
			contentsMap.put("postNo", postNo);
			contentsMap.put("categoryNo",categoyNo);
			PostVo postVo = blogService.getPosts(contentsMap);
			
			mainMap.put("postView", postVo);
			System.out.println("==========================");
			System.out.println(mainMap.get("postView"));
			model.addAttribute("map",mainMap);
			
			return "/blog/blog-main";
		}
		//카테고리 선택시 보여주는
		@RequestMapping("/categoryList/{uno}/{cno}")
		public String viewMainByCategory(
				@PathVariable("uno")Long userNo,
				@PathVariable("cno")Long categoryNo,
				Model model){
			Map<String, Object> map= blogService.getMainView(userNo);
			System.out.println("postList=========");
			System.out.println(map.get("postList"));
			List<PostVo> plist = blogService.getPostList(categoryNo,userNo);
			map.put("postList", plist);
			System.out.println("=================");
			System.out.println(plist);
			model.addAttribute("map",map);
			
			return "/blog/blog-main";
		}
	
}
