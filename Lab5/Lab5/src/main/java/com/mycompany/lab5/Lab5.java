/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        School school = new School();
        school.ReadFile();
        int x;
        do {
            System.out.println("Menu");
            System.out.println("1. ADD COLLEGE ");
            System.out.println("2. ADD UNIVERSITY");
            System.out.println("3. REMOVE BY ID");
            System.out.println("4. PRINT");
            System.out.println("5. PRINT GRADUATION STUDENT");
            System.out.println("6. SORT");
            System.out.println("7. FIND STUDENT BY NAME");
            System.out.println("8. EXIT");
            x = sc.nextInt();
            switch(x) {
                case 1:
                    school.AddCollege();
                    school.WriteFile();
                    break;
                case 2:
                    school.AddUniversity();
                    school.WriteFile();
                    break;
                case 3: 
                    school.RemoveByCode();
                    school.WriteFile();
                    break;
                case 4:
                    school.Print();                   
                    break;
                case 5:
                    school.PrintGraduationStudent();
                    break;
                case 6:
                    school.SortStudent();
                    school.WriteFile();
                    break;
                case 7:
                    school.FindByName();
                    school.WriteFileResult();
                    break;
                case 8:
                    System.out.println("existinggg");
                    break;
            }
        } while (x != 8);
        */
        var company = new ManagementStaff();
        int x;
        do {
            System.out.println("Menu");
            System.out.println("1. ADD LECTURER ");
            System.out.println("2. ADD TA");
            System.out.println("3. ADD RESEARCHERS");
            System.out.println("4. ADD SPECIALISTS");
            System.out.println("5. FIND EDIT BY ID");
            System.out.println("6. REMOVE BY ID");
            System.out.println("7. CALCULATE TOTAL SALARY");
            System.out.println("8. Statistic");
            System.out.println("9. 3 HIGHEST SALARY");
            System.out.println("10. PRINT");
            System.out.println("11. EXIT");
            x = sc.nextInt();
            switch(x) {
                case 1:
                    company.AddLecturers();
                    company.WriteFileEiuStaff();
                    break;
                case 2:
                    company.AddTeachingAssist();
                    company.WriteFileEiuStaff();
                    break;
                case 3: 
                    company.AddResearcher();
                    company.WriteFileEiuStaff();
                    break;
                case 4:
                    company.AddSpecialists();
                    company.WriteFileEiuStaff();                 
                    break;
                case 5:
                    company.EditById();
                    break;
                case 6:
                    company.RemoveById();
                    break;
                case 7:
                    company.TotalSalary();
                    company.WriteFileTotalSalary();
                    break;
                case 8:
                    company.Statistic();
                    company.WriteFileTotalSalarybyType();
                    break;
                case 9:
                    company.HighestPaid();
                    company.WriteFileTotalSalarybyType();
                    break;
                case 10:
                    company.Print();                 
                    break;
                case 11:
                    System.out.println("existinggggg");
                    break;
            }
        } while (x != 11);
    }
}
