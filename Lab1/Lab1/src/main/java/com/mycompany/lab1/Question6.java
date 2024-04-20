/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Question6 {

    public String getN() {
        return n;
    }
    private String n;

    public Question6() {
    }

    public Question6(String n) {
        this.n = n;
    }
    public void LengOfString() {
        System.out.print("length of string: " + n.length());
    }
    
    public void NumOfWord() {
        int count = 0;
        if (n.isEmpty()) {
            System.out.print(0);
        }
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.print(count + 1);
    }
    
    public void AddString(String k) {
        System.out.print(n + k);
    }
    
    public String Padlingo() {
        String c = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            c = c + n.charAt(i);
        }
        return c;
    }
}
