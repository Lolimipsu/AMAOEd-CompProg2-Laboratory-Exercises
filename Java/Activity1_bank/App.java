import java.util.Scanner;
import java.io.IOException;

public class App {
  public static void main(String[] args) throws IOException, InterruptedException {
    //definitions
    double balance;
    double amount;
    int user_choice;
    int run_again = 0;
    Scanner input = new Scanner(System.in);
    B_Backend bb = new B_Backend();

    do {
      System.out.println("Balance: ");
      balance = input.nextInt();
      System.out.println("-------------------------------------------------------");
      System.out.println("Select an option:\n1 - Withdraw\n2 - Deposit\n3 - Exit");
      user_choice = input.nextInt();
      System.out.println("-------------------------------------------------------");
      switch (user_choice) {
      case 1:
        System.out.println("Input withdraw amount:");
        amount = input.nextDouble();
        balance = bb.withdraw(amount, balance);
        System.out.println("Your new balance is:" + balance);
        System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
        run_again = input.nextInt();
        bb.cls();
        break;
      case 2:
        System.out.println("Input deposit amount:");
        amount = input.nextDouble();
        balance = bb.deposit(amount, balance);
        System.out.println("Your new balance is:" + balance);
        System.out.println("\n\nRun program again?\n1 = YES\n2 = NO");
        run_again = input.nextInt();
        bb.cls();
        break;
      case 3:
        System.out.println("Closing...");
        run_again = 2;
        break;

      default:
        System.out.println("Please choose a valid option");
        break;
      } // switch
    } while (run_again != 2);
  } // main
} // public class App