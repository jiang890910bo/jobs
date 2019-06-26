package com.jiangbo.ssm.controller;

import com.jiangbo.ssm.entity.User;
import com.jiangbo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	private List<User> userList = new ArrayList<User>();
	
	@RequestMapping("/createObject")
	public String createObject(Model model){
		model.addAttribute("user", userService.getUserById(1));
		for(int i = 0;i < 100000000;i++){
			userList.add(userService.getUserById(1));
		}
		
		return "showUser";
	}


	@RequestMapping("/createPool")
	public String createPool(Model model){
		model.addAttribute("user", userService.getUserById(1));
		for(int i = 0;i < 100000000;i++){
			userList.add(userService.getUserById(1));
		}

		return "showUser";
	}
}
