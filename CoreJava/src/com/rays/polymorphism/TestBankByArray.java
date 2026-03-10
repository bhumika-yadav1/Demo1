package com.rays.polymorphism;

public class TestBankByArray {
	
	public static void main (String[] args) {
		
		Bank[] banks = new Bank[3];
		
		banks[0] = new HDFC_Bank();
		banks[1] = new ICICI_Bank();
		banks[2] = new Axis_Bank();
		
		homeLoanEnquiry(banks);
	}
	
	public static void homeLoanEnquiry(Bank[] banks) {
		for(int i = 0; i<=banks.length; i++) {
			System.out.println(banks[i].getName());
			System.out.println(banks[i].interestRate());
		}
	}

}
