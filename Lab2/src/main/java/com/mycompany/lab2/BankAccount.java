/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankAccount {
    private int mAccNum;
    private String mName;
    private double mBalance;

    public BankAccount() {
    }

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public int getmAccNum() {
        return mAccNum;
    }

    public void setmAccNum(int mAccNum) {
        this.mAccNum = mAccNum;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public double getmBalance() {
        return mBalance;
    }

    public void setmBalance(double mBalance) {
        this.mBalance = mBalance;
    }
    
    
    public void Deposit(double money) {
        this.mBalance+=money;
    }
    
    public boolean Withdraw(double money) {
        if (money > this.mBalance)
            return false;
        this.mBalance-=money;
        return true;
    }
    
    public boolean TransferMoney(BankAccount acc2, double money) {
        if (money > this.mBalance)
            return false;
        acc2.Deposit(money);
        this.Withdraw(money);
        return true;
    }
    
    public void Print() {
        System.out.println("AccNum is: " + this.mAccNum);
        System.out.println("Balance is " + this.mBalance);
        System.out.println("Name is: " +this.mName);
        System.out.println("-------------------------------");
    }
    
    public void InputAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AccNum? ");
        mAccNum = sc.nextInt();
        System.out.println("Enter Name? ");
        mName = sc.next();
        System.out.println("Enter Balance? ");
        mBalance = sc.nextDouble();
    }
    
}
