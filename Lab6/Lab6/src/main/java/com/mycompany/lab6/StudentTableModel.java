/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class StudentTableModel extends JFrame{
    private JTable table;
    private DefaultTableModel model;
    public StudentTableModel() {
        setTitle("Student Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400,300));
        
        model = new DefaultTableModel();
        table = new JTable(model);
        
        
        model.addColumn("StudentID");
        model.addColumn("First Name");
        model.addColumn("Last Name");
        model.addColumn("Gender");
        model.addColumn("School Stage");
        
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        ArrayList<String[]> dataList = new ArrayList<>();
        
        for (String[] rowData: dataList) {
            model.addRow(rowData);
        }
        
        pack();
        setLocationRelativeTo(null);
    }
}
