package com.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferDto {
	private Integer fromAccountId;
	private Integer toAccountId;
	private Double amount;
}
