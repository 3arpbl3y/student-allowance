package org.example;

public class StudentOrderValidator {
    public static void main(String[] args) {
checkAll();
    }

    static void checkAll() {
        checkStudent();
        checkMarriege();
        checkCityRegister();
        checkChildren();
    }
    static void checkCityRegister() {
        System.out.println("CR is running");
    }

    static void checkMarriege() {
        System.out.println("marriege check");
    }
    static void checkChildren() {
        System.out.println("presence of children is checked");

    }

    static void checkStudent() {
        System.out.println("student check");

    }
}
