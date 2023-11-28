package com.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.model.Account;
import com.accounts.model.Customer;
import com.accounts.service.AccountsService;

@RestController 
public class AccountsController {
	
	 

	@Autowired
	AccountsService accountsService;

	@GetMapping("api/v1/accounts/{customerId}")
	public Account getAccountDetails(@PathVariable("customerId") Integer customerId) {
		Account account = accountsService.findByCustomerId(customerId);

		if (account != null) {
			return account;
		}

		return null;

	}

}
