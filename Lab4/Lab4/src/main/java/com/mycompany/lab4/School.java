/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class School {

    public School() {
    }
    Vector<Student> students = new Vector();
    static Scanner sc = new Scanner(System.in);
    public void AddCollege() {
        System.out.println("nhap so luong college");
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            var college = new CollegeStudent();
            college.Input();
            students.add(college);
        }
    }
    
    public void AddUniversity() {
        System.out.println("nhap so luong university");
        int n = sc.nextInt();
        for (int i = 0; i < n; i ++) {
            var university = new UniversityStudent();
            university.Input();
            students.add(university);
        }
    }
    
    public void RemoveByCode() {
        System.out.println("nhap id ban muon xoa");
        String code = sc.next();
        for (int i = 0;  i < students.size(); i++) {
            if (students.get(i).getNumber().equals(code)) {
                students.remove(students.get(i));
            }
        }
    }
    
    public void Print() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).Output();
        }
    }
    public void PrintGraduationStudent() {
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).IfGraduation()) {
                students.get(i).Output();
                count++;
            }
        }
        System.out.println("Sum of graduation: " + count);
    }
    
    public void SortStudent() {
        students.sort((s1, s2) -> {
            if(s1.getClass().toString().compareTo(s2.getClass().toString())==0)
                return s1.getNumber().compareTo(s2.getNumber());
            return s1.getClass().toString().compareTo(s2.getClass().toString());         
        });
    }

    public void FindByName() {
        System.out.println("nhap ten ban muon tim kiem");
        var name = sc.next();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFullName().equals(name)) {
                students.get(i).Output();
            }
        }
    }
}
