/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6extra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Store {
    ArrayList<CD> cds = new ArrayList<>();
    public Store() {
    }
    public boolean addCD(CD cd) {
        for (int i = 0; i < cds.size(); i++) {
            if (cds.get(i).getId().equals(cd.getId())) {
                return false;
            }
        }
        cds.add(cd);
        return true;
    }
    
    public void ShowAll() {
        for (int i = 0; i < cds.size(); i++) {
            System.out.println("CD ID is: " + cds.get(i).getId() + "\n");
        }
    }
}
