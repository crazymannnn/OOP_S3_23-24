/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class ManagementStaff {
    Vector<Staff> staffs = new Vector();
    static Scanner sc = new Scanner(System.in);
    public void WriteFileEiuStaff() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\EiuStaff.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var staff : staffs) {
                oStream.writeObject(staff);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
    public void WriteFileTotalSalary() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\TotalSalary.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var staff : staffs) {
                oStream.writeObject(staff);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
    public void WriteFileTotalSalarybyType() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\TotalSalarybyType.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var staff : staffs) {
                oStream.writeObject(staff);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
    
    public void ReadFile() {
        try {
            FileInputStream f = new FileInputStream("C:\\java file\\EiuStaff.eiu");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Staff st = null;
            while ((st=(Staff)inStream.readObject()) != null) {
                staffs.add(st);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        } catch (IOException e) {
            System.out.println("error read file");
        }
    }
    
    public void AddLecturers() {
        System.out.println("How many staff do u want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var pp = new Lecturers();
            pp.Input();
            staffs.add(pp);
        }
    }
    public void AddTeachingAssist() {
        System.out.println("How many staff do u want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var pp = new TeachingAssistants();
            pp.Input();
            staffs.add(pp);
        }
    }
    public void AddResearcher() {
        System.out.println("How many staff do u want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var pp = new Researchers();
            pp.Input();
            staffs.add(pp);
        }
    }
    public void AddSpecialists() {
        System.out.println("How many staff do u want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var pp = new Specialists();
            pp.Input();
            staffs.add(pp);
        }
    }
    
    public void EditById() {
        System.out.println("Nhap id ban muon edit");
        int n = sc.nextInt();
        for (int i = 0;  i< staffs.size(); i++) {
            if (staffs.get(i).getId().equals(n)) {
                System.out.println("Enter new name: ");
                var name = sc.next();
                System.out.println("Enter new dob: ");
                var dob = sc.next();
                System.out.println("Enter new id: ");
                var id = sc.next();
                staffs.get(i).setFullName(name);
                staffs.get(i).setDob(dob);
                staffs.get(i).setId(id);
            }
        }
    }
    
    public void RemoveById() {
        System.out.println("Nhap id ban muon remove");
        String n = sc.next();
        for (int i = 0; i < staffs.size(); i ++) {
            if (staffs.get(i).getId().equals(n)) {
                staffs.remove(staffs.get(i));
                break;
            }
        }
    }
    
    public void TotalSalary() {
        for (int i = 0;  i< staffs.size();i++) {
            System.out.println("Id: " + staffs.get(i).getId() + " Salary: " + staffs.get(i).Salary());
        }
    }
    
    public void Statistic() {
        staffs.sort((s1, s2) -> {
            if(s1.getClass().toString().compareTo(s2.getClass().toString())==0)
                return s1.getId().compareTo(s2.getId());
            return s1.getClass().toString().compareTo(s2.getClass().toString());         
        });
    }
    
    public void HighestPaid() {
        staffs.sort((s1, s2) -> {
            return Integer.compare(s2.Salary(), s1.Salary());
        });
        for (int i = 0; i < 3; i++) {
            System.out.println("3 highest paid are: ");
            staffs.get(i).Output();
        }
    }
    
    public void Print() {
        for (int i = 0; i < staffs.size(); i++) {
            staffs.get(i).Output();
            System.out.println("-----------");
        }
    }
}
