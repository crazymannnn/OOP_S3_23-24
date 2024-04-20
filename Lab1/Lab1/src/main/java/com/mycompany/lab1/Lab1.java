/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Lab1 {

    public static void main(String[] args) {
        //System.out.println(new Question1(123123).SumFirstLastDigit());
        //System.out.println(new Question2(2, 2, 2).FindMinimum());
        //new Question3(5).Solve();
        //Question4 test = new Question4();
        //int[] arr = test.Input();
        //test.SumOfEven(arr);
        
        //Question5:
        //Question5 test = new Question5();
        
        //CauA
        //boolean flag = test.CauA(test.Input(), 0);
        //if (flag) {
        //    System.out.print("Ok");
        //} else {
        //    System.out.print("CANNOT FIND");
        //}   
        
        //CauB:
        //ArrayList<Integer> result = test.CauB(5, 2, test.Input());
        //test.Output(result);
        
        //CauC:
        //ArrayList<Integer> result = test.CauC(test.Input());
        //test.Output(result);
        
        //CauD
        //ArrayList<Integer> result = test.CauD(test.Input());
        //test.Output(result);
        
        
        
        //Question6:
        //Question6 test = new Question6("123456789");
        //test.LengOfString();
        
        //Question6 test = new Question6("ad sad sad sada");
        //test.NumOfWord();
        
        //Question6 test = new Question6("ad sad sad sada");
        //test.AddString("123123");
        
        Question6 test = new Question6("abba");
        if (test.Padlingo() == test.getN()) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
        
    } 
}
