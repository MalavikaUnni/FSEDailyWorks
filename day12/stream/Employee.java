package com.cts.stream;

import java.io.Serializable;

public class Employee implements Serializable {
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -390191234184071418L;
	
		private int id;
		private String name;
		transient private String adress;
		private int age;
		private double salary;
		transient private double phone;
		
		
		public Employee(int id, String name, String adress, int age, double salary, double phone) {
			super();
			this.id = id;
			this.name = name;
			this.adress = adress;
			this.age = age;
			this.salary = salary;
			this.phone = phone;
		}
		
		
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
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getPhone() {
			return phone;
		}
		public void setPhone(double phone) {
			this.phone = phone;
		}


		@Override
		public String toString() {
			return id+" :" +name+ " :" +adress+ ":" +age+ ":" +salary+ ":" +phone;
			}

	}



