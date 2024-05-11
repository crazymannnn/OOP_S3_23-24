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
    
    public void SearchByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID ban muon tim: ");
        String s = sc.next();
        for (int i = 0; i < fulltimes.size(); i++) {
            if (fulltimes.get(i).getId().equals(s)) {
                fulltimes.get(i).OutputFullTime();
                break;
            }
        }
        
        for (int i = 0; i < parttimes.size(); i++) {
            if (parttimes.get(i).getId().equals(s)) {
                parttimes.get(i).OutputPartTime();
                break;
            }
        }
    }
    
    public void DeleteByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID ban muon xoa: ");
        String s = sc.next();
        for (int i = 0; i < fulltimes.size(); i++) {
            if (fulltimes.get(i).getId().equals(s)) {
                fulltimes.remove(fulltimes.get(i));
                break;
            }
        }
        
        for (int i = 0; i < parttimes.size(); i++) {
            if (parttimes.get(i).getId().equals(s)) {
                parttimes.remove(parttimes.get(i));
                break;
            }
        }
    }
    
    public void Edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID ban muon edit: ");
        String s = sc.next();
        for (int i = 0; i < fulltimes.size(); i++) {
            if (fulltimes.get(i).getId().equals(s)) {
                
            }
        }
    }
}
