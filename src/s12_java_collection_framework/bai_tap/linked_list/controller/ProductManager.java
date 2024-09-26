package s12_java_collection_framework.bai_tap.linked_list.controller;

import s12_java_collection_framework.bai_tap.linked_list.model.Product;

import java.util.*;

public class ProductManager implements Comparator<Product> {
    private List<Product> productList = new LinkedList<>();

    public ProductManager() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        if (!productList.contains(product) && product != null) {
            productList.add(product);
            System.out.println("Add product: " + product.toString() + " success");
        } else {
            System.out.println("Add product: " + product.toString() + " failed");
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            Product removedProduct = productList.remove(index);
            System.out.println("Remove product: " + removedProduct.toString() + " success");
        } else {
            System.out.println("Remove product failed");
        }
    }

    public void updateProduct(int index) {
        if (index >= 0 && index < productList.size()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new product name: ");
            String newName = sc.nextLine();
            productList.get(index).setName(newName);
            System.out.println("Update product: " + productList.get(index).toString() + " success");
        } else {
            System.out.println("Update product failed");
        }
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public void searchProduct(String productName) {
        int count = 0;
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                count++;
                System.out.println(product.toString());
            }
        }
        if (count > 0) {
            System.out.println(count + " products found");
        } else {
            System.out.println("No product found");
        }
    }

    public int compare(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice()) {
            return 1;
        } else if (p1.getPrice() == p2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
