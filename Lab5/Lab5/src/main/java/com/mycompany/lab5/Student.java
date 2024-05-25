/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Student implements Serializable{
    private String number;
    private String fullName;
    private int credits;
    private double avrScore;

    public Student() {
    }

    public Student(String number, String fullName, int credits, double avrScore) {
        this.number = number;
        this.fullName = fullName;
        this.credits = credits;
        this.avrScore = avrScore;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getAvrScore() {
        return avrScore;
    }

    public void setAvrScore(double avrScore) {
        this.avrScore = avrScore;
    }
    
    public abstract boolean IfGraduation();
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student number: ");
        this.number = sc.next();
        System.out.println("Enter student full name: ");
        this.fullName = sc.next();
        System.out.println("Enter student credit: ");
        this.credits = sc.nextInt();
        System.out.println("Enter student avr score: ");
        this.avrScore = sc.nextDouble();
    }
    
    public void Output() {
        System.out.println("student number: " + number);
        System.out.println("full name: " + fullName);
        System.out.println("student credit: " + credits);
        System.out.println("student avr score: " + avrScore);
    }
    
}
