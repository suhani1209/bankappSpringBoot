package com.bankapp.model.service;

import com.bankapp.model.persitance.User;

public interface UserService {
	public void AddUser(User user);
	public User getUserByUsername(String username);
}
