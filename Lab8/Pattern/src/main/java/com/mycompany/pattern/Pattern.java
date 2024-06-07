/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pattern;

/**
 *
 * @author ADMIN
 */
public class Pattern {

    public static void main(String[] args) {
        
        //question1
        /*CompanyInfo company = CompanyInfo.getInstance();
        company.displayInfo();
        //update info
        company.setAddress("new address");
        company.setOwner("new name");
        company.displayInfo();*/
        
        //question2
        Stock appleStock = new ConcreteStock("APP",100);
        Stock dellStock = new ConcreteStock("DELL",100);
        
        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addObserve(bobInvestor);
        appleStock.addObserve(tomInvestor);
        dellStock.addObserve(tomInvestor);
        
        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40.0);
        appleStock.notifyInvestors(10.0);
        appleStock.notifyInvestors(5.0);
        dellStock.notifyInvestors(300.0);
        dellStock.notifyInvestors(200.0);
    }
}
