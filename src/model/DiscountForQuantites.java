/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * This model represents <code>tblDiscountForQuantities</code>
 * @author TiVA
 */
public class DiscountForQuantites {
    
    private String itemCode;
    private String itemName;
    private double quantity;
    private double percentage;
    private double discountValue;

    public DiscountForQuantites() {    
    
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
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
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
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    /**
     * This discount is from item's selling
     * price and discount percentage amount.
     * @return the discountValue
     */
    public double getDiscountValue() {
        return discountValue;
    }

    /**
     * This discount is from item's selling
     * price and discount percentage amount.
     * @param discountValue the discountValue to set
     */
    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }
    
    
    
    
    
}
