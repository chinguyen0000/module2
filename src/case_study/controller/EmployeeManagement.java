package case_study.controller;

import case_study.model.Employee;
import case_study.model.FullTimeEmployee;
import case_study.model.PartTimeEmployee;

import java.io.*;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeManagement {
    private final String filePath = "src/case_study/model/files/employee_list.csv";

    public EmployeeManagement() {
    }

    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(this.filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String temp;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                if (tempArr[0].contains("FT")) {
                    employeeList.add(new FullTimeEmployee(tempArr[0], tempArr[1], tempArr[2], tempArr[3], LocalDate.parse(tempArr[4]), Integer.parseInt(tempArr[6]), Integer.parseInt(tempArr[7])));
                } else {
                    employeeList.add(new PartTimeEmployee(tempArr[0], tempArr[1], tempArr[2], tempArr[3], LocalDate.parse(tempArr[4]), Integer.parseInt(tempArr[6]), Integer.parseInt(tempArr[7])));
                }
            }
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        try {
            FileWriter writer = new FileWriter(this.filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            if (employee != null) {
                if (!isExistedEmployeeCode(employee.getId())) {
                    bufferedWriter.write(employee.toFileString() + "\n");
                    bufferedWriter.close();
                    writer.close();
                    System.out.println("Employee added successfully");
                } else {
                    System.out.println("Employee already exists. Please change the employee code");
                }
            } else {
                System.out.println("Wrong information for employee");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(int index, Employee newEmployee) {
        List<Employee> employeeList = this.getEmployeeList();
        try {
            employeeList.set(index, newEmployee);
            FileWriter writer = new FileWriter(this.filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toFileString() + "\n");
            }
            bufferedWriter.close();
            writer.close();
            System.out.println("Employee updated successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayEmployees() {
        List<Employee> employeeList = this.getEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employeeList.indexOf(employee) + ". " + employee.toString());
        }
    }

    public void deleteEmployee(int index) {
        List<Employee> employeeList = this.getEmployeeList();
        employeeList.remove(index);
        try {
            FileWriter writer = new FileWriter(this.filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toFileString() + "\n");
            }
            bufferedWriter.close();
            writer.close();
            System.out.println("Remove employee successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isExistedEmployeeCode(String code) {
        try {
            FileReader reader = new FileReader(this.filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String temp;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                if (tempArr[0].equals(code)) {
                    System.out.println("Employee code exists");
                    return true;
                }
            }
            bufferedReader.close();
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
