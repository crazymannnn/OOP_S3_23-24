/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import static java.awt.PageAttributes.MediaType.D;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class School  {

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
            System.out.println("-----------");
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
    
    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\java file\\student.dat");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var student : students) {
                oStream.writeObject(student);
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
            Student st = null;
            while ((st=(Student)inStream.readObject()) != null) {
                students.add(st);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        } catch (IOException e) {
            System.out.println("error read file");
        }
    }
    
    public void WriteFileResult() {
        try {
            FileOutputStream f = new FileOutputStream("D:\\result.dat");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (var student : students) {
                oStream.writeObject(student);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }
    
    public void ReadFileResult() {
        try {
            FileInputStream f = new FileInputStream("D:\\result.dat");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Student st = null;
            while ((st=(Student)inStream.readObject()) != null) {
                students.add(st);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        } catch (IOException e) {
            System.out.println("error read file");
        }
    }
    
}
