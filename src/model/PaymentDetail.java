/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author TiVA
 */
public class PaymentDetail {
    
    private String paymentID;
    private String cardHolderName;
    private String  cardNumber;
    private String cardExpireDate;
    private String cardType;
    private String cardBank;

    public PaymentDetail() {
    }

    public PaymentDetail(String paymentID, String cardHolderName, String cardNumber, String cardExpireDate, String cardType, String cardBank) {
        this.paymentID = paymentID;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cardExpireDate = cardExpireDate;
        this.cardType = cardType;
        this.cardBank = cardBank;
    }
    
    
    
    

    /**
     * @return the paymentID
     */
    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the cardHolderName
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * @param cardHolderName the cardHolderName to set
     */
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    /**
     * @return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return the cardExpireDate
     */
    public String getCardExpireDate() {
        return cardExpireDate;
    }

    /**
     * @param cardExpireDate the cardExpireDate to set
     */
    public void setCardExpireDate(String cardExpireDate) {
        this.cardExpireDate = cardExpireDate;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the cardBank
     */
    public String getCardBank() {
        return cardBank;
    }

    /**
     * @param cardBank the cardBank to set
     */
    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }
    
    
    
    
    
    
    
    
}
