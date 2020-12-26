/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Sameera
 */
public class CashBill {
    
    private String invoiceNo;
    private String trnDate;
    private String cashBillNo;
    private int settle;
    private String user;
    private double amount;

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTrnDate() {
        return trnDate;
    }

    public void setTrnDate(String trnDate) {
        this.trnDate = trnDate;
    }

    public String getCashBillNo() {
        return cashBillNo;
    }

    public void setCashBillNo(String cashBillNo) {
        this.cashBillNo = cashBillNo;
    }

    public int getSettle() {
        return settle;
    }

    public void setSettle(int settle) {
        this.settle = settle;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
