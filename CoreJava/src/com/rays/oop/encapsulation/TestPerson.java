package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Person p1 = new Person();
		
		p1.setName("nancy");
		p1.setDob(sdf.parse("2002/02/04"));
		p1.setAddress("Indore");
				
				System.out.println("p1 name:" + p1.getName());
				System.out.println("p1 address:" + p1.getAddress());
				System.out.println("p1 dob:" + p1.getDob());
				System.out.println("p1 age" + p1.getAge(p1.getDob()));
				
	}

}
