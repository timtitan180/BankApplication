package com.company;


import java.util.Scanner;

public class CheckingAccount extends Banking {
	final Scanner input = new Scanner(System.in);
	CheckingAccount() {

		super();
	}

	double deposit(int amount) {

		return super.balance += amount;
	}
	
	double withdraw(int amount) {

		return super.balance -= amount;
	}

	
	void doesTransaction() {
		System.out.print("Would you like to deposit funds from your checking account"
		+ "withdraw or just view your balance\nEnter key[D] to deposit, [W] to withdraw or [B]"
		+ "to view balance:");
		String getCharacterKey = input.nextLine();
		String upperCaseCharacter = getCharacterKey.toUpperCase();
		switch(upperCaseCharacter) {
		case "D":
			System.out.print("Enter the amount you want to deposit:");
			int	amountToDeposit = input.nextInt();
			deposit(amountToDeposit);
			break;
		case "W": 
			System.out.print("Enter the amount you want to withraw");
			int	amountToWithdraw = input.nextInt();
			if(withdraw(amountToWithdraw)<0) {
				System.out.print("You have insufficient funds to withdraw from your account");
				System.out.print("You can withdraw money from your account if you have Overdraft Capability");
				System.out.print("Do you want to see if you qualify?");
			}
			break;
			
		case "B":
			getBalance();
			break;
		}
	}
	
	void afterChosenTransaction() {
		System.out.print("Would you like to do anything else?");
		String getAnswer = input.nextLine();
		if(getAnswer.equals("Y") || getAnswer.equals("y"))  {
			System.out.print("Thank you for using this Banking System. Have a great day! :}");
			
		}
		doesTransaction();
		
	}


	}








