package Prof;

public class BankAccount {
    String name;
    String accountType;
    int accountNumber;
    double balance;

    public BankAccount(int accNumber, String accName, String accType, double initialAmount)
    {
        accountNumber = accNumber;
        name = accName;
        accountType = accType;
        balance = initialAmount;
    }

    public double Deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("Please enter a Positive Amount");
        }
        return balance;
    }

    public double Withdraw(double amount)
    {
        if (amount < 0)
        {
            System.out.println("Please enter a Positive Amount");
        }
        else if (balance - amount < 500)
        {
            System.out.println("Withdrawal is not permitted as it will result in minimum balance less than Php 500");
        }
        else
        {
            balance -= amount;
        }
        return balance;
    }

    public void DisplayDetails()
    {
        System.out.println("\n");
        System.out.println("Account Number\t Account Name\t Balance");
        System.out.println("--------------------------------------------------------");
        System.out.println(accountNumber + "\t\t" + name + "\t\t" + balance);
    }
}
