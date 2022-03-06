package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDetailDto {
	private Integer id;
	
	private String phoneNumber;
	private String address;
	private String email;
}
