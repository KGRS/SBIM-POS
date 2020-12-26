/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import backendcontrollers.CustomerController;
import functions.CustomerTableRender;
import functions.Validator;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Customer;

/**
 *
 * @author Sameera
 */
public class FormCustomer extends javax.swing.JDialog {

    /**
     * Creates new form FormCustomer
     */
    private DefaultTableModel tableModel;
    private String searchBy = "CustomerCode";
    public double invoiceAmount;
    private boolean isSearchOnly;

    public FormCustomer(java.awt.Frame parent, boolean modal, boolean isSearchOnly) {
        super(parent, modal);
        initComponents();
        this.isSearchOnly = isSearchOnly;
        if (isSearchOnly) {
            btnSelect.setVisible(false);
        }
        tableModel = (DefaultTableModel) tblCustomer.getModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();

        cellRenderer.setHorizontalAlignment(JLabel.RIGHT);

        tblCustomer.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
        tblCustomer.getColumnModel().getColumn(6).setCellRenderer(cellRenderer);
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        cmbsearchBy = new javax.swing.JComboBox();
        txtSearchText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Credit Cusromers");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        tblCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Address", "Tel.No", "Mobile No", "Credit Limit", "Total Oustanding"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.setRowHeight(25);
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblCustomer.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblCustomer.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblCustomer.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblCustomer.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblCustomer.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblCustomer.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        btnSelect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSelect.setForeground(new java.awt.Color(0, 51, 153));
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 153));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" Search By :");

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSearch.setText("Code :");

        cmbsearchBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Code", "Name" }));
        cmbsearchBy.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbsearchByPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchTextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbsearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchText)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearchText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsearchBy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbsearchByPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbsearchByPopupMenuWillBecomeInvisible
        // TODO add your handling code here:

        if (cmbsearchBy.getSelectedIndex() == 0) {
            lblSearch.setText("Code :");
            this.searchBy = "CustomerCode";
        } else {
            lblSearch.setText("Name :");
            this.searchBy = "CustomerName";
        }

    }//GEN-LAST:event_cmbsearchByPopupMenuWillBecomeInvisible

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showAllCustomer();
        txtSearchText.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchTextKeyReleased
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_txtSearchTextKeyReleased

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
        if (!isSearchOnly) {
            if (evt.getClickCount() == 2) {
                selectCustomer();
            }
        }

    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        if (!isSearchOnly) {
            selectCustomer();
        }

    }//GEN-LAST:event_btnSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox cmbsearchBy;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    public static javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtSearchText;
    // End of variables declaration//GEN-END:variables

    private void showAllCustomer() {
        try {
            tableModel.setRowCount(0);
            ArrayList<Customer> allCustomers = CustomerController.getAllCustomers();
            for (Customer customer : allCustomers) {
                double total = CustomerController.getCustomerTotalOustandingAmount(customer);
                tableModel.addRow(new Object[]{customer.getCus_code(), customer.getCus_name(),
                    customer.getCus_address1(), customer.getTelNo1(), customer.getMobileNo1(), Validator.BuildTwoDecimals(customer.getCeditLimit()), Validator.BuildTwoDecimals(total)});
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void searchCustomer() {
        tableModel.setRowCount(0);
        try {
            if (!txtSearchText.getText().isEmpty()) {
                String text = txtSearchText.getText().trim();
                ArrayList<Customer> searchCustomer = CustomerController.searchCustomer(this.searchBy, text);
                for (Customer customer : searchCustomer) {
                    tableModel.addRow(new Object[]{customer.getCus_code(), customer.getCus_name(),
                        customer.getCus_address1(), customer.getTelNo1(), customer.getMobileNo1(), Validator.BuildTwoDecimals(customer.getCeditLimit())});
                }
            } else {
                showAllCustomer();
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void selectCustomer() {

        if (tblCustomer.isRowSelected(tblCustomer.getSelectedRow())) {
            String cusCode = tableModel.getValueAt(tblCustomer.getSelectedRow(), 0).toString();
            String name = tableModel.getValueAt(tblCustomer.getSelectedRow(), 1).toString();
            double oustanding = Double.parseDouble(tableModel.getValueAt(tblCustomer.getSelectedRow(), 6).toString());
            double creditLimit = Double.parseDouble(tableModel.getValueAt(tblCustomer.getSelectedRow(), 5).toString());
            if ((this.invoiceAmount + oustanding) >= creditLimit) {
                int option = JOptionPane.showConfirmDialog(this, "<html>Total oustanding amount of selected customer reach the credit limit<br>"
                        + "Do you want to proceed ? <html>", "Credit limit reach", JOptionPane.YES_NO_OPTION);
                if (option == 0) {
                    FormPayment.setCreditPayment(cusCode, name);
                    this.dispose();
                }
            } else {

                FormPayment.setCreditPayment(cusCode, name);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a customer .", "No selcted customer", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
