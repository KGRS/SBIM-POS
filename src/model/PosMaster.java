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
public class PosMaster {
    
    private String transactionNo; // size 10
    private Date trnsactionDate; //
    private String invoiceNo;    //size 10
    private String depCode;      // size 10
    private Double subTotal;
    private Double discount;
    private Double discountAmount;
    private Double subTotalAfterDisc;
    private Double grandTotal;
    private String priceLevel; // size 25
    private String paymentType;  // size 20
    private Integer itemCount;
    private Integer taxStatus;
    private Double tax1;
    private Double tax2;
    private Double tax3;
    private Double tax4;
    private Double tax5;
    private Integer settled;
    private Integer cancelled;
    private String cancelReasoned; // size 50
    private String discountRemarks; //size 50
    private String discountReasons; //size 50

    public PosMaster() {
        
    }

    public String getCancelReasoned() {
        return cancelReasoned;
    }

    public void setCancelReasoned(String cancelReasoned) {
        this.cancelReasoned = cancelReasoned;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountReasons() {
        return discountReasons;
    }

    public void setDiscountReasons(String discountReasons) {
        this.discountReasons = discountReasons;
    }

    public String getDiscountRemarks() {
        return discountRemarks;
    }

    public void setDiscountRemarks(String discountRemarks) {
        this.discountRemarks = discountRemarks;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public Integer getSettled() {
        return settled;
    }

    public void setSettled(Integer settled) {
        this.settled = settled;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getSubTotalAfterDisc() {
        return subTotalAfterDisc;
    }

    public void setSubTotalAfterDisc(Double subTotalAfterDisc) {
        this.subTotalAfterDisc = subTotalAfterDisc;
    }

    public Double getTax1() {
        return tax1;
    }

    public void setTax1(Double tax1) {
        this.tax1 = tax1;
    }

    public Double getTax2() {
        return tax2;
    }

    public void setTax2(Double tax2) {
        this.tax2 = tax2;
    }

    public Double getTax3() {
        return tax3;
    }

    public void setTax3(Double tax3) {
        this.tax3 = tax3;
    }

    public Double getTax4() {
        return tax4;
    }

    public void setTax4(Double tax4) {
        this.tax4 = tax4;
    }

    public Double getTax5() {
        return tax5;
    }

    public void setTax5(Double tax5) {
        this.tax5 = tax5;
    }

    public Integer getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(Integer taxStatus) {
        this.taxStatus = taxStatus;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Date getTrnsactionDate() {
        return trnsactionDate;
    }

    public void setTrnsactionDate(Date trnsactionDate) {
        this.trnsactionDate = trnsactionDate;
    }

    @Override
    public String toString() {
        return "PosMaster\n{" + "transactionNo=" + transactionNo + ",\n trnsactionDate=" + trnsactionDate + ",\n invoiceNo=" + invoiceNo + ",\n depCode=" + depCode + ",\n subTotal=" + subTotal + ",\n discount=" + discount + ",\n discountAmount=" + discountAmount + ",\n subTotalAfterDisc=" + subTotalAfterDisc + ",\n grandTotal=" + grandTotal + ",\n priceLevel=" + priceLevel + ",\n paymentType=" + paymentType + ",\n itemCount=" + itemCount + ",\n taxStatus=" + taxStatus + ",\n tax1=" + tax1 + ",\n tax2=" + tax2 + ",\n tax3=" + tax3 + ",\n tax4=" + tax4 + ",\n tax5=" + tax5 + ",\n settled=" + settled + ", cancelled=" + cancelled + ",\n cancelReasoned=" + cancelReasoned + ", discountRemarks=" + discountRemarks + ", discountReasons=" + discountReasons + '}';
    }
    
    
    
    
}
