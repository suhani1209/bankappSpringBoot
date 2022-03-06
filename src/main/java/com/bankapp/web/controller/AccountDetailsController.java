package com.bankapp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.DtoUtil;
import com.bankapp.model.service.AccountService;

@Controller
@RequestMapping(path = "accountops")
public class AccountDetailsController {
	private AccountService accountService;

	@Autowired
	public AccountDetailsController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	

	//-------------transfer---------------
	@GetMapping(path = "accounts")
	public ModelAndView accountsGet(ModelAndView mv) {
		mv.setViewName("addaccounts");
		mv.addObject("accountDto", new AccountDto());
		return mv;
	}
	@PostMapping(path = "accounts")
	public String transferPost(@ModelAttribute AccountDto accountDto) {
		
		accountService.addAccount(DtoUtil.convertToAccount(accountDto));
		
		return "redirect:success";
	}
	
	
	
	@GetMapping(path = "success")
	public String transferGet() {
		return "success";
	}
}
