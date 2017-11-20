package com.company.lessons9;

/**
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant,
 * аспирант отличается от студента наличием некой научной работы.
 * Создать переменную типа Student, которая ссылается на объект типа Aspirant. (Задание с урока)
 * <p>
 * Создать метод getScholarship() для класса Student. Переопределить его в классе Aspirant.
 * Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива. (Задание с урока)
 */
public class StudAspMain {
    public static void main(String[] args) {
        Student st = new Student();
        Aspirant asp = new Aspirant();
        System.out.println(st.toString() + asp.toString());
        Student stasp = new Aspirant();
        System.out.println(stasp.toString());

        Student[] aspir = new Student[2];
        aspir[0] = new Student();
        aspir[1] = new Aspirant();
        for (Student show : aspir) {
            System.out.println(show.getScholarship());
        }
    }
}
