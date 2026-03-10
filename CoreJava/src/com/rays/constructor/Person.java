package com.rays.constructor;

public class Person {

	private String name;
	private String address;
	
	public Person() {
		System.out.println("this is default class");
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}

}
