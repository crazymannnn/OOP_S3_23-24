/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class MainFrame extends JFrame {
    private JButton btnCheckTotalStudent, btnNewStudent, btnRefresh;
    private StudentManager stuManager = new StudentManager();
    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnCheckTotalStudent = new JButton("Check total student");
        //event
        btnCheckTotalStudent.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, String.format("There are %d students in the database", stuManager.getStudents().size()), "Message", JOptionPane.INFORMATION_MESSAGE);
        });
        btnNewStudent = new JButton("New Student");
        btnRefresh = new JButton("Refresh");
        btnNewStudent.addActionListener((e) -> {
            NewStudentDialog dlg = new NewStudentDialog(this, "New Student");
            dlg.setModal(true);
            dlg.setVisible(true);
            if(dlg.getNewStudent()!=null)
                if (stuManager.addStudent(dlg.getNewStudent())==true) {
                    JOptionPane.showMessageDialog(null, "Input successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Input failed", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
        });
        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btnCheckTotalStudent);
        panel1.add(btnNewStudent);
        panel1.add(btnRefresh);
        this.add(panel1, BorderLayout.NORTH);
        this.setSize(800, 600);
        this.setLocation(200, 200);
        this.pack();
        
        
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
}
