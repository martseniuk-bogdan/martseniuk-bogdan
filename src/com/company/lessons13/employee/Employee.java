package com.company.lessons13.employee;

import java.util.Date;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary. Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report, который будет содержать статический метод generateReport, в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматировании строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
public class Employee {
    private String fullname;
    private double salary;
    private Date salaryDate;

    public Employee() {
    }

    public Employee(String fullname, double salary, Date salaryDate) {
        this.fullname = fullname;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        if (fullname != null ? !fullname.equals(employee.fullname) : employee.fullname != null) return false;
        return salaryDate != null ? salaryDate.equals(employee.salaryDate) : employee.salaryDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullname != null ? fullname.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (salaryDate != null ? salaryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }
}
