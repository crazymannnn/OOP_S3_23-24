/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student
 */
public class Model extends DefaultTableModel {
    public Model() {
        this.addColumn("Tile");
        this.addColumn("Collection");
        this.addColumn("Type");
        this.addColumn("Price");
    }
}
