package ss16_IO_text_file.bai_tap.customer_management.model;

import java.time.LocalDate;

public class Customer {
    private int id;
    private String name;
    private LocalDate birthday;
    private String address;


    public Customer(int id, String name, LocalDate birthday, String address) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + birthday + "," + address;
    }
}
