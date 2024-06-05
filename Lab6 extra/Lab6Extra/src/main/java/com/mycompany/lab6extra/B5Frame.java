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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class B5Frame extends JFrame {
    private JTextField cdID, cdTitle, cdPrice, year;
    private Store store = new Store();
    public B5Frame() {
    }

    public B5Frame(GraphicsConfiguration gc) {
        super(gc);
    }

    public B5Frame(String title) throws HeadlessException {
        super(title);
        this.setLayout(new GridLayout(7 , 1));
        
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("CD ID"));
        cdID = new JTextField();
        cdID.setPreferredSize(new Dimension(200, 20));
        panel1.add(cdID);
        this.add(panel1);
        
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(new JLabel("CD Title"));
        cdTitle = new JTextField();
        cdTitle.setPreferredSize(new Dimension(200, 20));
        panel2.add(cdTitle);
        this.add(panel2);
        
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(new JLabel("CD Collection"));
        String[] data = {"movie", "music", "photo"};
        var collection = new JComboBox(data);
        panel3.add(collection);
        panel3.add(new JLabel("CD Type"));
        var VCD = new JRadioButton("VCD");
        var CD = new JRadioButton("CD");
        var rndGroup = new ButtonGroup();
        rndGroup.add(VCD);
        rndGroup.add(CD);
        panel3.add(VCD);
        panel3.add(CD);
        this.add(panel3);
        
        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(new JLabel("CD Price"));
        cdPrice = new JTextField();
        cdPrice.setPreferredSize(new Dimension(200, 20));
        panel4.add(cdPrice);
        this.add(panel4);
        
        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.add(new JLabel("CD Year of Release"));
        this.add(panel5);
        
        JPanel panel6 = new JPanel(new FlowLayout());
        year = new JTextField();
        year.setPreferredSize(new Dimension(200,20));
        panel6.add(year);
        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener((e) -> {
            if (checkInput()) {
                if (VCD.isSelected()) {
                    CD newCD = new CD(cdID.getText(), cdTitle.getText(), collection.getSelectedItem().toString(), "VCD", Integer.parseInt(cdPrice.getText()), Integer.parseInt(year.getText()));
                    if (store.addCD(newCD)) {
                        store.addCD(newCD);
                        JOptionPane.showMessageDialog(null, "Add successfully", "OK", JOptionPane.CLOSED_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "ID DUPLICCATE", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (CD.isSelected()) {
                    CD newCD = new CD(cdID.getText(), cdTitle.getText(), collection.getSelectedItem().toString(), "CD", Integer.parseInt(cdPrice.getText()), Integer.parseInt(year.getText()));
                    if (store.addCD(newCD)) {
                        store.addCD(newCD);
                        JOptionPane.showMessageDialog(null, "Add successfully", "OK", JOptionPane.CLOSED_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "ID DUPLICCATE", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                Clear();
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in all information", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        panel6.add(btnAdd);
        this.add(panel6);
        
        JPanel panel7 = new JPanel(new FlowLayout());
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener((e) -> {
            Clear();
        });
        JButton btnShow = new JButton("Show All");
        btnShow.addActionListener((e) -> {
            store.ShowAll();
        });
        panel7.add(btnClear);
        panel7.add(btnShow);
        this.add(panel7);
    }
    
    public boolean checkInput() {
        if (cdID.getText().equals("") || cdTitle.getText().equals("")  || cdPrice.getText().equals("")  || year.getText().equals("") ) {
            //JOptionPane.showMessageDialog(null, "Please fill in all information", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void Clear() {
        cdID.setText("");
        cdTitle.setText("");
        cdPrice.setText("");
        year.setText("");
    }

    public B5Frame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
}
