package com.company.lessons10.library;

/**
 * Определить класс, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон.
 * Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. В программе организовать: ввод данных о читателях,  вывод информации о читателях.
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг.
 * - takeBook, который будет принимать переменное количество названий книг.
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс).
 * Аналогичным образом перегрузить метод returnBook().
 */
public class Users {
    private String firstName;
    private String lastName;
    private int numberOfTicket;
    private String fuckultet;
    private String birthday;
    private int phoneNumber;

    public Users() {
        firstName = "Ivan";
        lastName = "Ivanov";
        numberOfTicket = 227;
        fuckultet = "KIT";
        birthday = "03.01.1998";
        phoneNumber = 639013;
    }

    public Users(String firstName, String lastName, int numberOfTicket, String fuckultet, String birthday, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfTicket = numberOfTicket;
        this.fuckultet = fuckultet;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
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

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public String getFuckultet() {
        return fuckultet;
    }

    public void setFuckultet(String fuckultet) {
        this.fuckultet = fuckultet;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                ", fuckultet='" + fuckultet + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
