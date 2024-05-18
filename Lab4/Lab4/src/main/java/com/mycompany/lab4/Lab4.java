/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class Lab4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Q1:
        /*
        HashMap<String, String> wordMap = new HashMap<>();
        wordMap.put("one", "mot");
        wordMap.put("two", "hai");
        wordMap.put("three", "ba");
        Question1 q1 = new Question1();
        /*
        System.out.println("Enter word you want to find");
        String s = sc.next();
        if (q1.CheckExist(wordMap, s)) {
            System.out.println("Existed");
        } else {
            System.out.println("Not Existed");
        }
        */
        /*
        System.out.println("Enter word you want to transfer");
        String s = sc.next();
        q1.FindMeaning(wordMap, s);
        */
        //4485
        /*
        Random rd = new Random();
        TreeMap<Long, Long> newMap = new TreeMap<>();
        for (int i = 0; i < 2000000; i++) {
            var k = rd.nextLong(99999);
            var v = rd.nextLong(99999);
            newMap.put(k, v);          
        }
        int count = 0;
        for(var c : newMap.keySet()) {
            System.out.println(c);
            count++;
            if (count == 20) {
            break;
            }
        }
        Instant from = Instant.now();
        System.out.println("Enter word you want to look up");
        Long s = sc.nextLong();
        if (newMap.containsKey(s)) {
            System.out.println("Meaning: " + newMap.get(s));
        } else {
            System.out.println("Cannot find the word");
        }
        Instant to = Instant.now();
        System.out.println("kq:" + Duration.between(from, to).toMillis());
        
        //add tree: 388 hash: 150
        //lookup tree: 2290 hash: 3249
        */
        
        //Q2:
        /*
        BankFactory factory = new BankFactory();
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 1) {
            var cc = factory.getBank(BankType.Vietcombank);
            System.out.println(cc.getBankName());
        } else if (type == 2) {
            var cc = factory.getBank(BankType.TPBank);
            System.out.println(cc.getBankName());
        } else {
            System.out.println("Not found");
        }   
        */
        
        //Q3:
        School school = new School();
        school.AddCollege();
        school.AddUniversity();
        school.Print();
    }
}
