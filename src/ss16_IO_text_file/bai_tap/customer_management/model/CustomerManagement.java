package ss16_IO_text_file.bai_tap.customer_management.model;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerManagement {
    private final String PATH = "src/ss16_IO_text_file/bai_tap/customer_management/model/customer_list.txt";


    public CustomerManagement() {
    }

    public void addCustomer(Customer customer) {
        try {
            File file = new File(PATH);
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            writer.write(customer.toString() + "\n");
            bufferedWriter.close();
            System.out.println("Add customer successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }

    }

    public void removeCustomer(int id) {
        List<Customer> customerList = new ArrayList<Customer>();
        try {
            File file = new File(PATH);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String temp;
            String[] tempArray;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArray = temp.split(","); //tách 1 chuỗi thành mảng các chuỗi nhỏ
                customerList.add(new Customer(Integer.parseInt(tempArray[0]), tempArray[1], LocalDate.parse(tempArray[2]), tempArray[3]));
            }
            bufferedReader.close();

            customerList.remove(id);
            FileWriter writer = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Remove customer successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }

    public String displayCustomers() {
        String stringDisplay = "";
        try {
            File file = new File(PATH);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                stringDisplay += temp + "\n";
            }

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
        return stringDisplay;
    }

    public void updateCustomer(int id, Customer customer) {
        List<Customer> customers = new ArrayList<>();
        try {
            File file = new File(PATH);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String temp;
            String[] tempArray;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArray = temp.split(",");
                customers.add(new Customer(Integer.parseInt(tempArray[0]), tempArray[1], LocalDate.parse(tempArray[2]), tempArray[3]));
            }
            bufferedReader.close();
            customers.set(id, customer);
            FileWriter writer = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Customer c : customers) {
                bufferedWriter.write(c.toString() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Update customer successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
}
