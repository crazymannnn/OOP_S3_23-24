/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3final;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Company {

    public Company() {
    }
    ArrayList<FullTimeEmployee> fulltimes = new ArrayList<>();
    ArrayList<PartTimeEmployee> parttimes = new ArrayList<>();
    public void AddFullTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong nhan vien full time ban muon nhap: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var p = new FullTimeEmployee();
            p.InputFullTime();
            fulltimes.add(p);
        }
    }
    
    public void AddPartTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong nhan vien part time ban muon nhap: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var p = new PartTimeEmployee();
            p.InputPartTime();
            parttimes.add(p);
        }
    }
    
    public void ShowAllFull() {
        for (int i = 0; i < fulltimes.size(); i++) {
            fulltimes.get(i).OutputFullTime();
            System.out.println("----------------");
        }
    }
    
    public void ShowAllPart() {
        for (int i = 0; i < parttimes.size(); i++) {
            parttimes.get(i).OutputPartTime();
            System.out.println("----------------");
        }
    }
    
    public void ShowAllEmployee() {
        for (int i = 0; i < parttimes.size(); i++) {
            parttimes.get(i).OutputPartTime();
            System.out.println("----------------");
        }
        
        for (int i = 0; i < fulltimes.size(); i++) {
            fulltimes.get(i).OutputFullTime();
            System.out.println("----------------");
        }
    }
}
