/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Specialists extends Staff {
    private ArrayList<String> codes = new ArrayList<>();
    private int yearOfWork;
    private double salary;
    @Override
    public int Salary() {
        int count = 0;
        for (int i = 0; i < codes.size(); i++) {
            if (codes.get(i).startsWith("T")) {
                count++;
            }
        }
        return (yearOfWork * 4 + count) * 18000;
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
    public void Input() { //input chua xong
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many edicational project they have? ");
        int k = sc.nextInt();
        while(true && k > 0) {
            try {
                System.out.println("enter project code: ");
                var n = sc.next();
                codes.add(n);
                if (!(Character.isLetter(n.charAt(0)) && Character.isDigit(n.charAt(1)) && Character.isDigit(n.charAt(2)))) {
                    throw new Exception("Wrong projectcode");
                } else {
                    k--;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter again:  ");
                sc.nextLine();
            } catch (Exception ex) {
                System.out.println("Invalid project code format. Please enter again: ");
                sc.nextLine();
            }
        }
        System.out.println("how many year do they work?");
        this.yearOfWork = sc.nextInt();
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("The number of project they have: " + this.codes.size());
        System.out.println("Year of work: " + this.yearOfWork);
        System.out.println("Salary: " + this.Salary());
    }
}
