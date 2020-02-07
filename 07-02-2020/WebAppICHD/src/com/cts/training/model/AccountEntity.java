package com.cts.training.model;

public class AccountEntity {

	private String accountNumber;
	private String accountType;
	private CustomerEntity customer;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "AccountEntity [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customer="
				+ customer + "]";
	}
	
	
	
}
