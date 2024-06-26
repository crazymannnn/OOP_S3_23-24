/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;

/**
 *
 * @author Student
 */
public class CDStore extends javax.swing.JFrame {
    NewCD newCD = new NewCD();
    Model model = new Model();
    /**
     * Creates new form CDStore
     */
    public CDStore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        Title = new javax.swing.JComboBox<>();
        inputid = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("New CD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton6.setText("New CD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCD(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton7.setText("Backup");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackUp(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.setText("Restore");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Restore(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton9.setText("Refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete(evt);
            }
        });
        jPanel3.add(jButton10);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Collection", "Type", "Price"
            }
        ));
        jScrollPane2.setViewportView(table);

        Title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cd", "vcd", "Item 3", "Item 4" }));
        Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleCombobox(evt);
            }
        });
        jPanel5.add(Title);

        inputid.setPreferredSize(new java.awt.Dimension(200, 22));
        inputid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField(evt);
            }
        });
        jPanel5.add(inputid);

        jButton12.setText("Search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search(evt);
            }
        });
        jPanel5.add(jButton12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewCD(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCD
        NewCD newCD = new NewCD();
        newCD.setVisible(true);
    }//GEN-LAST:event_NewCD

    private void BackUp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackUp
        JFileChooser fc = new JFileChooser("D:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".EIU Files", "eiu");
        fc.setFileFilter(filter);
        int option = fc.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().toString();
            if (!filename.endsWith(".eiu")) {
                filename += ".eiu";
            }
            writeTo(filename);
        }
    }//GEN-LAST:event_BackUp

    private void Delete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete
        int selected = table.getSelectedRow();
        if (selected != -1) {
            int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (answer == JOptionPane.YES_OPTION) {
                newCD.Remove((String) table.getValueAt(selected, 0));
                refreshModel();
            }
        }
    }//GEN-LAST:event_Delete

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TitleCombobox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleCombobox
            // TODO add your handling code here:
    }//GEN-LAST:event_TitleCombobox

    private void Restore(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Restore
        JFileChooser fc = new JFileChooser("D:\\");
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".EIU Files", "eiu");
        fc.setFileFilter(filter);
        int option = fc.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            readFrom(fc.getSelectedFile().getAbsolutePath());
            refreshModel();
        }
    }//GEN-LAST:event_Restore

    private void Refresh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh
        fillIntable();
    }//GEN-LAST:event_Refresh

    private void Search(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search
        var sellected = inputid.getText();
        var lists = newCD.getListCD();
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId().equals(sellected)) {
                model.setRowCount(0);
                Object[] data = {lists.get(i).getTitle(), lists.get(i).getCollection(), lists.get(i).getType(), lists.get(i).getPrice()};
                model.addRow(data);
                table.setModel(model);
            }
        }
    }//GEN-LAST:event_Search

    private void JTextField(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CDStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CDStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CDStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CDStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CDStore().setVisible(true);
            }
        });
    }
    
    public void fillIntable() {
        model.setRowCount(0);
        for (CD cd : newCD.getListCD()) {
            Object[] rowData = {cd.getTitle(), cd.getCollection(), cd.getType(), cd.getPrice()};
            model.addRow(rowData);
        }
        table.setModel(model);
    }
    
    public void clearModel() {
        if (model != null) {
            model.setRowCount(0);
        }
    }
    
    public void refreshModel() {
        clearModel();
        fillIntable();
    }
    
    public void writeTo(String path){
        try {
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (CD cd : newCD.getListCD()) {
                oStream.writeObject(cd);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readFrom(String path){
        try {
            FileInputStream f = new FileInputStream(path);
            ObjectInputStream iStream = new ObjectInputStream(f);
            CD cd = null;
            while ((cd = (CD)iStream.readObject()) != null){
                newCD.addCD(cd);
            }
            iStream.close();
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Title;
    private javax.swing.JTextField inputid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
