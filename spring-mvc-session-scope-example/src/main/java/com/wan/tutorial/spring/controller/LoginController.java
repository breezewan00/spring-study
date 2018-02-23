package com.wan.tutorial.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.wan.tutorial.model.User;

@Controller
@SessionAttributes(value = "user")
public class LoginController {
	@ModelAttribute("user") //userをsession scopeにinput
	public User setUpUserForm() {
		return new User();
	}

	@GetMapping("/") //if url = / index()実行
	public String index() {
		return "index";
	}

	@PostMapping("/dologin")  //if url = /dologin doLogin実行
	public String doLogin(@ModelAttribute("user") User user, Model model) {
		if (user.getEmail().equals("aaa@gmail.com")&&user.getPassword().equals("aaaaaa")) {
			user.setFstname("Wan");
			user.setSecname("Tianyi");
			user.setAge(24);
		} else {
			model.addAttribute("message", "Login Failed");
			return "index";  //redirect
		}
		return "success";
	}
}
