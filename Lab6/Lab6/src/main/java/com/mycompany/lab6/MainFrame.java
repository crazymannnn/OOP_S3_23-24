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
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author ADMIN
 */
public class MainFrame extends JFrame {
    private JButton btnCheckTotalStudent, btnNewStudent, btnRefresh, btnDelete, btnSaveToFile;
    private StudentManager stuManager = new StudentManager();
    private JTable table;
    private StudentTableModel model = new StudentTableModel();
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
        btnRefresh = new JButton("Refresh");
        btnDelete = new JButton("Delele");
        btnSaveToFile = new JButton("SaveToFile");
        btnRefresh.addActionListener((e) -> {
            refreshModel();
        });
        btnDelete.addActionListener((e) -> {
            int selected = table.getSelectedRow();
            if (selected != -1) {
                int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (answer == JOptionPane.YES_OPTION) {
                    stuManager.removeStudent((String) table.getValueAt(selected, 0));
                    refreshModel();
                }
            }
        });
        btnSaveToFile.addActionListener((e) -> {
            stuManager.writeFile();
        });
        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btnCheckTotalStudent);
        panel1.add(btnNewStudent);
        panel1.add(btnRefresh);
        panel1.add(btnDelete);
        panel1.add(btnSaveToFile);
        this.add(panel1, BorderLayout.NORTH);
        
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);
        this.setSize(800, 600);
        this.setLocation(200, 200);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }
    
    public void fillInStudentTable() {
        for (Student stu : stuManager.getListStudent()) {
            String[] rowData = {stu.getStudentId(), stu.getFirstName(), stu.getLastName(), stu.getGender(), stu.getSchoolStage()};
            model.addRow(rowData);
        }
    }
    
    public void clearModel() {
        if (model != null) {
            model.setRowCount(0);
        }
    }
    
    public void refreshModel() {
        clearModel();
        fillInStudentTable();
    }
}
