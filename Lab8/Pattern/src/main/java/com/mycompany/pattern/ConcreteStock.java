/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class ConcreteStock implements Stock {
    private String symbol;
    private double currentPrice;
    private ArrayList<Investor> investors = new ArrayList<>();

    public ConcreteStock(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }
    
    @Override
    public void addObserve(Investor investor) {
        this.investors.add(investor);
    }


    @Override
    public void removeObserve(Investor investor) {
        this.investors.remove(investor);
    }


    @Override
    public void notifyInvestors(double priceChange) {
        currentPrice = priceChange;
        for (Investor investor : investors) {
            investor.update(symbol, priceChange);
        }
    }
    
}
