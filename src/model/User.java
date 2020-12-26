/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TiVA
 */
public class User {
    
    private String userId;
    private String userName;
    private String password;
    private int userLevel;    
    private String lastLogin;
    private String passChangeLogin;

    public User() {
    }

    public User(String userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public User(String userId, String userName, String password, int userLevel, String lastLogin, String passChangeLogin) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userLevel = userLevel;
        this.lastLogin = lastLogin;
        this.passChangeLogin = passChangeLogin;
    }

    /**
     * Get the value of passChangeLogin
     *
     * @return the value of passChangeLogin
     */
    public String getPassChangeLogin() {
        return passChangeLogin;
    }

    /**
     * Set the value of passChangeLogin
     *
     * @param passChangeLogin new value of passChangeLogin
     */
    public void setPassChangeLogin(String passChangeLogin) {
        this.passChangeLogin = passChangeLogin;
    }

    

    /**
     * Get the value of lastLogin
     *
     * @return the value of lastLogin
     */
    public String getLastLogin() {
        return lastLogin;
    }

    /**
     * Set the value of lastLogin
     *
     * @param lastLogin new value of lastLogin
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }


    /**
     * Get the value of userLevel
     *
     * @return the value of userLevel
     */
    public int getUserLevel() {
        return userLevel;
    }

    /**
     * Set the value of userLevel
     *
     * @param userLevel new value of userLevel
     */
    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }   

    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Get the value of userName
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set the value of userName
     *
     * @param userName new value of userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    /**
     * Get the value of userId
     *
     * @return the value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Set the value of userId
     *
     * @param userId new value of userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
}
