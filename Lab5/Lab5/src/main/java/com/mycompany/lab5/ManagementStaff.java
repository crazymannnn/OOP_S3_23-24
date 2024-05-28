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
    Vector staffs = new Vector();
    static Scanner sc = new Scanner(System.in);
    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\student.dat");
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
            FileInputStream f = new FileInputStream("C:\\java file\\student.dat");
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
        
    }
}
