package com.sandy.mvc;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value={"/home"})
	public String home(){
		return "home";
	}
	@RequestMapping(value={"/","/login"})
	public String login(){
		return "login";
	}
	@RequestMapping(value="/processlogin")
	public String processlogin(ModelMap map){
		String loginName=SecurityContextHolder.getContext().getAuthentication().getName();
		map.put("user", loginName);
		return "home";
	}
}
