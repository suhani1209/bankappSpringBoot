package com.bankapp.model.exceptions;

import java.util.function.Supplier;

public class BankAccountNotFoundException extends RuntimeException {

	public BankAccountNotFoundException(String arg0) {
		super(arg0);
	}

	
}
