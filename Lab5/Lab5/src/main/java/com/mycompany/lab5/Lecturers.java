/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lecturers extends Staff {
    private String acaRack;
    private String acaDegree;
    private int yearOfTeaching;
    private ArrayList<String> subjects = new ArrayList<>();
    private double salary;
    @Override
    public int Salary() {
        return (int)(subjects.size() * yearOfTeaching * 0.12 * 20000);
    }

    public Lecturers() {
    }

    public Lecturers(String acaRack, String acaDegree, int yearOfTeaching) {
        this.acaRack = acaRack;
        this.acaDegree = acaDegree;
        this.yearOfTeaching = yearOfTeaching;
    }

    public Lecturers(String acaRack, String acaDegree, int yearOfTeaching, String fullName, String dob, String id) {
        super(fullName, dob, id);
        this.acaRack = acaRack;
        this.acaDegree = acaDegree;
        this.yearOfTeaching = yearOfTeaching;
    }

    public String getAcaRack() {
        return acaRack;
    }

    public void setAcaRack(String acaRack) {
        this.acaRack = acaRack;
    }

    public String getAcaDegree() {
        return acaDegree;
    }

    public void setAcaDegree(String acaDegree) {
        this.acaDegree = acaDegree;
    }

    public int getYearOfTeaching() {
        return yearOfTeaching;
    }

    public void setYearOfTeaching(int yearOfTeaching) {
        this.yearOfTeaching = yearOfTeaching;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Enter acaRank");
        this.acaRack = sc.next();
        System.out.println("Enter acaDegree");
        this.acaDegree = sc.next();
        System.out.println("Enter year of teaching");
        this.yearOfTeaching = sc.nextInt();
        System.out.println("how many subject they have?");
        var k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            this.subjects.add(sc.next());
        }
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("acaRank: " + this.acaRack);
        System.out.println("acaDegree: " + this.acaDegree);
        System.out.println("yearOfTeaching: " + this.yearOfTeaching);
        for (int i = 0; i < subjects.size(); i++) {
            System.out.print(subjects.get(i) + " ");
        }
        System.out.println("Salary: " + this.Salary());
    }
}
