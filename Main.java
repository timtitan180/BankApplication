

package com.company;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import java.sql.Connection;

public class Main implements JDBCConnection {
    Connection conn;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    public static void main(String[] args) {
            final Scanner inputs = new Scanner(System.in);
            System.out.print("Welcome to this Banking Application.\nTo Get Started follow the instructions below\n");
            //Welcome
            System.out.print("Enter your name:");

            String name = inputs.nextLine();

            Banking account = new Banking();

            account.setName(name);

            System.out.print("Enter your account number:");

            long accountNumber = inputs.nextLong();

            account.setAccountNumber(accountNumber);

            System.out.println("Now enter your routing number");

            long routingNumber = inputs.nextLong();

            account.setRoutingNumber(routingNumber);

            System.out.print("Enter your account type (Checking,Savings,Privileged or a Credit Card account):");

            String accountType = inputs.nextLine();

            account.setAccountType(accountType);

            System.out.print("Enter your account's initial balance:");

            double balance = inputs.nextDouble();

            account.setBalance(balance);

            JDBCConnection.getConnection();
            String query = "INSERT INTO users(name,account_number,routing_number,account_type(s),balance) VALUES (account.getName(),account.getAccountNumber(),account.getRoutingNumber(),account.getAccountType(),account.getBalance())";
            try {
                JDBCConnection.setQuery(query);
            }
            catch(Exception e) {
                System.out.println("Data could not be saved in the database.");
            }

            String accountTypeCharacter = accountType.substring(0,1);

            switch(accountTypeCharacter.toUpperCase()) {
                    case "CH":
                        CheckingAccount checkingAccount = new CheckingAccount();
                        checkingAccount.doesTransaction();
                        checkingAccount.afterChosenTransaction();
                            break;

                    case "SA":
                            SavingsAccount savingsAccount = new SavingsAccount();
                            savingsAccount.SavingsAccountMenu();
                            String savingsAccountchoice = inputs.nextLine();
                            savingsAccount.SwitchStatement(savingsAccountchoice);
                            break;
                case "PR":
                        Priviliged priviligedAccount = new Priviliged();
                        priviligedAccount.getPriviligedAccountMenu();
                        String priviligedAccountchoice = inputs.next();
                        priviligedAccount.getPriviligedSwitchStatement(priviligedAccountchoice);
                        break;
                    case "CR":
                            CreditCardAccount creditCardAccount = new CreditCardAccount();
                            creditCardAccount.getCreditCardAccountMenu();
                            String creditCardchoice = inputs.nextLine();
                            creditCardAccount.SwitchStatement(creditCardchoice);
                            break;


                    }


    }

}
