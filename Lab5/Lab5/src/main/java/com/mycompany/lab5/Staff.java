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
public class Staff {
    private String fullName;
    private String dob;
    private String id;

    public Staff() {
    }

    public Staff(String fullName, String dob, String id) {
        this.fullName = fullName;
        this.dob = dob;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name: ");
        this.fullName = sc.next();
        System.out.println("Enter day of birth: ");
        this.dob = sc.next();
        System.out.println("Enter personal ID: ");
        this.id = sc.next();
    }
    
    public void Output() {
        System.out.println("Full name: " + this.fullName);
        System.out.println("Day of birth: " + this.dob);
        System.out.println("Personal ID: " + this.id);
    }
}
