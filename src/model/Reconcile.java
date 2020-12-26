/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author TiVA
 */
public class Reconcile implements Serializable{
    private int reconcileId;
    private String userId;
    private String location_code;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private double beginningAmount;
    private int note5000;
    private int note2000;
    private int note1000;
    private int note500;
    private int note100;
    private int note50;
    private int note20;
    private int note10;
    private int coin10;
    private int coin5;
    private int coin2;
    private int coin1;
    private int cent50;
    private int cent25;
    private double totalAmount;
    private double paidOut;
    private double balanceAmount;
    private String registerName;

    public Reconcile() {
    
    }

    /**
     * @return the reconcileId
     */
    public int getReconcileId() {
        return reconcileId;
    }

    /**
     * @param reconcileId the reconcileId to set
     */
    public void setReconcileId(int reconcileId) {
        this.reconcileId = reconcileId;
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
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the beginningAmount
     */
    public double getBeginningAmount() {
        return beginningAmount;
    }

    /**
     * @param beginningAmount the beginningAmount to set
     */
    public void setBeginningAmount(double beginningAmount) {
        this.beginningAmount = beginningAmount;
    }

    /**
     * @return the note5000
     */
    public int getNote5000() {
        return note5000;
    }

    /**
     * @param note5000 the note5000 to set
     */
    public void setNote5000(int note5000) {
        this.note5000 = note5000;
    }

    /**
     * @return the note2000
     */
    public int getNote2000() {
        return note2000;
    }

    /**
     * @param note2000 the note2000 to set
     */
    public void setNote2000(int note2000) {
        this.note2000 = note2000;
    }

    /**
     * @return the note1000
     */
    public int getNote1000() {
        return note1000;
    }

    /**
     * @param note1000 the note1000 to set
     */
    public void setNote1000(int note1000) {
        this.note1000 = note1000;
    }

    /**
     * @return the note500
     */
    public int getNote500() {
        return note500;
    }

    /**
     * @param note500 the note500 to set
     */
    public void setNote500(int note500) {
        this.note500 = note500;
    }

    /**
     * @return the note100
     */
    public int getNote100() {
        return note100;
    }

    /**
     * @param note100 the note100 to set
     */
    public void setNote100(int note100) {
        this.note100 = note100;
    }

    /**
     * @return the note50
     */
    public int getNote50() {
        return note50;
    }

    /**
     * @param note50 the note50 to set
     */
    public void setNote50(int note50) {
        this.note50 = note50;
    }

    /**
     * @return the note20
     */
    public int getNote20() {
        return note20;
    }

    /**
     * @param note20 the note20 to set
     */
    public void setNote20(int note20) {
        this.note20 = note20;
    }

    /**
     * @return the note10
     */
    public int getNote10() {
        return note10;
    }

    /**
     * @param note10 the note10 to set
     */
    public void setNote10(int note10) {
        this.note10 = note10;
    }

    /**
     * @return the coin10
     */
    public int getCoin10() {
        return coin10;
    }

    /**
     * @param coin10 the coin10 to set
     */
    public void setCoin10(int coin10) {
        this.coin10 = coin10;
    }

    /**
     * @return the coin5
     */
    public int getCoin5() {
        return coin5;
    }

    /**
     * @param coin5 the coin5 to set
     */
    public void setCoin5(int coin5) {
        this.coin5 = coin5;
    }

    /**
     * @return the coin2
     */
    public int getCoin2() {
        return coin2;
    }

    /**
     * @param coin2 the coin2 to set
     */
    public void setCoin2(int coin2) {
        this.coin2 = coin2;
    }

    /**
     * @return the coin1
     */
    public int getCoin1() {
        return coin1;
    }

    /**
     * @param coin1 the coin1 to set
     */
    public void setCoin1(int coin1) {
        this.coin1 = coin1;
    }

    /**
     * @return the cent50
     */
    public int getCent50() {
        return cent50;
    }

    /**
     * @param cent50 the cent50 to set
     */
    public void setCent50(int cent50) {
        this.cent50 = cent50;
    }

    /**
     * @return the cent25
     */
    public int getCent25() {
        return cent25;
    }

    /**
     * @param cent25 the cent25 to set
     */
    public void setCent25(int cent25) {
        this.cent25 = cent25;
    }

    /**
     * @return the totalAmount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * @return the paidOut
     */
    public double getPaidOut() {
        return paidOut;
    }

    /**
     * @param paidOut the paidOut to set
     */
    public void setPaidOut(double paidOut) {
        this.paidOut = paidOut;
    }

    /**
     * @return the balanceAmount
     */
    public double getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * @param balanceAmount the balanceAmount to set
     */
    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    /**
     * @return the registerName
     */
    public String getRegisterName() {
        return registerName;
    }

    /**
     * @param registerName the registerName to set
     */
    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getLocation_code() {
        return location_code;
    }

    public void setLocation_code(String location_code) {
        this.location_code = location_code;
    }
    
    
    
    
    
}
