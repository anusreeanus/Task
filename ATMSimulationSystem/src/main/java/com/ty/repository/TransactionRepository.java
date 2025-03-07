package com.ty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.model.Account;
import com.ty.model.Transaction;



public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByAccountId(Account account);
}
