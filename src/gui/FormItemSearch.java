/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import backendcontrollers.ItemController;
import functions.ReadConfig;
import functions.Validator;
import static gui.FormBilling.item;
import static gui.FormBilling.txtItemPrice;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Item;

/**
 *
 * @author Sameera
 */
public class FormItemSearch extends javax.swing.JDialog {

    /**
     * Creates new form FormItemSearch
     */
    boolean isSearchFromOrder;
    private DefaultTableModel tableModel;
    private String searchBy = "ItemCode";

    public FormItemSearch(java.awt.Frame parent, boolean modal, boolean isSearchFromOrder) {
        super(parent, modal);
        initComponents();
        this.isSearchFromOrder = isSearchFromOrder;
        tableModel = (DefaultTableModel) tblItem.getModel();
        tableModel.setRowCount(0);

        btnAddToOrder.setVisible(isSearchFromOrder);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();

        cellRenderer.setHorizontalAlignment(JLabel.RIGHT);

        tblItem.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblItem.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);

        itemSearchKeyRegister();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbSearchBy = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        btnAddToOrder = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Search By");

        cmbSearchBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Code", "Item Name" }));
        cmbSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchByActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Item Code/Name");

        txtItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemCodeKeyReleased(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Iskoola Pota", 0, 11)); // NOI18N

        tblItem.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Code", "Description", "Quantity", "Selling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItem.setRowHeight(20);
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        tblItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblItemKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);
        if (tblItem.getColumnModel().getColumnCount() > 0) {
            tblItem.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblItem.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblItem.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblItem.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        btnAddToOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddToOrder.setForeground(new java.awt.Color(0, 51, 153));
        btnAddToOrder.setText("ADD TO ORDER");
        btnAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrderActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 51, 153));
        btnCancel.setText("CANCEL");
        btnCancel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,0),"Esc");

        btnCancel.getActionMap().put("Esc", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancel.doClick();
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Item Search");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtItemCode)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddToOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddToOrder, btnCancel});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
        this.getAllItems();

    }//GEN-LAST:event_formWindowOpened

    private void cmbSearchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearchByActionPerformed
        // TODO add your handling code here:
        if (cmbSearchBy.getSelectedIndex() == 0) {
            this.searchBy = "ItemCode";
        } else if (cmbSearchBy.getSelectedIndex() == 1) {
            this.searchBy = "ItemName";
        }
    }//GEN-LAST:event_cmbSearchByActionPerformed

    private void txtItemCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemCodeKeyReleased
        // TODO add your handling code here:

        searchItem(txtItemCode.getText().trim(), this.searchBy);
    }//GEN-LAST:event_txtItemCodeKeyReleased

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            if (isSearchFromOrder) {
                addToCart();
            }
        }
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrderActionPerformed
        // TODO add your handling code here:
        addToCart();
    }//GEN-LAST:event_btnAddToOrderActionPerformed

    private void tblItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblItemKeyPressed
        // TODO add your handling code here:
        if (isSearchFromOrder) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int selectedRow = tblItem.getSelectedRow();
                if (tblItem.isRowSelected(selectedRow)) {
                    addToCart();
                }
            }
        }
    }//GEN-LAST:event_tblItemKeyPressed

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
            java.util.logging.Logger.getLogger(FormItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormItemSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormItemSearch dialog = new FormItemSearch(new javax.swing.JFrame(), true, false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToOrder;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox cmbSearchBy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtItemCode;
    // End of variables declaration//GEN-END:variables

    private void getAllItems() {

        try {
            double sellingPrice = 0;
            ArrayList<Item> allItems = ItemController.getAllItems();
            for (Item item : allItems) {
                double selling_margin = item.getSelling_margin();
                if (selling_margin > 0) {
                    sellingPrice = item.getSellingPrice() - (item.getSellingPrice() * selling_margin / 100);
                } else {
                    sellingPrice = item.getSellingPrice();
                }
                Object row[] = {item.getItemCode(), item.getDescription(), Validator.BuildTwoDecimals(item.getQuantity()), Validator.BuildTwoDecimals(sellingPrice)};
                tableModel.addRow(row);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchItem(String value, String searchBy) {
        try {

            String itemCode;
            String itemName;
            double qty;
            double price;
            ResultSet findItem = ItemController.findItem(searchBy, value);
            findItem.last();
            int row = findItem.getRow();
            if (row > 0) {
                tableModel.setRowCount(0);
                findItem.beforeFirst();
                while (findItem.next()) {
                    itemCode = findItem.getString("ItemCode");
                    itemName = findItem.getString("ItemName");
                    qty = findItem.getDouble("Quantity");
                    price = findItem.getDouble("SellPrice");
                    Object ob[] = {itemCode, itemName, Validator.BuildTwoDecimals(qty), Validator.BuildTwoDecimals(price)};
                    tableModel.addRow(ob);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormItemSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addToCart() {
        int selectedRow = tblItem.getSelectedRow();
        if (tblItem.isRowSelected(selectedRow)) {
            String itemCode = tblItem.getValueAt(selectedRow, 0).toString();
            double sellingPrice = 0;
            try {
                Item item_ByItemCode = ItemController.getItem_ByItemCode("ItemCode", itemCode);
                FormBilling.item = item_ByItemCode;
                FormBilling.txtItemCode.setText(item_ByItemCode.getItemCode());
                double selling_margin = item_ByItemCode.getSelling_margin();
                if (selling_margin > 0) {
                    sellingPrice = item_ByItemCode.getSellingPrice() - (item_ByItemCode.getSellingPrice() * selling_margin / 100);
                } else {
                    sellingPrice = item_ByItemCode.getSellingPrice();
                }

                FormBilling.txtItemPrice.setText(Validator.BuildTwoDecimals(sellingPrice));

                if (ReadConfig.isPriceEdit == 1) {
                    txtItemPrice.requestFocus();
                    txtItemPrice.selectAll();
                } else {
                    FormBilling.txtQty.setText("1");
                    FormBilling.txtQty.requestFocus();
                    FormBilling.txtQty.selectAll();
                }

                this.dispose();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormItemSearch.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FormItemSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a item for add to bill", "No selected item", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void itemSearchKeyRegister() {
        AbstractAction selectAction = new AbstractAction("") {

            public void actionPerformed(ActionEvent ae) {

                tblItem.requestFocus();
                tblItem.setRowSelectionInterval(0, 0);

            }
        };
        AbstractAction searchAction = new AbstractAction("") {

            public void actionPerformed(ActionEvent ae) {

                txtItemCode.requestFocus();
                txtItemCode.selectAll();

            }
        };

        tblItem.registerKeyboardAction(selectAction, KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
        tblItem.registerKeyboardAction(searchAction, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
}
