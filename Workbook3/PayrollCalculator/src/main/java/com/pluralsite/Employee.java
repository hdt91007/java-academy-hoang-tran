package com.pluralsite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Employee {

    private int employeeid;
    private String name;
    private double hoursWorked;
    private double payRate;
    private double grosspay;

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void getgrosspay() {
        this.grosspay = this.payRate * this.hoursWorked;
    }

    public Employee(int employeeid, String name, double hoursWorked, double payRate, double grosspay) {
        this.employeeid = employeeid;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                ", grosspay=" + hoursWorked*payRate +
                '}';
    }

}




