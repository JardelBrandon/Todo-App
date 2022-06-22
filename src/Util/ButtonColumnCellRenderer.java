/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Task;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author JB
 */
public class ButtonColumnCellRenderer extends DefaultTableCellRenderer {
    private String buttonType;

    public ButtonColumnCellRenderer(String buttonType) {
       this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(
                jtable, value, hasFocus, hasFocus, row, row);
        
        label.setHorizontalAlignment(CENTER);
        label.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/resources/" + buttonType + ".png")));
        
        return label;
    }
    
}
