package com.cts.training.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddressEntity {
	
	private int id;
	private String houseNumber;
	private String street;
	private String city;
	private  String state;
    //private  List<String> list;
	private Set<String> set;
    //private Map<String> map;
	
    public AddressEntity()
    {
    	
    }
	
	public AddressEntity(int id, String houseNumber, String street, String city, String state, Set<String> set) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.set = set;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}
    
	

}
