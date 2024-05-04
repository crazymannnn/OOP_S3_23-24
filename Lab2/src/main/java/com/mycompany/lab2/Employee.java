/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employee {
    private String code;
    private String name;
    private int yearOfService;
    private double salaryCoefficient;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String code, String name, int yearOfService, double salaryCoefficient, double basicSalary) {
        this.code = code;
        this.name = name;
        this.yearOfService = yearOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    
    public void InputEmploy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee code? ");
        code = sc.next();
        System.out.println("Enter employee name? ");
        name = sc.next();
        System.out.println("Enter employee yearOfService? ");
        yearOfService = sc.nextInt();
        System.out.println("Enter employee salaryCoefficient? ");
        salaryCoefficient = sc.nextDouble();
        System.out.println("Enter employee basicSalary? ");
        basicSalary = sc.nextDouble();
    }
    
    public void OutputEmploy() {
        System.out.println("Employee code: " + code);
        System.out.println("Employee name: " + name);
        System.out.println("Employee yearOfService: " + yearOfService);
        System.out.println("Employee salaryCoefficient: " + salaryCoefficient);
        System.out.println("Employee basicSalary: " + basicSalary);
    }
}
