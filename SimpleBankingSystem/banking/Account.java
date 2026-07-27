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

    public void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {

            throw new InvalidAmountException(
                    "Deposit amount must be greater than zero");

        }

        balance = balance + amount;

        System.out.println("Deposit successful");

    }

    // Withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException,
            InvalidAmountException {
        if (amount <= 0) {

            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than zero");

        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance for withdrawal. Your current balance is: "
                            + balance + " USD");
        }
        balance = balance - amount;
        System.out.println("Withdrew: " + amount + ", Successful, New Balance: " + balance + " USD");
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