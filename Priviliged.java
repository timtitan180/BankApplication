
package com.company;

import java.util.Scanner;

public class Priviliged extends Banking {
    Priviliged(){};
    double balance;

    Priviliged(double balance) {
        this.balance = balance;
    }

    public void getPriviligedAccountMenu() {

        System.out.print("Would you like to deposit funds from your priviliged account"
                + "withdraw or just view your balance\nEnter key [D] to deposit, [W] to withdraw or [B]"
                + "to view balance or [O] to withdraw more funds than is available in your account: or [E] to exit");
    }

    public void getPriviligedSwitchStatement(String character) {
        switch (character) {
            case "D" -> {
                System.out.print("Enter the amount you want to deposit?");
                double amount = inputs.nextDouble();
                deposit(amount);
            }
            case "W" -> {
                System.out.print("Enter the amount you want to withdraw:");
                double amount = inputs.nextInt();
                withdraw(amount);
                System.out.print(amount + "has been from your account");

            }
            case "B" -> {
                System.out.print("Your balance is:");
                System.out.print(balance);
            }

            case "O" -> {
                System.out.println("Enter the amount you want to withdraw:");
                double amount = inputs.nextDouble();
                getOverdraftFacility(balance, amount);
            }
            case "E" -> {

                System.out.print("Thank you for using this Banking System");
            }
            default -> {
                System.out.print("Option does not exist");
            }
        }
    }

    static double getOverdraftFacility(double balance, double amount) {
        double temporaryBalance = balance;
        temporaryBalance *= amount / 10;
        return temporaryBalance;
    }


}