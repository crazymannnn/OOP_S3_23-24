/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //QUESTION1
        //ComplexNumber s1 = new ComplexNumber();
        //s1.InputNumber();
        //ComplexNumber s2 = new ComplexNumber();
        //s2.InputNumber();
        //s1.Plus(s2).OutputNumber();
        //s1.Minus(s2).OutputNumber();
        //s1.Multiply(s2).OutputNumber();
        
        //QUESTION2
        /*int n = sc.nextInt();
        ArrayList<BankAccount> banks = new ArrayList<BankAccount>();
        //nhap thong tin
        for (int i = 0; i < n; i++) {
            BankAccount pp = new BankAccount();
            pp.InputAccount();
            banks.add(pp);
        }*/
        
        //Deposit money
        /*for (int i = 0; i < banks.size(); i++) {
            System.out.println("How much do u want to deposit? + banks.get(i).getmName()");
            banks.get(i).Deposit(sc.nextDouble());
            banks.get(i).Print();
        }*/
        
        //withdraw money
        /*for (int i = 0; i < banks.size(); i++) {
            System.out.println("How much do u want to withdraw? " + banks.get(i).getmName());
            if (banks.get(i).Withdraw(sc.nextDouble())) {
                banks.get(i).Print();
            } else {
                System.out.println("Not enough money ");
            }           
        }*/
        
        //transfer money, input n must >1
        /*banks.get(0).TransferMoney(banks.get(1), 100);
        banks.get(1).Print();
        banks.get(0).Print();*/   
        
        
        //QUESTION3
        Company company = new Company();
        company.Input();
        company.Sort();
        company.Output();
    }
}
