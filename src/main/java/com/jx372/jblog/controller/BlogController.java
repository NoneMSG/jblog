package com.jx372.jblog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jx372.jblog.service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
		@Autowired
		private BlogService blogService;
		
//		@RequestMapping("/blog-main/{no}")
//		public String main(@PathVariable("no")Long no){
//			return "/blog/blog-main";
//		}
		
		@RequestMapping("/blog-main/{uno}")
		public String viewPost(
				@PathVariable("uno")Long userNo,
				Model model){
			Map<String, Object> map= blogService.getMainView(userNo);
			System.out.println("category: "+map.get("categoryList"));
			System.out.println("---------------------------------------");
			System.out.println("post: "+map.get("postList"));
			System.out.println("-----------------------------------------");
			System.out.println("blog: "+map.get("blogVo"));
			System.out.println("-----------------------------------------");
			model.addAttribute( "map", map );
			return "/blog/blog-main";
		}
	
}
