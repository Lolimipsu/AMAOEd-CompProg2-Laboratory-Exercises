import java.io.IOException;

public class B_Backend{
    // withdraw
    public double withdraw(double amount, double balance)
    {
        double new_withdraw_bal;

        if (amount < 0)
        {
            System.out.println("Please enter a Positive Amount");
        }
        else if (balance - amount < 500)
        {
            System.out.println("Withdrawal is not possible as it will make the balance less than PHP 500."); 
        }
        else
        {   
            new_withdraw_bal = balance - amount;
            balance = new_withdraw_bal;
        }
        return balance;
    }

    // deposit
    public double deposit(double amount, double balance)
    {
        double new_deposit_bal;
        if (amount > 0)
        {
           new_deposit_bal = balance + amount;
           balance = new_deposit_bal;
        }
        else{
            System.out.println("Please enter a Positive Amount");
        }
        return balance;
    }

    public void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
}