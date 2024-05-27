/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class TeachingAssistants extends Staff {
    private int numOfsubject;
    private double salary;

    public TeachingAssistants() {
    }

    public TeachingAssistants(int numOfsubject) {
        this.numOfsubject = numOfsubject;
    }

    public TeachingAssistants(int numOfsubject, String fullName, String dob, String id) {
        super(fullName, dob, id);
        this.numOfsubject = numOfsubject;
    }

    public int getNumOfsubject() {
        return numOfsubject;
    }

    public void setNumOfsubject(int numOfsubject) {
        this.numOfsubject = numOfsubject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Num of subject they assist? ");
        this.numOfsubject = sc.nextInt();
        this.salary = numOfsubject * 0.3 * 18000;
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("Num of subject they assist: " + this.numOfsubject);
        System.out.println("Salary: " + this.salary);
    }
}
