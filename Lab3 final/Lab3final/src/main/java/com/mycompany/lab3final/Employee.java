/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3final;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Employee {
    private String id;
    private String name;
    private int year;
    private String address;
    private String phone;
    public abstract void getInfo();
    public abstract void getPayment();

    public Employee() {
    }

    public Employee(String id, String name, int year, String address, String phone) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id ");
        id = sc.next();
        System.out.println("Nhap name ");
        name = sc.next();
        System.out.println("Nhap year ");
        year = sc.nextInt();
        System.out.println("Nhap address ");
        address = sc.next();
        System.out.println("Nhap phone ");
        phone = sc.next();
    }
    
    public void Output() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}
