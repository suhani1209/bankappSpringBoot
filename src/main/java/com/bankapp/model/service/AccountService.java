package com.bankapp.model.service;

import java.util.List;

import com.bankapp.dto.AccountDetailDto;
import com.bankapp.model.persitance.Account;

public interface AccountService {
	public List<Account> getAllAccounts();
	public Account getAccountById(int accountId);
	public Account addAccount(Account account);
	//public Account updateAccountDetails(int accountId, AccountDetailDto accountDetail);
	public Account deleteAccount(int accountId);
	
	
	public void transfer(int fromAccountId, int toAccountId, double amount);
	public void deposit(int accountId,double amount);
	public void withdraw(int accountId,double amount);
}
