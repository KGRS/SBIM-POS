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
public class POSTransaction {
    
    private String transActionNo;  // 10
    private String itemCode; //10
    private String kotNo;    //20
    private String description;  //50
    private double quantity;
    private double unitPrice;
    private double rate;
    private double totalAmount;
    private String special;
    private String orderNo;    
    private String location;
    private String depCode;
    private double discountPresentage;
    private Date currTime;
    private String remarks;
    private String cancelReason;
    private Integer canceled;

    /**
     * @return the transActionNo
     */
    public String getTransActionNo() {
        return transActionNo;
    }

    /**
     * @param transActionNo the transActionNo to set
     */
    public void setTransActionNo(String transActionNo) {
        this.transActionNo = transActionNo;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the kotNo
     */
    public String getKotNo() {
        return kotNo;
    }

    /**
     * @param kotNo the kotNo to set
     */
    public void setKotNo(String kotNo) {
        this.kotNo = kotNo;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the quantity
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
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
     * @return the special
     */
    public String getSpecial() {
        return special;
    }

    /**
     * @param special the special to set
     */
    public void setSpecial(String special) {
        this.special = special;
    }

    /**
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the depCode
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * @param depCode the depCode to set
     */
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    /**
     * @return the discountPresentage
     */
    public double getDiscountPresentage() {
        return discountPresentage;
    }

    /**
     * @param discountPresentage the discountPresentage to set
     */
    public void setDiscountPresentage(double discountPresentage) {
        this.discountPresentage = discountPresentage;
    }

    /**
     * @return the currTime
     */
    public Date getCurrTime() {
        return currTime;
    }

    /**
     * @param currTime the currTime to set
     */
    public void setCurrTime(Date currTime) {
        this.currTime = currTime;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the cancelReason
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * @param cancelReason the cancelReason to set
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * @return the canceled
     */
    public Integer getCanceled() {
        return canceled;
    }

    /**
     * @param canceled the canceled to set
     */
    public void setCanceled(Integer canceled) {
        this.canceled = canceled;
    }
    
    
    
    
}
