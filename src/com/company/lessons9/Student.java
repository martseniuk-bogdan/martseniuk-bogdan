package com.company.lessons9;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private static int scholarship = 100;

    public Student() {
        firstName = "Shcherbinina";
        lastName = "Liso4ka";
        group = "KIT_25a";
    }

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public void getScholarship() {
        System.out.println("100");
    }
}
