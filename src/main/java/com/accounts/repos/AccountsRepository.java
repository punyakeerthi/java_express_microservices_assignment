package com.accounts.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accounts.model.Account;

@Repository
public interface  AccountsRepository extends JpaRepository<Account, Integer>  {
	
	Account findByCustomerId(Integer customerId);

}
