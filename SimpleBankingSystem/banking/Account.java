package SimpleBankingSystem.banking;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor

    public Account(String accountNumber, String accountHolderName, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }

    // Deposit money

    public void deposit(double amount) {

        balance += amount;
        System.out.println("Deposited: " + amount + ", Successful, New Balance: ");
    }

    // Withdraw money

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrew: " + amount + ", Successful, New Balance: ");
    }

    // Display account information

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance + " USD");
    }

    // Getters

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;

    }

    public double getBalance() {
        return balance;
    }

}