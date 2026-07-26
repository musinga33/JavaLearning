package SimpleBankingSystem.banking;

public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;
    private Account account;

    // constructor

    public Customer(String customerId, String name, String phoneNumber, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    // Display customer information

    public void displayCustomerInfo() {

        System.out.println("Customer ID:" + customerId);
        System.out.println("Name:" + name);
        System.out.println("Phone Number:" + phoneNumber);

        System.out.println("\nAccount Information:");

        account.displayAccountInfo();
    }

    // getters

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Account getAccount() {
        return account;
    }
}