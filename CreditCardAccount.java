package com.company;

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class CreditCardAccount extends Banking  {

    public static void getCreditCardAccountMenu() {
        System.out.println("Would you like to deposit funds from your credit card account" + "withdraw or just view your balance\nEnter key [D] to deposit, [W] to withdraw or [B]to view balance or [O] to withdraw more funds than is available in your account:");
    }

    public  void SwitchStatement(String character) {
        switch (character) {
            case "D" -> {
                System.out.print("Enter the amount you want to deposit:");
                double amount = inputs.nextDouble();
                deposit(amount);
            }
            case "W" -> {
                System.out.print("Enter the amount you want to withdraw:");
                double withdraw = inputs.nextInt();
                deposit(withdraw);
                System.out.print(amount + "has been from your account");

            }
            case "B" -> {
                System.out.print("Your balance is:");
                System.out.print(balance);
            }

            case "O" -> {
                payAmountDue();
                System.out.print("Thank you for your payment!");
            }
            case "E" -> {

                System.out.print("Thank you for using this Banking System");
            }
            default -> {
                System.out.print("Option does not exist");
            }
        }
    }


   public static void payAmountDue() {
        Scanner inputs = new Scanner(System.in);
        List<String> cardList = new ArrayList<String>();
        System.out.println("Enter year:");
        String year = inputs.nextLine();
        cardList.add(year);
        System.out.println("Enter month on the card");
        String month = inputs.nextLine();
        cardList.add(month);
        System.out.println("Enter amount owed on the card:");
        String amountOwed = inputs.nextLine();
        cardList.add(amountOwed);
        System.out.println("How much are you trying to pay off:");
        String amountToPayOff = inputs.nextLine();
        cardList.add(amountToPayOff);
    }


}


