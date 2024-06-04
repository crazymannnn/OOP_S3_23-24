/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6extra;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class B4Frame extends JFrame {

    public B4Frame() {
    }

    public B4Frame(GraphicsConfiguration gc) {
        super(gc);
    }

    public B4Frame(String title) throws HeadlessException {
        super(title);
        this.setLayout(new GridLayout(7,1));
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("Resort Price Calculator"));
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("Base Price for a room is $200"));
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(new JLabel("Choose obtions that you want"));
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        
        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(new JLabel("Guest Name:"));
        var name = new JTextField();
        name.setPreferredSize(new Dimension(200, 20));
        panel4.add(name);
        this.add(panel4);
        
        JPanel panel5 = new JPanel(new FlowLayout());
        var bf = new JRadioButton("Breakfast $20");
        var goft = new JRadioButton("Goft $50");
        var pool = new JRadioButton("Pool $15");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(bf);
        rndGroup.add(goft);
        rndGroup.add(pool);
        panel5.add(bf);
        panel5.add(goft);
        panel5.add(pool);
        this.add(panel5);
        
        JPanel panel6 = new JPanel(new FlowLayout());
        JLabel panel7 = new JLabel();
        String [] data = {"Weekend (+30%)", "Week day (-10%)"};
        var day = new JComboBox(data);
        panel6.add(day);
        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener((e) -> {
            if (name.getText() != null) {
                double money = 200;
                if (bf.isSelected()) {
                    money += 20;
                } else if (goft.isSelected()) {
                    money += 50;
                } else if (pool.isSelected()) {
                    money += 15;
                }
                if (day.getSelectedItem().equals("Weekend (+30%)")) {
                    money =(double) money * 1.3;
                } else {
                    money = money * 0.9;
                }
                panel7.setText("Hello " + name.getText() + " Your payment is: " + money);
            }
        });
        panel6.add(btnCalculate);
        this.add(panel6);
        this.add(panel7);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public B4Frame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
    
}
