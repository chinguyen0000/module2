package ss10_dsa_list_set.bai_tap.customer_management.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagement {
    private List<Customer> customers = new ArrayList<Customer>();

    public CustomerManagement() {}

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Add customer successful");
    }

    public void removeCustomer(int id) {
        customers.remove(id);
        System.out.println("Remove customer successful");
    }

    public String displayCustomers() {
        String display = "Total of customers: " + customers.size() + "\n";
        for (Customer customer : customers) {
            display += customer.toString() + "\n";
        }
        return display;
    }

    public void updateCustomer(int id, Customer customer) {
        customers.set(id, customer);
        System.out.println("Update customer successful");
    }



}
