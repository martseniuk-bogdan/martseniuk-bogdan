package com.company.lessons8;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 */
public class Person implements Comparable<Person> {
    private String fullName;
    private int age;

    public Person() {
        setFullName("Щербинина Елизавета");
        setAge(19);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Идет- " + getFullName());
    }

    public void talk() {
        System.out.println("Говорит- " + getFullName() + " ему- " + getAge() + "  лет.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return fullName != null ? fullName.equals(person.fullName) : person.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Person person) {
        int personAge = person.getAge();
        return this.age - personAge;
    }

    @Override
    public String toString() {
        return String.format("Person- %s , he(she) is %d YO!", fullName, age);
    }
}
