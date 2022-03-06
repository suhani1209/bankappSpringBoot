package com.bankapp.web.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.dto.DtoUtil;
import com.bankapp.dto.UserDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.model.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;


	@GetMapping(path = "login")
	public String appLogin() {
		return "login";
	}
	
	@GetMapping(path = "accessdenied")
	public ModelAndView accessdenied(Principal principal, ModelAndView mv) {
		mv.addObject("username", principal.getName());
		mv.setViewName("403");
		return mv;
	}
	@GetMapping("/logout")
	public String logout()
	{
		return "login";
	}
	
	@GetMapping(path = "adduser")
	public ModelAndView addUserGet(ModelAndView mv) {
		mv.setViewName("userlogin");
		mv.addObject("userDto", new UserDto());
		return mv;
	}
	@PostMapping(path = "adduser")
	public String withdrawPost(@ModelAttribute UserDto userDto) {
		userService.AddUser(DtoUtil.convertToUser(userDto));
		return "redirect:success";
	}
	
	@GetMapping(path = "success")
	public String transferGet() {
		return "success_user_registered";
	}
}
