package com.jx372.jblog.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jx372.jblog.dto.JsonResult;
import com.jx372.jblog.service.AdminService;
import com.jx372.jblog.vo.AdminVo;
import com.jx372.jblog.vo.UserVo;
import com.jx372.security.AuthUser;

@Controller("adminControllerApi")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@ResponseBody
	@RequestMapping("/blog/api/blog-admin-category")
	public JsonResult category(
			@AuthUser UserVo authUser,
			@RequestParam(value="sno", required=true, defaultValue="0")Long startNo,
			Model model){
		
		List<AdminVo> categoryList = adminService.getCategoryListAjax(authUser.getNo(),startNo);
	
		return JsonResult.success(categoryList);
	}

}
