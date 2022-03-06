package com.bankapp.secconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankapp.model.persitance.User;
import com.bankapp.model.service.UserService;

@Service
public class MyUserDetailService implements UserDetailsService {

	private UserService userService;

	@Autowired
	public MyUserDetailService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("user is not found");
		}
		// how to conver our user to the user that is undertandaable by spring sec
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				AuthorityUtils.createAuthorityList(user.getProfile()));
	}

}
