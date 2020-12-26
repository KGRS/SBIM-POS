/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class OrderItems {
    
    private String orderId;
    private String itemCode;
    private String itemName;
    private Double itemPrice;
    private double itemQty;
    private Double itemDiscount;
    private Integer itemStatus;
    private double totalValue;
    private double totalValueWithDiscount;
    private String discount_remark;
    private String trn_date;

    public OrderItems() {
    }

    public OrderItems(String orderId, String itemCode, String itemName, Double itemPrice, double itemQty, Double itemDiscount, Integer itemStatus, double totalValue, double totalValueWithDiscount,String discount_remark) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
        this.itemDiscount = itemDiscount;
        this.itemStatus = itemStatus;
        this.totalValue = totalValue;
        this.totalValueWithDiscount = totalValueWithDiscount;
        this.discount_remark = discount_remark;
    }


    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
     * @return the itemPrice
     */
    public Double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the itemDiscount
     */
    public Double getItemDiscount() {
        return itemDiscount;
    }

    /**
     * @param itemDiscount the itemDiscount to set
     */
    public void setItemDiscount(Double itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    /**
     * @return the itemStatus
     */
    public Integer getItemStatus() {
        return itemStatus;
    }

    /**
     * @param itemStatus the itemStatus to set
     */
    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * @return the itemQty
     */
    public double getItemQty() {
        return itemQty;
    }

    /**
     * @param itemQty the itemQty to set
     */
    public void setItemQty(double itemQty) {
        this.itemQty = itemQty;
    }
  

    /**
     * @return the totalValue
     */
    public double getTotalValue() {
        return totalValue;
    }

    /**
     * @param totalValue the totalValue to set
     */
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * @return the totalValueWithDiscount
     */
    public double getTotalValueWithDiscount() {
        return totalValueWithDiscount;
    }

    /**
     * @param totalValueWithDiscount the totalValueWithDiscount to set
     */
    public void setTotalValueWithDiscount(double totalValueWithDiscount) {
        this.totalValueWithDiscount = totalValueWithDiscount;
    }  

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDiscount_remark() {
        return discount_remark;
    }

    public void setDiscount_remark(String discount_remark) {
        this.discount_remark = discount_remark;
    }   

    public String getTrn_date() {
        return trn_date;
    }

    public void setTrn_date(String trn_date) {
        this.trn_date = trn_date;
    }    
          
}
