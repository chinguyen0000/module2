package case_study.view;

import case_study.controller.EmployeeManagement;
import case_study.model.Employee;
import case_study.model.FullTimeEmployee;
import case_study.model.PartTimeEmployee;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();
        String[] employee;
        int order, option;

        while (true) {
            System.out.println("Choose an option:\n" +
                    "1. Display an employee list\n" +
                    "2. Add New\n" +
                    "3. Update\n" +
                    "4. Remove\n" +
                    "5. Search\n" +
                    "6. Exit");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    em.displayEmployees();
                    break;
                case 2:
                    employee = enterDataFromKeyboard(sc);
                    if (employee != null) {
                        if (employee[0].contains("FT")) {
                            em.addEmployee(new FullTimeEmployee(employee[0], employee[1], employee[2], employee[3], LocalDate.parse(employee[4]), Integer.parseInt(employee[5]), Integer.parseInt(employee[6])));
                        } else {
                            em.addEmployee(new PartTimeEmployee(employee[0], employee[1], employee[2], employee[3], LocalDate.parse(employee[4]), Integer.parseInt(employee[5]), Integer.parseInt(employee[6])));
                        }
                    }
                    break;
                case 3:
                    em.displayEmployees();
                    order = -1;
                    do {
                        System.out.println("Enter the order of employee you'd like to edit information");
                        order = Integer.parseInt(sc.nextLine());
                    } while (order >= em.getEmployeeList().size() || order < 0);
                    employee = enterDataFromKeyboard(sc);
                    if (employee != null) {
                        if (employee[0].contains("FT")) {
                            em.updateEmployee(order, new FullTimeEmployee(employee[0], employee[1], employee[2], employee[3], LocalDate.parse(employee[4]), Integer.parseInt(employee[5]), Integer.parseInt(employee[6])));
                        } else {
                            em.updateEmployee(order, new PartTimeEmployee(employee[0], employee[1], employee[2], employee[3], LocalDate.parse(employee[4]), Integer.parseInt(employee[5]), Integer.parseInt(employee[6])));
                        }
                    }
                    break;
                case 4:
                    em.displayEmployees();
                    order = -1;
                    do {
                        System.out.println("Enter the order of employee you'd like to remove");
                        order = Integer.parseInt(sc.nextLine());
                    } while (order >= em.getEmployeeList().size() || order < 0);
                    em.deleteEmployee(order);
                    break;
                case 5:
                    System.out.println("Enter employee code or full name to search");
                    String searchInput = sc.nextLine();
                    List<Employee> employeeList = em.getEmployeeList();
                    boolean found = false;
                    for (Employee emp : employeeList) {
                        if (emp.getFullName().equals(searchInput) || emp.getId().equals(searchInput)) {
                            System.out.println(emp.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found");
                    }
                    break;
                case 6:
                default:
                    System.exit(0);
                    break;
            }
        }

    }

    public static boolean isIdValid(String id) {
        String regexId = "^(FT|PT)\\d{4}$";
        Pattern pattern = Pattern.compile(regexId);
        Matcher matcher = pattern.matcher(id);
        if (!matcher.matches()) {
            System.out.println("Invalid ID");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isFullNameValid(String fullName) {
        String regexFullName = "^[A-Z][a-z]*(?:\\s[A-Z][a-z]*)*$";
        Pattern pattern = Pattern.compile(regexFullName);
        Matcher matcher = pattern.matcher(fullName);
        if (!matcher.matches()) {
            System.out.println("Full name is invalid");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isEmailValid(String email) {
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            System.out.println("Email is invalid");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isPhoneValid(String phone) {
        String regexPhone = "^0[0-9]{9}$";
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher = pattern.matcher(phone);
        if (!matcher.matches()) {
            System.out.println("Phone number is invalid");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDateValid(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date);
            return true;
        } catch (Exception e) {
            System.out.println("Date of birth is invalid or not following format yyyy-mm-dd");
            return false;
        }
    }

    public static boolean isNumberValid(String salary) {
        try {
            int tempSalary = Integer.parseInt(salary);
            if (tempSalary > 0) {
                return true;
            } else {
                System.out.println("Invalid money");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid money");
            return false;
        }

    }

    public static String[] enterDataFromKeyboard(Scanner sc) {
        String[] employee = new String[7];
        System.out.println("Enter employee code: ");
        employee[0] = sc.nextLine();
        System.out.println("Enter employee name: ");
        employee[1] = sc.nextLine();
        System.out.println("Enter employee email: ");
        employee[2] = sc.nextLine();
        System.out.println("Enter employee phone number: ");
        employee[3] = sc.nextLine();
        System.out.println("Enter employee birthday: ");
        employee[4] = sc.nextLine();
        System.out.println("Enter the number of hourly wage for part-time employee or the monthly salary for full-time employee: ");
        employee[5] = sc.nextLine();
        System.out.println("Enter hours worked for part-time employee or bonuses for full-time employee");
        employee[6] = sc.nextLine();
        if (!isIdValid(employee[0]) || !isFullNameValid(employee[1]) || !isEmailValid(employee[2]) || !isPhoneValid(employee[3]) || !isDateValid(employee[4]) || !isNumberValid(employee[5]) || !isNumberValid(employee[6])) {
            return null;
        } else {
            return employee;
        }
    }

}
