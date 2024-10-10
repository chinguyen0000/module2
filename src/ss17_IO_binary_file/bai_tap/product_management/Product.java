package ss17_IO_binary_file.bai_tap.product_management;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String description;
    private int price;
    private String manufacturer;

    public Product() {
    }

    public Product(int code, String name, String description, int price, String manufacturer) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + description + ", " + price + " VND, " + manufacturer;
    }
}
