/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankFactory {
    private BankType bankType;
    public BankFactory() {
    }

    public BankFactory(BankType bankType) {
        this.bankType = bankType;
    }

    public BankType getBankType() {
        return bankType;
    }

    public void setBankType(BankType bankType) {
        this.bankType = bankType;
    }
    public bank getBank(BankType bankType) {
        switch(bankType) {
            case TPBank -> {
                return new TPBank();
            }
            case Vietcombank -> {
                return new Vietcombank();
            }
            default -> throw new IllegalArgumentException("Invalid input");
        }
    }
}
