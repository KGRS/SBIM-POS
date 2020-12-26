/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.awt.Dimension;
import java.awt.Toolkit;
import model.Client;

/**
 *
 * @author Sameera
 */
public class Information {

    private static Information infor;
    private String userName = "not_user";
    private String location_discription="not Location Discription";
    private String location_code="not Location Code";
    private String userId = "not_userId";
    private String Beginning_Time = "00:00:00";
    private String start_date = "2000-01-01";
    private int user_level;
    
    private Dimension dimension;
    private double height_screen;
    private double width_screen;
  
    
    public static final String PROJECT_LOCATION = System.getProperty("user.dir");

    public Information() {
    }
    

    public static Information intilzeInformation() {
        if (infor == null) {
            infor = new Information();
           
        }
        return infor;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getBeginning_Time() {
        return Beginning_Time;
    }

    public void setBeginning_Time(String Beginning_Time) {
        this.Beginning_Time = Beginning_Time;
    }    

    public String getUserID() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public int getUser_level() {
        return user_level;
    }

    public void setUser_level(int user_level) {
        this.user_level = user_level;
    }  
    
      public String getLocationDiscription() {
        return location_discription;
    }

    public void setLocationDiscription(String locationDiscription) {
        this.location_discription = locationDiscription;
        System.out.println("location in infor :"+locationDiscription);
    }

    public String getLocation_code() {
        return location_code;
    }

    public void setLocation_code(String location_code) {
        this.location_code = location_code;
    }    
    
    void initilizeCurrenScrrenSize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize);
        this.dimension = screenSize;
        this.height_screen = screenSize.getHeight();
        this.width_screen = screenSize.getWidth();
    }   
    

    /**
     * @return the height_screen
     */
    public double getHeight_screen() {
        return height_screen;
    }

    /**
     * @return the width_screen
     */
    public double getWidth_screen() {
        return width_screen;
    }

    /**
     * Returning the project location.
     * @return the PROJECT_LOCATION
     */
    public String getPROJECT_LOCATION() {
        return PROJECT_LOCATION;
    }
    
}