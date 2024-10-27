package case_study.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee {
    private String id;
    private String fullName;
    private String email;
    private String phone;
    private LocalDate dob;
    private int totalSalary;

    public Employee(String id, String fullName, String email, String phone, LocalDate dob) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.totalSalary = 0;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return id + ", " + fullName + ", " + email + ", " + phone + ", " + dob + ", " + totalSalary + " VND";
    }

    public String toFileString() {
        return id + "," + fullName + "," + email + "," + phone + "," + dob + "," + totalSalary;
    }

}
