package com.company;

import java.util.Scanner;
import java.util.Date;

public class Banking extends Main {
	Scanner inputs = new Scanner(System.in);
	String name;
	long accountNumber;
	long routingNumber;
	private long SSN;
	private String Address;
	public Date date;
	String accountType;
	double balance;
	Banking() {

	}
	Banking(String name, long accountNumber, long routingNumber, String accountType, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
		this.accountType = accountType;
		this.balance = balance;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return this.name;
	}

	public void setAccountNumber(long accountNumber) {

		this.accountNumber = accountNumber;
	}

	public long getAccountNumber() {

		return this.accountNumber;
	}

	public void setRoutingNumber(long routingNumber) {

		this.routingNumber = routingNumber;
	}

	public long getRoutingNumber() {

		return this.accountNumber;
	}

	public void setAccountType(String accountType) {

		this.accountType = accountType;
	}

	public String getAccountType() {

		return this.accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public static char getInputtedCharacter ()
	{
		return inputs.next().charAt(0);
	}

	double deposit (double amount){
		return this.balance += amount;
	}

	double withdraw ( double amount){
		return this.balance -= amount;
	}



//	public void SwitchStatement() {
//		switch (getInputtedCharacter()) {
//			case 'D' -> {
//				System.out.print("Enter the amount you want to deposit?");
//				double amount = inputs.nextDouble();
//				deposit(amount);
//			}
//			case 'W' -> {
//				System.out.print("Enter the amount you want to withdraw:");
//				double amount = inputs.nextInt();
//				withdraw(amount);
//				System.out.print(amount + "has been from your account");
//
//			}
//			case 'B' -> {
//				System.out.print("Your balance is:");
//				System.out.print(balance);
//			}
//			case 'E' -> {
//
//				System.out.print("Thank you for using this Banking System");
//			}
//			default -> {
//				System.out.print("Option does not exist");
//			}
//		}
//
//	}

}





