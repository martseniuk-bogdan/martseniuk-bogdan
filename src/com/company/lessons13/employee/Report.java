package com.company.lessons13.employee;

import java.text.DateFormat;
import java.util.Date;

public class Report {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Ященко ", 1500.501, new Date(1500000000000L));
        employees[1] = new Employee("Марценюк ", 1500.101, new Date(1505500000000L));
        employees[2] = new Employee("Щербинина ", 3000.000, new Date(1500500000000L));
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        for (Employee employee : employees) {
            String s = df.format(employee.getSalaryDate());
            System.out.printf("Работник: %s получает зарплату: %5.2f$ такого числа- %s\n", employee.getFullname(), employee.getSalary(), s);
        }
    }
}
