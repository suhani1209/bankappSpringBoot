package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
	private Integer id;
	private String name;
	private Double balance;
	
	private String phoneNumber;
	private String address;
	private String email;
	
	
}