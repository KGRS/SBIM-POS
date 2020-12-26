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
public class CartModel implements Serializable{
    
    private String itemCode;
    private String itemName;
    private double qty;
    private double price;
    private double discount;
    private double total;
    private String dicountType;
    private String location;

    public CartModel() {
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
     * @return the qty
     */
    public double getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(double qty) {
        this.qty = qty;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    

    @Override
    public String toString() {
        return "CartModel{" + "itemCode=" + itemCode + ", itemName=" + itemName + ", qty=" + qty + ", price=" + price + ", discount=" + discount + ", total=" + total + '}';
    }

    /**
     * @return the dicountType
     */
    public String getDicountType() {
        return dicountType;
    }

    /**
     * @param dicountType the dicountType to set
     */
    public void setDicountType(String dicountType) {
        this.dicountType = dicountType;
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
    
    
    
}
