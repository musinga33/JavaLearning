package SimpleBankingSystem.banking;

import java.time.LocalDateTime;

public class Transaction {

    private String type;
    private double amount;
    private LocalDateTime date;

    // Constrictor

    public Transaction(String type, double amount) {

        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();

        // display information

    }

    public void displayTransaction() {

        System.out.println("Type:" + type);
        System.out.println("Amount" + amount);
        System.out.println("Date" + date);

        System.out.println("___________________________________");

    }

    // Getters

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }
}