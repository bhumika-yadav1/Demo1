package com.rays.oop.encapsulation;

public class Account {
		
		private String accNumber;
		private String accType;
		private double balance;
		
		public String getAccNumber() {
			return accNumber;
		}
		
		public void setAccNumber(String accNumber) {
			this.accNumber = accNumber;			
		}
		
		public String getAccType() {
			return accType;
		}
		
		public void setAccType(String accType) {
			this.accType = accType;
		}
		
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void deposit(double amount) {
			balance = balance + amount;
			System.out.println(balance);		
		}
		
		public void withdrawl(double amount) {
			if(amount>balance) {
				System.err.println("insufficient fund transfer");
			}
			else {
				balance = balance-amount;
				System.out.println(balance);
			}
		}
		
		
		
	

}
