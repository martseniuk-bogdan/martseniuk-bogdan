package com.company.lessons13.employee;

public class Report {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Ященко ", 1500.501);
        employees[1] = new Employee("Марценюк ", 1500.101);
        employees[2] = new Employee("Щербинина ", 3000.000);
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("Работник: %s получает зарплату: %5.2f$\n", employee.getFullname(), employee.getSalary());
        }
    }
}
