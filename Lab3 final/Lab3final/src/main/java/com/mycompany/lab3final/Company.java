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
            //fulltimes.get(i).OutputFullTime();
            fulltimes.get(i).getInfo();
            System.out.println("----------------");
        }       
    }
    
    public void ShowAllPart() {
        for (int i = 0; i < parttimes.size(); i++) {
            //parttimes.get(i).OutputPartTime();
            parttimes.get(i).getInfo();
            System.out.println("----------------");
        }
    }
    
    public void ShowAllEmployee() {
        for (int i = 0; i < parttimes.size(); i++) {
            //parttimes.get(i).OutputPartTime();
            parttimes.get(i).getInfo();
            System.out.println("----------------");
        }
        
        for (int i = 0; i < fulltimes.size(); i++) {
            //fulltimes.get(i).OutputFullTime();
            fulltimes.get(i).getInfo();
            System.out.println("----------------");
        }
    }
    
    public void SearchByID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID ban muon tim: ");
        String s = sc.next();
        for (int i = 0; i < fulltimes.size(); i++) {
            if (fulltimes.get(i).getId().equals(s)) {
                fulltimes.get(i).getInfo();
                break;
            }
        }
        
        for (int i = 0; i < parttimes.size(); i++) {
            if (parttimes.get(i).getId().equals(s)) {
                parttimes.get(i).getInfo();
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
                System.out.println("nhap ten moi: ");
                var name = sc.next();
                System.out.println("nhap nam moi");
                var year = sc.nextInt();
                System.out.println("nhap dia chi moi");
                var address = sc.next();
                System.out.println("nhap sdt moi: ");
                var phone = sc.next();
                System.out.println("nhap luong moi: ");
                var salary = sc.nextFloat();
                fulltimes.get(i).setName(name);
                fulltimes.get(i).setYear(year);
                fulltimes.get(i).setAddress(address);
                fulltimes.get(i).setPhone(phone);
                fulltimes.get(i).setSalary(salary);
                fulltimes.get(i).OutputFullTime();
                break;
            }
        }
        for (int i = 0; i < parttimes.size(); i++) {
            if (parttimes.get(i).getId().equals(s)) {
                System.out.println("nhap ten moi: ");
                var name = sc.next();
                System.out.println("nhap nam moi");
                var year = sc.nextInt();
                System.out.println();
                System.out.println("nhap dia chi moi");
                var address = sc.next();
                System.out.println("nhap sdt moi: ");
                var phone = sc.next();
                System.out.println("nhap working hour moi: ");
                var workingHour = sc.nextInt();
                System.out.println("nhap payrate moi: ");
                var payRate = sc.nextFloat();
                parttimes.get(i).setName(name);
                parttimes.get(i).setYear(year);
                parttimes.get(i).setAddress(address);
                parttimes.get(i).setPhone(phone);
                parttimes.get(i).setWorkingHour(workingHour);
                parttimes.get(i).setPayRate(payRate);
                parttimes.get(i).OutputPartTime();
                break;
            }
        }
    }

    public void SearchByPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap payment ban muon tim: ");
        var n = sc.nextFloat();
        for (int i = 0; i < fulltimes.size(); i++) {
            if (fulltimes.get(i).getPayment() == n) {
                fulltimes.get(i).getInfo();
                break;
            }
        }
        for (int i = 0;  i< parttimes.size(); i++) {
            if (parttimes.get(i).getPayment() == n) {
                parttimes.get(i).getInfo();
                break;
            }
        }
    }

    public void SortFullTime() {
        fulltimes.sort((s1, s2) -> {
            var compare = Integer.compare(s2.getYear(), s1.getYear());
            if (compare == 0) {
                compare = Float.compare(s1.getPayment(), s2.getPayment());
            }
            return compare;
        });
    }

    public void SortPartTime() {
        parttimes.sort((s1, s2) -> {
            var compare = Integer.compare(s2.getYear(), s1.getYear());
            if (compare == 0) {
                compare = Float.compare(s1.getPayment(), s2.getPayment());
            }
            return compare;
        });
    }
}
