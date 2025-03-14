package Encapsulation;

class BankAccount 
{
    private double balance;

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
        } else 
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class Encapsulation_and_Data_Validation 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount();
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance()); // Output: Balance: 500.0

        account.withdraw(100);
        System.out.println("Balance: " + account.getBalance()); // Output: Balance: 400.0

        account.withdraw(600); // Output: Invalid withdrawal amount.
    }
}
