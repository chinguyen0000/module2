package case_study.model;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {
    int wageHours;
    int workingHours;

    public PartTimeEmployee(String id, String fullName, String email, String phone, LocalDate dob, int wageHours, int workingHours) {
        super(id, fullName, email, phone, dob);
        this.wageHours = wageHours;
        this.workingHours = workingHours;
        setTotalSalary(wageHours * workingHours);
    }

    public int getWageHours() {
        return wageHours;
    }

    public void setWageHours(int wageHours) {
        this.wageHours = wageHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(byte workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return super.toString() + " (Hourly Wage: " + wageHours + " VND, Working Hours: " + workingHours + " hours)";
    }

    public String toFileString() {
        return super.toFileString() + "," + wageHours + "," + workingHours;
    }
}
