/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class Payment {
    
    private static final String CASH="CASH";
    private static final String CARD="CARD";    
    
    private String paymentID;
    private String orderID;
    private String paymentType;
    private Double amount;    
    
    public Payment() {
        
    }    

    public Payment(String paymentID, String transID, double amount) {
        this.paymentID = paymentID;
        this.orderID = transID;
        this.amount = amount;
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
    
}
