package SimpleBankingSystem.banking;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Musinga Bank");
        // Create an account

        Account samuelAccount = new Account(
                "1001",
                "IRADUKUNDA Musinga Samuel",
                1000);
        // Create a customer and give him the account

        Customer samuel = new Customer(
                "C001",
                "IRADUKUNDA Musinga Samuel",
                "0786590801",
                samuelAccount);
        // Add Samuel to bak
        bank.addCustomer(samuel);

        // Display all customers
        bank.displayAllCustomers();
        // Display customer information

        Account johnAccount = new Account(
                "1002", "John", 75000);
        Customer john = new Customer("C002", "John",
                "0780000000",
                johnAccount);
        bank.addCustomer(john);
        samuel.displayCustomerInfo();

        // Deposit money

        System.out.println("\nAfter Deposit:");

        try {

            samuelAccount.deposit(40000050);

        } catch (InvalidAmountException e) {

            System.out.println(e.getMessage());

        }

        samuelAccount.displayAccountInfo();
        // Withdraw money

        System.out.println("\nAfter Withdrawal:");

        try {
            samuelAccount.withdraw(999999000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        samuelAccount.displayAccountInfo();
        samuelAccount.displayTransactionHistory();

    }

}