package com.jx372.jblog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jx372.jblog.service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
		@Autowired
		private BlogService blogService;
		
		@RequestMapping("/blog-main/{no}")
		public String main(@PathVariable("no")Long no){
			return "/blog/blog-main";
		}
		
		public String viewPost(
				@RequestParam(value="uno",required=true, defaultValue="")Long userNo,
				Model model){
			Map<String, Object> map= blogService.getMainView(userNo);
			return "/blog/blog-main";
		}
	
}
