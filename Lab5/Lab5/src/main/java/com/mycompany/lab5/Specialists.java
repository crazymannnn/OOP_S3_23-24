/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Specialists extends Staff {
    private ArrayList<String> codes = new ArrayList<>();
    private int yearOfWork;
    private double salary;
    public void Salary() {
        int count = 0;
        for (int i = 0; i < codes.size(); i++) {
            if (codes.get(i).startsWith("T")) {
                count++;
            }
        }
        this.salary = (yearOfWork * 4 + count) * 18000;
    }

    public Specialists() {
    }

    public Specialists(int yearOfWork, double salary) {
        this.yearOfWork = yearOfWork;
        this.salary = salary;
    }

    public Specialists(int yearOfWork, double salary, String fullName, String dob, String id) {
        super(fullName, dob, id);
        this.yearOfWork = yearOfWork;
        this.salary = salary;
    }

    public ArrayList<String> getCodes() {
        return codes;
    }

    public void setCodes(ArrayList<String> codes) {
        this.codes = codes;
    }

    public int getYearOfWork() {
        return yearOfWork;
    }

    public void setYearOfWork(int yearOfWork) {
        this.yearOfWork = yearOfWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void Input() {
        
    }
}
