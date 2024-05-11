/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3final;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Student
 */
public class Store {

    public Store() {
    }
    ArrayList<CD> cds = new ArrayList<>();
    public void Input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            var cd = new CD();
            cd.InputCD();
            cds.add(cd);
        }
    }
    
    public void Output() {
        for (int i = 0; i < cds.size(); i++) {
            cds.get(i).OutputCD();
        }      
    }
    
    public void SearchByTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Title ban muon tim? ");
        String s = sc.next();
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getTitle().equals(s)) {
                cds.get(i).OutputCD();
                System.out.println("-----------------------");
            }
        }
    }
    
    public void SearchByCollection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Collection ban muon tim? ");
        String s = sc.next();
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getCollection().equals(s)) {
                cds.get(i).OutputCD();
                System.out.println("-----------------------");
            }
        }
    }
    
    public void SearchByType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type ban muon tim? ");
        String s = sc.next();
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getType().equals(s)) {
                cds.get(i).OutputCD();
                System.out.println("-----------------------");
            }
        }
    }
    
    public void DeleteById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon xoa ID nao?? ");
        String s = sc.next();
        for (int i =0 ; i < cds.size(); i++) {
            if (cds.get(i).getId().equals(s)) {
                cds.remove(cds.get(i));
            }
        }
        System.out.println("Xoa thanh cong");
        for (int i = 0; i < cds.size(); i++) {
            cds.get(i).OutputCD();
            System.out.println("-----------------------");
        }
    }
    
    public void Edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon edit ID nao???? ");
        String s = sc.next();
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getId().equals(s)) {
                System.out.println("New collection: ");
                var collection = sc.next();
                System.out.println("New type: ");
                var type = sc.next();
                System.out.println("New title: ");
                var title = sc.next();
                System.out.println("New price: ");
                var price = sc.nextInt();
                System.out.println("New year: ");
                var year = sc.nextInt();
                cds.get(i).setCollection(collection);
                cds.get(i).setType(type);
                cds.get(i).setTitle(title);
                cds.get(i).setPrice(price);
                cds.get(i).setYear(year);
                cds.get(0).OutputCD();
            }
            break;
        }        
    }
    
    public void DisplayAll() {
        for (int i = 0; i < cds.size(); i++) {
            cds.get(i).OutputCD();
        }   
    }
    
    public void Sort() {
        cds.sort((CD s1, CD s2) -> {
            return s1.getYear() - s2.getYear();
        });
    }
}
