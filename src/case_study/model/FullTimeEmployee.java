package case_study.model;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
    private int salary;
    private int bonus;

    public FullTimeEmployee(String id, String fullName, String email, String phone, LocalDate dob, int salary, int bonus) {
        super(id, fullName, email, phone, dob);
        this.salary = salary;
        this.bonus = bonus;
        setTotalSalary(salary + bonus);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " (Salary: " + salary + " VND, Bonus: " + bonus + " VND)";
    }

    public String toFileString() {
        return super.toFileString() + "," + salary + "," + bonus;
    }

}
