package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.persitance.Account;
import com.bankapp.model.persitance.User;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.UserService;

@SpringBootApplication
public class BankappApplication implements CommandLineRunner{

//	@Autowired
//	private AccountService accountService;
	
	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.AddUser(new User("aaa", "bbb", "ROLE_MGR", "aaa@gmail.com"));
//		userService.AddUser(new User("mmm", "nnn", "ROLE_CLERK", "mmm@gmail.com"));
		
//		accountService.addAccount(new Account("shubham", 50000.00, "9281881111", "new delhi", "sks@gmail.com"));
//		accountService.addAccount(new Account("ranjan", 50000.00, "9290020114", "new delhi", "ran@gmail.com"));

		
	}

}
