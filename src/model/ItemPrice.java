/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Administrator
 */
public class ItemPrice {

        String itemCode;
        double itemPrice;

    public ItemPrice() {
        
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public ItemPrice(String itemCode, double itemPrice) {
        this.itemCode = itemCode;
        this.itemPrice = itemPrice;
    }
        


}
