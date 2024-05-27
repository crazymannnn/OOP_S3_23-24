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
public class Lecturers extends Staff {
    private String acaRack;
    private String acaDegree;
    private int yearOfTeaching;
    private ArrayList<String> subjects = new ArrayList<>();
    private double salary = subjects.size() * yearOfTeaching * 0.12 * 20000;

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
    
}
