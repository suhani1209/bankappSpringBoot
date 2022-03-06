package com.bankapp.secconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	private UserDetailsService userDetailsService;
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/accountops/**").hasAnyRole("MGR")
		.antMatchers("/transaction/**").hasAnyRole("CLERK","MGR")
		.antMatchers("/home/**").permitAll()
		.and().formLogin()
		.loginPage("/login").loginProcessingUrl("/banklogin")
		.usernameParameter("uname").passwordParameter("upass")
		.defaultSuccessUrl("/home")
		.permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/accessdenied")
		.and().sessionManagement().maximumSessions(1);
		
		http
        .logout(logout -> logout
          .logoutUrl("/logout")
          .permitAll()
          .addLogoutHandler(new SecurityContextLogoutHandler())
        );
  }

	
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return new BCryptPasswordEncoder(); 
	}
	
}
