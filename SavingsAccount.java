package com.company;

public class SavingsAccount extends Banking {

    public void SavingsAccountMenu() {
        System.out.print("Would you like to deposit funds from your checking account"
                + "withdraw or just view your balance\nEnter key [D] to deposit, [W] to withdraw or [B]"
                + "to view balance or [E] to exit:");
    }

    public void SwitchStatement(String character) {
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
            case "E" -> {

                System.out.print("Thank you for using this Banking System");
            }
            default -> {
                System.out.print("Option does not exist");
            }
        }
    }
}