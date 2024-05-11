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
public class FullTimeEmployee extends Employee {
    private float salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(float salary, String id, String name, int year, String address, String phone) {
        super(id, name, year, address, phone);
        this.salary = salary;
    }
    
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void InputFullTime() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap salary: ");
        salary = sc.nextFloat();
    }
    
    public void OutputFullTime() {
        super.Output();
        System.out.println("salary: " + salary);
    }
}
