package SimpleBankingSystem.banking;

public class Main {

    public static void main(String[] args) {

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

        // Display customer information

        samuel.displayCustomerInfo();

        // Deposit money

        System.out.println("\nAfter Deposit:");

        try {

            samuelAccount.deposit(40000);

        } catch (InvalidAmountException e) {

            System.out.println(e.getMessage());

        }

        samuelAccount.displayAccountInfo();
        // Withdraw money

        System.out.println("\nAfter Withdrawal:");

        try {
            samuelAccount.withdraw(10000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        samuelAccount.displayAccountInfo();

    }

}