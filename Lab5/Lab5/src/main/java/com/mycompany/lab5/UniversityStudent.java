/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class UniversityStudent extends Student {
    private String thesisName;
    private double thesisScore;

    public UniversityStudent(String thesisName, double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent(String thesisName, double thesisScore, String number, String fullName, int credits, double avrScore) {
        super(number, fullName, credits, avrScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent() {
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public boolean IfGraduation() {
        if (this.getCredits() >= 150 && this.getAvrScore() >= 5 && this.getThesisScore() >= 5) {
            return true;
        }
        return false;
    }
    static Scanner sc = new Scanner(System.in);
    @Override
    public void Input() {
        super.Input();
        System.out.println("Enter student thesis name: ");
        this.thesisName = sc.next();
        System.out.println("Enter student thesis score: ");
        this.thesisScore = sc.nextDouble();
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("student thesis name: " + thesisName);
        System.out.println("student thesis score: " + thesisScore);
    }
    
}
