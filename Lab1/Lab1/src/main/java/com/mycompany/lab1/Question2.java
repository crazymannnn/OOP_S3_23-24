/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question2 {
    private int num1;
    private int num2;
    private int num3;

    public Question2(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Question2() {
    }
    
    
    public int FindMinimum() {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        }
        if (num2 <= num3 && num2 <= num1) {
            return num2;
        }
        return num3;
    }
}
