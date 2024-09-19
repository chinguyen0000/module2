package ss8_clean_code_refactoring.bai_tap.model;

public class CustomerManagement {
    private Customer[] customers = new Customer[20];
    private int currentIndex = 0;

    public CustomerManagement() {

    }

    public void addCustomer(Customer customer) {
        boolean isAdded = false;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                isAdded = true;
                currentIndex++;
                break;
            }
        }
        if (!isAdded) {
            System.out.println("Add customer failed");
        } else {
            System.out.println("Add customer successful");
        }

    }

    public void removeCustomer(int id) {
        customers[id] = null;
        System.out.println("Remove customer successful");
        sortCustomers();
        currentIndex--;
    }

    public String displayCustomers() {
        String display = "Total of customers: " + currentIndex + "\n";
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                display += customers[i].toString() + "\n";
            }
        }
        return display;
    }

    public void updateCustomer(int id, Customer customer) {
        boolean isUpdated = false;
        for (int i = 0; i < customers.length; i++) {
            if (i == id) {
                customers[i] = customer;
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            System.out.println("Update customer failed");
        } else {
            System.out.println("Update customer successful");
        }
    }

    public void sortCustomers() {
        for (int i = 0; i < currentIndex; i++) {
            if (customers[i] == null) {
                for (int j = i; j < currentIndex - 1; j++) {
                    customers[j] = customers[j + 1];
                }
                i--;
            }
        }
        if (customers[currentIndex-1] != null) {
            customers[currentIndex-1] = null;
        }
        System.out.println("Sorted customer list");
    }

}
