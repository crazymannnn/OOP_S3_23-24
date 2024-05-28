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
public class Researchers extends Staff {
    private ArrayList<String> codes = new ArrayList<>();
    private int numOfYear;
    private double salary;
    @Override
    public int Salary() {
        int count = 0;
        for (int i = 0; i < codes.size(); i++) {
            if (codes.get(i).startsWith("D")) {
                count++;
            }
        }
        return (numOfYear * 2 + count) * 20000;
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
    static Scanner sc = new Scanner(System.in);
    @Override //thieu input
    public void Input() {
        super.Input();
        System.out.println("How many research project they have? ");
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
        System.out.println("How many year do they work? ");
        this.numOfYear = sc.nextInt();
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("the number of project they have: " + this.codes.size());
        System.out.println("Year of work: " + this.numOfYear);
        System.out.println("Salary: " + this.Salary());
    }
}
