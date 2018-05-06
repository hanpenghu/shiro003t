package com.hanhan.controller;

import com.hanhan.test1.dto.ActiveUser;
import com.hanhan.test1.hanhan.p;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstAction {
	//系统首页
	@RequestMapping("/first")
	public String first(Model model)throws Exception{
		p.p("-------------------------------------------------------");
		p.p("FirstAction开始");
		p.p("-------------------------------------------------------");
		
		//从shiro的session中取activeUser
		Subject subject = SecurityUtils.getSubject();
		//取身份信息
		ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
//		//通过model传到页面
		model.addAttribute("activeUser", activeUser);
		
		return "/WEB-INF/jsp/first.jsp";
	}
	
	//欢迎页面
	@RequestMapping("/welcome")
	public String welcome(Model model)throws Exception{
		
		return "/welcome";
		
	}
}	
