/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backendcontrollers;

import backend_db.ConnectionControll;
import backend_db.DBConection;
import java.net.NoRouteToHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author TiVA
 */
public class LoginController {

    public static boolean isThisUserIDExist(User user) throws ClassNotFoundException, SQLException {
        String query = "SELECT UserId FROM tblUsers WHERE UserId ='" + user.getUserId() + "' ;";
        //System.out.println("Query  : "+query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        User u = null;
        if (result.next()) {
            u = new User();
            u.setUserId(result.getString(1));
        }
        if (u == null) {
            return false;
        } else {
            return true;
        }
    }

    public static User getUserPassword(User user) throws ClassNotFoundException, SQLException {
        String query = "SELECT Pwd,Name,userLevel FROM dbo.tblUsers WHERE userid='" + user.getUserId() + "';";
        System.out.println("Query  : " + query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());
        User u = null;
        if (result.next()) {
            u = new User();
            u.setPassword(result.getString(1));
            u.setUserName(result.getString(2));
            u.setUserLevel(result.getInt(3));
        }
        return u;
    }

    public static int addNewUser(User user) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO tblUsers(UserId,Name,Pwd,UserLevel)"
                + "values('" + user.getUserId() + "','" + user.getUserName() + "','" + user.getPassword() + "', " + user.getUserLevel() + " );";

        System.out.println("Query  : " + query);
        int response = ConnectionControll.setData(query, DBConection.getConnection());
        return response;
    }

    public static int updateUser(User user) throws ClassNotFoundException, SQLException {
        String query = "Update tblUsers SET "
                + "Name ='" + user.getUserName() + "',"
                + "Pwd = '" + user.getPassword() + "',"
                + "PwdChgLogin = '" + user.getPassChangeLogin() + "' "
                + "Where UserId = '" + user.getUserId() + "'";

        System.out.println("Query : " + query);
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;
    }

    public static int updateLastLogin(User user) throws ClassNotFoundException, SQLException {
        String query = "Update tblUsers SET "
                + "LastLogin = '" + user.getLastLogin() + "' "
                + "Where UserId = '" + user.getUserId() + "' AND"
                + " pwd = '" + user.getPassword() + "' ";

        System.out.println("Query : " + query);
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;
    }

    public static int deleteUser(User u) throws ClassNotFoundException, SQLException {
        String query = "delete tblUsers where UserId = '" + u.getUserId() + "'";
        int setData = ConnectionControll.setData(query, DBConection.getConnection());
        return setData;
    }

    //update tblUsers set pwdChglogin= getDate() where userid ='test' AND name='test' AND pwd='test'
    public static boolean isPermission(String userName, String authType) throws ClassNotFoundException, SQLException {
        String query = "SELECT UserName\n"
                + "      ,PassWord\n"
                + "      ,AuthType\n"
                + "  FROM tblAuthorization WHERE UserName = '"+userName+"' AND AuthType = '"+authType+"' ";
        System.out.println("Query  : "+query);
        ResultSet result = ConnectionControll.getDataAsViewable(query, DBConection.getConnection());      
        if (result.next()) {
            return true;
        } else {
            return false;
        }
    }
}
