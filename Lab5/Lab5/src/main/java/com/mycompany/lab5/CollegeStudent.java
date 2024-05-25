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
public class CollegeStudent extends Student {
    private double ExamScore;

    public CollegeStudent(double ExamScore) {
        this.ExamScore = ExamScore;
    }

    public CollegeStudent() {
    }
    

    public CollegeStudent(double ExamScore, String number, String fullName, int credits, double avrScore) {
        super(number, fullName, credits, avrScore);
        this.ExamScore = ExamScore;
    }

    public double getExamScore() {
        return ExamScore;
    }

    public void setExamScore(double ExamScore) {
        this.ExamScore = ExamScore;
    }

    @Override
    public boolean IfGraduation() {
        if (this.getCredits() >= 100 && this.getAvrScore() >= 5 && this.getExamScore() >= 5) {
            return true;
        }
        return false;
    }
    static Scanner sc = new Scanner(System.in);
    @Override
    public void Input() {
        super.Input();
        System.out.println("Enter student graduation score: ");
        this.ExamScore = sc.nextDouble();
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("graduation score: " + ExamScore);
    }
}
