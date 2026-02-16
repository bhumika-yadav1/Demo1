package com.rays.oop.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setAccNumber("478923782658732");
		a1.setAccType("current");
		a1.setBalance(1000.00);
		
		System.out.println("a1 account no :"  + a1.getAccNumber());
		System.out.println("a1 account type:" + a1.getAccType());
		System.out.println("a1 account balance:"+ a1.getBalance());
		
		a1.deposit(1000.00);
		a1.withdrawl(500.00);
		
		
	}

}
