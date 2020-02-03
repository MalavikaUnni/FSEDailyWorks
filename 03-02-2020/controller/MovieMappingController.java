package com.cts.training.controller;

import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class MovieMappingController {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//Insertion
//		Movie movie= new Movie();
//		movie.setName("L2");
//		Actor actors = new Actor();
//		actors.setActorName("Mohanlal");
//		actors.setMovie(movie);
//        //movie.setActors((Set<Actor>) actors);
//		session.save(movie);
//		session.save(actors);


		
		//many-to-one
		
//		Criteria criteria = session.createCriteria(Actor.class);
//		criteria.add(Restrictions.eq("actorName", "Mohanlal"));
//		Actor actor = (Actor) criteria.uniqueResult();
//
//		System.out.println(actor.getActorName());
//		System.out.println(actor.getMovie().getName());

		
		//one-to-many
		
		Criteria criteria = session.createCriteria(Movie.class);
		criteria.add(Restrictions.eq("id", 37));
		Movie movie = (Movie) criteria.uniqueResult();
		System.out.println(movie.getName());

		Set<Actor> actors = movie.getActors();
		for(Actor actor : actors){
		  System.out.println(actor.getActorName());
		}
		
		
		tx.commit();
		session.close();

	}

}
