/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class CardDetail implements Serializable{

    String cardHolderName;
    String cardNumer;
    String cardType;
    String cardExpDate;
    String bank;
    double amount;

    public CardDetail(String cardHolderName, String cardNumer, String cardType, String cardExpDate, String bank, double amount) {
        this.cardHolderName = cardHolderName;
        this.cardNumer = cardNumer;
        this.cardType = cardType;
        this.cardExpDate = cardExpDate;
        this.bank = bank;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }   

    public CardDetail() {
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumer() {
        return cardNumer;
    }

    public void setCardNumer(String cardNumer) {
        this.cardNumer = cardNumer;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CardDetail{" + "cardHolderName=" + cardHolderName + ", cardNumer=" + cardNumer + ", cardType=" + cardType + ", cardExpDate=" + cardExpDate + ", bank=" + bank + ", amount=" + amount + '}';
    }
    
}
