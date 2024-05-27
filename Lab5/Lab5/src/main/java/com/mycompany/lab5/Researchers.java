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
public class Researchers extends Staff {
    private ArrayList<String> codes = new ArrayList<>();
    private int numOfYear;
    private double salary;
    public void Salary() {
        int count = 0;
        for (int i = 0; i < codes.size(); i++) {
            if (codes.get(i).startsWith("D")) {
                count++;
            }
        }
        this.salary = (numOfYear * 2 + count) * 20000;
    }

    public Researchers() {
    }

    public Researchers(int numOfYear, double salary) {
        this.numOfYear = numOfYear;
        this.salary = salary;
    }

    public Researchers(int numOfYear, double salary, String fullName, String dob, String id) {
        super(fullName, dob, id);
        this.numOfYear = numOfYear;
        this.salary = salary;
    }

    public ArrayList<String> getCodes() {
        return codes;
    }

    public void setCodes(ArrayList<String> codes) {
        this.codes = codes;
    }

    public int getNumOfYear() {
        return numOfYear;
    }

    public void setNumOfYear(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
