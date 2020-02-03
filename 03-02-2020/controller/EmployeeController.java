package com.cts.training.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.ContractEmployee;
import com.cts.training.model.Employee;
import com.cts.training.model.PermanentEmployee;

public class EmployeeController  {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Employee employee=new Employee();
		employee.setName("Malavika Unni");
		
		
		PermanentEmployee pe=new PermanentEmployee();
		pe.setSalary(23435);
		pe.setBonus(44F);
		
		ContractEmployee ce=new ContractEmployee();
		ce.setPayPerHour(2000);
		ce.setContractPeriod(12);
		session.save(employee);
		session.save(pe);
		session.save(ce);
		
//		Map<String, String> emails=new HashMap<String, String>();
//		emails.put("Gmail_Email","malavika@gmail.com");
//		emails.put("Yahoo_Emaill","malavike@yahoo.com");
//		emails.put("Business_Email","malavika@cts.com");
		//employee.setEmails(emails);
		
//		employee.setEmails (new String []{"emailaddress1@provider1.com", "emailaddress2@provider2.com", "emailaddress3@provider3.com", "emailaddress4@provider4.com"});
//     	session.save(employee);
//		
		
		tx.commit();
		session.close();

	}

}
