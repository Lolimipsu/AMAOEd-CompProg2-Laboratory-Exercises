package Prof;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        String personName;
        String accountType;
        int AccountNumber;
        double balance;
        BankAccount ba;
        int choice = 4;
        double amt;

        Scanner in = new Scanner(System.in);

        System.out.println("Creating New Account");
        System.out.println("----------------------");
        System.out.print("Enter Name: ");
        personName = in.nextLine();
        System.out.print("Account Number: ");
        AccountNumber = in.nextInt();
        in.nextLine();
        System.out.println("Account Type: Current or Savings");
        System.out.print("Account Type: ");
        // **Current Account or Savings Account
        accountType = in.nextLine();
        System.out.print("Initial Deposit: ");
        balance = in.nextDouble();

        if (balance < 500) {
            System.out.println("Sorry, your Account cannot be created");
            System.out.println("Minumum of Php 500 should be maintained in your Account");
            System.out.println("Closing Program...");
            System.exit(0);
        }

        ba = new BankAccount(AccountNumber, personName, personName, balance);

        do {
            System.out.println("\n");
            System.out.println("Welcome, " + personName + "!");
            System.out.println("Transactions");
            System.out.println("-------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit Account");
            System.out.println("-------------------");
            System.out.print("Please Enter Response: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Amount: ");
                    amt = in.nextDouble();
                    balance = ba.Deposit(amt);
                    System.out.println("Current Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the Amount: ");
                    amt = in.nextDouble();
                    balance = ba.Withdraw(amt);
                    System.out.println("Current Balance: " + balance);
                    break;
                case 3:
                    ba.DisplayDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please Enter ONLY between 1 and 4");
            }
        } while (choice != 4);
    }
}
