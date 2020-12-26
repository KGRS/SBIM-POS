/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class ItemDiscountRate {
    
    private String rateId;
    private String startDate ;
    private String endDate;
    private String rate_PostUser;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    private String rate_postDate;

    public ItemDiscountRate() {
    }

    /**
     * @return the rateId
     */
    public String getRateId() {
        return rateId;
    }

    /**
     * @param rateId the rateId to set
     */
    public void setRateId(String rateId) {
        this.rateId = rateId;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the rate_PostUser
     */
    public String getRate_PostUser() {
        return rate_PostUser;
    }

    /**
     * @param rate_PostUser the rate_PostUser to set
     */
    public void setRate_PostUser(String rate_PostUser) {
        this.rate_PostUser = rate_PostUser;
    }

    /**
     * The specific date that rate initial
     * @return the rate_postDate
     */
    public String getRate_postDate() {
        return rate_postDate;
    }

    /**
     * @param rate_postDate the rate_postDate to set
     */
    public void setRate_postDate(String rate_postDate) {
        this.rate_postDate = rate_postDate;
    }
    
    
    
    
    
}
