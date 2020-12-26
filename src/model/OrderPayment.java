/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class OrderPayment {
    
     
    
    private String paymentID;
    private String orderID;
    private String paymentType;
    private Double amount;
    private String cashBillNo;
    private String creditTo;
    
    public OrderPayment() {
        
    }

    public OrderPayment(String paymentID, String orderID, String paymentType, Double amount,String cashBillNo,String creditTo) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.paymentType = paymentType;
        this.amount = amount;
        this.cashBillNo = cashBillNo;
        this.creditTo = creditTo;
    }

    

    /**
     * Get the value of paymentID
     *
     * @return the value of paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * Set the value of paymentID
     *
     * @param paymentID new value of paymentID
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }
    

    /**
     * Get the value of trnsID
     *
     * @return the value of trnsID
     */
    public String getOrderID() {
        return orderID;
    }    
    
    /**
     * Set the value of trnsID
     *
     * @param trnsID new value of trnsID
     */
    public void setOrderID(String transID) {
        this.orderID = transID;
    }  
    

    /**
     * Get the value of amount
     *
     * @return the value of amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Set the value of amount
     *
     * @param amount new value of amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }   

    public String getCashBillNo() {
        return cashBillNo;
    }

    public void setCashBillNo(String cashBillNo) {
        this.cashBillNo = cashBillNo;
    }

    public String getCreditTo() {
        return creditTo;
    }

    public void setCreditTo(String creditTo) {
        this.creditTo = creditTo;
    }
    
}
