package com.cts.training.model;

public class CustomerEntity {
	
	private int id;
	private String customerName;
	private long phone;
//	private String accountNumber;
//	private String accountType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	public String getAccountType() {
//		return accountType;
//	}
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", customerName=" + customerName + ", phone=" + phone + "]";
	}
	

	
	
}
