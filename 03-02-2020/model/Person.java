package com.cts.training.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	//onetoone mapping
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passpord_id")
	private PassportDetails passport;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PassportDetails getPassport() {
		return passport;
	}
	public void setPassport(PassportDetails passport) {
		this.passport = passport;
	}
	
	
}
