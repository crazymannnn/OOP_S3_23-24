/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;

/**
 *
 * @author ADMIN
 */
public class CompanyInfo {
    private static CompanyInfo instance;
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String owner;

    private CompanyInfo() {
        this.companyName = "MyCompany";
        this.address = "123, Phu Hoa Street, HCM city";
        this.phoneNumber = "012312312";
        this.email = "info@eiu.edu.vn";
        this.owner = "Nguyen Thanh Duy";
    }
    
    public static synchronized CompanyInfo getInstance() {
        if (instance == null) {
            instance = new CompanyInfo();
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Owner: " + owner);
    }
}
