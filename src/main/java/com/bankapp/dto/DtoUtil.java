package com.bankapp.dto;

import com.bankapp.model.persitance.Account;
import com.bankapp.model.persitance.User;

public class DtoUtil {
	public static Account convertToAccount(AccountDto accountDto) {
		Account account=new Account();
		account.setName(accountDto.getName());
		account.setAddress(accountDto.getAddress());
		account.setBalance(accountDto.getBalance());
		account.setEmail(accountDto.getEmail());
		account.setPhoneNumber(accountDto.getPhoneNumber());
		
		return account;
	}
	public static User convertToUser(UserDto userDto) {
		User user=new User();
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		user.setProfile(userDto.getProfile());
		user.setEmail(userDto.getEmail());
		return user;
	}
	
}
