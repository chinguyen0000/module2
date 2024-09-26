package s12_java_collection_framework.bai_tap.array_list.view;

import s12_java_collection_framework.bai_tap.array_list.controller.ProductManager;
import s12_java_collection_framework.bai_tap.array_list.model.Product;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager pm = new ProductManager();
        pm.addProduct(new Product(4, "Màn hình 2", 3500000));
        pm.addProduct(new Product(3, "Màn hình", 5000000));
        pm.addProduct(new Product(1, "Chuột", 350000));
        pm.addProduct(new Product(2, "Bàn phím", 999000));


        while (true) {
            System.out.println("1. Display product list" + "\n2. Add product to list" + "\n3. Update product name with index" + "\n4. Delete product from list" + "\n5. Search product by name" + "\n6. Sort product by price in ascending order" + "\n7. Sort product by price in descending order" + "\n0. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    pm.displayProducts();
                    break;
                case 2:
                    System.out.println("Enter the id of product");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the name of product");
                    String name = sc.nextLine();
                    System.out.println("Enter the price of product");
                    int price = Integer.parseInt(sc.nextLine());
                    pm.addProduct(new Product(id, name, price));
                    break;
                case 3:
                    System.out.println("Enter the position of product");
                    int index = Integer.parseInt(sc.nextLine());
                    pm.updateProduct(index);
                    break;
                case 4:
                    System.out.println("Enter the position of product");
                    index = Integer.parseInt(sc.nextLine());
                    pm.removeProduct(index);
                    break;
                case 5:
                    System.out.println("Enter the name of product");
                    name = sc.nextLine();
                    pm.searchProduct(name);
                    break;
                case 6:
                    Collections.sort(pm.getProductList(),pm);
                    pm.displayProducts();
                    break;
                case 7:
                    Collections.sort(pm.getProductList(),pm);
                    Collections.reverse(pm.getProductList());
                    pm.displayProducts();
                    break;
                case 0:
                default:
                    System.exit(0);
            }
        }
    }
}
