/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Company {

    public Company() {
    }
    ArrayList<Employee> lists = new ArrayList<>();
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee pp = new Employee();
            pp.InputEmploy();
            lists.add(pp);
        }
    }
    
    public void Output() {
        for (int i = 0; i < lists.size(); i++) {
            lists.get(i).OutputEmploy();
            System.out.println("----------------");
        }
    }
    
    public void OutputTotal() {
        for (int i = 0; i < lists.size(); i++) {
            var total = lists.get(i).getBasicSalary() * lists.get(i).getSalaryCoefficient();
            lists.get(i).OutputEmploy();
            System.out.println("Total is: " + total);
            System.out.println("----------------");
        }
    }
    
    public void OutputHighest() {
        var result = new ArrayList<Employee>();
        var max = lists.get(0).getBasicSalary() * lists.get(0).getSalaryCoefficient();
        for (int i = 0; i < lists.size(); i++) {
            var total = lists.get(i).getBasicSalary() * lists.get(i).getSalaryCoefficient();
            if (total > max) {
                max = total;
            }
        }
        
        for (int i = 0; i < lists.size(); i++) {
            var total = lists.get(i).getBasicSalary() * lists.get(i).getSalaryCoefficient();
            if (total == max) {
                result.add(lists.get(i));
            }
        }
        System.out.println("People who have the highest salary are: ");
        for (int i = 0; i < result.size(); i++) {
            result.get(i).OutputEmploy();
            System.out.println("Salary is: " + max);
            System.out.println("-------------------------");
        }
    }
    
    Comparator<Employee> com = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o2.getBasicSalary()*o2.getSalaryCoefficient() - o1.getBasicSalary()*o1.getSalaryCoefficient());
        }
    };
    
    public void Sort() {
        lists.sort(com);
    }
}
