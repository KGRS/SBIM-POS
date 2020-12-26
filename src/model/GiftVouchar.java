/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class GiftVouchar {
    private String voucharId;
    private String issuDate;
    private String userId;
    private String location;
    private String expireDate;
    private double amount;
    private int status;

    public GiftVouchar() {
    }

    public GiftVouchar(String voucharId, String issuDate, String userId, String expireDate, double amount, int status) {
        this.voucharId = voucharId;
        this.issuDate = issuDate;
        this.userId = userId;
        this.expireDate = expireDate;
        this.amount = amount;
        this.status = status;
    }

    /**
     * @return the voucharId
     */
    public String getVoucharId() {
        return voucharId;
    }

    /**
     * @param voucharId the voucharId to set
     */
    public void setVoucharId(String voucharId) {
        this.voucharId = voucharId;
    }

    /**
     * @return the issuDate
     */
    public String getIssuDate() {
        return issuDate;
    }

    /**
     * @param issuDate the issuDate to set
     */
    public void setIssuDate(String issuDate) {
        this.issuDate = issuDate;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    

    @Override
    public String toString() {
        return "GiftVouchar{" + "voucharId=" + voucharId + ", issuDate=" + issuDate + ", userId=" + userId + ", location=" + location+ ", expireDate=" + expireDate + ", amount=" + amount + ", status=" + status + '}';
    }
    
    
}
