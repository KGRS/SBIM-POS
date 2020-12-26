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
public class Customer {
    
    String cus_code;
    String cus_name;
    String cus_address1;
    String cus_address2;
    
    String telNo1;
    String telNo2;
    String mobileNo1;
    String mobileNo2;
    String email;
    String fax;
    String contactPerson;
    double ceditLimit;
    int Active;
    
    /**
     *  ,CreditLimit
           ,Address1
           ,Address2
           ,Telephone1
           ,Telephone2
           ,Mobile1
           ,Mobile2
           ,Email
           ,Fax
           ,ContactPerson
           ,Active
     * @return 
     */

    public String getCus_code() {
        return cus_code;
    }

    public void setCus_code(String cus_code) {
        this.cus_code = cus_code;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_address1() {
        return cus_address1;
    }

    public void setCus_address1(String cus_address1) {
        this.cus_address1 = cus_address1;
    }

    public double getCeditLimit() {
        return ceditLimit;
    }

    public void setCeditLimit(double ceditLimit) {
        this.ceditLimit = ceditLimit;
    }

    public String getTelNo1() {
        return telNo1;
    }

    public void setTelNo1(String telNo1) {
        this.telNo1 = telNo1;
    }

    public String getMobileNo1() {
        return mobileNo1;
    }

    public void setMobileNo1(String mobileNo1) {
        this.mobileNo1 = mobileNo1;
    }

    public String getCus_address2() {
        return cus_address2;
    }

    public void setCus_address2(String cus_address2) {
        this.cus_address2 = cus_address2;
    }

    public String getTelNo2() {
        return telNo2;
    }

    public void setTelNo2(String telNo2) {
        this.telNo2 = telNo2;
    }

    public String getMobileNo2() {
        return mobileNo2;
    }

    public void setMobileNo2(String mobileNo2) {
        this.mobileNo2 = mobileNo2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int Active) {
        this.Active = Active;
    }
    
    
    
}
