package com.cts.training.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.PassportDetails;
import com.cts.training.model.Person;

public class MappingController {

	public static void main(String [] args)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
//		Person person=new Person();
//		person.setName("Hameemsha");
//		PassportDetails pDetails=new PassportDetails();
//		pDetails.setPassportNumber("AD343245787");
//		pDetails.setPerson(person);
//		person.setPassport(pDetails);
//		session.save(pDetails);
//		session.save(person);
		
		
		Criteria criteria=session.createCriteria(Person.class);
		//Person p=(Person) criteria.uniqueResult();
		//System.out.println(p.getName());
		
		//List<Person> persons=criteria.add(Restrictions.eq("name","hameemsha")).list();
		List<Person> persons=criteria.add(Restrictions.gt("id",30)).list();
		for(Person p:persons)
		{
			System.out.println(p.getPassport().getPassportNumber());
		}
		
		tx.commit();
		session.close();
	}
}
