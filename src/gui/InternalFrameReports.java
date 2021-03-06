/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import functions.Information;
import functions.ReportGenerat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Sameera
 */
public class InternalFrameReports extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameReports
     */
    private DateFormat dateFormat;

    public InternalFrameReports() {
        initComponents();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calCombo_fromDate.setDateFormat(dateFormat);
        calCombo_todate.setDateFormat(dateFormat);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdb_salesSummery = new javax.swing.JRadioButton();
        rdbProductWiseSummery = new javax.swing.JRadioButton();
        rdbREfundSummery = new javax.swing.JRadioButton();
        rdbProductWiseRefundSummery = new javax.swing.JRadioButton();
        rdbsubcatWiseProdusctSummery = new javax.swing.JRadioButton();
        rdbMainCatWise = new javax.swing.JRadioButton();
        rdbDailyExpensesReport = new javax.swing.JRadioButton();
        rdbInvoiceSum = new javax.swing.JRadioButton();
        rdbCustomerList = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calCombo_fromDate = new org.freixas.jcalendar.JCalendarCombo();
        calCombo_todate = new org.freixas.jcalendar.JCalendarCombo();
        btnPrint = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Reports");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 51, 153));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reports");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        buttonGroup1.add(rdb_salesSummery);
        rdb_salesSummery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdb_salesSummery.setText("Sales summery");

        buttonGroup1.add(rdbProductWiseSummery);
        rdbProductWiseSummery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbProductWiseSummery.setText("Product Wise Sales Summery");

        buttonGroup1.add(rdbREfundSummery);
        rdbREfundSummery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbREfundSummery.setText("Refund Summery");

        buttonGroup1.add(rdbProductWiseRefundSummery);
        rdbProductWiseRefundSummery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbProductWiseRefundSummery.setText("Product Wise Refund Summery");

        buttonGroup1.add(rdbsubcatWiseProdusctSummery);
        rdbsubcatWiseProdusctSummery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbsubcatWiseProdusctSummery.setText("Sub category wise produsct sale summery");

        buttonGroup1.add(rdbMainCatWise);
        rdbMainCatWise.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbMainCatWise.setText("All in one Summary Report");

        buttonGroup1.add(rdbDailyExpensesReport);
        rdbDailyExpensesReport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbDailyExpensesReport.setText("Daily expenses summery report");

        buttonGroup1.add(rdbInvoiceSum);
        rdbInvoiceSum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbInvoiceSum.setText("Invoice Summary");

        buttonGroup1.add(rdbCustomerList);
        rdbCustomerList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdbCustomerList.setText("Customer List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rdbCustomerList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdb_salesSummery, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(rdbProductWiseSummery, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(rdbREfundSummery, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(rdbProductWiseRefundSummery, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbMainCatWise)
                    .addComponent(rdbsubcatWiseProdusctSummery)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rdbInvoiceSum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbDailyExpensesReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_salesSummery)
                    .addComponent(rdbMainCatWise, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbProductWiseSummery)
                    .addComponent(rdbsubcatWiseProdusctSummery))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbREfundSummery)
                    .addComponent(rdbDailyExpensesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbProductWiseRefundSummery)
                    .addComponent(rdbInvoiceSum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Start date :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("   End date :");

        calCombo_fromDate.setToolTipText("Search start date");
        calCombo_fromDate.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        calCombo_fromDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calCombo_fromDatePropertyChange(evt);
            }
        });

        calCombo_todate.setToolTipText("Search start date");
        calCombo_todate.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calCombo_todate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calCombo_fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calCombo_fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calCombo_todate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnPrint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 51, 153));
        btnPrint.setText("Preview");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        FormMain.reports.dispose();
        if (FormMain.reports != null) {
            FormMain.reports = null;

        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        if (rdb_salesSummery.isSelected() || rdbProductWiseSummery.isSelected() || rdbREfundSummery.isSelected()
                || rdbProductWiseRefundSummery.isSelected() || rdbsubcatWiseProdusctSummery.isSelected()
                || rdbMainCatWise.isSelected() || rdbDailyExpensesReport.isSelected() || rdbInvoiceSum.isSelected() || rdbCustomerList.isSelected()) {
            printReport();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a report");
        }

    }//GEN-LAST:event_btnPrintActionPerformed

    private void calCombo_fromDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calCombo_fromDatePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_calCombo_fromDatePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPrint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private org.freixas.jcalendar.JCalendarCombo calCombo_fromDate;
    private org.freixas.jcalendar.JCalendarCombo calCombo_todate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdbCustomerList;
    private javax.swing.JRadioButton rdbDailyExpensesReport;
    private javax.swing.JRadioButton rdbInvoiceSum;
    private javax.swing.JRadioButton rdbMainCatWise;
    private javax.swing.JRadioButton rdbProductWiseRefundSummery;
    private javax.swing.JRadioButton rdbProductWiseSummery;
    private javax.swing.JRadioButton rdbREfundSummery;
    private javax.swing.JRadioButton rdb_salesSummery;
    private javax.swing.JRadioButton rdbsubcatWiseProdusctSummery;
    // End of variables declaration//GEN-END:variables

    private void printReport() {
        String report = null;

        int reportIndex;
        HashMap hashmap;
        ReportGenerat rg;

        //String image_path = MainClass.path + "pictures\\logo.png";
        // String waterMark_path = MainClass.path + "pictures\\watermark.jpg";
        String kotbot = "";
        String location = "";
        String Location_desc = "";

        hashmap = new HashMap();
        rg = new ReportGenerat();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date st_date = calCombo_fromDate.getDate();
        Date end_date = calCombo_todate.getDate();

        String start_date = dateFormat.format(st_date);
        String en_date = dateFormat.format(end_date);

        String user = Information.intilzeInformation().getUserName();

        if (rdb_salesSummery.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "DailySalesSummery";
        } else if (rdbProductWiseSummery.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "ProductWiseSalesSummery";
        } else if (rdbREfundSummery.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "DailyRefundSalesSummery";
        } else if (rdbProductWiseRefundSummery.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "ProductWiseRefundSalesSummery";
        } else if (rdbMainCatWise.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            hashmap.put("SUBREPORT_DIR", Information.intilzeInformation().getPROJECT_LOCATION() + "\\iReports\\");
            report = "MainCategoryWiseProductSalesSummery";
        } else if (rdbsubcatWiseProdusctSummery.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "SubCategoryWiseProductSalesSummery";
        } else if (rdbDailyExpensesReport.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "DailyExpencessReport";
        } else if (rdbInvoiceSum.isSelected()) {
            hashmap.put("Start_Date", start_date);
            hashmap.put("End_Date", en_date);
            hashmap.put("User", user);
            report = "DateWiseOrderSummerry";
        } else if (rdbCustomerList.isSelected()) {
            hashmap.put("User", user);
            report = "CustomerList";
        }

        if (report != null) {
            report = report + ".jrxml";
            rg.PrintReport(report, hashmap);
        }
    }
}
