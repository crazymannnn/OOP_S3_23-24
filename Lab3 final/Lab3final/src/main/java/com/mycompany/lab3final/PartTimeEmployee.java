/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3final;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {
    private int workingHour;
    private float payRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate, String id, String name, int year, String address, String phone) {
        super(id, name, year, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }
    

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }
    
    @Override
    public void getInfo() {
        super.Output();
        System.out.println("Working hour: " + workingHour);
        System.out.println("Pay rate: " + payRate);
    }

    @Override
    public float getPayment() {
        return this.payRate * this.workingHour;
    }
    
     public void InputPartTime() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap working houe: ");
        workingHour = sc.nextInt();
        System.out.println("Nhap pay rate: ");
        payRate = sc.nextFloat();
    }
    
    public void OutputPartTime() {
        super.Output();
        System.out.println("working hour: " + workingHour);
        System.out.println("pay rate: " + payRate);
    }
}
