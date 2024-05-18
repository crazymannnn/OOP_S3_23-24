/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.HashMap;

/**
 *
 * @author Student
 */
public class Question1 {
    HashMap<String, String> wordMap = new HashMap<>();

    public Question1() {
    }

    public HashMap<String, String> getWordMap() {
        return wordMap;
    }

    public void setWordMap(HashMap<String, String> wordMap) {
        this.wordMap = wordMap;
    }
    
    public boolean CheckExist(HashMap<String, String> wordMap, String s) {
        if (wordMap.containsKey(s)) {
            return true;
        }
        return false;
    }
    
    public void FindMeaning(HashMap<String, String> wordMap, String s) {
        System.out.println(wordMap.get(s));
    }
}
