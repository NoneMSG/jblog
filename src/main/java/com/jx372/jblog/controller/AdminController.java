package com.jx372.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

	@RequestMapping("/blog/blog-admin-basic")
	public String basic(){
		return "/blog/blog-admin-basic";
	}
	
	@RequestMapping("/blog/blog-admin-category")
	public String category(){
		return "/blog/blog-admin-category";
	}
	
	@RequestMapping("/blog/blog-admin-write")
	public String write(){
		return "/blog/blog-admin-write";
	}
	
	@RequestMapping(value="/blog/blog-admin-basic", method=RequestMethod.POST)
	public String basic(Model model){
		return "redirect:/blog/blog-main";
	}
	
	@RequestMapping(value="/blog/blog-admin-write", method=RequestMethod.POST)
	public String write(Model model){
		return "redirect:/blog/blog-main";
	}
	
	
}
