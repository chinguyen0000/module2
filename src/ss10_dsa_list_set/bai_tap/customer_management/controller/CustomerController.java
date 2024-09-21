package ss10_dsa_list_set.bai_tap.customer_management.controller;

import ss10_dsa_list_set.bai_tap.customer_management.model.Customer;
import ss10_dsa_list_set.bai_tap.customer_management.model.CustomerManagement;

import java.time.LocalDate;
import java.util.Scanner;

public class CustomerController {
    public static void main(String[] args) {
        CustomerManagement customerManagement = new CustomerManagement();
        customerManagement.addCustomer(new Customer(1, "Test 1", LocalDate.parse("1990-01-01"),"hcm"));
        customerManagement.addCustomer(new Customer(2, "Test 2", LocalDate.parse("1999-01-01"),"hà nội"));
        customerManagement.addCustomer(new Customer(3, "Test 3", LocalDate.parse("2020-01-01"),"đà nẵng"));
        customerManagement.addCustomer(new Customer(4, "Test 1", LocalDate.parse("1990-01-01"),"hcm"));
        customerManagement.addCustomer(new Customer(5, "Test 2", LocalDate.parse("1999-01-01"),"hà nội"));
        customerManagement.addCustomer(new Customer(6, "Test 3", LocalDate.parse("2020-01-01"),"đà nẵng"));
        int id, position;
        String name, address;
        LocalDate birthday;
        while (true) {
            System.out.println("Choose an option:\n" +
                    "1. Display customer list\n" +
                    "2. Add a new customer\n" +
                    "3. Update information of a customer\n" +
                    "4. Remove a customer\n" +
                    "5. Exit");
            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.println(customerManagement.displayCustomers());
                    break;
                case 2:
                    System.out.println("Enter customer's id:");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter customer's name:");
                    name = scanner.nextLine();
                    System.out.println("Enter customer's birthday:");
                    birthday = LocalDate.parse(scanner.nextLine());
                    System.out.println("Enter customer's address:");
                    address = scanner.nextLine();
                    customerManagement.addCustomer(new Customer(id, name, birthday, address));
                    break;
                case 3:
                    System.out.println("Enter customer's position in list (start from 0)");
                    position = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter new customer's id:");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter new customer's name:");
                    name = scanner.nextLine();
                    System.out.println("Enter new customer's birthday:");
                    birthday = LocalDate.parse(scanner.nextLine());
                    System.out.println("Enter new customer's address:");
                    address = scanner.nextLine();
                    customerManagement.updateCustomer(position, new Customer(id, name, birthday, address));
                    break;
                case 4:
                    System.out.println("Enter customer's position in list (start from 0)");
                    position = Integer.parseInt(scanner.nextLine());
                    customerManagement.removeCustomer(position);
                    break;
                case 5:
                    System.exit(0);

            }
        }

    }
}
