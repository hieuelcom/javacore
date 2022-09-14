/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class employe {
    private String FirstName;
    private String LastName;
    private double Salary;

    public void setFirstName(String FName) {
        FirstName = FName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String LName) {
        LastName = LName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setSalary(double a) {
        if (a >= 0.0) {
            Salary = a;
        }
    }

    public double getSalary() {
        return Salary;
    }

}
