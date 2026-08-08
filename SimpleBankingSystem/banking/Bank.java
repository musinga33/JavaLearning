package SimpleBankingSystem.banking;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    // constructor

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // add customer

    public void addCustomer(Customer customer) {
        customers.add(customer);

        System.out.println("Customer added successfully.");
    }

    // Display all customers

    public void displayAllCustomers(){
        System.out.println("\n========" + bankName + "=========");
        System.out.println("Customers:");

        for (Customer customer : customers){
            customer.displayCustomerInfo();
            System.out.println(------------------);
        }
    }

    // Getters

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    
}