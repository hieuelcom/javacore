package com.mycompany.mavenproject1;

public class emloyetest {
    public static void main(String[] args) {
        employe e = new employe();
        System.out.println("first name" + e.getFirstName());
        System.out.println("last name" + e.getLastName());
        System.out.println("salary" + e.getSalary());
        employe r = new employe();
        System.out.println("first name " + r.getFirstName());
        System.out.println("last name " + r.getLastName());
        System.out.println("salary " + r.getSalary() + 10);
    }
}
