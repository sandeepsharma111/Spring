package com.training.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
@RequestMapping("/")
public String hello(ModelMap map) {
	System.out.println("here wer are");
	map.addAttribute("address", "Pune India");
	User user=new User();
	user.setFirstName("Sumit");
	user.setLastName("Mishra");
	user.setContactNo("12121212");
	map.addAttribute("currentUser", user);
	return "hello";
}
@RequestMapping(value="/saveUser")
public String saveUser(@ModelAttribute("currentUser") User user ,ModelMap map) {
	map.addAttribute("updateUser", user);
	return "success";
}


}
