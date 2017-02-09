package com.capgemini.main;

import com.capgemini.model.Account;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountService service = new AccountServiceImpl(null);
		Account account = new Account();
		account.setAccountNumber(101);
		account.setAmount(2000);
		try{
		service.createAccount(101, 2000);
		
		service.deposit(500, account);
		
		service.withdraw(500, account);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
