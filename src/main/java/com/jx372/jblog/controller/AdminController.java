package com.jx372.jblog.controller;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jx372.jblog.service.AdminService;
import com.jx372.jblog.vo.AdminVo;
import com.jx372.jblog.vo.BlogVo;
import com.jx372.jblog.vo.UserVo;
import com.jx372.security.AuthUser;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/blog/blog-admin-basic/{uno}", method=RequestMethod.GET)
	public String basic(@AuthUser UserVo authUser,
			Model model, @ModelAttribute BlogVo blogVo){
			BlogVo blogInfo = adminService.getBlogInfo(authUser.getNo());

//			System.out.println(blogInfo);
			model.addAttribute("blogInfo",blogInfo);
			//String uno = userNo.toString();
		return "/blog/blog-admin-basic";
	}
	@RequestMapping(value="/blog/blog-admin-basic", method=RequestMethod.POST)
	public String basic(@RequestParam(value="file") MultipartFile file,
			@AuthUser UserVo authUser,
			 @ModelAttribute BlogVo blogVo){
			String proFileUrl = adminService.restore(file);
			blogVo.setLogoPath(proFileUrl);
			blogVo.setUserNo(authUser.getNo());
			String uno = authUser.getNo().toString();
			adminService.getUpdateBlogInfo(blogVo);
			//System.out.println(blogVo);
		return "redirect:/blog/blog-main/"+uno;
	}
	
	@RequestMapping("/blog/blog-admin-category")
	public String category(@AuthUser UserVo authUser, 
			Model model){
		
		List<AdminVo> categoryList = adminService.getCategoryList(authUser.getNo());
		model.addAttribute("categoryList",categoryList);
		//System.out.println("=============");
		//System.out.println(categoryList);
		return "/blog/blog-admin-category";
	}
	
	@RequestMapping(value="/blog/blog-admin-category",method=RequestMethod.POST)
	public String category(@AuthUser UserVo authUser,
		//	@RequestParam(value="name")String name,
		//	@RequestParam(value="description")String disc,
			@ModelAttribute AdminVo adminVo,
			Model model){
		
		adminVo.setUserNo(authUser.getNo());
		System.out.println(adminVo);
		adminService.addCategory(adminVo);
		return "redirect:/blog/blog-admin-category";
	}
	
	@RequestMapping("/blog/blog-admin-write")
	public String write(){
		return "/blog/blog-admin-write";
	}
	
	
	@RequestMapping(value="/blog/blog-admin-write", method=RequestMethod.POST)
	public String write(Model model){
		return "redirect:/blog/blog-main";
	}
	
	
}
