/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManager() {
    }
    
    
    public Student findStudentById(String studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(studentId)) {
                return students.get(i);
            }
        }
        return null;
    }
    
    public boolean addStudent(Student st) {
        for (int i = 0; i < students.size(); i++) {
            if (st.getStudentId().equals(students.get(i).getStudentId())) {
                return false;
            }
        }
        students.add(st);
        return true;
    }
    
    public ArrayList<Student> getListStudent() {
        return students;
    }
}
