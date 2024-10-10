package ss17_IO_binary_file.bai_tap.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public final static String PATH = "src/ss17_IO_binary_file/bai_tap/product_management/products.txt";

    public static void writeProductsToFile(List<Product> products) {
        try {
            FileOutputStream file = new FileOutputStream(PATH, true);
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(products);
            writer.close();
            file.close();
            System.out.println("Thêm sản phẩm thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(PATH);
            ObjectInputStream reader = new ObjectInputStream(file);
            products = (List<Product>) reader.readObject();
            reader.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Máy ảnh", "Máy ảnh Samsung", 3000000, "Samsung"));
        productList.add(new Product(2, "Ipad", "Ipad mini 2024", 36000000, "Apple"));
        productList.add(new Product(3, "Laptop", "Laptop ASUS", 28000000, "ASUS"));
        productList.add(new Product(4, "Chuột", "Chuột Logitech", 560000, "Logitech"));
        writeProductsToFile(productList);
        List<Product> tempProduct = readProductsFromFile();
        for (Product p : tempProduct) {
            System.out.println(p);
        }
    }
}
