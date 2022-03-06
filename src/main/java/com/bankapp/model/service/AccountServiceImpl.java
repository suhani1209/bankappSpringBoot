package com.bankapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.exceptions.BankAccountNotFoundException;
import com.bankapp.model.persitance.Account;
import com.bankapp.model.persitance.AccountDao;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.findAll();
	}

	@Override
	public Account getAccountById(int accountId) {
		return accountDao.findById(accountId)
				.orElseThrow(()->new BankAccountNotFoundException("Bank Account Not Found"));
	}

	@Override
	public Account addAccount(Account account) {
		return accountDao.save(account);
	}

	@Override
	public Account deleteAccount(int accountId) {
		Account accDelete=accountDao.getById(accountId);
		accountDao.delete(accDelete);
		return accDelete;
	}

	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		Account fromAcc= getAccountById(fromAccountId);
		Account toAcc= getAccountById(toAccountId);
		
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		accountDao.save(fromAcc);
		accountDao.save(toAcc);
	}

	@Override
	public void deposit(int accountId, double amount) {
		Account accToDeposit= getAccountById(accountId);
		accToDeposit.setBalance(accToDeposit.getBalance()+amount);
		accountDao.save(accToDeposit);
	}

	@Override
	public void withdraw(int accountId, double amount) {
		Account accToWithdraw= getAccountById(accountId);
		accToWithdraw.setBalance(accToWithdraw.getBalance()-amount);
		accountDao.save(accToWithdraw);
	}

//	@Override
//	public Account updateAccountDetails(int accountId, AccountDetailDto accountDetail) {
//		Account account=accountDao.getById(accountId);
//		account.setAddress(accountDetail.getAddress());
//		account.setEmail(accountDetail.getEmail());
//		account.setPhoneNumber(accountDetail.getPhoneNumber());
//		accountDao.save(account);
//		return account;
//	}

	


}
