package com.wan.tutorial.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.wan.tutorial.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	/*
	 * get user from session attribute
	 */

	@GetMapping("/info")
	public String userInfo(@SessionAttribute("user") User user) {
		System.out.println("Email: " + user.getEmail());
	    System.out.println("First Name: " + user.getFstname());
	    System.out.println("Second Name: " + user.getSecname());
	    return "user";
	}
}
