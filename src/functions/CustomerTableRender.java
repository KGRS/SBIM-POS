/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import gui.FormCustomer;
import static gui.FormCustomer.tblCustomer;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Ruwan
 */
public class CustomerTableRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        Component c
                = super.getTableCellRendererComponent(table, value,
                        isSelected, hasFocus,
                        row, column);

        for (int i = 0; i < FormCustomer.tblCustomer.getRowCount(); i++) {
            double oustanding = Double.parseDouble(FormCustomer.tblCustomer.getValueAt(i, 6).toString());
            double creditLimit = Double.parseDouble(FormCustomer.tblCustomer.getValueAt(i, 5).toString());
            if (oustanding > creditLimit) {
                c.setBackground(Color.red);
                c.setForeground(Color.black);
            }

        }

        // Only for specific cell
//        if (row == 0 && column < 4) {
////            c.setBackground(/*special background color*/);
//            c.setBackground(Color.red);
//        } else {
//            c.setBackground(Color.white);
//        }
        return c;
    }
}
