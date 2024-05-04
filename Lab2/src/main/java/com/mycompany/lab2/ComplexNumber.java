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
public class ComplexNumber {
    private double re;
    private double im;

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public void InputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input real");
        re = sc.nextDouble();
        System.out.println("input ima");
        im = sc.nextDouble();
    }
    
    public void OutputNumber() {
        System.out.println(re + "+" + im + "!");
    }
    
    public ComplexNumber Plus(ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber();
        result.im = this.im + num2.getIm();
        result.re = this.re + num2.getRe();
        return result;
    }
    
    public ComplexNumber Minus(ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber();
        result.im = this.im - num2.getIm();
        result.re = this.re - num2.getRe();
        return result;
    }
    
    public ComplexNumber Multiply(ComplexNumber num2) {
        ComplexNumber result = new ComplexNumber();
        result.re = this.re*num2.getRe() - this.im*num2.getIm();
        result.im = this.re*num2.getIm() + num2.getRe()*this.im;
        return result;
    }
}
