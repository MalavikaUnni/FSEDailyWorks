package com.cts.training.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.spring.dao.RegisterDAO;
import com.cts.training.spring.model.Register;

public class RegisterController {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		RegisterDAO registerDAO = (RegisterDAO) context.getBean("registerDAOImpl");
		
		
//		Insertion
//		Register register=new Register(1,"Malavika","mal@gmail.com",9876543210L, "mal", "pass");
//		System.out.println(registerDAO.saveUser(register));

		
// 		GetUSerBYID
		Register register=new Register();
//		System.out.println(registerDAO.getUserById(1));
		
//
//		System.out.println(registerDAO.getAllUsers());
		
		System.out.println(registerDAO.deleteUser(register));
		
	}

	}


