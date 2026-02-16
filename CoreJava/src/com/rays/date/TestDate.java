package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		System.out.println("-------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(d));

		System.out.println("-----------------");
		
		String dob = "2005-10-30";
		System.out.println(dob);
		
		System.out.println("----------------");

		Date d1 = sdf.parse(dob);
		 System.out.println(d1);
	}

}
