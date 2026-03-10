package com.rays.polymorphism;

public class Bank {
	
	public  String getName() {
		return "RBI Bank";
	}
	
	public double interestRate() {
		return 11.0;
	}
	
	public static Bank getBank(int i) {
		
		if(i==1) 
		 return new HDFC_Bank();
		
		if(i==2)
			return new ICICI_Bank();
		
		if(i==3)
			return new Axis_Bank();
		
		return new Bank();
		
		
		
	}

	

}
