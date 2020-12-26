/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Sameera
 */
public class BinCard {
    
    private String itemCode;
    private String date;
    private String time;
    private String location;
    private String  recivedID ;
    private String recivedFrom;
    private String issueId;
    private String issueTo;
    private String StockEditID;
    private double issueQty;
    private double balanceQty;
    private double recivedQty;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueTo() {
        return issueTo;
    }

    public void setIssueTo(String issueTo) {
        this.issueTo = issueTo;
    }

    public String getStockEditID() {
        return StockEditID;
    }

    public void setStockEditID(String StockEditID) {
        this.StockEditID = StockEditID;
    }

    public double getIssueQty() {
        return issueQty;
    }

    public void setIssueQty(double issueQty) {
        this.issueQty = issueQty;
    }

    public double getBalanceQty() {
        return balanceQty;
    }

    public void setBalanceQty(double balanceQty) {
        this.balanceQty = balanceQty;
    }

    public String getRecivedID() {
        return recivedID;
    }

    public void setRecivedID(String recivedID) {
        this.recivedID = recivedID;
    }

    public String getRecivedFrom() {
        return recivedFrom;
    }

    public void setRecivedFrom(String recivedFrom) {
        this.recivedFrom = recivedFrom;
    }

    public double getRecivedQty() {
        return recivedQty;
    }

    public void setRecivedQty(double recivedQty) {
        this.recivedQty = recivedQty;
    }
       
    
}
