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
public class Refund {
    
    private String refund_id;
    private String refund_from;
    private String refund_date;
    private String refund_user;
    private String refund_cashierPoint;
    private double refund_amount;

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public String getRefund_from() {
        return refund_from;
    }

    public void setRefund_from(String refund_from) {
        this.refund_from = refund_from;
    }

    public String getRefund_date() {
        return refund_date;
    }

    public void setRefund_date(String refund_date) {
        this.refund_date = refund_date;
    }

    public String getRefund_user() {
        return refund_user;
    }

    public void setRefund_user(String refund_user) {
        this.refund_user = refund_user;
    }

    public double getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(double refund_amount) {
        this.refund_amount = refund_amount;
    }

    public String getRefund_cashierPoint() {
        return refund_cashierPoint;
    }

    public void setRefund_cashierPoint(String refund_cashierPoint) {
        this.refund_cashierPoint = refund_cashierPoint;
    }
     
    
    
}
