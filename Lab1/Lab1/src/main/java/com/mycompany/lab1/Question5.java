/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Student
 */
public class Question5 {

    public Question5() {
    }
    public ArrayList<Integer> Input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            nums.add(sc.nextInt());
        }
        return nums;
    }
    
    public void Output(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+ " ");
        }
    }
    
    public boolean CauA(ArrayList nums, int n) {
        if (nums.contains(n)) {
            nums.remove(Integer.valueOf(n));
            return true;
        }
        return false;
    }
    
    public ArrayList<Integer> CauB (int num, int pos, ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (i == pos) {
                result.add(num);               
            } else if (i > pos) {
                result.add(nums.get(i-1));
            } else {
                result.add(nums.get(i));
            }
        }
        return result;
    }
    
    public ArrayList<Integer> CauC (ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            count = 0;
            if (result.contains(nums.get(i))) {
                continue;
            }
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j)) {
                    count++;
                }
            }
            if (count > 1) {
                result.add(nums.get(i));
            }
        }
        return result;
    }
    
    public ArrayList<Integer> CauD (ArrayList<Integer> nums) {
        return (ArrayList<Integer>) nums.stream().distinct().collect(Collectors.toList());
    }
}
