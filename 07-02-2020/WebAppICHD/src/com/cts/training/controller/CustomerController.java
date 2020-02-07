package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.AccountEntity;
import com.cts.training.model.CustomerEntity;
import com.cts.training.model.FundTransferEntity;

public class CustomerController {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		FundTransferEntity entity= (FundTransferEntity)context.getBean("fund");
		//System.out.println(entity.getAmount());
		AccountEntity accSender=entity.getSender();
		AccountEntity accReceiver=entity.getReceiver();
		//System.out.println(acc.getAccountNumber());
		CustomerEntity cust1=accSender.getCustomer();
		CustomerEntity cust2=accReceiver.getCustomer();
		System.out.println(accSender);
		System.out.println(accReceiver);
		

	}

}
