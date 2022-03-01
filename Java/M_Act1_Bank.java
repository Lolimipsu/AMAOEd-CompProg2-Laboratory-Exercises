import java.util.Scanner;
import java.io.IOException;

public class M_Act1_Bank {
    public static void main(String[] args) throws IOException, InterruptedException {
        // definitions
        int balance;
        int user_choice;
        Scanner input = new Scanner(System.in);
        int run_again = 0;

        while (run_again != 2) {
            balance = input.nextInt();
            System.out.println("-------------------------------------------------------");
            System.out.println("Select an option:\n1 - Withdraw\n2 - Deposit\n3 - Exit");
            user_choice = input.nextInt();
            System.out.println("-------------------------------------------------------");
            switch (user_choice) {
                case 1:
                    withdraw(balance, input);
                    System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
                    run_again = input.nextInt();
                    cls();
                    break;
                case 2:
                    deposit(balance, input);
                    System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
                    run_again = input.nextInt();
                    cls();
                    break;
                case 3:
                    cls();
                    System.out.println("thanks for using my app");
                    run_again = 2;
                    break;

                default:
                    System.out.println("Please choose a valid option");
                    break;
            }// switch
        } // while
    }// main

    // Withdraw
    private static void withdraw(int balance, Scanner input) {
        int withdraw_amt;
        int new_withdraw_bal;
        System.out.println("Withdraw amount:");
        withdraw_amt = input.nextInt();
        new_withdraw_bal = balance - withdraw_amt;
        balance = new_withdraw_bal;
        System.out.println("Your new balance is:" + new_withdraw_bal);

    }

    // Deposit
    private static void deposit(int balance, Scanner input) {
        int deposit_amt;
        int new_deposit_bal;
        System.out.println("Deposit amount:");
        deposit_amt = input.nextInt();
        new_deposit_bal = balance + deposit_amt;
        balance = new_deposit_bal;
        System.out.println("Your new balance is:" + new_deposit_bal);
    }

    // Clear Screen
    private static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}// public class Act1_Bank