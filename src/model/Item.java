/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class Item {

    private String itemCode;
    private String description;
    private String printName;  // item name
    private String subCategory;
    private double cost;
    private double quantity;
    private double sellingPrice;
    private double reorderQty;
    private double min_qty;
    private double max_qty;
    private String u_m_oSelling;
    private String minusSell;
    private double selling_margin;

    public String getMinusSell() {
        return minusSell;
    }

    public void setMinusSell(String minusSell) {
        this.minusSell = minusSell;
    }

    public String getU_m_oSelling() {
        return u_m_oSelling;
    }

    public void setU_m_oSelling(String u_m_oSelling) {
        this.u_m_oSelling = u_m_oSelling;
    }

    public Item() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public double getMax_qty() {
        return max_qty;
    }

    public void setMax_qty(double max_qty) {
        this.max_qty = max_qty;
    }

    public double getMin_qty() {
        return min_qty;
    }

    public void setMin_qty(double min_qty) {
        this.min_qty = min_qty;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getReorderQty() {
        return reorderQty;
    }

    public void setReorderQty(double reorderQty) {
        this.reorderQty = reorderQty;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public double getSelling_margin() {
        return selling_margin;
    }

    public void setSelling_margin(double selling_margin) {
        this.selling_margin = selling_margin;
    }

    
}
