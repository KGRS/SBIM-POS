/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Administrator
 */
public class ItemDiscount {

    private String item_code;
    private String rate_code;
    private double itemPrice;
    private int discount_type;
    private double discount;

    public ItemDiscount() {
    }

    public ItemDiscount(String item_code, double itemPrice) {
        this.item_code = item_code;
        this.itemPrice = itemPrice;
    }
    

    public ItemDiscount(String item_code, String rate_code,double itemPrice, int discount_type, double discount) {
        this.item_code = item_code;
        this.rate_code = rate_code;
        this.discount_type = discount_type;
        this.discount = discount;
        this.itemPrice =itemPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(int discount_type) {
        this.discount_type = discount_type;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getRate_code() {
        return rate_code;
    }

    public void setRate_code(String rate_code) {
        this.rate_code = rate_code;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    

}
