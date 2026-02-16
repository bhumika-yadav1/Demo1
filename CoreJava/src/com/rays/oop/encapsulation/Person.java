package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {
	
	private String name; 
	private String address;
	private Date dob;
	public final static int Avg_Age = 18;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getDob() {
		return this.dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getAge(Date dob) {
		Date now = new Date();
		int age = now.getYear()-dob.getYear();
		return age;
	}

}
