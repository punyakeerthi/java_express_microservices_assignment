package com.accounts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.model.Account;
import com.accounts.repos.AccountsRepository;

@Service
public class AccountsService {

	@Autowired
	AccountsRepository accountsRepository;

	public Account findByCustomerId(int customerId) {

		return accountsRepository.findByCustomerId(customerId);
	}

}
