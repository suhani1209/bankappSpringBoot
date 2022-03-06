package com.bankapp.model.persitance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="account_table")
public class Account {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double balance;
	
	private String phoneNumber;
	private String address;
	private String email;
	
	public Account(String name, Double balance, String phoneNumber, String address, String email) {
		this.name = name;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}

	

	
}
