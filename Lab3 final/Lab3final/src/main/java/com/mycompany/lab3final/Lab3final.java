/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3final;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab3final {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //bai 1
        /*
        int choice;
        Store store = new Store();
        do {
            System.out.println("Menu");
            System.out.println("1. ADD ID");
            System.out.println("2. SEARCH BY TITLE");
            System.out.println("3. SEARCH BY COLLECTION");
            System.out.println("4. SEARCH BY TYPE");
            System.out.println("5. DELETE BY ID");
            System.out.println("6. EDIT BY ID");
            System.out.println("7. DISPLAY ALL");
            System.out.println("8. SORT DESCENDING YEAR");
            System.out.println("9. EXIT");
            choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    store.Input();
                    break;
                case 2:
                    store.SearchByTitle();
                    break;
                case 3: 
                    store.SearchByCollection();
                    break;
                case 4:
                    store.SearchByType();
                    break;
                case 5:
                    store.DeleteById();
                    break;
                case 6:
                    store.Edit();
                    break;
                case 7:
                    store.DisplayAll();
                    break;
                case 8: 
                    store.Sort();
                    break;
                case 9:
                    System.out.println("existinggggg");
                    break;    
            }
        } while (choice != 9);    
        */

        //bai 2
        Company company = new Company();
        int temp;
        do {
            System.out.println("Menu");
            System.out.println("1. ADD FULL TIME ");
            System.out.println("2. ADD PART TIME");
            System.out.println("3. SHOW FULL TIME");
            System.out.println("4. SHOW PART TIME");
            System.out.println("5. SHOW ALL EMPLOYEE");
            System.out.println("6. SEARCH BY ID");
            System.out.println("7. DELETE BY ID");
            System.out.println("8. EDIT");
            System.out.println("9. SEARCH BY PAYMENT");
            System.out.println("10. SORT BY AGE, PAYMENT");
            System.out.println("11. EXIT");
            temp = sc.nextInt();
            switch (temp) {
                case 1: 
                    company.AddFullTime();
                    break;
                case 2:
                    company.AddPartTime();
                    break;
                case 3: 
                    company.ShowAllFull();
                    break;
                case 4:
                    company.ShowAllPart();
                    break;
                case 5:
                    company.ShowAllEmployee();
                    break;
                case 6:
                    company.SearchByID();
                    break;
                case 7:
                    company.DeleteByID();
                    break;
                case 8: 
                    company.Edit();
                    break;
                case 9:
                    company.SearchByPayment();
                    break;
                case 10:
                    company.SortFullTime();
                    company.SortPartTime();
                case 11:
                    System.out.println("existinggggg");
                    break;
            }
        } while (temp != 11);
    }
}
