package com.pluralsight;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private Double payRate;
    private Double hoursWorked;
    private Double OvertimeWorked;
    private Double regularHoursWorked;
    private Double Otpay;
    private double normalpay;
    DecimalFormat df = new DecimalFormat("0.00");

    public Employee(int employeeId, String name, String department, Double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;

    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularhours() {

        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeWorked() {
        if (this.hoursWorked > 40) {
            this.OvertimeWorked = this.hoursWorked - 40;
            return OvertimeWorked;
        } else {
            return 0;
        }
    }

    public double getTotalpay() {
        if (this.hoursWorked > 40) {
            this.Otpay = getOvertimeWorked() * this.payRate * 1.5;
            this.normalpay = this.payRate * 40;}
        else { this.normalpay = payRate * getRegularhours(); }

            return Otpay + normalpay;

        }

        public double setpunchin(Double clockInTime) {
        return clockInTime;
        }

    public double setpunchout(Double clockOutTime) {
        return clockOutTime;
    }
    public double setpunchout() {
        int currentmin = LocalTime.now().getMinute();
        int currenthour = LocalTime.now().getHour();


        double v = ((double) currentmin / 60) + currenthour;
          v = Double.parseDouble(df.format(v));
        return v;
    }
    public void punchTimeCard (Double clockInTime,Double clockOutTime){

        Double Dailyhours = clockOutTime-clockInTime;
        this.hoursWorked = this.hoursWorked + Dailyhours;
    }

    }

